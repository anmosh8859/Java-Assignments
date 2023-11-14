import java.util.Scanner;

public class Main {
    static int[] sort(int arr[]){
        int small=arr[0];
        for(int i=0;i< arr.length;i++){
            int j;
            for(j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("How many integers you want to store?");
        int n=s.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<arr.length;i++)
            arr[i]=s.nextInt();
        System.out.println("Numbers: ");
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
        int greatest=arr[0];
        for(int i=0;i<arr.length;i++) {
            if(greatest<arr[i])
                greatest=arr[i];
        }
        System.out.println("Greatest Number: "+greatest);
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++) {
            if(smallest>arr[i])
                smallest=arr[i];
        }
        System.out.println("Smallest Number: "+smallest);
        int sum=0;
        for(int i:arr)
            sum+=i;
        System.out.println("Sum of numbers in array: "+sum);
        System.out.println("Average of Numbers stored: "+sum/n);
        System.out.println("Enter the number of which frequency you want to know: ");
        int givNum=s.nextInt();
        int frequency = 0;
        for (int i:arr) {
            if(givNum==i)
                frequency++;
        }
        System.out.println("Frequency: "+frequency);
        System.out.println("Sorted Array");
        for (int i:Main.sort(arr))
            System.out.print(" "+i);
        System.out.println();
        int sumEven=0;
        for (int i:Main.sort(arr)){
            if(i%2==0)
                sumEven+=i;
        }
        System.out.println("Sum of Even numbers in arraay: "+sumEven);
        Driver.driver();
    }
}