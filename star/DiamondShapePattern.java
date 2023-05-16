package star;

public class DiamondShapePattern {
    public static void main(String[] args) {
        int n = 5;

        //with space
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=n-2;i>=0;i--){
            for (int j=i;j<n;j++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
