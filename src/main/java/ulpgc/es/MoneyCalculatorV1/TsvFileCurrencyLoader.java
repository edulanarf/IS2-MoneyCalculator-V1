package ulpgc.es.MoneyCalculatorV1;


import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
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

    private List<Currency> load(FileReader file) throws IOException {
        return load(new BufferedReader(file)); //Para leer el archivo mas comodamente y ahorrar memoria usamos BufferedReader
    }

    private List<Currency> load(BufferedReader file) throws IOException {
        List<Currency> result = new ArrayList<>();
        while(true){
            String line = file.readLine();
            if(line == null){
                break; //No hay nada mas que leer
            }
            result.add(toCurrency(line));
        }
        return result;
    }

    private Currency toCurrency(String line) {
        return toCurrency(line.split("\t")); //Separamos por tabulaciones
    }
    private Currency toCurrency(String[] fields) {
        return new Currency(
                fields[0],                         //code
                fields[1],                         //name
                fields.length == 2 ? "": fields[2] //symbol
        );
    }
}
