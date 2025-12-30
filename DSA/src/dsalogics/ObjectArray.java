package dsalogics;

class Details{
	private String name;
	private String email;
	private int age;
	public Details(String name, String email, int age) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public int getAge() {
		return age;
	}
}



class Single {
    Details[] d;
    public Single(int size) {
        this.d = new Details[size];
        
    }
    public void insert(int index, String name,String email,int age) {
        try {
            if (d[index] == null) {
                d[index] = new Details(name, email, age);
              
                System.out.println("The value: " + name + " is inserted");
            } else {
                System.out.println("The cell is already filled");
            }
        } catch (Exception e) {
            System.out.println("Invalid index");
        }
    }
    public void traverse() {
    	System.out.println("SEATNO:\t NAME:\t EMAIL:\t\t AGE:");
        for (int i = 0; i < d.length; i++) {
        	if(d[i]!=null)
            System.out.println(i+1+"\t"+ d[i].getName()+"\t "+d[i].getEmail()+"\t"+d[i].getAge());
        }
    }
    public void SearchByName(String name) {
        try {
            for (int i = 0; i < d.length; i++) {
                if (name.equals(d[i].getName())) {
                    System.out.println("Found the Dtails: " + name + " at the index " + i);
                    return;
                }
            }
            System.out.println("The value is not present");
        } catch (Exception e) {
            System.out.println("Invalid value enter the correct value");
        }
    }
    public void SearchBySeatNo(int i) {
        try {
            if (d[i] != null) {
                System.out.println("The Details: " +  d[i].getName()+" "+d[i].getEmail()+" "+d[i].getAge() + " present at the index: " + i);
            } else {
                System.out.println("No value present at the index: " + i);
            }
        } catch (Exception e) {
            System.out.println("Invalid index");
        }
    }

    public void DeleteByName(String name) {
        try {
            for (int i = 0; i < d.length; i++) {
                if (name.equals(d[i].getName())) {                 
                    System.out.println("Deleted the value: " + name + " from the index " + i);
                    d[i] = null; 
                    return;
                }
            }
            System.out.println("The value is not present");
        } catch (Exception e) {
            System.out.println("Invalid value enter the correct value");
        }
    }

    public void DeleteBySeatNo(int i) {
        try {
            if (d[i] != null) {
                System.out.println("The value: " +  d[i].getName()+" "+d[i].getEmail()+" "+d[i].getAge() + " deleted from the index: " + i);
                d[i] = null;
                return;
            } else {
                System.out.println("No value present at the index: " + i);
            }
        } catch (Exception e) {
            System.out.println("Invalid index");
        }
    }
}

public class ObjectArray {
public static void main(String[] args) {
	Single s= new Single(5);
	System.out.println("**************INSERT**************");
	s.insert(0, "darshan", "darshan@gmail",21);
	s.insert(2, "adi", "aadi@gmail",11);
	s.insert(3, "banu", "banu@gmail",31);
	s.insert(1, "rajesh", "rajesh@gmail",27);
	s.insert(4, "lalith", "lalith@gmail",20);
	System.out.println("**************TRAVERSE**************");
	s.traverse();
	System.out.println("**************SEARCH BY SEAT NO**************");
	s.SearchBySeatNo(0);
	System.out.println("**************SEARCH BY NAME**************");
	s.SearchByName("adi");
	System.out.println("**************DELETE BY SEAT NO **************");
	s.DeleteBySeatNo(4);
	System.out.println("**************DELETE BY NAME **************");
	s.DeleteByName("banu");
	System.out.println("**************TRAVERSE**************");
	s.traverse();
	
}
}
