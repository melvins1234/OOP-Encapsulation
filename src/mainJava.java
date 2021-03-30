import java.util.Random;

public class mainJava {

    static Random rand = new Random();

    public static void main(String args[]){


        System.out.println(RandomBoyName());



    }

    public static String RandomBoyName(){

        String Name[]= {"Rey", "Aron", "Mike", "Steve", "John"};

        return Name[rand.nextInt(5)];

    }

}
