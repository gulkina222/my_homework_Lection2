public class Nominee {

    static {
        System.out.println("Init Nominee class");
    }

    private String name;
    private int nomineeAwardQuantityLimit;
    private float nomineeAwardAmountLimit;

    public int getNomineeAwardQuantityLimit() {
        return nomineeAwardQuantityLimit;
    }

    public float getNomineeAwardAmountLimit() {
        return nomineeAwardAmountLimit;
    }

    public void setNomineeAwardQuantityLimit(int nomineeAwardQuantityLimit) {
        this.nomineeAwardQuantityLimit = nomineeAwardQuantityLimit;
    }

    public void setNomineeAwardAmountLimit(float nomineeAwardAmountLimit) {
        this.nomineeAwardAmountLimit = nomineeAwardAmountLimit;
    }

    public Nominee(int nomineeAwardQuantityLimit, float nomineeAwardAmountLimit) {
        this.nomineeAwardQuantityLimit = nomineeAwardQuantityLimit;
        this.nomineeAwardAmountLimit = nomineeAwardAmountLimit;
    }

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

