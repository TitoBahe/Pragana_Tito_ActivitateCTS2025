package prototype.classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListaOferte implements Oferte{
    List<String> list = null;

    public ListaOferte() {
        this.list = new ArrayList<>();
    }

    @Override
    public void citesteLista(String file) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("oferte.txt"));
            String line=null;
            while((line = reader.readLine()) != null) {
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public Oferte copieaza() {
        ListaOferte listaOferte = new ListaOferte();
        List<String> temp = new ArrayList<>();
        for(String line : this.list){
            temp.add(line);
        }
        listaOferte.setList(temp);
        return listaOferte;
    }

    @Override
    public String toString() {
        return "ListaOferte{" +
                "list=" + list +
                '}';
    }

    
}
