import java.util.*;
public class reverseAnumber {
    public static void main (String[]args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        // Using algorithm
        /*int rev =0;
        while (num!=0) {
            rev = rev*10 + num%10;
            num = num/10;
        }*/

        //Using String buffer class
        /*StringBuffer bff = new StringBuffer(String.valueOf(num));
        StringBuffer rev = bff.reverse(); */

        //String Builder class
        StringBuilder sbd = new StringBuilder();
        sbd.append(num);
         StringBuilder rev = sbd.reverse();

        System.out.println("Reversed number is:"+ rev);
    } 
}
