package com.maogx;

public class GitInfo {
	
	private String userName;
	private String email;
	
	public GitInfo(String userName,String email){
		this.userName=userName;
		this.email=email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "GitInfo [userName=" + userName + ", email=" + email + "]";
	}
	
	public static void main(String[] args) {
		GitInfo gitinfo=new GitInfo("maogx", "mgx_star@126.com");
		System.out.println(gitinfo.toString());
	}
	

}
