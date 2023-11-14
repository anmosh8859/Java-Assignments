public class AddNNumbers {
    public static void main(String[] args) {
        Integer sum=0;
        for(int i=0;i<args.length;i++)
            sum+=Integer.parseInt(args[i]);
        System.out.println("Sum: "+sum);
    }
}
