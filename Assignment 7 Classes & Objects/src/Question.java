public class Question {
    private int queNo;
    private String que,optionA, optionB, optionC,optionD;
    void setQuestion(int n, String q, String a, String b, String c, String d){
        queNo=n;
        que=q;
        optionA=a;
        optionB=b;
        optionC=c;
        optionD=d;
    }
    void showQuestion(){
        System.out.print("Question No: "+queNo+". ");
        System.out.println(que);
        System.out.println("A. "+optionA);
        System.out.println("B. "+optionB);
        System.out.println("C. "+optionC);
        System.out.println("D. "+optionD);
    }
    public static void main(String[] args) {
     Question q=new Question();
     q.setQuestion(1,"What is the capital of Turkey?", "Ankara", "Copenhagen", "Madrid", "Tokyo");
     q.showQuestion();
    }
}
