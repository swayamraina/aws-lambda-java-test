import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import request.Order;
import request.Request;
import request.State;
import response.Response;


public class Main implements RequestHandler<Request, Response> {

    @Override public Response handleRequest (Request request, Context context) {
        context.getLogger().log("request received: " + request.toString());
        Float amount = total (request);
        return new Response(amount, "6");
    }

    private Float total (Request r) {
        Float total = 0f;
        if (null == r.profile()) return total;
        if (!r.profile().active()) return total;
        if (null == r.orders() || 0 == r.orders().size()) return total;
        for (Order o : r.orders()) {
            if (State.CONFIRMED.equals(o.state())) {
                total += o.price();
            }
        }
        return total;
    }

    static {
        try { Thread.sleep(3000); } catch (Exception e) {}
    }

}
