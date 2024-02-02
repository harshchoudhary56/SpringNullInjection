package in.ineuron.comp;

import java.util.Date;

public class PersonalInfo {
	private Integer pid;
	private String pname;
	private String paddress;
	private Date dob;
	private Date dom;
	private Date doj;
	
	

	public PersonalInfo(Integer pid, String pname, String paddress, Date dob, Date dom, Date doj) {
		System.out.println("PersonalInfo :: 5 param constructor called");
		this.pid = pid;
		this.pname = pname;
		this.paddress = paddress;
		this.dob = dob;
		this.dom = dom;
		this.doj = doj;
	}



	@Override
	public String toString() {
		return "PersonalInfo [pid=" + pid + ", pname=" + pname + ", paddress=" + paddress + ", dob=" + dob + ", dom="
				+ dom + ", doj=" + doj + "]";
	}
	
	

	
	
	
}
