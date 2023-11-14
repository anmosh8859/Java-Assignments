public class MarkSheet {
    private Integer phy,chem,math,eng,hin;

    public Integer getPhy() {
        return phy;
    }

    public void setPhy(Integer phy) {
        this.phy = phy;
    }

    public Integer getChem() {
        return chem;
    }

    public void setChem(Integer chem) {
        this.chem = chem;
    }

    public Integer getMath() {
        return math;
    }

    public void setMath(Integer math) {
        this.math = math;
    }

    public Integer getEng() {
        return eng;
    }

    public void setEng(Integer eng) {
        this.eng = eng;
    }

    public Integer getHin() {
        return hin;
    }

    public void setHin(Integer hin) {
        this.hin = hin;
    }
    public Integer maxMarks(){
        int arr[],i=0,j=0;
        arr = new int[5];
        arr[0]=hin;//85
        arr[1]=eng;//90
        arr[2]=math;//55
        arr[3]=phy;//95
        arr[4]=chem;//100
        while(j<arr.length){
            if(arr[i]<=arr[j])
                i=j;
                j++;
        }
        return arr[i];
    }
    public double avgMarks(){
        return (hin+eng+math+phy+chem)/5.0;
    }
    public void checkResult(int passMarks){
        if(hin+eng+math+phy+chem<passMarks)
            System.out.println("Failed");
        else System.out.println("Passed");
    }
}
