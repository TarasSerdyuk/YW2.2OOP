public class Main {
    public static void main(String[] args) {
        Griffindor[] griffindor = {
                new Griffindor("Гарри", "Поттер", 10, 20, 30, 40, 50),
                new Griffindor("Гермиона", "Грейнджер", 11, 21, 31, 41, 51),
                new Griffindor("Гарри", "Поттер", 12, 22, 32, 42, 52),
        };
        Puffenduy[] puffenduys = {
                new Puffenduy("Захария", "Смит", 10, 20, 30, 40, 50),
                new Puffenduy("Седрик", "Диггори", 11, 21, 31, 41, 51),
                new Puffenduy("Джастин", "Финч-Флетчли", 12, 22, 32, 42, 52),
        };
        Koggtevran[] koggtevrans = {
                new Koggtevran("Чжоу", "Чанг", 10, 20, 30, 40, 50, 60),
                new Koggtevran("Падма", "Патил", 10, 20, 30, 40, 50, 60),
                new Koggtevran("Маркус", "Белби", 10, 20, 30, 40, 50, 60),
        };
        Slizerin[] slizerins = {
                new Slizerin ("Драко", "Малфой", 10, 20, 30, 40, 50, 60, 70),
                new Slizerin ("Грэхэм", "Монтегю", 10, 20, 30, 40, 50, 60, 70),
                new Slizerin ("Грегори", "Гойл", 10, 20, 30, 40, 50, 60, 70),
        };
        Hogwarts hogwarts = new Hogwarts();
        printStudent(griffindor);
    }


}