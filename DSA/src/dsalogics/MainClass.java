package dsalogics;



class SingleDimentionArray{
	int[] a;

	public SingleDimentionArray(int size) {
		this.a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i]=Integer.MIN_VALUE;
		}
	}
	
	public void insert(int index,int value) {
		try {
			if(a[index]==Integer.MIN_VALUE) {
				a[index]=value;
				System.out.println("the value :"+value+"  is inserted");
			}
			else {
				System.out.println("the cell is already filled");
			}
			
		} catch (Exception e) {
			System.err.println("invalid index");
		}
	}
	
	public void traverse() {
		for (int i = 0; i < a.length; i++) {
			System.out.println("at "+i+"  index -> "+ "  the value:"+a[i]);
		}
	}
	
	public void SearchByValue(int value) {
		try {
			for (int i = 0; i < a.length; i++) {
				if(a[i]==value) {
					System.out.println("found the value:"+value+"at the index  "+i);
					return;
				}
			}
			System.out.println("the value is not present");
			
		} catch (Exception e) {
			System.err.println("invalid value enter the correct value");
		}
	}
	
	public void SearchByIndex(int index) {
		
		try {
			if(a[index]!=Integer.MIN_VALUE) {
				System.out.println("the value : "+a[index]+"  present at the index:"+index);
				
			}
			
		} catch (Exception e) {
			System.err.println("invalid index");
			}
	}
	
	public void DeleteByValue(int value) {
		try {
			for (int i = 0; i < a.length; i++) {
				if(a[i]==value) {
					a[i]=Integer.MIN_VALUE;
					System.out.println("delted the value: "+value+"  from  the index  "+i);
					return;
				}
			}
			System.out.println("the value is not present");
			
		} catch (Exception e) {
			System.err.println("invalid value enter the correct value");
		}
	}
	
	public void DeleteByIndex(int index) {
		
		try {
			if(a[index]!=Integer.MIN_VALUE) {
				System.out.println("the value : "+a[index]+" deleted  from the index:"+index);
				a[index]=Integer.MIN_VALUE;
				return;
			}
			
		} catch (Exception e) {
			System.err.println("invalid index");
			}
	}
	
	
}
public class MainClass {
public static void main(String[] args) {
	SingleDimentionArray s= new SingleDimentionArray(5);
	System.out.println("*************INSERTION*************");
	s.insert(0, 5);
	s.insert(2, 15);
	s.insert(1, 50);
	s.insert(4, 25);
	s.insert(3, 35);
	System.out.println("*************TRAVERSE*************");
	s.traverse();
	System.out.println("*************SEARCH BY VALUE*************");
	s.SearchByValue(50);
	System.out.println("*************SEARCH BY INDEX*************");
	s.SearchByIndex(4);
	System.out.println("*************DELETE BY INDEX*************");
	s.DeleteByIndex(1);
	System.out.println("*************DELETE BY VALUE*************");
	s.DeleteByValue(3);
	s.DeleteByValue(35);
	s.traverse();
}
}
