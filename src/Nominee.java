public class Nominee {


    static {
        System.out.println("Init Nominee class");
    }

    private String name;

    public Nominee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void receiveAward(Award award) {
        if (award.getSoli() == 0) {
            // soli is not defined
            System.out.println("Re-calculation has not been applied: " + award.getValue());
        } else {
            // soli is defined
            float valueWithSoli;
            valueWithSoli = award.getValue() * award.getSoli();
            float differenceInPercentages;
            differenceInPercentages = (award.getSoli() - 1) * 100;
            System.out.println("Re-calculation has been applied. Soli: " + award.getSoli() + ", the new re-calculated value: " +
                    valueWithSoli + ", difference in percentage: " + differenceInPercentages);
        }

    }
}
