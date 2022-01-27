package project;

class ClassesAndObjects {

	public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,5);
        Rectangle rectangle2 = new Rectangle(5.7,8.1);
        System.out.println("Rectangle1 with sides "+rectangle1.getWidth()+" and "+rectangle1.getLength()+" has area "+rectangle1.computeArea());
        System.out.println("Rectangle2 with sides "+rectangle2.getWidth()+" and "+rectangle2.getLength()+" has area "+rectangle2.computeArea());

        Circle circle1 = new Circle(3.2);
        Circle circle2 = new Circle(4);
        System.out.println("Circle1 with radius "+circle1.getRadius()+" has area "+circle1.computeArea());
        System.out.println("Circle2 with radius "+circle2.getRadius()+" has area "+circle2.computeArea());
	}

}
