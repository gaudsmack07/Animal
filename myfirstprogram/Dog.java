package myfirstprogram;

import demo.Animal;

public class Dog extends Animal{
	
	int a;
	int b;
	int c;
	int d;
	
	Dog(){
		
	}
	
	public Dog(int a, int b, int c, int d){
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		k = 5;
	}
	
	public static void something() {
		Animal a = new Animal(1,1,1);
		int n = a.k;
	}

}
