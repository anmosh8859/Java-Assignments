public class Time {
    private int hr,min,sec;

    private void setHr(int hr) {
        this.hr = hr;
    }

    private void setMin(int min) {
        this.min = min;
    }

    private void setSec(int sec) {
        this.sec = sec;
    }

    public int getHr() {
        return hr;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }
    Time(){

    }
    Time(int hr){
        setHr(hr);
    }
    Time(int hr, int min, int sec){
        setHr(hr);
        setMin(min);
        setSec(sec);
    }
}
