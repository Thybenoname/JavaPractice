import java.util.Scanner;

class Powers{
    public static void main(String args[]){
        double n;
        Scanner Obj = new Scanner(System.in);
        System.out.print("Number:  ");
        n = Obj.nextDouble();
        System.out.println(n);
        System.out.println(n * n);
        System.out.println(n * n * n);
        System.out.println(Math.pow(n, 4));
    }
}


