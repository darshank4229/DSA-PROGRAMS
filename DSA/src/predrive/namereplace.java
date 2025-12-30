package predrive;

public class namereplace {

public static String Name(String str) {
	String res="";
	str=str.replaceAll("[@#$&!,0-9]", "").toLowerCase();
	str=str.replaceAll(" +", " ");
	String[] s1=str.split(" ");
	for (int i = 0; i < s1.length; i++) {
		char f=(char)(s1[i].charAt(0)-32);
		res=res+f+s1[i].substring(1)+" ";
	}
	return res;
}
public static void main(String[] args) {
	System.out.println(Name("@@@@123darshan     ####@@@k"));
}
	
}
