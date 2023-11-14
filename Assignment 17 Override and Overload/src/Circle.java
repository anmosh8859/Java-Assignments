public class Circle{
    private float radius;
    void setRadius(float radius){
        this.radius=radius;
    }
    float getRadius(){
        return radius;
    }
    double getArea(){
        return 3.14*radius*radius;
    }
}
class ThickCircle extends Circle{
    private float thickness;
    void setThickness(float thickness){
        this.thickness=thickness;
    }
    float getThickness(){
        return thickness;
    }
    double getArea(){
        return (super.getArea()-(3.14*(super.getRadius()-thickness)*(super.getRadius()-thickness)));
    }
}