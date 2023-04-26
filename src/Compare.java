public class Compare {
    public void compareGriffindorStudents(Griffindor first, Griffindor second) {
        int firstPoints = first.getBravery() + first.getHonor() + first.getNobility();
        int secondPoints = second.getBravery() + second.getHonor() + second.getNobility();
        if (firstPoints > secondPoints) {
            System.out.println("Студент " + first.getName() + " " + first.getSurname() + " лучше чем " + second.getName() + " " + second.getSurname());
        } else if (firstPoints < secondPoints) {
            System.out.println("Студент " + second.getName() + " " + second.getSurname() + " лучше чем " + first.getName() + " " + first.getSurname());
        } else {
            System.out.println("Студентs " + first.getName() + " " + first.getSurname() + " и " + second.getName() + " " + second.getSurname() + " равны");
        }
    }
    public void comparePuffenduyStudents(Puffenduy first, Puffenduy second) {
        int firstPoints = first.getHonesty() + first.getLoyalty() + first.getOreLoving();
        int secondPoints = second.getHonesty() + second.getLoyalty() + second.getOreLoving();
        if (firstPoints > secondPoints) {
            System.out.println("Студент " + first.getName() + " " + first.getSurname() + " лучше чем " + second.getName() + " " + second.getSurname());
        } else if (firstPoints < secondPoints) {
            System.out.println("Студент " + second.getName() + " " + second.getSurname() + " лучше чем " + first.getName() + " " + first.getSurname());
        } else {
            System.out.println("Студентs " + first.getName() + " " + first.getSurname() + " и " + second.getName() + " " + second.getSurname() + " равны");
        }
    }
     public void compareKoggtevranStudents(Koggtevran first, Koggtevran second) {
        int firstPoints = first.getCreativity() + first.getMind() + first.getWisdom() + first.getWit();
        int secondPoints = second.getCreativity() + second.getMind() + second.getWisdom() + second.getWit();
        if (firstPoints > secondPoints) {
            System.out.println("Студент " + first.getName() + " " + first.getSurname() + " лучше чем " + second.getName() + " " + second.getSurname());
        } else if (firstPoints < secondPoints) {
            System.out.println("Студент " + second.getName() + " " + second.getSurname() + " лучше чем " + first.getName() + " " + first.getSurname());
        } else {
            System.out.println("Студентs " + first.getName() + " " + first.getSurname() + " и " + second.getName() + " " + second.getSurname() + " равны");
        }
    }
    public void compareSlizerinStudents(Slizerin first, Slizerin second) {
        int firstPoints = first.getAmbition() + first.getCunning() + first.getDetermination() + first.getLustForPower() + first.getResourcefulness();
        int secondPoints = second.getAmbition() + second.getCunning() + second.getDetermination() + second.getResourcefulness() + second.getLustForPower();
        if (firstPoints > secondPoints) {
            System.out.println("Студент " + first.getName() + " " + first.getSurname() + " лучше чем " + second.getName() + " " + second.getSurname());
        } else if (firstPoints < secondPoints) {
            System.out.println("Студент " + second.getName() + " " + second.getSurname() + " лучше чем " + first.getName() + " " + first.getSurname());
        } else {
            System.out.println("Студентs " + first.getName() + " " + first.getSurname() + " и " + second.getName() + " " + second.getSurname() + " равны");
        }
    }
    public void compareAnyStudents(Hogwarts first, Hogwarts second) {
        int firstPoints = first.getPower() + first.getDistance();
        int secondPoints = second.getPower() + second.getDistance();
        if (firstPoints > secondPoints) {
            System.out.println("Студент " + first.getName() + " " + first.getSurname() + " лучше чем " + second.getName() + " " + second.getSurname());
        } else if (firstPoints < secondPoints) {
            System.out.println("Студент " + second.getName() + " " + second.getSurname() + " лучше чем " + first.getName() + " " + first.getSurname());
        } else {
            System.out.println("Студентs " + first.getName() + " " + first.getSurname() + " и " + second.getName() + " " + second.getSurname() + " равны");
        }
    }

}
