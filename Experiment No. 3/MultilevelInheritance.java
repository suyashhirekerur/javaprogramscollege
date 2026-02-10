class Student {
    int rollNo;

    void setRollNo(int r) {
        rollNo = r;
    }
}

class Test extends Student {
    int sub1, sub2;

    void setMarks(int s1, int s2) {
        sub1 = s1;
        sub2 = s2;
    }
}

class Result extends Test {
    void displayResult() {

        int total = sub1 + sub2;
        System.out.println("Roll No: " + rollNo);
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("Total Marks: " + total);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Result r = new Result();
        r.setRollNo(101);
        r.setMarks(70, 80);
        r.displayResult();
    }
}
