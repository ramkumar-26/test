package star;

public class DiamondShapePattern {
    public static void main(String[] args) {
        int n = 4;
        int count = 1;
        //without space
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                System.out.print(" ");
            }
            for (int j=0;j<count;j++){
                System.out.print("*");
            }
            count += 2;
            System.out.println();
        }
        count -= 2;
        for (int i=n-1;i>=0;i--){
            count-=2;
            for (int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for (int j=0;j<count;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
