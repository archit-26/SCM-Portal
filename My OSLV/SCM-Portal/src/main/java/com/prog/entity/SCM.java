package com.prog.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "OSL_DATA")
public class SCM {
	
//	Id
//    Project Name
//    Model Name
//    Assign to
//    Request Date
//    PRA Date
//    Requester
//    File Count
//    State
//    AP Chipset
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String pname;
	private String mname;
	private String assignto;
	private String reqdate;
	private String pradate;
	private String requester;
	private String filecount;
	private String state;
	private String chipset;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getAssignto() {
		return assignto;
	}
	public void setAssignto(String assignto) {
		this.assignto = assignto;
	}
	public String getReqdate() {
		return reqdate;
	}
	public void setReqdate(String reqdate) {
		this.reqdate = reqdate;
	}
	public String getPradate() {
		return pradate;
	}
	public void setPradate(String pradate) {
		this.pradate = pradate;
	}
	public String getRequester() {
		return requester;
	}
	public void setRequester(String requester) {
		this.requester = requester;
	}
	public String getFilecount() {
		return filecount;
	}
	public void setFilecount(String filecount) {
		this.filecount = filecount;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getChipset() {
		return chipset;
	}
	public void setChipset(String chipset) {
		this.chipset = chipset;
	}
	@Override
	public String toString() {
		return "SCM [id=" + id + ", pname=" + pname + ", mname=" + mname + ", assignto=" + assignto + ", reqdate="
				+ reqdate + ", pradate=" + pradate + ", requester=" + requester + ", filecount=" + filecount
				+ ", state=" + state + ", chipset=" + chipset + "]";
	}
	public SCM() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
