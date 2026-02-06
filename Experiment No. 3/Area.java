import java.util.Scanner;

public class Area {
    private int length;
    private int breadth;

    public void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();

        Area rect = new Area();
        rect.setDim(length, breadth);

        System.out.println("Area of rectangle: " + rect.getArea());
    }
}
