package request;

import java.util.List;

public class Request {

    public Profile profile;
    public Profile profile () { return profile; }

    public List<Order> orders;
    public List<Order> orders () { return orders; }


    @Override public String toString() {
        return new StringBuffer()
                .append("{").append("\n")
                .append("profile: ").append(null==profile ? "" : profile.toString()).append(",").append("\n")
                .append("orders: ").append(null==orders ? "" : toString(orders)).append("\n")
                .append("}").append("\n")
                .toString();
    }

    public String toString (List<Order> orders) {
        StringBuffer sb = new StringBuffer();
        for (Order o : orders) {
            sb.append(o.toString()).append(", ");
        }
        return sb.toString();
    }

}
