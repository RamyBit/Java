import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[][] seats ={
                {0,0,0,1,1,1,0,0,1,1},
                {1,1,0,1,0,1,1,0,0,0},
                {1,1,1,1,1,1,1,1,1,1},
                {0,0,0,1,1,1,1,0,0,0},
                {0,1,1,1,0,0,0,1,1,1}
        };
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        if(seats[row-1][column-1] == 0){
            System.out.printf("Free");
        }else{
            System.out.println("Sold");
        }



    }
}