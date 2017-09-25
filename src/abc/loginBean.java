package abc;
import javax.faces.bean.ManagedBean;
@ManagedBean(name="loginBean",eager=true)

public class loginBean 
{
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
	
	public String login()
	{
		if (username.equals("admin") && password.equals("admin")){
		return "home";}
		else
		return "failure";	
			
	}

}
