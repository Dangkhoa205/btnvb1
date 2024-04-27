
package project_01;


public class Baitap1 {
 static int soNguyenTo(int n) {
    int i,j,so;
         if (n < 2) {
        return 0; 
    }

    for (j = 2; j * j <= n; j++) {
        if (n % j == 0) {
            return 0; 
        }
    }

    return n;
        
    }

      static int soLe(int j) {
        if(j % 2 != 0){
           return j;
        }
        else {
        return 0;
        }
        }
 
    public static void main(String[] args) {
        // TODO code application logic here
      int a = 13; 
        int b = 7;
      
        int ketQua = soNguyenTo(a);
    int     thongBao = soLe(b);

        
            System.out.println(ketQua);
            System.out.println(thongBao);
        } 
}

    
    

