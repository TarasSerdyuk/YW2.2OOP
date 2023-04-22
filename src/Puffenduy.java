public class Puffenduy extends Hogwarts {
    private int oreLoving;
    private int loyalty;
    private int honesty;

    public Puffenduy(String name, String surname, int power, int distance, int oreLoving, int loyalty, int honesty) {
        super(name, surname, power, distance);
    }

    public int getOreLoving() {
        return oreLoving;
    }

    public void setOreLoving(int oreLoving) {
        this.oreLoving = oreLoving;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
