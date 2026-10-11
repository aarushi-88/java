public class Passport {
    private String passportNo;
    private String issueDate;
    private String expiryDate;

    // Constructor
    public Passport(String passportNo, String issueDate, String expiryDate) {
        this.passportNo = passportNo;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }

    // Getters
    public String getPassportNo() {
        return passportNo;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    // Setters
    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Passport No: " + passportNo +
               "\nIssue Date: " + issueDate +
               "\nExpiry Date: " + expiryDate;
    }
}