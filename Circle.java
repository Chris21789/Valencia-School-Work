package project;

class Circle {
    private double radius;
    public void setRadius(double radius) {
        this.radius = radius;
    }   
    public double getRadius() {
        return radius;
    }    
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle() {
        radius = 0;
    }
    public double computeArea(){
        return Math.PI*radius*radius;
    }
}