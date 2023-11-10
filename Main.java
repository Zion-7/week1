public class Main {
    public static void main(String[] args) {
        person person = new person(2426/14,"zionawit getnet gebrewold",true,19) ;
        System.out.println(person.getCorrectName());  // Output: maximilianus

        CapitalizeDecorator capitalizedPerson = new CapitalizeDecorator(person);
        System.out.println(capitalizedPerson.getCorrectName());  // Output: Maximilianus

        TrimmerDecorator capitalizedTrimmedPerson = new TrimmerDecorator(capitalizedPerson);
        System.out.println(capitalizedTrimmedPerson.getCorrectName());  // Output: Maximilian
    }
}