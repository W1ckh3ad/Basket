package classes;

import java.util.LinkedList;

public class BasketArrayList {
    private LinkedList<String> basket = new LinkedList<String>();

    public BasketArrayList(String... obst) throws Exception {
        
        for (int i = 0; i < obst.length; i++) {
            basket.add(obst[i]);
        }
    }

    public void addObst(String obst) throws Exception {       
        basket.add(obst);
    }

    public void removeObst(int index){        
       basket.remove(index);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String string = "Obstliste: \n\n";
        for (int i = 0; i < basket.length; i++) {            
                if (basket[i] != null) {
                    string += i + ") " + basket[i] + "\n";            
                }
        }
        string += "Es sind noch " + (10 - count) + " Plätze frei im Obstkorb \n\n\n";
        return string;
    }
}
