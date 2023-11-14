class Distance {
    private int km,m,cm;
    public void setDistance(int x,int y,int z){
        km=x;
        m=y;
        cm=z;
    }
    public void displayDistance(){
        System.out.println(km+" km "+m+" m "+cm+" cm ");
    }
    public Distance addDistance(Distance d){
        Distance temp= new Distance();
        temp.cm=cm+d.cm;
        temp.m=temp.cm/100+m+d.m;
        temp.cm%=100;
        temp.km=temp.m/1000+km+d.km;
        temp.m%=1000;
        return temp;
    }
}