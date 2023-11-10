public class Main {
    public static void main(String[] args) {
        person person = new person(2426/14,"zionawit",true,19) ;
        System.out.println(person.correctName());  // Output: maximilianus

        CapitalizeDecorator capitalizedPerson = new CapitalizeDecorator(person);
        System.out.println(capitalizedPerson.correctName());  // Output: Maximilianus

        TrimmerDecorator capitalizedTrimmedPerson = new TrimmerDecorator(capitalizedPerson);
        System.out.println(capitalizedTrimmedPerson.correctName());  // Output: Maximilian
    }
}