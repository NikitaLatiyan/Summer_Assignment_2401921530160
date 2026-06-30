class Box3D extends Box {

    private double height;

    public Box3D() {
        super();
        height = 0;
    }

    public Box3D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public void setDimensions(double length, double breadth, double height) {
        super.setDimensions(length, breadth);
        this.height = height;
    }

    public double volume() {
        return length * breadth * height;
    }

    public static void main(String[] args) {

        Box box = new Box(10, 5);
        System.out.println("Area = " + box.area());

        Box3D box3d = new Box3D(10, 5, 4);
        System.out.println("Area = " + box3d.area());
        System.out.println("Volume = " + box3d.volume());
    }
}
