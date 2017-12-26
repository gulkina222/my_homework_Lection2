public class Nominator {


    static {
        System.out.println("Init Nominator class");
    }

    private String name;

    public Nominator(String name) {
        this.name = name;
    }

    public void nominate(Award award, Nominee nominee) {
        System.out.println(award.getValue());
        System.out.println(nominee.getName());
        nominee.receiveAward(award);

    }
}
