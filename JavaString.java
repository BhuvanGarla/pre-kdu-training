import java.util.Scanner;

class JavaString {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	
        System.out.print("Enter text1: ");
        String myString1 = input.next();
        
        System.out.print("Enter text2: ");
        String myString2 = input.next();
        
        int stringSize1= myString1.length();
        System.out.println("The length of the first string is " + stringSize1);
        
        int stringSize2= myString2.length();
        System.out.println("The length of the second string is " + stringSize2);
        
        if (stringSize2 != stringSize1) { 
            System.out.println("The length of the two strings is not the same ");
        }else{
            System.out.println("The length of the two strings are the same");
        } 
        
        boolean result=myString1.equals(myString2);
        if(result==true){
            System.out.println("Two strings are equal");
        }else{
            System.out.println("Two strings are not equal");
        }

    }
}