/**
 * Blog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package socialapp.soap.client;

public interface Blog extends java.rmi.Remote {
    public socialapp.soap.client.User login(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public socialapp.soap.client.Article[] getBlogs(socialapp.soap.client.User arg0) throws java.rmi.RemoteException;
}
