
package string;

 //WAP to print all the alphabets of strings in ascending and descending
//order.

public class Ascendinganddescending {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="asmita";
		char ch[]=str.toCharArray();
		char temp;
		
		for(int i=0;i<=ch.length-1;i++) {
			for(int j=i+1;j<=ch.length-1;j++) {
				if(ch[i]>ch[j]) {
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
			
		}
		
		System.out.println("ascending order="+new String(ch));
		char ch1[]=str.toCharArray();
		char temp1;
		for(int i=ch1.length-1;i>=0;i--) {
			for(int j=ch1.length-1;j>=i;j--) {
				if(ch1[i]<ch1[j]) {
					temp1=ch1[i];
					ch1[i]=ch1[j];
					ch1[j]=temp1;
				}
			}
		}
		System.out.println("descending order="+new String(ch1));
		

}}


