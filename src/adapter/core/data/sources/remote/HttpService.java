package adapter.core.data.sources.remote;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class HttpService {
    public HttpService() {}

    public Object get() {
        try {
            final Map<String, Object> response = new HashMap<String, Object>();

            response.put("name", "beka");
            response.put("email", "beka@mail.ru");
            response.put("isVip", true);

            return response;
        } catch (Exception e) {
            return CompletableFuture.completedFuture(null);
        }
    }

    public Object post() {
        try {
            final Map<String, Object> response = new HashMap<String, Object>();

            response.put("name", "beka");
            response.put("email", "beka@mail.ru");
            response.put("isVip", true);

            return response;
        } catch (Exception e) {
            return CompletableFuture.completedFuture(null);
        }
    }
}
