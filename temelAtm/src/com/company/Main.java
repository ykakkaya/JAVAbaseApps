package com.company;
import java.util.*;
public class Main {
    static int bakiye;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String userName="java";
        String password="123456";

        int deneme=1;
        while(deneme<=3){
            System.out.println("kullanıcı adınızı giriniz");
            String user= scanner.nextLine();
            System.out.println("şifrenizi giriniz");
            String pass=scanner.nextLine();
            if (userName.equals(user)&& password.equals(pass)) {
                System.out.println("giriş işlemi başarılı");
                int select = 2;
                while (select > 1 && select <4) {

                    System.out.println("hangi işlemi yapmak istersiniz :" +
                            " 1 para yatırma  2 para çekme  3 bakiye sorma  4 çıkış");
                    int select2 = scanner.nextInt();
                    if (select2==4){
                        System.out.println("çıkış işlemi yapıldı");
                        select=0;
                        deneme=4;
                    }
                        switch (select2) {
                            case 1:
                            paraYatır();
                            break;
                            case 2:
                            paraCek();
                            break;
                            case 3:
                            paraBakiye();
                            break;

                        }
                }
            }else{
                if (deneme==3){
                    System.out.println("kartınız bloke oldu bankanızla görüşün");
                }
                deneme++;
            }
        }
	
    }

    public static void paraYatır(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("yatırılacak tutarı giriniz");
        int tutar= scanner.nextInt();
        bakiye+=tutar;
        System.out.println("yatırılan tutar :"+ tutar);
        System.out.println("toplam bakiye : "+ bakiye);
    }
    public static void paraCek(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("çekilecek tutarı giriniz");
        int tutar= scanner.nextInt();
        if(bakiye>=0 && bakiye>=tutar) {
            bakiye -= tutar;
        }
        System.out.println("yatırılan tutar :"+ tutar);
        System.out.println("toplam bakiye : "+ bakiye);
    }
    public static void paraBakiye(){

        System.out.println("toplam bakiye : "+ bakiye);
    }
}
