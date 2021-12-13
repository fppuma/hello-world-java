package com.example.helloworld;

public class HelloWorld {

	public static void main(String[] args) throws InterruptedException {
		for(int i = 0 ; i < 100; i++){
			System.out.println("Hello World Ping " + i );
			Thread.sleep(1000);
		}

	}

}
