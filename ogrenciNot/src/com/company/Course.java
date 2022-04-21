package com.company;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;

        int note=0;
    }

    public void addTeacher(Teacher teacher){
        if(this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
        }else{
            System.out.println(teacher.name+" bu dersi veremez");
        }

    }

    public void printTeacher(){
        if(teacher!=null){
            System.out.println(this.name+" dersinin hocası: "+teacher.name);
        }else{
            System.out.println("bu derse hoca atanmamıştır.");
        }


    }


}
