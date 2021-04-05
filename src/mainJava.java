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
    public static String generateGirlName(){
        String girlName[] = {"Olivia", "Emma", "Ava", "Sophia", "Isabella"};
        return girlName[rand.nextInt(5)];
    }

    static String generateRelationships()
    {
        String[] relationship = {"hates", "loves", "is indifferent to", "is angry with", "is apologetic to"};

        return relationship[(int)(Math.random()*5)];
    }

}
