import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;


public class Main implements RequestHandler<Request, Float> {

    @Override public Float handleRequest (Request request, Context context) {
        return total (request);
    }

    private Float total (Request r) {
        Float total = 0f;
        if (!r.profile().active()) return total;
        if (null == r.orders() || 0 == r.orders().size()) return total;
        for (Order o : r.orders()) {
            if (State.CONFIRMED.equals(o.state())) {
                total += o.price();
            }
        }
        return total;
    }

}
