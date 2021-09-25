public class StringCase{
public static void main(String[] arg){
	String s="Rohan";
	System.out.println(s);
	String LowerCase=s.toLowerCase();
	System.out.println(LowerCase);
	String UpperCase=s.toUpperCase();
	System.out.println(UpperCase);

	String a="Kumbhar";
	String b="KuMBhar";
	System.out.println(a==b);
	System.out.println(a.equals(b));
	System.out.println(a.equalsIgnoreCase(b));

	int x=500;
	String X=String.valueOf(x);
	System.out.println(X);
	

	String bbc="10";
	String c="20";
	int d=Integer.parseInt(bbc);
	int de=Integer.parseInt(c);
	System.out.println(d);
	System.out.println(de);
	System.out.println(d+de);
	


}
}