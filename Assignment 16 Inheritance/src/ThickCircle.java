class ThickCircle extends Circle{
    private float thickness;
    public ThickCircle(double radius, float thickness){
        super(radius);
        this.thickness= thickness;
    }

    public float getThickness() {
        return thickness;
    }
    public double areaHollowSpace(){
        return areaCircle(getRadius()-thickness);
    }
    public double thicknessArea(){
            return areaCircle(getRadius())-areaHollowSpace();
    }
}