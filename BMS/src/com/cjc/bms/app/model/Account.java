package com.cjc.bms.app.model;

public class Account {
          private long accNo;
          private String name;
          private long moNo;
          private long adharNo;
          private String gender;
          private int age;
          private double balance;
          
          public void setAccNo(long accno) {
        	  this.accNo=accno;
        	  }
          public long getAccNo() {
        	  return accNo;
          }
		
		public void setName(String name) {
			this.name=name;
		}
		
		public String getName() {
			return name;
		}
		
		public void setMoNo(long moNo) {
			this.moNo=moNo;
		}
		
		public long getMoNo() {
			return moNo;
		}
		
		public void setAdharNo(long adharno) {
			this.adharNo=adharno;
		}
		
		public long getAdharNo() {
			return adharNo;
		}
		
		public void setGender(String gender) {
			this.gender=gender;
		}
		
		public String getGender() {
			return gender;
		}
		
		public void setAge(int age) {
			this.age=age;
		}
		
		public int getAge() {
			return age;
		}
		
		public void setBalance(double balance) {
			this.balance=balance;
		}
		public double getBalance() {
			return balance;
		}
          
}
