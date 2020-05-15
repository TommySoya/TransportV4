package person;

/**
 * @description:
 * @author: dell
 * @date: Created in 2020/5/15 0:40
 * @version: 4.0
 * @modified By:
 */
public class Person {
    private int p_Age = 18;
    private String p_Sex = "男";
    private String id = "201902202";
    private String p_Name;

    public Person(String p_Name) {
        this.p_Name = p_Name;
    }

    public Person() {
    }

    public void driveTransport(Transport transport) {
        transport.drivingMethod(transport);
    }
}
