package ru.lesson.lessons;

import java.util.Scanner;

public class CalcRunner {

	public static void main (String[] args){
		Scanner reader= new Scanner(System.in);
		try {
			String exit="no";
			while (!exit.equals("yes")){ 
				String first=reader.next();
				String second=reader.next();
				calculate calc=new calculate();
				try {
					calc.div(Integer.valueOf(first),Integer.valueOf(second));
				} catch (UserExceptions e) {
					System.out.println(e.getMessage());
				}
				System.out.println(calc.getResult());
				exit=reader.next();
			}
		} finally{
			reader.close();
		}

	}
}
