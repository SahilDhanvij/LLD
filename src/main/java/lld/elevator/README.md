# Elevator System

## Problem
Design an elevator control system for a building with multiple elevators:
handle external hall calls (floor + direction) and internal cabin requests,
decide which elevator serves which request, move elevators, open/close doors.

## Clarifying questions
- How many elevators, how many floors?
- Scheduling strategy: nearest-elevator, SCAN/LOOK (serve requests in one
  direction before reversing), or something else?
- Are external calls just "up/down" buttons per floor (typical), and internal
  calls specific floor numbers from inside the cabin?

## Core entities
- `Elevator` — current floor, direction, state (idle/moving/door open),
  internal request queue
- `ElevatorController`/`ElevatorSystem` — owns all elevators, assigns
  incoming requests to the "best" elevator
- `Request` — external (floor + direction) or internal (target floor)
- `Direction` enum — UP, DOWN, IDLE

## Things interviewers probe for
- **Concurrency**: multiple requests can arrive while an elevator is mid-move;
  design needs a thread-safe way to queue/merge requests.
- Scheduling algorithm choice and why (SCAN/LOOK avoids starvation vs naive
  nearest-elevator).
- Where does the "which elevator should serve this call" decision live —
  should be a pluggable strategy, not hardcoded in the controller.
