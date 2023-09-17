package test06;

public class SynchronizedEx {
    public static void main(String[] args) {
        Calculator calcualtor = new Calculator();

        User1Thread user1Thread = new User1Thread();
        user1Thread.setCalculator(calcualtor);
        user1Thread.start();

        User2Thread user2Thread = new User2Thread();
        user2Thread.setCalculator(calcualtor);
        user2Thread.start();
    }
}
