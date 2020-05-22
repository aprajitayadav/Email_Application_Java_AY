package emailapp;

public class emailmain {
    public static void main(String[] args) {
        email eml = new email("Aprajita", "Yadav");

        // eml.setAlternateEmail("ay@gmail.com");
        System.out.println(eml.showInfo());
    }

}