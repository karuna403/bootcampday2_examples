package bootcampprograms2dayexamples;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="java is a typed programming language";
  String[] a=s.split(" "); String c="0"; String d="0";
  System.out.print('"');
  for(int i=a.length-1; i>=0;i--){
	 
	  c=a[i];
	  System.out.print("output="+c+" " );
	   
  }
  System.out.print('"');
  
 
	}

}
