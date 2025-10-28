public class Utils {
    public static String printMethodCall(String method, String name) {
        return method + "(\"" + name + "\"): ";
    } 

    public static String whoIsAwesome(String name) {
        return "" + name + " is awesome!";
    }

    public static int indexOfFirstSpace(String name) {
        return name.indexOf(' ');
    }

    public static int indexOfSecondSpace(String name) {
        int space1 = name.indexOf(' ');
        if (space1 == -1) {
            return -1;
        } else {
            int space2 = name.indexOf(' ', space1 + 1);
            return space2;
        }
    }

    public static String findFirstName(String name) {
        int place1 = name.indexOf(' ');
        if (place1 == -1) {
            return name;
        } else {
            return name.substring(0, place1);
        }
    }

    public static String findLastName(String name) {
        int place1 = name.indexOf(' ');
        if (place1 == -1) {
            return "";
        } 
        int place2 = name.indexOf(' ', place1 + 1);
        if (place2 == -1) {
            return name.substring(place1 + 1);
        } else {
            return name.substring(place2 + 1);
        }
    }

    public static String findMiddleName(String name) {
        int place1 = name.indexOf(' ');
        if (place1 == -1) {
            return "";
        } 
        int place2 = name.indexOf(' ', place1 + 1);
        if (place2 == -1) {
            return "";
        } else {
            return name.substring(place1 + 1, place2);
        }
    }

    public static String generateLastFirstMidInitial(String name) {
        int place1 = name.indexOf(' ');
        if (place1 == -1) {
            return name;
        } 
        String firstName = name.substring(0, place1);
        int place2 = name.indexOf(' ', place1 + 1);
        String middleInitial;
        String lastName;
        if (place2 == -1) {
            lastName = name.substring(place1 + 1);
            return lastName + ", " + firstName;
        } else {
            lastName = name.substring(place2 + 1);
            String middleName = name.substring(place1, place2);
            middleInitial = "" + middleName.charAt(1) + ".";
            return lastName + ", " + firstName + " " + middleInitial;
        }
    
    }
    
}
