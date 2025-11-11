public class AutoUtils {
    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (cleanlinessLevel < 0) {
            cleanlinessLevel = 0;
        }
        if (cleanlinessLevel > 10) {
            cleanlinessLevel = 10;
        }
        return cleanlinessLevel;
    }

    public static String generateUsername(String name) {
        // name = AutoUtils.fixName(name);
        int space = name.indexOf(' ');
        String afterLastName = name.substring(space + 1);
        int spaceNumberTwo = afterLastName.indexOf(' ');
        if (space == -1) {
            return "";
        } 
        // if (spaceNumberTwo >= 0) {
        //     return "";
        // }
        int randomNumber = (int) ((Math.random() * 1950) + 100);
        String lowercaseName = name.toLowerCase();
        int spaceForFirstName = lowercaseName.indexOf(' ');
        String firstName = lowercaseName.substring(0, spaceForFirstName);
        String lastName = lowercaseName.substring(space + 1);
        return "\"@" + firstName + "_" + lastName + "_" + randomNumber + "\"";
    }
     
    public static int cleanCar(Car car) {
        car.setCleanlinessLevel(car.getCleanlinessLevel() + 2);
        return car.getCleanlinessLevel();
    }

    public static String fixName(String name) {
        int space = name.indexOf(' ');
        String afterLastName = name.substring(space + 1);
        int spaceNumberTwo = afterLastName.indexOf(' ');
        if (space < 0) {
            return "";
        } 
        if (spaceNumberTwo < 0) {
            return "";
        }
        // if (spaceNumberThree < 0) {
        //     return "";
        // }
        String trimmedFirstName = name.trim();
        int spaceAfterFirstName = trimmedFirstName.indexOf(' ');
        String onlyFirstName = trimmedFirstName.substring(0, spaceAfterFirstName);
        String spacePlusLastName = name.substring(spaceAfterFirstName + 3);
        String trimmedLastName = spacePlusLastName.trim();
        int theSpaceAfterLastName = trimmedLastName.indexOf(' ');
        // String spaceAfterLastName = name.substring(theSpaceAfterLastName + 1);
        // String trimmedExtraSpace = spaceAfterLastName.trim();
        // String onlyLastName = trimmedLastName.substring(0, theSpaceAfterLastName);
        return onlyFirstName + " " + trimmedLastName;
    }
}

