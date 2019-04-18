package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int num =0;
		System.out.println("enter the value of n");
		int n= scan.nextInt();
		scan.close();
		for (i=1;i<=n;i++){
			int counter =0;
			for(num=1;num<=i;num++){
				if(i%num==0){
					counter = counter+1;
				}
			}
			if(counter==2)
				System.out.println(i + " is prime number");
			else
				System.out.println(i + " is not a prime number");
		}
		}
	}
