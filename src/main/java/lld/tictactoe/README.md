# Tic-Tac-Toe

## Problem
Design a 2-player Tic-Tac-Toe game: make moves, detect win/draw, reject
invalid moves.

## Clarifying questions
- Fixed 3x3 or configurable NxN with a "k in a row to win" rule?
- Two human players, or should the design allow plugging in an AI player later?

## Core entities
- `Board` — grid state, move validation, win/draw detection
- `Player` — symbol (X/O), name
- `Game` — orchestrates turns, holds Board + Players, reports result

## Things interviewers probe for
- Clean win-detection that doesn't hardcode 3x3 (scales to NxN if asked).
- Where does turn-order/validation logic live — in `Game`, not scattered.
- Extensibility: could you plug in a different win condition or board size
  without rewriting `Game`?
