public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(7);
        System.out.println("Circumference: "+c.getCircumference());
        MarkSheet ms= new MarkSheet();
        ms.setChem(100);
        ms.setEng(97);
        ms.setHin(26);
        ms.setMath(55);
        ms.setPhy(95);
        System.out.println("Highest Marks: "+ms.maxMarks());
        System.out.println("Average Marks: "+ms.avgMarks());
        ms.checkResult(300);
    }
}