class Circle {
    private double radius;


    protected Circle(double radius){
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
    double areaCircle(double radius){
        return 3.14*radius*radius;
    }
}
