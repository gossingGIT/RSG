package org.project.domain.rsgGroup;

import java.util.Date;

public class RsgGroupVO {

	private int gid;
	private String uid = "";
	private String gName = "";
	private int gLimit;
	private String gDiscription = "";
	private Date gFirstRsgtDate;
	private Date gMdfyDate;
	private String gDelYN = "N";
	
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public int getgLimit() {
		return gLimit;
	}
	public void setgLimit(int gLimit) {
		this.gLimit = gLimit;
	}
	public String getgDiscription() {
		return gDiscription;
	}
	public void setgDiscription(String gDiscription) {
		this.gDiscription = gDiscription;
	}
	public Date getgFirstRsgtDate() {
		return gFirstRsgtDate;
	}
	public void setgFirstRsgtDate(Date gFirstRsgtDate) {
		this.gFirstRsgtDate = gFirstRsgtDate;
	}
	public Date getgMdfyDate() {
		return gMdfyDate;
	}
	public void setgMdfyDate(Date gMdfyDate) {
		this.gMdfyDate = gMdfyDate;
	}
	public String getgDelYN() {
		return gDelYN;
	}
	public void setgDelYN(String gDelYN) {
		this.gDelYN = gDelYN;
	}
	
}
