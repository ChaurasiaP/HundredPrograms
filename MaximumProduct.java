package RFP283.Day9;

import java.util.Scanner;

public class MaximumProduct {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Length of Array");
//        int size = sc.nextInt();
//        int[] a = new int[size];

        MaximumProduct maximumProductObj = new MaximumProduct();

        int[] a = { 2, -5,1,-1 };
        maximumProductObj.getMaxProduct(a);
    }

    void getMaxProduct(int[] a){

        int maxProduct = 0; //assuming initial max_product is ZERO
        int num1 = a[0];
        int num2 = a[1];

        for(int i=0; i<a.length-1; i++){    // iterating till length -1 ( since j will iterate from i+1)
            int x = a[i];

            for(int j=i+1; j<a.length; j++){
                int y = a[j];
                int product = x*y;

                if(product>maxProduct){ // checking and assigning product value if its greater than maxProduct
                    maxProduct = product;
                    num1 = a[i];
                    num2 = a[j];
                }
                if(maxProduct == 0 ){       // if maxProduct is negative then the lesser negative will be assigned to maxProduct
                    maxProduct = a[i]*a[j];
                    num1 = a[i];
                    num2 = a[j];
                }
            }
        }
        System.out.println("The pair is: "+num1+", "+num2);
        System.out.println("Max product from array is: "+maxProduct);
    }
}
