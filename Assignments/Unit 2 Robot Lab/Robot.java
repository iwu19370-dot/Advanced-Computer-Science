public class Robot {
    // to-do: change file name, class, and constructor to Robot

    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right

    private int[] hallway;

    public int getPosition() {
        return position;
    }


    public void setPosition(int position) {

        if (position < 0) {
            this.position = 0;
        } else if (position > hallway.length - 1) {
            this.position = hallway.length - 1;
        } else {
            this.position = position;
        }
    }


    public boolean isFacingRight() {
        return isFacingRight;
    }


    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }


    public int[] getHallway() {
        return hallway;
    }


    public void setHallway(int[] hallway) {
        for (int i = 0; i <= hallway.length - 1; i++) {
            if (hallway[i] < 0) {
                hallway[i] = 0;
            }

        }
        this.hallway = hallway;
    }


    public Robot(int[] hallwayToClean, int startingPosition) {
        // to-do: implement constructor

        setHallway(hallwayToClean);
        setPosition(startingPosition);
        this.isFacingRight = true;
    }


    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */
    public boolean isRobotBlockedByWall() {
        // to-do: implement this method
        boolean blockedByLeftWall = true;
        boolean blockedByRightWall = true;
        if (position == hallway.length - 1 && isFacingRight == true) {
            blockedByRightWall = true;
            return blockedByRightWall;
        }
        if (position == 0 && isFacingRight == false) {
            blockedByLeftWall = true;
            return blockedByLeftWall;
        } else {
            return false;
        }
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        // to-do: implement this method
        if (hallway[position] >= 1) {
            hallway[position] = hallway[position] - 1;
        }


        if (hallway[position] == 0) {
            if (isRobotBlockedByWall() == true) {
                if (position == 0) {
                    this.isFacingRight = true;
                }
                if (position == hallway.length - 1) {
                    this.isFacingRight = false;
                }
            } else if (isFacingRight == false) {
                this.position = position - 1;
            } else {
                this.position = position + 1;
            }
        }
    }


    /**
     * This method displays the current state of the robot and the hallway. It then calls the move()
     * method and counts the number of moves it takes to clear the hallway. The method should
     * display the current state of the robot after each move.
     * 
     * @return the number of moves made
     */

    public int clearHall() {
        // to-do: implement this method
        int count = 0;
        while (hallIsClear() == false) {
            move();
            count = count + 1;
            System.out.println("After move " + count + ".");
            displayState();
        }
        return count;
    }

    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */
    public boolean hallIsClear() {
        // to-do: implement this method
        boolean trueFalse = true;
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] > 0) {
                return false;
            }
        }
        
        return true;
    }

    /*
     * Displays the current state of the robot and the hallway.
     */
    public void displayState() {
        // to-do: implement this method
        String[] array = new String[hallway.length];
        for (int i = 0; i < hallway.length; i++) {
            System.out.print(array[i] = hallway[i] + " ");
        }
        System.out.println(" ");
        for (int h = 0; h < position; h++) {
            System.out.print(array[h] = "  ");
        }
        if (this.isFacingRight == true) {
            System.out.println(array[position] = ">");
        }
        if (this.isFacingRight == false) {
            System.out.println("<");;
        }
    }
}
