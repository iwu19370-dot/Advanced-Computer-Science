import java.util.ArrayList;

public class Shelter {
    // instance variables
    private Dog[][] kennels;

    // constructors
    public Shelter(int rows, int cols) {
        // to-do: implement this constructor
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Can't be negative.");
        }
        this.kennels = new Dog[rows][cols];
    }

    /* initializes kennels as a 3x3 2D array */
    public Shelter() {
        kennels = new Dog[3][3];
    }

    // getters and setters
    public Dog[][] getKennels() {
        return kennels;
    }

    public void setKennels(Dog[][] kennels) {
        this.kennels = kennels;
    }

    // methods

    /*
     * prints out the 2D array 'kennels', displaying the dog's info if the kennel is occupied, or
     * 'empty' if the kennel is empty
     */
    public void displayStatus() {
        for (Dog[] row : kennels) {
            for (Dog animal : row) {
                if (animal != null) {
                    System.out.print(animal);
                } else {
                    System.out.print("[Empty]");
                }
            }
            System.out.println();
        }
    }

    public void add(Dog animal) {
        // to-do: implement this method
        if (animal == null) {
            throw new IllegalArgumentException("Animal can't be nothing.");
        }
        for (int i = 0; i < kennels.length; i++) {
            for (int j = 0; j < kennels[i].length; j++) {
                if (kennels[i][j] == null) {
                    kennels[i][j] = animal;
                    return;
                }
            }
        } 
        
    }


    public void add(Dog animal, int row, int col) {
        // to-do: implement this method
        if (animal == null || row >= kennels.length || 
            col >= kennels[0].length || row < 0 || col < 0) {
                throw new IllegalArgumentException("Invalid index.");
        }
        for (int i = 0; i < kennels.length; i++) {
            for (int j = 0; j < kennels[i].length; j++) {
                if (kennels[row][col] == null) {
                    kennels[row][col] = animal;
                    return;
                } else if (kennels[i][j] == null) {
                    kennels[i][j] = animal;
                    return;
                }
            }
        }
    }

    public void add(ArrayList<Dog> animals) {
        // to-do: implement this method
        if (animals == null) {
            throw new IllegalArgumentException("Can't be null.");
        }
        for (int i = 0; i < animals.size(); i++) {
            add(animals.get(i));
        }
    }

    public Dog adopt(int row, int col) {
        // to-do: implement this method
        Dog adopted = new Dog();
        if (row >= kennels.length || col >= kennels[0].length || row < 0 || col < 0) {
            throw new IllegalArgumentException("Invalid index.");
        } else if (kennels[row][col] == null) {
            throw new IllegalArgumentException("No dog here.");
        } else {
            adopted = kennels[row][col];
            kennels[row][col] = null;
        }
        return adopted;
    }

    public ArrayList<Dog> search(String name) {
        // to-do: implement this method
        if (name == null) {
            throw new IllegalArgumentException("Nothing to check.");
        }
        ArrayList<Dog> allThatIsCalledName = new ArrayList<Dog>();
        for (int i = 0; i < kennels.length; i++) {
            for (int j = 0; j < kennels[i].length; j++) {
                if (kennels[i][j].getName().equals(name)) {
                    allThatIsCalledName.add(kennels[i][j]);
                }
            }
        }
        return allThatIsCalledName;
    }

    public ArrayList<Dog> search(int age) {
        // to-do: implement this method
        if (age < 0) {
            throw new IllegalArgumentException("Not a possible age.");
        }
        ArrayList<Dog> allThatIsTheAge = new ArrayList<Dog>();
        for (int i = 0; i < kennels.length; i++) {
            for (int j = 0; j < kennels[i].length; j++) {
                if (kennels[i][j].getAge() == age) {
                    allThatIsTheAge.add(kennels[i][j]);
                }
            }
        }
        return allThatIsTheAge;
    }
}
