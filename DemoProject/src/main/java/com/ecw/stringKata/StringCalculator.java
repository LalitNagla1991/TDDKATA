package com.ecw.stringKata;

public class StringCalculator {
	public int add(String numbers) {
		int sum=0,num=0;
		String[] strArray = numbers.split(",|\\n");
		StringBuilder stringBuilder=new StringBuilder();
		for(String number:strArray) {
			if(!number.isEmpty()) {
				num=Integer.parseInt(number);
				if(num<0) {
					stringBuilder.append(num);
					stringBuilder.append(" ");
				}else if(num<1000) {
					sum=sum + Integer.parseInt(number);
				}
			}
		}
		System.out.println(stringBuilder.indexOf("-"));
		if(stringBuilder.indexOf("-")>=0) {
			throw new NegativeNotAllowedException("negatives not allowed "+stringBuilder.toString().trim());
		}
		return sum;
	}
	public static void main(String args[]) {
		StringCalculator  stringCalculator=new StringCalculator();
		stringCalculator.add("1,-2,3");
	}
}
