package predrive;
import java.util.ArrayList;
import java.util.List;
public class endswithING {
	    public static void main(String[] args) {
	        String input = "the cow is eating and sleeping on ground";
	        List<String> l1 = new ArrayList<>();
	        List<String> l2 = new ArrayList<>();
	        for (String word : input.split(" ")) {
	            if (word.endsWith("ing")) {
	                l1.add(word);
	            } else {
	                l2.add(word);
	            }
	        }
	        l1.addAll(l2);
	       String ll= String.join(" ", l1);
	        System.out.println(ll);
	    }
}
