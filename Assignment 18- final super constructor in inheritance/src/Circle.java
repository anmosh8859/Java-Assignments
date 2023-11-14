public class Circle {
    protected float radius;
    static final float PI;
    static {
        PI= 3.14F;
    }
    {
        radius=5;
    }

    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }
    public double getArea(){
        return (Circle.PI*this.radius*this.radius);
    }
}
