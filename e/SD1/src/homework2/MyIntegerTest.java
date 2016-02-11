package homework2;

public class MyIntegerTest {

	public static void main(String[] args) {
		MyInteger p = new MyInteger(20) ;
		p.setTheInt(p.getTheInt()+1) ; 
		System.out.println(p.getTheInt());
		System.out.println(p.getVal());

	}

}
