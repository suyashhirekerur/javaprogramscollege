class Floor {
    public double apply(double num) {
        return Math.floor(num);
    }
}

class Ceil {
    public double apply(double num) {
        return Math.ceil(num);
    }
}

class Round {
    public long apply(double num) {
        return Math.round(num);
    }
}

public class MathOperations {
    public static void main(String[] args) {
        double number1 = 5.7;
        double number2 = 3.3;

        Floor floor = new Floor();
        Ceil ceil = new Ceil();
        Round round = new Round();

        System.out.println("Number: " + number1);
        System.out.println("Floor: " + floor.apply(number1));
        System.out.println("Ceil: " + ceil.apply(number1));
        System.out.println("Round: " + round.apply(number1));

        System.out.println();

        System.out.println("Number: " + number2);
        System.out.println("Floor: " + floor.apply(number2));
        System.out.println("Ceil: " + ceil.apply(number2));
        System.out.println("Round: " + round.apply(number2));
    }
}