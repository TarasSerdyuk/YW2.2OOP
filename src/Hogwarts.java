public class Hogwarts {
    private String name;
    private String surname;
    private int power;
    private int distance;

    public Hogwarts(String name, String surname, int power, int distance) {
        this.name = name;
        this.surname = surname;
        this.power = power;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
    public void printStudent(Griffindor[] griffindors) {
        String name = null;
        String surname = null;

        for (Griffindor griffindor: griffindors) {
            name = griffindor.getName();
            surname = griffindor.getSurname();


            System.out.println("ФИО: " + name + " " + surname + " " );
        }
    }
}


