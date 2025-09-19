package structural.Proxy;

// Proxy for Tekion server
public class TekionProxy implements Server {
    private Server realServer;
    private String cachedResponse;

    public TekionProxy() {
        this.realServer = new Tekion();
    }

    @Override
    public void call(String request) {
        // Add headers
        System.out.println("[Proxy] Adding auth headers for request: " + request);
        // Logging
        System.out.println("[Proxy] Logging request: " + request);
        // Caching (simple demo)
        if (cachedResponse != null) {
            System.out.println("[Proxy] Returning cached response");
            System.out.println(cachedResponse);
            return;
        }
        // Call real server
        realServer.call(request);
        // Cache response (for demo, just cache the request string)
        cachedResponse = "Cached response for: " + request;
    }
}
