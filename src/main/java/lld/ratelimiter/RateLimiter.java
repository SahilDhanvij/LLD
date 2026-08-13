package lld.ratelimiter;

public interface RateLimiter {
    /**
     * @return true if the request for this client should be allowed.
     */
    boolean allowRequest(String clientId);
}
