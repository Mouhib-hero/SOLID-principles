package LSP.Exercise_refactored;

public class ElectronicDuck extends Duck {
    private boolean _on = false;

    @Override
    public void quack() {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            System.out.println("Cannot quack when off");
        }
    }

    @Override
    public void swim() {
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            System.out.println("Cannot swim when off");
        }
    }

    public void turnOn() {
        _on = true;
    }

    public void turnOff() {
        _on = false;
    }
}
