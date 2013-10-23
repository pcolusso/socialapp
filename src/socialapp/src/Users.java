package socialapp.src;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "socialnetwork")
public class Users implements Serializable {
	@XmlElementWrapper(name = "users")
    @XmlElement(name = "user")
	private List<User> users;

	public Users()
	{
		users = new ArrayList<User>();
	}
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public void addTestUser(String name)
	{
		User u = new User(1, name, name + "@test,com", "desc", "pass");
		
		List<Article> articles = new ArrayList<Article>();
		articles.add(new Article("test1", "12/09/2013", "ddfsdfsdfsdfds"));
		articles.add(new Article("test2", "13/09/2013", "fsfsdfdsfs"));
		articles.add(new Article("test3", "14/09/2013", "asdsdsadsa"));
		u.setBlog(articles);
		
		List<Friend> friends = new ArrayList<Friend>();
		friends.add(new Friend(1));
		u.setFriends(friends);
		
		users.add(u);
	}
	
	public void register(String name, String email, String desc, String password)
	{
		users.add(new User(1, name, email, desc, password));
	}
	
	public User logon(String email, String password)
	{
		for (User user : users)
			if (user.getEmail() == email && user.getPassword() == password)
				return user;
		return null; //Logon failed
	}
	
}