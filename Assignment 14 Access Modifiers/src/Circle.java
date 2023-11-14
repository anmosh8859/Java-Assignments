public class Circle {
    private float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float r) {
        this.radius = r;
    }
    public double area(){
        float r=this.getRadius();
        return (double) (r*r*3.14);
    }
    public double circumference(){
        float r=this.getRadius();
        return (double) 2*3.14*r;
    }
}