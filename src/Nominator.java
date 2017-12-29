public class Nominator {


    static {
        System.out.println("Init Nominator class");
    }

    private String name;
    private int nominatorAwardQuantityLimit;
    private float nominatorAwardAmountLimit;


    public int getNominatorAwardQuantityLimit() {
        return nominatorAwardQuantityLimit;
    }

    public float getNominatorAwardAmountLimit() {
        return nominatorAwardAmountLimit;
    }

    public void setNominatorAwardQuantityLimit(int nominatorAwardQuantityLimit) {
        this.nominatorAwardQuantityLimit = nominatorAwardQuantityLimit;
    }

    public void setNominatorAwardAmountLimit(float nominatorAwardAmountLimit) {
        this.nominatorAwardAmountLimit = nominatorAwardAmountLimit;
    }

    public Nominator(int nominatorAwardQuantityLimit, float nominatorAwardAmountLimit) {
        this.nominatorAwardQuantityLimit = nominatorAwardQuantityLimit;
        this.nominatorAwardAmountLimit = nominatorAwardAmountLimit;
    }

    public Nominator(String name) {
        this.name = name;
    }

    public void nominate(Award award, Nominee nominee) {
        System.out.println(award.getValue());
        System.out.println(nominee.getName());
        nominee.receiveAward(award);

    }

    public void giveAward(Award award) {

    }

}


