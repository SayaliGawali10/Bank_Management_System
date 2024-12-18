package com.cjc.bms.app.client;

  import java .util.*;

import com.cjc.bms.app.model.Account;
  
public class Test {
	public static void main(String[] args) {
		
	
         Scanner sc=new Scanner(System.in);
         Account a=new Account();
         
       System.out.println("Enter accNo, Enter name, enter mobNo, enter adharNo, enter gender, enter age, enter balance");
       
       long accNo=sc.nextLong();
        a.setAccNo(accNo);
       
        String name=sc.next();
        a.setName(name);
        
        long mobNo=sc.nextLong();
        a.setMoNo(mobNo);
        
        long adharNo=sc.nextLong();
        a.setAdharNo(adharNo);
        
        String gender=sc.next();
        a.setGender(gender);
        
        int age=sc.nextInt();
        a.setAge(age);
        
        double balance=sc.nextDouble(); 
        a.setBalance(balance);
        
        System.out.println("Account Created Sucessfully");
        
        System.out.println("Choose an option");
        
       
        System.out.println("1. Display All Details");
        System.out.println("2. Deposite Money");
        System.out.println("3. Withdrawl Money");
        System.out.println("4. Check Balance");
      
        int option=sc.nextInt();
        
         
         
         if(option==1 ) {
        	 System.out.println("Display All Details");
        	
        	 System.out.println("accNo- "+a.getAccNo());
        	 System.out.println("name- "+a.getName());
        	 System.out.println("mobNo- "+a.getMoNo());
        	 System.out.println("adharNo- "+a.getAdharNo());
        	 System.out.println("gender- "+a.getGender());
        	 System.out.println("age- "+a.getAge());
        	 System.out.println("balance- "+a.getBalance());
        	 
         }
         
                 
           else if(option==2) {
         
        	 System.out.println("Deposite Money");
             System.out.println("Enter Deposite Money");
             double depositemoney=sc.nextDouble();
             
             if(depositemoney>0) {
            	
            	 double newdeposite=a.getBalance();
            	 a.setBalance(balance);
            	  
            	 double totalbalance=a.getBalance() + depositemoney;
            	 
            	 System.out.println("Deposited New Balance"+depositemoney); 
            	 System.out.println("Deposited total balance"+totalbalance); 
                 }
             else {
            	 System.out.println("Money is not negative value");
             }
         } 
          
           
             else if(option==3) {
            	  
            	  System.out.println("Withdrawal Money");
            	  System.out.println("Enter withdrawal Money");
                  double withdrawalmoney=sc.nextDouble();
                  double currentbalance=a.getBalance();
                  
                
				if(withdrawalmoney>0 && withdrawalmoney<=currentbalance) {
					
					 double totalbalance=currentbalance - withdrawalmoney;
					
                	  a.setBalance(totalbalance);
                	  
                	 System.out.println("Withdrwal Successfully");
                 	 System.out.println("Withdrawal Money is " +withdrawalmoney);
                 	 System.out.println("Total balance "+totalbalance);
                 	 
                 	   
                  }  
				
				else if (withdrawalmoney>currentbalance) {
			       
					System.out.println("Insufficient balance.");
			    } 
				
				else {
			        System.out.println("Withdrawal amount must be positive.");
			    }
            	  
              } 
             else if(option==4) {
            	  
            	  System.out.println("Total Balance");
            	  
            	  System.out.println("Total Balance- "+a.getBalance());
         } 
         
             else {
            	 System.out.println("Exit");
             }
         
         
        	 
       
          
        
      
         }	
         
         
}	 
        	
        
      
         	
        

       
         

