package request;

public class Profile {

    public String name;
    public String name () { return name; }

    public String number;
    public String number () { return number; }

    public String email;
    public String email () { return email; }

    public Boolean active;
    public Boolean active () { return Boolean.TRUE.equals(active); }



    @Override public String toString() {
        return new StringBuffer()
                .append("{ ").append("\n")
                .append("name: ").append(name).append("\n")
                .append("number: ").append(number).append("\n")
                .append("email: ").append(email).append("\n")
                .append("active: ").append(active).append("\n")
                .append("}").append("\n")
                .toString();
    }

}
