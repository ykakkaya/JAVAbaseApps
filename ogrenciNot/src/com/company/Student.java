package com.company;

public class Student {
    Course course1;
    Course course2;
    Course course3;
    Course course4;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    public Student(){

    }

    public void addBulkExam(int note1,int note2,int note3,int note4){
        this.course1.note=note1;
        this.course2.note=note2;
        this.course3.note=note3;
        this.course4.note=note4;

    }
    public void isPass(){
        calcAvarege();
        if(this.avarage>=45){
            this.isPass=true;
            System.out.println("sınıfı geçtiniz ve not ortalamanız: "+this.avarage);
        }else{
            this.isPass=false;
            System.out.println("sınıf tekrarı yapmalısınız not ortalamanız: "+this.avarage);
        }

    }
    public void  calcAvarege(){
        this.avarage=((course1.note+course2.note+course3.note+course4.note)/4.0);

    }
    public void printNote(){
        System.out.println("==========================================");
        System.out.println(this.name+" ve "+ this.stuNo+" nolu öğrencinin ");
        System.out.println(course1.name+" dersi notu: "+course1.note);
        System.out.println(course2.name+" dersi notu: "+course2.note);
        System.out.println(course3.name+" dersi notu: "+course3.note);
        System.out.println(course4.name+" dersi notu: "+course4.note);
        System.out.println("==========================================");

    }
}
