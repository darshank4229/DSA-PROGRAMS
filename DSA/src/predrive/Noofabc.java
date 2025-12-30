package predrive;
public class Noofabc {
    public static String rep(String str) {
        String res="";
        int i = 0; 
        while (i < str.length()) {
        	 int count = 0;
            while (i < str.length() && Character.isDigit(str.charAt(i))) { 
                count = count * 10 + (str.charAt(i) - '0');
                i++;
            }
            char c = str.charAt(i);
            i++;
            for (int j = 0; j < count; j++) {
                res=res+c;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(rep("12x"));
        System.out.println(rep("3a2b4c"));
    }
}
