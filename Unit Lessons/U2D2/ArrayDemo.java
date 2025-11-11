public class ArrayDemo{
    public static void main(String[] args){
        // Pokemon
        // you can have a team of 6, index is max of 5(starts from 0)

        // Pokemon[] team = new Pokemon[6];
        // {0, 1, 2, 3, 4, 5} ordered list

        // team[3] = new Pokemon("Charizard")
        // {0, 1, 2, "Charizard", 4, 5}

        // This code created a list of size 6, so the max index is 5

        // Pokemon[] box = new Pokemon[30];

        // Pokemon[] box2 = new Pokemon[1000];

        int[] myFavoriteNumbers = new int[4];
        // my favorite numbers sub 0
        myFavoriteNumbers[0] = 6;
        myFavoriteNumbers[1] = 15;
        myFavoriteNumbers[2] = 17;
        myFavoriteNumbers[3] = 23;
        // {6, 15, 17, 23}

        myFavoriteNumbers[0] = 7;
        // {7, 15, 17, 23}
        System.out.println(myFavoriteNumbers[3]);
        for (int n = 0; n < 4; n++) {
            System.out.println(myFavoriteNumbers[n]);
        }
        
        // what if I actually have 5 different numbers
        // list sizes are immutable <- can't change it without creating a new object
        // Strings are a list (array) of characters! They are also immutable.
        // {'h', 'e', 'l', 'l', 'o'}

        // String[] beatles = new String[4];
        // beatles[0] = "John Lennon";
        // beatles[1] = "Paul McCartney";

        String[] beatles = {"John Lennon", "Paul McCartney", null, "Ringo Starr"};
        String[] beatles2 = new String[5];
        for (int i = 0; i < beatles.length; i++) {
            if (beatles[i] != null) {
                System.out.println(beatles[i].length());
            } else {
                System.out.println("This element is null.");
            }
        }
        beatles2[4] = "Isabelle";

        int[] number = new int[3];
        // {0, 0, 0}

        boolean[] trust = new boolean[3];
        // {false, false, false}

        String[] list = new String[3];
        // {null, null, null}
    }
}