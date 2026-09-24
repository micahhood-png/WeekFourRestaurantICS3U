package restaurant.restaurant.WeekFourRestaurantICS3U.src;

import java.util.*;
/*******************************
 * Name: Your name Micah Hood
 * Class: ICS3U
 * Date: Friday Sept. 25
 * Project Name: Restaurant
 * 
 * You will have your first real project this week. You must meet all of the following criteria:
Create a restaurant of your choosing
Print menu items one at a time, including the price.
Ask how many of each item they would like to purchase
Must have at least 5 different menu items
Calculate the total price
If the total is more than $30, take off 10%.
If the total is more than $50, take off 20%.
Add 13% HST  to the total
Print out the initial price, any discounts, taxes, and the grand total.
Read in a payment amount from the user
Calculate the change
If the change is negative, state that they still owe you money.
This is to be done individually.
DO NOT use AI! 
Feel free to use previous notes, videos, and online resources like w3schools.com
Fork the repository, add me (MrZebarth) as a collaborator, clone the repository to your computer, program your solution, and then commit and push the results.
 ********************************/
public class Main {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println(" Welcome to Dan's pizza! We sell pizza, super pizza mega pizza galactic pizza universal pizza ALL THE PIZZA!");
			System.out.println(" How many pizzas do you want to order? they all cost 10.0$!");
			double pizza = 10.0*in.nextDouble(); 
			System.out.println(" GREAT! now, How many 2.0$ drinks is it gonna take to quench that TERRIBLE thirst of yours? Don't worry, buy as many as you want! I won't object.");
			double drinks = 2.0*in.nextDouble(); 
			System.out.println("SWEET! Now, you can't have a big pizza meal without some special Dan's pizza ice cream! buy how many 5.0$ cartons?");
			double cartons = 5.0*in.nextDouble(); 
			System.out.println("WONDERFUL! But of course, you can't have a feast like this without some pepper flakes to spice up your pizza! Only 1.0$ per flake!");
			double flakes = 1.0*in.nextDouble(); 
			System.out.println("FANTASTIC! lastly, I'll sell you a treadmill for half price, because I feel sorry for how much fatter you're going to be after tonight. What? It's a party with a ton of friends? Oh, my mistake. but hey since I already offered, you might as well buy one right? Here you go.");
			double treadmill = 100.0; 
			System.out.println("EPIC! alrighty, your total price is: ");
			double totalPrice = pizza + drinks + cartons + flakes + treadmill; 
			double tax = totalPrice*0.13; 
			double totalPrice1= totalPrice+tax; 
			System.out.println(totalPrice1);
			System.out.println("WOW thats quite a tab you've racked up. alright, I'll be a nice guy, you can have 20% off! But next time you come YOU'RE PAYING 20% MORE!!!");
			double discount=0;
			if (totalPrice1>=50.0) {
			 discount = totalPrice1*0.2;
			double totalPrice2 = totalPrice1 - discount; 
			 System.out.println(totalPrice2);
			 System.out.println("Anything else you'd LIke to buy? NO?? WELL THEN WHY ARE YOU STILL HERE GETOUT I GOT CUSTOMERS TO SERVE!");
			System.out.println("(you were rudely shoved out the door)");
			System.out.println("Have a nice day! *SLAM*");
			}
		}
	
	}
	


		// TODO Auto-generated method stub
		
	}


