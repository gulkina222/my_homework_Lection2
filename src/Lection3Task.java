import java.util.Random;

public class Lection3Task {

    public static void main(String[] args) {
        Award a, b, c, d, e, f;
        a = new Award(250, 0.846575f);
        b = new Award(350);
        c = new Award(450, 1.003434f);
        d = new Award(550);
        e = new Award(650, 2.5464563f);
        f = new Award(750);

        Nominee james, david, adam;
        james = new Nominee("James");
        david = new Nominee("David");
        adam = new Nominee("Adam");
        james.receiveAward(a);
        james.receiveAward(b);
        david.receiveAward(c);
        david.receiveAward(d);
        adam.receiveAward(e);
        adam.receiveAward(f);


        double quantityB, quantityD, quantityF;
        double randomC;
        int randomZ;
        Random rand = new Random();

        randomZ = rand.nextInt(50);
        randomC = rand.nextDouble();
        quantityB = calculateQuantity(randomC, 3, randomZ, b.getValue());
        System.out.println("Quantity B: " + quantityB);

        randomZ = rand.nextInt(50);
        randomC = rand.nextDouble();
        quantityD = calculateQuantity(randomC, 3, randomZ, d.getValue());
        System.out.println("Quantity D: " + quantityD);

        randomZ = rand.nextInt(50);
        randomC = rand.nextDouble();
        quantityF = calculateQuantity(randomC, 3, randomZ, f.getValue());
        System.out.println("Quantity F: " + quantityF);


        /**
         * create new object Nominator with parameters: max quantity of award that can give Nominator; max amount of award that can give Nominator
         * */
        Nominator nominator = new Nominator(5, 500.00f);

        /**
         * create new object Nominee with parameters: max quantity of award that can receive Nominee; max amount of award that can receive Nominee
         */
        Nominee nominee = new Nominee (5, 500.00f);

        Nominator mike;
        mike = new Nominator("Mike");
        mike.giveAward(a);
        mike.giveAward(b);
        mike.giveAward(c);
        mike.giveAward(d);
        mike.giveAward(e);
        mike.giveAward(f);


        if (quantityB >= quantityD) {
            System.out.println("Quantity of James's awardB is not less than Quantity of David's awardD");

        } else {
            System.out.println("Quantity of James's awardB is less than Quantity of David's awardD");
        }


        if (quantityB != quantityF) {
            System.out.println("Quantity of James's awardB is not equal to Quantity of Adam's awardF");

        } else {
            System.out.println("Quantity of James's awardB is equal to Quantity of Adam's awardF");
        }

        if (quantityB > quantityD && quantityB > quantityF) {
            System.out.println("Quantity of James's awardB is the biggest");

        } else {
            System.out.println("Quantity of James's awardB is not the biggest");
        }


        if (quantityB > quantityD || quantityB > quantityF) {
            System.out.println("Quantity of James's awardB is not the smallest");

        } else {
            System.out.println("Quantity of James's awardB is the smallest");
        }
    }


    private static double calculateQuantity(double c, int population, int z, int p) {
        double quantity;
        quantity = ((z ^ 2 * (p) * (1 - p)) / (c * c)) / (1 + ((((z ^ 2 * (p) * (1 - p)) / (c * c)) - 1) / population));
        return quantity;
    }


}
