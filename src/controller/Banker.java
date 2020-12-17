package controller;

import java.sql.Timestamp;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Banker {
	
	private String accountNumber = "";
	private String routingNumber = "";
	private Timestamp timemarker;
	private String user;
	
	public void setUser(String userA) {
		user = userA;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setAccountNum() {
		Random rand = new Random();
		String accNum = "";
				
		for(int i = 0; i < 12; i++) {
			if(i == 3 || i == 7) {
				accNum += "-";
			} else {
				accNum += Integer.toString(rand.nextInt(10));
			}
		}
		accountNumber = accNum;
	}
	
	public String getAccountNum() {
		return accountNumber;
	}
	
	public void setRoutingNum() {
		Random rand = new Random();
		String rouNum = "";
		
		for(int i = 0; i < 19; i++) {
			if(i == 4 || i == 9 || i == 14) {
				rouNum += "-";
			} else {
				rouNum += Integer.toString(rand.nextInt(10));
			}
		}
		routingNumber = rouNum;
	}
	
	public String getRoutingNum() {
		return routingNumber;
	}
	
	public void setTimeMarker() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(1));
		timemarker = timestamp;
	}
	
	public boolean checkMarker() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		
		if(timestamp.after(timemarker)) {
			setTimeMarker();
			return true;
		} else {
			return false;
		}
	}
	
	public String setSuggestions() {
		String[] suggestions = {user + " it looks like you've been spending alot of money on food. Try purchasing groceries.",
				user + " too many bar nights could lead to more than a drained bank account.",
				user + " we suggest buying more groceries.",
				user + " buying all those PC parts is really putting a dent in your savings."};
		
		Random rand = new Random();
		return "<html><p>" + suggestions[rand.nextInt(suggestions.length)] + "</p></html>";
	}
	
	public String getValue(int base, int range) {
		Random rand = new Random();
		int value = rand.nextInt(range) + base;
		return "$ " + Integer.toString(value);
	}
	
	public String getPrecentageChange(String lastVal, String currentVal) {
		int ref;
		ref = Integer.parseInt(currentVal.substring(2));
		double curVal = ref;
		ref = Integer.parseInt(lastVal.substring(2));
		double lasVal = ref;
		
		if(curVal > lasVal) {
			Double precent = (curVal/lasVal);
			return ("(+ " + String.format("%.2f", precent * 100) + ")");
		} else {
			Double precent = (lasVal/curVal);
			return ("(- " + String.format("%.2f", precent * 100) + ")");
		}
	}
}
