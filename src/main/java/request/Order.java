package request;

public class Order {

    public Long id;
    public Long id () { return id; }

    public State state;
    public State state () { return state; }

    public Source source;
    public Source source () { return source; }

    public Destination destination;
    public Destination destination () { return destination; }

    public float price;
    public float price () { return price; }


    @Override public String toString() {
        return new StringBuffer()
                .append("{ ").append("\n")
                .append("id: ").append(id).append("\n")
                .append("state: ").append(state).append("\n")
                .append("price: ").append(price).append("\n")
                .append("}").append("\n")
                .toString();
    }
}
