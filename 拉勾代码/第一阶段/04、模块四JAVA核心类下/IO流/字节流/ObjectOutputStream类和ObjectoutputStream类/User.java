package IO流.字节流.ObjectOutputStream类和ObjectoutputStream类;

public class User implements java.io.Serializable{


    private static final long serialVersionUID = -1515306309183689209L;
    private String name;
    private String password;
    private transient String phoneNum;      //transient表示该成员不参与序列化，对象当前参数不会被写入

    public User() {
    }

    public User(String name, String password, String phoneNum) {
        this.name = name;
        this.password = password;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
