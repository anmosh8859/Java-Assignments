public class Circle {
    private Integer radius;

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }
    Double getCircumference(){
        return (2*3.14*getRadius());
    }
}
