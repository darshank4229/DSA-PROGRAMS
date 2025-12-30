package dsalogics;



class TwoDimentionArray {
    int[][] a;
 

    public TwoDimentionArray(int rows, int cols) {
        a = new int[rows][cols];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void insert(int row, int col, int value) {
        try {
            if (a[row][col] == Integer.MIN_VALUE) {
                a[row][col] = value;
                System.out.println("Value " + value + " inserted at [" + row + "," + col + "]");
            } else {
                System.out.println("Cell already filled");
            }
        } catch (Exception e) {
            System.err.println("Invalid index");
        }
    }

    public void traverse() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print( "  " + a[i][j]);
            }
            System.out.println();
        }
    }

    public void searchByValue(int value) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == value) {
                    System.out.println("Found value " + value + " at [" + i + "," + j + "]");
                    return;
                }
            }
        }
        System.out.println("Value not found");
    }

    public void searchByIndex(int row, int col) {
        try {
            if (a[row][col] != Integer.MIN_VALUE) {
                System.out.println("Value " + a[row][col] + " present at [" + row + "," + col + "]");
            } else {
                System.out.println("Cell is empty");
            }
        } catch (Exception e) {
            System.err.println("Invalid index");
        }
    }

    public void deleteByValue(int value) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == value) {
                    a[i][j] = Integer.MIN_VALUE;
                    System.out.println("Deleted value " + value + " from [" + i + "," + j + "]");
                    return;
                }
            }
        }
        System.out.println("Value not found");
    }

    public void deleteByIndex(int row, int col) {
        try {
            if (a[row][col] != Integer.MIN_VALUE) {
                System.out.println("Deleted value " + a[row][col] + " from [" + row + "," + col + "]");
                a[row][col] = Integer.MIN_VALUE;
            }
        } catch (Exception e) {
            System.err.println("Invalid index");
        }
    }
}

public class two {
    public static void main(String[] args) {

        TwoDimentionArray t = new TwoDimentionArray(2, 2);
        System.out.println("******** INSERTION ********");
        t.insert(0, 0, 10);
        t.insert(0, 1, 20);
        t.insert(1, 0, 30);
        t.insert(1, 1, 40);
        System.out.println("******** TRAVERSE ********");
        t.traverse();
        System.out.println("******** SEARCH BY VALUE ********");
        t.searchByValue(20);
        System.out.println("******** SEARCH BY INDEX ********");
        t.searchByIndex(1, 2);
        System.out.println("******** DELETE BY INDEX  ********");
        t.deleteByIndex(0, 1);
        System.out.println("******** DELETE BY VALUE  ********");
        t.deleteByValue(30);

        t.traverse();
    }
}

