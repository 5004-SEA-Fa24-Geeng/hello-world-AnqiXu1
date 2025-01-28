package student;

/**
 * This class is a placeholder which you will fully implement based on the javadoc
 * 
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 * 
 */

public class Greeting {
    private int localityID;
    private String localityName;
    private String asciiGreeting;
    private String unicodeGreeting;
    private String formatStr;

    /**
     * Constructor1 for Greeting class,including ID, name. Default greeting.
     * @param localityID, encoded as integer.
     * @param localityName, encoded as a String.
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello");
    }

    /**
     * Constructor2 creates a greeting with ascii and unicode characters
     * @param localityID, encoded as integer.
     * @param localityName, encoded as a String.
     * @param greeting, encoded as a String.
     */
    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, "%s, %%s!");
    }

    /**
     * Constructor3 creates a greeting with ascii and uni-code characters.
     * @param localityID, encoded as integer.
     * @param localityName, encoded as a String.
     * @param asciiGreeting, encoded as a String.
     * @param unicodeGreeting, encoded as a String.
     * @param formatStr, encoded as a String.
     */
    public Greeting(int localityID, String localityName, String asciiGreeting, String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    /**
     * Get the locality ID.
     * @return locality ID, encoded as integer.
     */
    public int getLocalityID() {
        return localityID;
    }

    /**
     * Get the locality Name.
     * @return locality Name,encoded as a String.
     */
    public String getLocalityName() {
        return localityName;
    }

    /**
     * Get the ascii greeting.
     * @return ascii greeting,encoded as a String.
     */
    public String getAsciiGreeting() {
        return asciiGreeting;
    }

    /**
     * Get the uni-code Greeting.
     * @return uni-code Greeting,encoded as a String.
     */
    public String getUnicodeGreeting() {
        return unicodeGreeting;
    }

    /**
     * Get the formatStr
     * @return
     */
    public String getFormatStr() {
        return formatStr;
    }

    /**
     * Gets the format string, allowing for ASCII-only greetings if specified.
     * @return the format string with the greeting inserted into the format.
     */
    public String getFormatStr(boolean asciiOnly) {
        if (asciiOnly) {
            return String.format(formatStr, "%s", asciiGreeting);
        } else {
            return String.format(formatStr, "%s", unicodeGreeting);
        }
    }

    /**
     * Override toString for debugging
     * @return the full greeting details as a string.
     */
    @Override
    public String toString() {
        return String.format(
                "{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}",
                localityID, localityName, asciiGreeting, unicodeGreeting
        );
    }
}
