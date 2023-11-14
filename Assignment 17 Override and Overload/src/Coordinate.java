public class Coordinate {
    private float x,y;
    
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    double getDistance(){
        return (Math.sqrt((x*x)+(y*y)));
    }
    double getDistance(int x1, int y1){
        return (Math.sqrt(Math.pow((x-x1), 2)+Math.pow((y-y1), 2)));
    }
}