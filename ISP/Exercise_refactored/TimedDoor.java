package ISP.Exercise_refactored;

public class TimedDoor implements ITimedDoor {
    private static final int TIME_OUT = 100;
    private boolean _locked;
    private boolean _opened;

    @Override
    public void lock() {
        _locked = true;
    }

    @Override
    public void unlock() {
        _locked = false;
    }

    @Override
    public void open() {
        if (!_locked) {
            _opened = true;
        }
    }

    @Override
    public void close() {
        _opened = false;
    }

    @Override
    public void timeOutCallback() {
        _locked = true;
    }

}
