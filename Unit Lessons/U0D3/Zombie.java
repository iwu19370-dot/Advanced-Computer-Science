public class Zombie {
    //instance variables (attributes)
    //green
    String skinColor = "Green";
    //rot
    boolean isDead = true;
    //human count
    int humansConsumed = 0;

    //main
    public static void main(String[] args) {
        Zombie Lily = new Zombie();

        System.out.println(Lily.growl());
        System.out.println("Lily ate " + Lily.humansConsumed() + " humans.");

        Zombie Brian = new Zombie();

        System.out.println(Brian.growl());
        System.out.println(Brian.humansConsumed());
        Brian.eatHuman();
        System.out.println(Brian.humansConsumed());
        Brian.feast(14);
        System.err.println(Brian.humansConsumed());


    }

    //methods (behaviors)
    //walk with arms out
    //eat brains

    //growl
    public String growl() {
        return "grrrrraa";
    }

    // Challenge: make a new methods that returns the number of human eaten
    public int humansConsumed() {
        return humansConsumed;
    }
    
    public void eatHuman(){
        humansConsumed++;
    }

    public void feast(int humanCount){
        humansConsumed += humanCount;

    }

}
