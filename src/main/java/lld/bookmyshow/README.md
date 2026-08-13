# BookMyShow (Movie Ticket Booking)

## Problem
Design a movie ticket booking system: browse shows for a movie/city, view
seat layout for a show, select seats, hold them temporarily, pay, confirm
booking.

## Clarifying questions
- Single theater or multi-city/multi-theater?
- Seat categories (regular/premium) with different pricing?
- How long is a seat "held" before release if payment isn't completed?
- Payment integration — assume a `PaymentGateway` interface, don't implement
  real payment.

## Core entities
- `Movie`, `Theater`, `Screen`, `Show` (movie + screen + time)
- `Seat` — category, position; `SeatStatus` — AVAILABLE, HELD, BOOKED
- `Booking` — user, show, seats, status
- `SeatLockManager` / hold mechanism with expiry
- `PaymentGateway` (interface)

## Things interviewers probe for
- **Concurrency is the whole point of this question**: two users selecting
  the same seat at the same time must not both succeed. Discuss
  locking/holding seats with a timeout (and how you'd implement that —
  synchronized blocks, a scheduled cleanup task, or a distributed lock if
  asked about scaling).
- Clean seat status state machine (AVAILABLE → HELD → BOOKED, with HELD
  reverting to AVAILABLE on timeout or cancellation).
- Separation of concerns: booking logic vs payment vs seat locking.
