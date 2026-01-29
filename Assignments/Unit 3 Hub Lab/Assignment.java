public class Assignment {
    private String title;
    private String description;
    private int descriptionLength;

    public Assignment(String title, String description) {
        // Students: add your own validation and exceptions as you see fit
        if (title == null) {
            throw new IllegalArgumentException("Title is null.");
        }
        if (title.toLowerCase() == "shit" || title.toLowerCase() == "fuck" || title.toLowerCase() == "bitch") {
            throw new IllegalArgumentException("No profanity");
        }
        setTitle(title);
        setDescription(description);
    }

    public void setTitle(String title) {
        if (title == null) {
            throw new IllegalArgumentException("Title is null.");
        }
        if (title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title is blank");
        }
        this.title = title;
    }

    public void setDescription(String description) {
        if (description == null) {
            throw new IllegalArgumentException("Description is null.");
        }
        if (description.trim().isEmpty()) {
            throw new IllegalArgumentException("Description is blank");
        } 
        if (description.length() > 100) {
            throw new IllegalArgumentException("Description is too long.");
        }
        this.description = description;
        this.descriptionLength = description.length();
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDescriptionLength() {
        return descriptionLength;
    }
}
