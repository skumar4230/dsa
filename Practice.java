public class Practice{
    public static void main(String[] args) {
        int num [][] = new int[2][3];
        // Fill the array with numbers
        num[0][0]=10;
        num[0][1]=-5;
        num[0][2]=7;
        num[1][0]=8;
        num[1][1]=9;
        num[1][2]=6;
        for (int is[] : num) {
            for (int is2 :is) {
                System.out.print(is2+" ");
                // System.out.println();

                
            }
            System.out.println();
            
        }
      
    }
}