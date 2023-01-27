package demo;

public class Dog extends Animal{
	
	int a;
	int b;
	int c;
	int d;
	
	Dog(int a, int b, int c, int d){
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	@Override
	public boolean equals(Object obj) {
		Dog d = (Dog) obj;
		return this.a == d.a && this.b == d.b && this.c == d.c && this.d == d.d;
	}

}
