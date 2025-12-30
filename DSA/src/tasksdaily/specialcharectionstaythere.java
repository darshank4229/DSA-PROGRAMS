package tasksdaily;

public class specialcharectionstaythere {
	public static void main(String[] args) {
		String str="i&know$java@program#";
		char[] c=str.toCharArray();
		int i=0;
		int j=c.length-1;
		while(i<j) {
			if(!Character.isLetter(c[i])) {
				i++;
			}
			else if(!Character.isLetter(c[j])) {
				j--;
			}
			else {
				char temp=c[i];
				c[i]=c[j];
				c[j]=temp;
				i++;
				j--;
			}
		}
		String s1=new String(c);
		System.out.println(s1);
	}

}
