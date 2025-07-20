package constrctor.abc;

public class Demo {
   Demo(){
	System.out.println("I am in Non-Parameterized contructor");
}
   Demo(int a,String b){
	   System.out.println("I am in Parameterized contructor-:"+a+","+b);
   }
   void display() {
	   
   }
   public static void main(String[] args) {
	   Demo d1=new Demo();
	   Demo d2=new Demo(30,"SMBST");
	   d1.display();
	   d2.display();
   }
}