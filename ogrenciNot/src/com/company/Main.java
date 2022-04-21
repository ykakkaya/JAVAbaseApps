package com.company;

public class Main {

    public static void main(String[] args) {
        Teacher teacher1=new Teacher("ali","555","TUR");
        Teacher teacher2=new Teacher("veli","556","TAR");
        Teacher teacher3=new Teacher("ahmet","557","MAT");
        Teacher teacher4=new Teacher("elif","558","İNG");

        Course course1= new Course("turkçe","101","TUR");
        course1.addTeacher(teacher1);
        Course course2= new Course("tarih","101","TAR");
        course2.addTeacher(teacher2);
        Course course3= new Course("matematik","101","MAT");
        course3.addTeacher(teacher3);
        Course course4= new Course("ingilizce","101","İNG");
        course4.addTeacher(teacher4);


        Student student=new Student();
        student.name="yigit";
        student.stuNo="12345";
        student.course1=course1;
        student.course2=course2;
        student.course3=course3;
        student.course4=course4;

        student.addBulkExam(100,85,90,78);
        student.printNote();
        student.isPass();





    }
}
