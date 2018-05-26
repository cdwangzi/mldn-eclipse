package cn.mldn.vo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Emp implements Serializable {
	private Long empno ;
	private String ename ;
	private Integer level ; 
	private Double salary ;
	private Date hiredate ;
	public Long getEmpno() {
		return empno;
	}
	public void setEmpno(Long empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	
	@Override
	public String toString() {
		return "【*** 雇员信息 ***】empno = " + this.empno + "、ename = " + this.ename + "、level = " + this.level + "、salary = " + this.salary + "、hiredate = " + hiredate ;
	}
	
}
