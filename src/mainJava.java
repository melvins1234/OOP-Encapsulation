import java.util.Random;

public class mainJava {

    static Random rand = new Random();

    public static void main(String args[]){

        BoyClass boyClass = new BoyClass();
        GirlClass girlClass = new GirlClass();
        Relationship relationship = new Relationship();


        String boyName[]= {"Rey", "Aron", "Mike", "Steve", "John"};
        String girlName[] = {"Olivia", "Emma", "Ava", "Sophia", "Isabella"};
        String[] relationships = {"hates", "loves", "is indifferent to", "is angry with", "is apologetic to"};

        boyClass.setBoyName(boyName);
        girlClass.setGirlName(girlName);
        relationship.setRelationship(relationships);


        System.out.println(boyClass.getBoyName()[rand.nextInt(5)]+" " +
                relationship.getRelationship()[rand.nextInt(5)] + " "
                +girlClass.getGirlName()[rand.nextInt(5)]);

    }

}
