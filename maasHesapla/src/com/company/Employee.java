package com.company;

import java.util.Optional;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax,bonus,zam;

    public Employee(String name,double salary, int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public void tax(){
        if(this.salary<1000){
            System.out.println("vergi dilimine girmediniz. maaşınız: "+this.salary);
        }else{
             tax=this.salary*0.03;
            System.out.println(tax);



        }
    }
    public void bonus(){
        if(this.workHours>=40){
            bonus= (this.workHours-40)*30;
            System.out.println("alacağınız mesai ücreti: "+ bonus);


        }
    }
    public void raiseSalary(){
        int year= 2022-this.hireYear;
        if(year<10){
            zam=this.salary*0.05;
            System.out.println(zam);



        }else if(year>=10 && year<20){
            zam=this.salary*0.10;
            System.out.println(zam);


        }else if(year>=20){
            zam=this.salary*0.15;
            System.out.println(zam);


        }
    }

    public void employeePrint(){
        System.out.println("Adi: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("çalışma saati: "+this.workHours);
        System.out.println("işe başlama yılı: "+this.hireYear);
        System.out.print("vergi: ");
        tax();
        System.out.print("bonus ödeme ");
        bonus();
        System.out.print("kıdem maaş artışı ");
        raiseSalary();
        System.out.println("vergi ne bonuslar ile  toplam maaş:  "+(this.salary-tax+bonus+zam));
        System.out.println("toplam mmas: "+(this.salary+zam));

    }

}
