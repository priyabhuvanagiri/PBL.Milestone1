package com.wipro.ccbill.entity;
import java.util.*;
import com.wipro.ccbill.exception.*;
public class CreditCardBill {
	private String creditCardNo;
	private String customerId; 
	private Date billDate;
	private Transaction monthTransactions[];
	public CreditCardBill()
	{
		
	}
	 public CreditCardBill(String creditCardNo, String customerId, Date billDate, Transaction[] monthTransactions) {
	        super();
	        this.creditCardNo = creditCardNo;
	        this.customerId = customerId;
	        this.billDate = billDate;
	        this.monthTransactions = monthTransactions;
	    }
	    public double getTotalAmount(String transactionType)
	    {
	        double amount=0.0;
	        if(transactionType.equals("DB"))
	        {
	            for(Transaction t:monthTransactions)
	            {
	                if(t.getTransactionType().equals("DB"))
	                {
	                    amount+=t.getTransactionAmount();
	                }
	            }
	        }
	        else if(transactionType.equals("CR"))
	        {
	            for(Transaction t:monthTransactions)
	            {
	                if(t.getTransactionType().equals("CR"))
	                {
	                    amount+=t.getTransactionAmount();
	                }
	            }
	        }
	        return amount;
	    }
	    public String validateData() throws InputValidationException
	    {
	        if(!(creditCardNo!=null&&creditCardNo.length()==16&&customerId!=null&&customerId.length()>=6))
	        {
	            throw new InputValidationException();
	        }
	        return "valid";
	    }
	    public double calculateBillAmount() throws InputValidationException
	    {
	        if(!validateData().equals("valid"))
	        {
	            return 0.0;
	        }
	        if(monthTransactions==null||monthTransactions.length==0)
	        {
	            return 0.0;
	        }
	        double outstanding_amount=getTotalAmount("DB")-getTotalAmount("CR");
	        double interest=(outstanding_amount*(19.9/12))/100.0;
	        return outstanding_amount+interest;
	    }
}
