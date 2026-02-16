class Student {
    int rollNo;

    void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    int getRollNo() {
        return rollNo;
    }
}

class Test extends Student {
    int sub1;
    int sub2;

    void setMarks(int sub1, int sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    void getMarks() {
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
    }
}

interface Sports {
    int sMarks = 20;

    void setSportsMarks(int marks);
}

class Result extends Test implements Sports {
    int sportsMarks;

    public void setSportsMarks(int marks) {
        sportsMarks = marks;
    }

    void display() {
        int total = sub1 + sub2 + sportsMarks;
        System.out.println("Roll No: " + getRollNo());
        getMarks();
        System.out.println("Sports Marks: " + sportsMarks);
        System.out.println("Total Marks: " + total);
    }
}

public class ResultTest {
    public static void main(String[] args) {
        Result r = new Result();
        r.setRollNo(101);
        r.setMarks(85, 90);
        r.setSportsMarks(18);
        r.display();
    }
}
