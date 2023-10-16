package DIP.Exercise_refactored;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        DataStorage dataStorage = new MyDatabase();
        EncodingModule encodingModule = new EncodingModule(dataStorage);
        encodingModule.encodeWithFiles();
        encodingModule.encodeBasedOnNetworkAndDatabase();
    }
}
