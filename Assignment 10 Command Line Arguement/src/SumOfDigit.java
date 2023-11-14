public class SumOfDigit {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i< args.length;i++){
            int num=Integer.parseInt(args[i]);
            System.out.print("Sum of digits of "+num);
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            System.out.println(" is "+ sum);
            sum=0;
        }
    }
}
