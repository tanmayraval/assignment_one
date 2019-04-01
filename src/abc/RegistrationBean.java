package abc;

import javax.faces.bean.ManagedBean;
@ManagedBean(name="RegistrationBean",eager=true)

public class RegistrationBean 
{
	private String firstname;
	private String lastname;
	private String emailid;
	private String address;
	private String phn_no;
	private String username;
	private String password;
		
	public String getUserName()
	{
		return username;
	}
	public void setUserName(String username)
	{
		this.username=username;
	}
	public String getPassword()
	{
		return username;
	}
	public void setPassword(String password)
	{
		this.password= password;
	}
	public String getFirstName()
	{
		return firstname;
	}
	public void setFirstName(String firstname)
	{
		this.firstname=firstname;
	}
	public String getLastName()
	{
		return lastname;
	}
	public void setLastName(String lastname)
	{
		this.lastname=lastname;
	}
		
	public String getEmailid()
	{
		return emailid;
	}
	public void setEmailid(String emailid)
	{
		this.emailid=emailid;
	}
	public String getAddres()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getPhn_no()
	{
		return phn_no;
	}
	public void setPhn_no(String phn_no)
	{
		this.phn_no=phn_no;
	}
		
	public String regestration()
	{
		return("Success");	
	}
}

