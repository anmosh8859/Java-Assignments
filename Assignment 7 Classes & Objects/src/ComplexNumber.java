public class ComplexNumber {
    int real,imaginary;
    void setValues(int x, int y){
        real=x;
        imaginary=y;
    }
    void showValues(){
        System.out.println("Complex Number: "+real+"+"+imaginary+"i");
    }

    public static void main(String[] args) {
        ComplexNumber cn=new ComplexNumber();
        cn.setValues(5,4);
        cn.showValues();
    }
}
