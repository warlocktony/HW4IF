import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();


    }

    public static void task1() {
        System.out.println("task 1");
        int age = 15;
        if (age >= 18) {

            System.out.println("If age people equally " + age + " than he is adult");

        } else {
            System.out.println("If age people equally " + age + " than he isn't adult,need more time");

        }

    }

    public static void task2() {
        System.out.println("task 2");
        int temp = 4;
        if (temp < 5) {
            System.out.println("On street " + temp + " temp,on street is cold " + " need take hat");

        } else {

            System.out.println("On street " + temp + " temp,today is hot " + " you may go with out hat");


        }
    }

    public static void task3() {
        System.out.println("task 3");
        int speedKmHour = 70;
        if (speedKmHour > 60) {

            System.out.println("If speed " + speedKmHour + " ,than speed exceeded " + " need to pay tax");

        } else {
            System.out.println("If speed " + speedKmHour + " ,than speed not exceeded " + " you may drive fine");

        }
    }

    public static void task4() {
        System.out.println("task 4");
        int age = 61;

        if (age <2) {
            System.out.println("if age of people " + age + " go to sleep");
        }else if(age >=2 && age <=6){
            System.out.println("if age of people " + age + " go to kindergarten");
        }else if(age >=7 && age <=18){
            System.out.println("if age of people " + age + " go to school");
        }else if(age >18 && age <24){
            System.out.println("if age of people " + age + " go to university");
        }else if(age >=24 && age <=60){
            System.out.println("if age of people " + age + " go to work");
        }else if(age >60){
            System.out.println("if age of people " + age + " go to chill");
        }
    }

    public static void task5() {
        System.out.println("task 5");
        int ageChildren = 15;
        if (ageChildren <5 ) {
            System.out.println("if age of children " + ageChildren + " dont ride on attraction");
        }else if(ageChildren >=5 && ageChildren <14){
            System.out.println("if age of children " + ageChildren + " may ride on attraction with adult");
        }else if(ageChildren >=14){
            System.out.println("if age of children " + ageChildren + " may ride on attraction without adult");

        }
    }

    public static void task6() {
        System.out.println("task 6");
        int people = 40;
        int wagonPlaces = 102;
        int seatPlaces = 60;
        int stayPlaces = wagonPlaces - seatPlaces;

        if (people > wagonPlaces) {
            System.out.println("wagon is full");
        }else if(people < wagonPlaces && people < seatPlaces ) {
            System.out.println("there are free seatsplaces");
        }else if(people < wagonPlaces && people > seatPlaces){
            System.out.println("there are not seats places,there are only stay places");



        }
    }

    public static void task7() {
        System.out.println("task 7");
        int one =1000;
        int two =200;
        int three =30;
        if (one > two && one > three) {
            System.out.println("numver one most big of all");
        }else if(two > one && two > three) {
            System.out.println("number two most big of all");
        }else if(three > one && three > two){
            System.out.println("number tree most big of all");
        }




    }
}




