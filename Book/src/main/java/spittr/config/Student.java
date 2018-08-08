package spittr.config;

/**
 * @ClassName Student
 * @Description
 * @Author martind
 * @Date 2018/8/8 9:46
 **/
public class Student {
    private Long id;
    private String name;
    private String Address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
