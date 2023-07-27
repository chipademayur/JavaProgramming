// Star pattern
public class Starpattern1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Stsr pattern");
        int n=5;
        for(int i=1;i<=n;i++){               //height sathi for loop use karto.
            for(int j=1;j<=i;j++){             //pattern sathi for loop use karto.
                System.out.print("*");
            }
            System.out.println("");          //New line sathi
        }

    }
}
// Answer
// *
// **
// ***
// ****
// *****