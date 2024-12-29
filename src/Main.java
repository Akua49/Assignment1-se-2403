import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student harry = new Student("Harry", "Potter", 21, true, Arrays.asList(78, 89, 99, 51));
        Student ron = new Student("Ron", "Qeasley", 20, true, Arrays.asList(78, 89, 75, 63, 82));
        Student hermione = new Student("Hermione", "Granger", 19, false, Arrays.asList(100, 99, 95, 98, 100, 96, 97));
        Student luna = new Student("Luna", "Lovegood", 20, false, Arrays.asList(46, 87, 67, 79, 96, 58, 83));
        Student draco = new Student("Draco", "Malfoy", 19, true, Arrays.asList(21, 45, 0, 9, 51, 43));

        Teacher snape = new Teacher("Severus", "Snape", 51, true, "Math", 7, 800000);
        Teacher dumbledore = new Teacher("Albus", "Dumbledore", 71, true, "Philosophy", 25, 1500000);
        Teacher mcgonagall = new Teacher("Minerva", "McGonagall", 62, false, "Sociology", 17, 1100000);
        Teacher bellatrix = new Teacher("Bellatrix", "Lestrange", 35, false, "Programming", 3, 570000);
        Teacher sirius = new Teacher("Sirius", "Black", 49, true, "Physics", 9, 750000);

        School hogwarts = new School();
        hogwarts.addMember(harry);
        hogwarts.addMember(ron);
        hogwarts.addMember(hermione);
        hogwarts.addMember(luna);
        hogwarts.addMember(draco);
        hogwarts.addMember(snape);
        hogwarts.addMember(dumbledore);
        hogwarts.addMember(mcgonagall);
        hogwarts.addMember(bellatrix);
        hogwarts.addMember(sirius);

        System.out.println(hogwarts);

        for (Person member : hogwarts.members) {
            if (member instanceof Teacher) {
                Teacher teacher = (Teacher) member;
                if (teacher.getYearsOfExperience() > 10) {
                    teacher.giveRaise(10);
                }
            }
        }

        System.out.println("After salary raises:");
        System.out.println(hogwarts);

        System.out.println("Hermione's GPA: " + hermione.calculateGPA());
    }
}
