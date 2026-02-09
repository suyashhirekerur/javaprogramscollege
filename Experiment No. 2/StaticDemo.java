class StaticDemo {

    static int count;

    static {
        count = 10;
        System.out.println("Static block executed");
    }

    static void showCount() {
        System.out.println("Count value: " + count);
    }

    public static void main(String[] args) {

        System.out.println("Main method started");

        StaticDemo.showCount();

        StaticDemo.count = 25;

        StaticDemo.showCount();
    }
}