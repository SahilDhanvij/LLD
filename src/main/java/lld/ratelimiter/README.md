# Rate Limiter

## Problem
Design a rate limiter that allows at most N requests per client per time
window.

## Clarifying questions
- Per-user, per-IP, per-API-key limiting?
- Algorithm preference: token bucket, sliding window log, sliding window
  counter, fixed window? (Good to implement 2 and discuss tradeoffs.)
- Single instance in-memory, or does it need to work across distributed nodes
  (would need Redis or similar — good discussion point even if you don't code it)?

## Core entities
- `RateLimiter` (interface) — `allowRequest(clientId)`
- `TokenBucketRateLimiter`, `SlidingWindowRateLimiter` — implementations
- `Bucket`/`WindowState` — per-client state

## Things interviewers probe for
- Understanding the tradeoffs between algorithms (burst tolerance, memory,
  accuracy at window boundaries).
- Thread-safety for concurrent requests from the same client.
- Where per-client state is stored and how it's cleaned up (memory growth).
