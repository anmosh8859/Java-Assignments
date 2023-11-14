public class FilterPrime {
    public static void main(String[] args) {
        A:for(int i=0;i< args.length;i++){
            int n=Integer.parseInt(args[i]);
            if(n%2==0 && n!=2) {
                continue A;
            }
            for(int j=3;j<n/2;j+=2){
                if(n%i==0) {
                    continue A;
                }
            }
            System.out.println(n+"Number is Prime");
        }
    }
}
