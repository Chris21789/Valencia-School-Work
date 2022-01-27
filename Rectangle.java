package project;

class Rectangle {
	private double length, width;
    public void setLength(double length) {
        this.length = length;
    }    
    public double getLength() {
        return length;
    }	
   public void setWidth(double width) {
        this.width = width;
    }	
     public double getWidth() {
        return width;
    } 
     public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
     public Rectangle() {
        length = 0;
        width = 0;
    }
    public double computeArea(){
        return this.length * this.width;
    }
}