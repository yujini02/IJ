package day13.inheritance실습.level01.No1;

public class Student {

    private String name;
    private String subject;
    private int fee;
    private double returnFee;

    public Student(String name,String subject,int fee) {
        this.name = name;
        this.subject = subject;
        this.fee = fee;

    }
    void calcReturnFee () {
        if (subject == "javaprogram") {

        } else if (subject == "jspprogram") {

        } else {
            System.out.println("그런 과정은 없습니다");
        }
    }
    void print(){

    }
  public static void main(String args[]) {
      Student stu = new Student("장동건", "jspprogram",
              500000);
      stu.calcReturnFee();
      stu.print();
  }
}
