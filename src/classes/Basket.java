package classes;

public class Basket {
    private String[] basket = new String[10];
    private int count;

    public Basket(String... obst) {
        if (obst.length > 10) {
            throw new Exception();
        }
        count = obst.length;
        for (int i = 0; i < obst.length; i++) {
            basket[i] = obst[i];
        }
    }

    public void addObst(String obst){
        if (count >= 10) {
            throw new Exception();
        }
        basket[count++] = obst;
    }

    public void removeObst(int index){
        count--;
        for (int i = index + 1; i < basket.length; i++) {
            basket[i - 1]  = basket[i];
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String string = "";
        for (int i = 0; i < basket.length; i++) {            
                string += i + ") " + basket[i];            
        }
        return string;
    }

    
}
