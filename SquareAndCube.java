package SquareCube;

class SqCb{
	void insert(long num)
	{
		long Square=num*num;
		long Cube=num*num*num;
		System.out.println("Square is:"+Square);
		System.out.println("Cube is:"+Cube);
	}
	}
public class SquareAndCube {
public static void main(String[] args)
{
SqCb s1=new SqCb();
s1.insert(5000);
}
}