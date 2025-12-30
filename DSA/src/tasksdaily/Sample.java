package tasksdaily;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Sample {
public static void main(String[] args) {
	int [] a= {4,5,8,9,12,15,1};
	Arrays.sort(a);
	Set<Integer> s1= new HashSet<Integer>();
	for (int i = 0; i < a.length; i++) {
		s1.add(a[i]);
	}
	for (int i = a[0]; i < a[a.length-1]; i++) {
		if(!s1.contains(i)) {
			System.out.println(i+" ");
		}
	}
}
}
