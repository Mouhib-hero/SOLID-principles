package DIP.Exercise_refactored;

import java.util.HashMap;
import java.util.Map;

public class MyDatabase implements DataStorage {
    private Map<Integer, String> data = new HashMap<>();
    private int count = 0;

    @Override
    public void write(String inputString) {
        data.put(++count, inputString);
    }
}
