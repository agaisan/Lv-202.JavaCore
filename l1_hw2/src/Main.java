import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String name, address;
        int age;
        System.out.println("What is your name?");
        name = br.readLine();
        System.out.println("How old are you?");
        age = Integer.parseInt(br.readLine());
        System.out.println("Where are you live, " + name + "?");
        address = br.readLine();
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        System.out.println("You live :" + address);
    }
}
