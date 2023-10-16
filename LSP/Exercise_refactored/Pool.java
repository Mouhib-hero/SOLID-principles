package LSP.Exercise_refactored;

public class Pool {
    public void run() {
        Duck donaldDuck = new Duck();
        Duck electricDuck = new ElectronicDuck();

        // Quack and swim behavior for a normal DUck
        quackAndSwim(donaldDuck);

        // Quack and swim behavior for an  ElectronicDuck
        // turnOn and turnOff to not have unexpected behavior
        ((ElectronicDuck) electricDuck).turnOn();
        quackAndSwim(electricDuck);
        ((ElectronicDuck) electricDuck).turnOff();
    }

    private void quackAndSwim(Duck duck) {
        duck.quack();
        duck.swim();
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}
