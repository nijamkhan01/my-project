package Variable;
 class Coupling {
     public void read(){
    	 Topic t= new Topic();
    	 System.out.println("Read");
		 t.nature();
	}
     public static void main(String[] args) {
		Coupling c= new Coupling();
		c.read();
	}
}
 class Topic{
	 void nature() {
		 System.out.println("This is a nature.");
	 }
	 
 }
