package Homework.상속;

import javax.security.auth.Subject;

public class Student {
  private String name;
  private String subject;
  private int fee;
  private double returnFee;

  public void calcReturnFee(){
    if(this.subject.equals("javaprogram")){
      this.returnFee = fee*0.25;
    }else if(this.subject.equals("jsprogram")){
      this.returnFee = fee*0.2;
    }
  }
  public void print(){
    System.out.println(this.name + "씨의 과정명은 " + this.subject + " 이고 교육비는 " + this.fee + " 이며 환급금은 " + (int)this.returnFee + " 입니다.");
  }
  public Student(){}
  public Student(String name, String subject, int fee) {
    this.name = name;
    this.subject = subject;
    this.fee = fee;
  }

  public static void main(String args[]){
    Student stu = new Student("차은우", "jsprogram", 500000);
    stu.calcReturnFee();
    stu.print();
  }
}