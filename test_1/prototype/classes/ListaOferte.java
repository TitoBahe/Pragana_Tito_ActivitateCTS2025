package test_1.prototype.classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListaOferte implements ListaAbstract {
    List<String> lista = null;

    public ListaOferte() {
        this.lista = new ArrayList<String>();
    }

    public void setLista(List<String> l){
        lista = l;
    }

    @Override
    public void citeste() {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("oferte.txt"));
            String line;
            while((line = reader.readLine()) != null){
                lista.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ListaAbstract copiaza() {
        ListaOferte listaOferte = new ListaOferte();
        List<String> temp = new ArrayList<String>();
        for(String s:this.lista){
            temp.add(s);
        }
        listaOferte.setLista(temp);
        return listaOferte;
    }

    @Override
    public String toString() {
        return "ListaOferte{" +
                "lista=" + lista +
                '}';
    }
}
