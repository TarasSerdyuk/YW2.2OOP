public class Main {
    public static void main(String[] args) {
        Hogwarts[] students = {
                new Griffindor("Гарри", "Поттер", 10, 20, 30, 40, 50),
                new Griffindor("Гермиона", "Грейнджер", 11, 21, 31, 41, 51),
                new Griffindor("Гарри", "Поттер", 12, 22, 32, 42, 52),
                new Puffenduy("Захария", "Смит", 10, 20, 30, 40, 50),
                new Puffenduy("Седрик", "Диггори", 11, 21, 31, 41, 51),
                new Puffenduy("Джастин", "Финч-Флетчли", 12, 22, 32, 42, 52),
                new Koggtevran("Чжоу", "Чанг", 10, 20, 30, 40, 50, 60),
                new Koggtevran("Падма", "Патил", 10, 20, 30, 40, 50, 60),
                new Koggtevran("Маркус", "Белби", 10, 20, 30, 40, 50, 60),
                new Slizerin ("Драко", "Малфой", 10, 20, 30, 40, 50, 60, 70),
                new Slizerin ("Грэхэм", "Монтегю", 10, 20, 30, 40, 50, 60, 70),
                new Slizerin ("Грегори", "Гойл", 10, 20, 30, 40, 50, 60, 70),
        };
        Griffindor[] griffindorStudents = {
                new Griffindor("Гарри", "Поттер", 10, 20, 30, 40, 50),
                new Griffindor("Гермиона", "Грейнджер", 11, 21, 31, 41, 51),
                new Griffindor("Гарри", "Поттер", 12, 22, 32, 42, 52),
        };
        Koggtevran[] koggtevranStudents = {
                new Koggtevran("Чжоу", "Чанг", 10, 20, 30, 40, 50, 60),
                new Koggtevran("Падма", "Патил", 10, 20, 30, 40, 50, 60),
                new Koggtevran("Маркус", "Белби", 10, 20, 30, 40, 50, 60),
        };
        Puffenduy[] puffenduyStudents = {
                new Puffenduy("Захария", "Смит", 10, 20, 30, 40, 50),
                new Puffenduy("Седрик", "Диггори", 11, 21, 31, 41, 51),
                new Puffenduy("Джастин", "Финч-Флетчли", 12, 22, 32, 42, 52),
        };
        Slizerin[] slizerinStudents = {
                new Slizerin ("Драко", "Малфой", 10, 20, 30, 40, 50, 60, 70),
                new Slizerin ("Грэхэм", "Монтегю", 10, 20, 30, 40, 50, 60, 70),
                new Slizerin ("Грегори", "Гойл", 10, 20, 30, 40, 50, 60, 70),
        };


        PrintStudent printer = new PrintStudent();
        for (Hogwarts student : griffindorStudents) {
            printer.print(student);
        }
        Compare hogwarts = new Compare();
        hogwarts.compareGriffindorStudents(griffindorStudents[0],griffindorStudents[1]);
        hogwarts.comparePuffenduyStudents(puffenduyStudents[0],puffenduyStudents[1]);
        hogwarts.compareKoggtevranStudents(koggtevranStudents[1],koggtevranStudents[2]);
        hogwarts.compareSlizerinStudents(slizerinStudents[0],slizerinStudents[2]);
        hogwarts.compareAnyStudents(students[0],students[6]);
    }
}