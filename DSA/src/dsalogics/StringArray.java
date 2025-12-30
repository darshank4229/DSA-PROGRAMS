package dsalogics;

class StringArra {
    String[] a;
    public StringArra(int size) {
        this.a = new String[size];
        
    }
    public void insert(int index, String value) {
        try {
            if (a[index] == null) {
                a[index] = value;
              
                System.out.println("The value: " + value + " is inserted");
            } else {
                System.out.println("The cell is already filled");
            }
        } catch (Exception e) {
            System.out.println("Invalid index");
        }
    }
    public void traverse() {
        for (int i = 0; i < a.length; i++) {
            System.out.println("At " + i + " index -> the value: " + a[i]);
        }
    }
    public void SearchByValue(String value) {
        try {
            for (int i = 0; i < a.length; i++) {
                if (value.equals(a[i])) {
                    System.out.println("Found the value: " + value + " at the index " + i);
                    return;
                }
            }
            System.out.println("The value is not present");
        } catch (Exception e) {
            System.out.println("Invalid value enter the correct value");
        }
    }
    public void SearchByIndex(int index) {
        try {
            if (a[index] != null) {
                System.out.println("The value: " + a[index] + " present at the index: " + index);
            } else {
                System.out.println("No value present at the index: " + index);
            }
        } catch (Exception e) {
            System.out.println("Invalid index");
        }
    }

    public void DeleteByValue(String value) {
        try {
            for (int i = 0; i < a.length; i++) {
                if (value.equals(a[i])) {                 
                    System.out.println("Deleted the value: " + value + " from the index " + i);
                    a[i] = null; 
                    return;
                }
            }
            System.out.println("The value is not present");
        } catch (Exception e) {
            System.out.println("Invalid value enter the correct value");
        }
    }

    public void DeleteByIndex(int index) {
        try {
            if (a[index] != null) {
                System.out.println("The value: " + a[index] + " deleted from the index: " + index);
                a[index] = null;
                return;
            } else {
                System.out.println("No value present at the index: " + index);
            }
        } catch (Exception e) {
            System.out.println("Invalid index");
        }
    }
}
public class StringArray {
    public static void main(String[] args) {
        StringArra s = new StringArra(5);
        System.out.println("*************INSERTION*************");
        s.insert(0, "apple");
        s.insert(2, "orange");
        s.insert(1, "banana");
        s.insert(4, "grapes");
        s.insert(3, "watermelon");
        System.out.println("*************TRAVERSE*************");
        s.traverse();
        System.out.println("*************SEARCH BY VALUE*************");
        s.SearchByValue("apple");
        System.out.println("*************SEARCH BY INDEX*************");
        s.SearchByIndex(2);
        System.out.println("*************DELETE BY INDEX*************");
        s.DeleteByIndex(4);
        System.out.println("*************DELETE BY VALUE*************");
        s.DeleteByValue("avcado");
        s.DeleteByValue("watermelon");
        s.traverse();
    }
}