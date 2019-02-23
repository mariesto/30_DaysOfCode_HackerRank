package Day_12;

import java.util.Scanner;

public class Inheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person{
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] scores) {
        super(firstName, lastName, identification);
        this.testScores = scores;
    }

    public String calculate(){
        int sum = 0, divided;
        String rs = "";

        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }

        divided = sum/testScores.length;

        if(divided <= 100 && divided >= 90){
            rs = "O";
        }else if(divided < 90 && divided >= 80){
            rs = "E";
        }else if(divided < 80 && divided >= 70){
            rs = "A";
        }else if(divided < 70 && divided >= 55){
            rs = "P";
        }else if(divided < 55 && divided >= 40){
            rs = "D";
        }else if(divided < 40 && divided >= 0){
            rs = "T";
        }

        return rs;
    }

}

