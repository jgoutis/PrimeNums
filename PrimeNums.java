import java.util.Scanner;
public class PrimeNums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Prime Numbers
        System.out.println("First number");
        int start = sc.nextInt();
        System.out.println("Last number");
        int end = sc.nextInt();
        int[] nums = new int[end-start];
        int counter = 0;
        boolean skip = false;

        for(int i = start; i<=end; i++){
            if(i == 2){
                nums[counter] = 2;
                counter++;
            }
            else if(i == 1 || i <= 0){
                continue;
            }
            else if(i % 2 == 0){
                continue;
            }
            else{
                for(int j = 2; j<i/2;j++){
                    if(i%j == 0){
                        skip = true;
                        break;
                    }
                }
                if(skip){
                    skip = false;
                    continue;
                }
                else{
                    nums[counter] = i;
                    counter++;
                }
            }
        }
        for(int i = 0; i<counter;i++){
            System.out.println(nums[i]);
        }
    }
}
