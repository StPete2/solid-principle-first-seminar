package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Persister persister = new Persister(user);
        ConsoleReporter consoleReporter = new ConsoleReporter(user);
        consoleReporter.report();
        persister.save();
    }
}