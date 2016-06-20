package models;

import java.util.Scanner;

public class DonationCenterManager{
	
	public static final int CENTER_MIN = 2;
	public static final int CENTER_MEDIUM = 5;

	private int numberPeople;
	private int moneyGather;
	private int moneyDonation;
	private int interests;


	public  int getPeopleNumber(String list){
		String number="";
		for (int i = 0; i <= list.length(); i++) {
			if(i==list.length() || list.charAt(i)==44){
				numberPeople+=Integer.parseInt(number);
				number="";
			}else if(list.charAt(i)!=44){
				number+=list.charAt(i);
			}
		}
		return numberPeople;
	}

	public  int getMoneyGather(String list){
		String number="";
		for (int i = 0; i <= list.length(); i++) {
			if(i==list.length() || list.charAt(i)==44){
				moneyGather+=Integer.parseInt(number);
				number="";
			}else if(list.charAt(i)!=44){
				number+=list.charAt(i);
			}
		}
		return moneyGather;
	}

	public int getMoneyDonation(int center){
		if (center <= CENTER_MIN) {
			getCenterMin(center);
		}else if (center > CENTER_MIN && center <= CENTER_MEDIUM ){
			getCenterMedium(center);
		}else{
			getCenterMax(center);
		}
		return moneyDonation;
	}

	public int getCenterMin(int center){
		moneyDonation = moneyGather/center;
		return moneyDonation;
	}

	public int getCenterMedium(int center){
		interests = (moneyDonation *20)/100;
		moneyDonation = (moneyDonation - interests)/center;
		return moneyDonation;
	}

	public int getCenterMax(int center){
		interests = (moneyDonation *30)/100;
		moneyDonation = (moneyDonation - interests)/center;
		return moneyDonation; 
	}
		
	public static void main(String[] args) {
		DonationCenterManager nogal = new DonationCenterManager();
		System.out.println(nogal.getPeopleNumber("4,2,8,54,2,4,9,4"));
		System.out.println(nogal.getMoneyGather("4564645,5864565,746548784,4548744,27456548"));
		System.out.println(nogal.getMoneyDonation(4));
	}

}