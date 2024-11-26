package ulpgc.es.MoneyCalculatorV1;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class TsvFileCurrencyLoader implements CurrencyLoader{
    private final File file;


    public TsvFileCurrencyLoader(File file) {
        this.file = file;
    }

    @Override
    public List<Currency> load() { //"method overloading"(El primer metodo sera publico y se delega al siguiente metodo)
        try{
            return load(new FileReader(file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Currency> load(FileReader file){
        //TODO
    }
}
