
package project_01;


public class Baitap1 {
 static int soNguyenTo(int n) {
    int i;
        if (n < 2) {
            return 0;
        }
        for ( i = 2; i <= math.sqrt(n); i++) {
            if (n % i == 0) {
                break;
            }
        }
        return n;
    }

     static int soLe(int j) {
        if(j % 2 != 0){
        return j;
         }
        }
 
    public static void main(String[] args) {
        // TODO code application logic here
      int a = 13; 
        int b = 7;
        System.out.println(a);
        System.out.println(b);
 
}

    }
    

