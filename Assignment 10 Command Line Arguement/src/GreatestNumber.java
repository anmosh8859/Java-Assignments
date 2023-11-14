public class GreatestNumber {
    public static void main(String[] args) {
        int flag=0;
        int i=0, j=0;
        while(j<args.length){
            A:while(j<args.length){
                if(Integer.parseInt(args[i])>Integer.parseInt(args[j]))
                    j++;
                else{
                    i=j;
                    j++;
                    break;
                }
            }
        }
        System.out.println(Integer.parseInt(args[i])+" is gratest");
    }
}
