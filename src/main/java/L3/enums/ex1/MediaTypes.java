package L3.enums.ex1;

public enum MediaTypes {
    AUDIO("name", "audio"),
    VIDEO("name", "video"),
    IMAGE("name", "image");

    private final String attributeName;
    private final String attributeValue;

    MediaTypes(String attributeName, String attributeValue) {
        this.attributeName = attributeName;
        this.attributeValue = attributeValue;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public String getAttributeName() {
        return attributeName;
    }
}
