package socialapp.soap.client;

import java.rmi.RemoteException;
import java.util.Scanner;

import javax.xml.rpc.ServiceException;

public class BlogClient {
	public static void main(String args[]) throws ServiceException {
		BlogServiceLocator loc = new BlogServiceLocator();
		Blog blog = loc.getBlogPort();
		Scanner s = new Scanner(System.in);
		
		try {
			User user = logon(s, blog);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static User logon(Scanner s, Blog b) throws RemoteException
	{
		User u = null;
		while (u == null) {
			System.out.print("Enter your username: ");
			String email = s.nextLine();
			System.out.print("Enter your password: ");
			String pw = s.nextLine();
			
			u = b.login(email, pw);
			
			if (u == null)
				System.out.println("Invalid Credentials!");
		}
		return u;
	}
}
