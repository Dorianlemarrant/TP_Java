package fr.ensai.library;

public class Loan {
    private Student student;
    private Item item;
    private String startDate;
    private String returnDate; 
    
    public Loan(Student student, Item item, String startDate, String returnDate) {
        this.student = student;
        this.item = item;
        this.startDate = startDate;
        this.returnDate = null;
    }
}
