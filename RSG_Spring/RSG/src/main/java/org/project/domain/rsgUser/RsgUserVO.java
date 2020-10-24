package org.project.domain.rsgUser;

import java.util.Date;

public class RsgUserVO {
	private String uid="";
	private String upw="";
	private String uname="";
	private String uaddr="";
	private String uphone="";
	private Date ufrstRgstDate;
	private Date umdfyDate;
	private int ulevel;
	private String udelYn="";
	private Date ulastLogin;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUaddr() {
		return uaddr;
	}
	public void setUaddr(String uaddr) {
		this.uaddr = uaddr;
	}
	public String getUphone() {
		return uphone;
	}
	public void setUphone(String uphone) {
		this.uphone = uphone;
	}
	public Date getUfrstRgstDate() {
		return ufrstRgstDate;
	}
	public void setUfrstRgstDate(Date ufrstRgstDate) {
		this.ufrstRgstDate = ufrstRgstDate;
	}
	public Date getUmdfyDate() {
		return umdfyDate;
	}
	public void setUmdfyDate(Date umdfyDate) {
		this.umdfyDate = umdfyDate;
	}
	public int getUlevel() {
		return ulevel;
	}
	public void setUlevel(int ulevel) {
		this.ulevel = ulevel;
	}
	public String getUdelYn() {
		return udelYn;
	}
	public void setUdelYn(String udelYn) {
		this.udelYn = udelYn;
	}
	public Date getUlastLogin() {
		return ulastLogin;
	}
	public void setUlastLogin(Date ulastLogin) {
		this.ulastLogin = ulastLogin;
	}
	
	
	
}
