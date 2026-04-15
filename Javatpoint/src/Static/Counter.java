package Static;

public class Counter {
	int count=0;
	static int staticCount=0;
	Counter(){
		count++;
		staticCount++;
	}
	void display() {
		System.out.println("Count is: "+count);
		System.out.println("Static Count is: "+staticCount);
	}

	public static void main(String[] args) {
		Counter c=new Counter();
		c.display();
		Counter c1=new Counter();
		c1.display();

	}

}
