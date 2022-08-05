public class Main {
    public static void main(String[] args) {
        hw4Ex1();//первое домашнее задание
        hw4Ex2();//второе домашнее задание
        hw4Ex3();//Третье домашнее задание
        hw4Ex4();//Четвертое домашнее задание
        hw4Ex5();//Пятое домашнее задание
    }
    public static void hw4Ex1() {

        int clientIOS = 0;
        if (clientIOS==0) {
            System.out.println("Установите версию приложения для IOS по ссылке");}

        if (clientIOS==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public  static void hw4Ex2(){
        int clientDeviseYear = 2013;
        int OSClient= 1 ;
        if (clientDeviseYear<2015&&OSClient==0) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } if (clientDeviseYear>2015&&OSClient==0) {
            System.out.println("Установите  версию приложения для IOS по ссылке");
        }
        if (clientDeviseYear<2015&&OSClient==1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }if (clientDeviseYear>2015&&OSClient==1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }
    public  static void hw4Ex3(){
        int year = 2021;

        //boolean visokosnyYear=true ;
        if (year%4==0 && year % 100 != 0|| year%400==0) {
            System.out.println(year+" является высокосным годом");
        }else {
            System.out.println(year+" не является высокосным годом");
        }




    }
    public static void hw4Ex4(){
        int deliveryDistant = 30;
        int deliviryDays = 1;

        if (deliveryDistant>20) {
            deliviryDays++;
        }
        if (deliveryDistant>60) {
            deliviryDays++;
        }

        System.out.println("На доставку потребуется " +deliviryDays+   " дня");




        //System.out.println("Потребуется дней ");
    }
    public static void hw4Ex5(){
        int monthNumber = 5;
        switch (monthNumber) {
            case 12 :
            case 1 :
            case 2 :
                System.out.println("Winter");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Spring");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("Summer");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("Summer");
                break;

            default :
                System.out.println("Такого месяца нет");


        }

    }
}