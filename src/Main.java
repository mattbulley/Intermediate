import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		ident();
		selectChapter();
		scanner.close();
	}
	
	public static void ident() {
		System.out.println("\r\n" + 
				"  _____       _                               _ _       _       \r\n" + 
				" |_   _|     | |                             | (_)     | |      \r\n" + 
				"   | |  _ __ | |_ ___ _ __ _ __ ___   ___  __| |_  __ _| |_ ___ \r\n" + 
				"   | | | '_ \\| __/ _ \\ '__| '_ ` _ \\ / _ \\/ _` | |/ _` | __/ _ \\\r\n" + 
				"  _| |_| | | | ||  __/ |  | | | | | |  __/ (_| | | (_| | ||  __/\r\n" + 
				" |_____|_| |_|\\__\\___|_|  |_| |_| |_|\\___|\\__,_|_|\\__,_|\\__\\___|\r" + 
				"                                                                \r" + 
				
				 
				                                                                      
				
				" ____   ____   ____   ____   ____   ____   ____   ____   ____   ____  \r\n" + 
				"|____| |____| |____| |____| |____| |____| |____| |____| |____| |____| \r\n" + 
				"                                                                      \r\n" + 
				
				"");
		
		System.out.println("Created by Matt Bulley : Thursday, 8 February 2018");
		System.out.println("");
		contents();
	
	}
	
	public static void contents()
	{
		System.out.println("  Contents:");
		System.out.println("");
		System.out.println("	12  Blackjack");
		System.out.println("	13  Unique Sum");
		System.out.println("	14  Too Hot?");
		System.out.println("	15  People");
		System.out.println("	16  Garage");
		System.out.println("	17  Paint Wizard");
		System.out.println("	18  Working With Files");
		System.out.println("	19  Junit");
		System.out.println("	20  Library/TDD");
		System.out.println("");
		System.out.println("  Please enter a number (0 to quit program):");
	}
	
	public static void selectChapter() {
		boolean incorrectInput = true;
		int any = 0;
		scanner.reset();
		do {
			
			
			try {
					any = Integer.parseInt(scanner.nextLine());
					incorrectInput = false;
					
				} catch (Exception wrongInput) {
					
					System.out.println("");
					System.out.println("Incorrect input! Please enter a valid difficulty");
					
					
				}
			
			if(incorrectInput) {
				System.out.println("");
				System.out.println("Incorrect input! Please enter a valid difficulty");
			}
			
		} while (incorrectInput);
		
		switch(any) {
			case 12:
				Chapter12.chapter12();
				break;
			case 13:
				Chapter13.chapter13();
				break;
			case 14:
				Chapter14.chapter14();
				break;
			case 15:
				Chapter15.chapter15();
				break;
			case 16:
				Chapter16.chapter16();
				break;
			case 17:
				Chapter17.chapter17();
				break;
			case 18:
				Chapter18.chapter18();
				break;
			case 19:
				Chapter19.chapter19();
				break;
			case 20:
				Chapter20.chapter20();
				break;
			case 0:
				System.out.println("Goodbye");
				System.exit(0);
				break;
		
		}
		
	}
	
	public static int returnInput() {
		boolean incorrectInput = true;
		int any = 0;
		scanner.reset();
		do {
			
			
			try {
					any = Integer.parseInt(scanner.nextLine());
					incorrectInput = false;
					
				} catch (Exception wrongInput) {
					
					System.out.println("");
					System.out.println("Incorrect input! Please enter a valid difficulty");
					
					
				}
			
			if(incorrectInput) {
				System.out.println("");
				System.out.println("Incorrect input! Please enter a valid difficulty");
			}
			
		} while (incorrectInput);
		
		return any;
	}

}
