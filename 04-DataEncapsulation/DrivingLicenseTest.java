public class DrivingLicenseTest {
    public static void main(String[] args) {
        DrivingLicense dl = new DrivingLicense();


        dl.setName("Jack");
        dl.setSurname("Smith");
        dl.setAddress("123 Main St");
        dl.setPostalCode("12345");
        dl.setCity("Sample City");
        dl.setLicenseNumber("D1234567");
        dl.setYearOfIssue(2020);
        dl.setLicenseCategory("B");

        dl.display();
    }
}
