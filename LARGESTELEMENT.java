import java.util.Scanner;
public class SMALLESTANDLARGESTELEMENT {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int[][] Array = new int[2][2];

        System.out.print("Enter the Elements - ");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                Array[i][j]= input.nextInt(); // taking user input 
            }
        }
        
       

        int large = Array[0][0];

        // finding largest element 

        for(int i= 0; i<2; i++)
        {
            for(int j= 0; j<2; j++)
            {
                if(large<Array[i][j])
                {
                    large = Array [i][j];
                }
            }
        }

        int small = Array[0][0];

        // finding lsmallst element 

        for(int i= 0; i<2; i++)
        {
            for(int j= 0; j<2; j++)
            {
                if(small>Array[i][j])
                {
                    small = Array [i][j];
                }
            }
        }

        System.out.println("Largest element = "+large);
        System.out.println("Smallest element  = "+small);

    }
    
}
