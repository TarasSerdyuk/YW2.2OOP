public class Puffenduy extends Hogwarts {
    private int oreLoving;
    private int loyalty;
    private int honesty;


    public Puffenduy(String name, String surname, int power, int distance, int oreLoving, int loyalty, int honesty) {
        super(name, surname, power, distance);

        this.oreLoving = oreLoving;
        this.loyalty = loyalty;
        this.honesty = honesty;
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

    @Override
    public String toString() {
        return "Puffenduy{" + super.toString() + "oreLoving=" + oreLoving + ", loyalty=" + loyalty + ", honesty=" + honesty + '}';
    }
}
