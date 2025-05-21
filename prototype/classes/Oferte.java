package prototype.classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface Oferte {
    void citesteLista(String file) throws IOException;
    Oferte copieaza();
}
