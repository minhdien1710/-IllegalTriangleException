import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a: ");
        Float a = scanner.nextFloat();
        System.out.println("nhap b: ");
        Float b = scanner.nextFloat();
        System.out.println("nhap c: ");
        Float c = scanner.nextFloat();
        try {
            if (a < 0 || b < 0 || c < 0 || a + b < c || a + c < b || b + c < a){
                throw new Exception("do dai ko hop le.");
            }
            else {
                System.out.println("day la cac canh cua mot tam giac");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());


        }


    }
}
