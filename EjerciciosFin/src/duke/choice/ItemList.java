package duke.choice;

import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

import java.util.Arrays;

public class ItemList implements Handler {
    private Clothing[] stock;
    public ItemList(Clothing[] stock) {
        this.stock = stock;
    }
    @Override
    public void accept(ServerRequest serverRequest, ServerResponse serverResponse) {
        serverResponse.status(Http.Status.OK_200);
        serverResponse.headers().put("Content-Type", "text/plain; charset=UTF-8");
        StringBuilder result = new StringBuilder();
        for(Clothing c : stock){
            result.append(c + "\n");
        }
        serverResponse.send(result);
    }
}
