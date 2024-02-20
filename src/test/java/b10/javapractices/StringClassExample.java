package b10.javapractices;

public class StringClassExample {

	public static void main(String[] args) {
		
		String s="sachin";
		
		System.out.println(s);
		
		String ss=new String("rohit");
		
		System.out.println(ss);
		
		String sss="sachin";
		
		System.out.println(s.hashCode());
		System.out.println(sss.hashCode());
		
		
		String adharNumber="123456789";
		
		String adnumb2=adharNumber.concat("420");
		
		System.out.println(adnumb2);
		
		System.out.println(adharNumber);

	}

}
