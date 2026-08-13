package lld.ratelimiter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TokenBucketRateLimiter implements RateLimiter {
    private final int capacity;
    private final double refillTokensPerSecond;
    private final Map<String, Object> buckets = new ConcurrentHashMap<>();
    // TODO: define a small Bucket class holding current tokens + lastRefillTimestamp

    public TokenBucketRateLimiter(int capacity, double refillTokensPerSecond) {
        this.capacity = capacity;
        this.refillTokensPerSecond = refillTokensPerSecond;
    }

    @Override
    public boolean allowRequest(String clientId) {
        // TODO: get-or-create bucket for clientId, refill based on elapsed
        // time, consume a token if available (return true), else return false.
        throw new UnsupportedOperationException("not implemented");
    }
}
