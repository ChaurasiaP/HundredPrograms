public class DoubleRepeat {
    public static void main(String[] args) {
        int[] a = {2, 4, 3, 2, 4};
        int[] b = new int[a.length];
        int k = 0;

        for (int i = 0; i < a.length; i++) {    // iterating the outer loop
            int count = 0;    // counter inittialized to ZERO
            for (int j = 0; j < a.length; j++) {  //iterating inner to check and compare elements
                if (a[i] == a[j]) {   // incrementing counter if match is found
                    count++;
                }
            }
            if (count > 1) {    // if counter is more than 1
                b[k] = (a[i] + a[i]);   // storing doubled values to a new array with k index
                k++;
            } else {
                b[k] = a[i];    // storing non repeating digit as it is
                k++;
            }
        }
        for (int l : b) {   // foreach to print the new doubled array
            System.out.print(l + " ");
        }
    }
}
