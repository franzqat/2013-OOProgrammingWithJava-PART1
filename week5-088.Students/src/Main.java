
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("studentnumber: ");
            String sn = reader.nextLine();
            Student s = new Student(name, sn);
            list.add(s);

        }
        for (Student st : list) {
            System.out.println(st);
        }

        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result");
        for (Student st : list) {
            if (st.getName().contains(searchTerm)) {
                System.out.println(st);
            }
        }

    }
}
