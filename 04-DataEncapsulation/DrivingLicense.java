public class DrivingLicense {
    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private String licenseNumber;
    private int yearOfIssue;
    private String licenseCategory;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }
    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
    public String getLicenseCategory() {
        return licenseCategory;
    }
    public void setLicenseCategory(String licenseCategory) {
        this.licenseCategory = licenseCategory;
    }

    public void display() {
        System.out.println("=== Driving License Information ===");
        System.out.println("Driver's Name     : " + getName() + " " + getSurname());
        System.out.println("Address           : " + getAddress());
        System.out.println("Postal Code       : " + getPostalCode());
        System.out.println("City              : " + getCity());
        System.out.println("License Number    : " + getLicenseNumber());
        System.out.println("Year of Issue     : " + getYearOfIssue());
        System.out.println("License Category  : " + getLicenseCategory());
        System.out.println("===================================");
    }
}
