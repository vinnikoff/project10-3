

import java.lang.String;

public class Main {
    public static void main(String[] args) {
     String [] arr = new String[1];

        try {
            System.out.println(arr[0].toString());
        }
        catch (NullPointerException e) {
            System.out.println("Error - null pointer");
        }
        }
}