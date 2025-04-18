package fr.ensai.library;

public class Magazine extends Item {

    private String issn;
    private String issueNumber;

    /**
     * Constructs a new Magazine object.
     */
    public Magazine(String issn, String title, String issueNumber, int year, int pageCount) {
        super(title, year, pageCount);
        this.issn = issn;
        this.issueNumber = issueNumber;
    }
}
