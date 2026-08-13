# Library Management System

## Problem
Design a library system: catalog of books (possibly multiple copies), members,
checkout/return, holds/reservations, late fees.

## Clarifying questions
- Multiple copies of the same book (ISBN) — track per-copy or just counts?
- Reservation/holds queue when all copies are checked out?
- Late fee calculation rules?
- Multiple branches, or single library?

## Core entities
- `Book` (catalog-level: title, author, ISBN) vs `BookCopy` (physical item, status)
- `Member` — borrowing history, current checkouts, fees owed
- `Library` — catalog, search, orchestrates checkout/return/hold
- `Checkout` / `Loan` — copy, member, due date
- `Reservation` — member waiting for a copy

## Things interviewers probe for
- Separating the *catalog* concept (Book) from the *physical inventory*
  concept (BookCopy) — a very common LLD modeling test.
- Handling the "all copies checked out, add to hold queue, notify when
  available" flow.
- Clean status transitions for a BookCopy (Available, CheckedOut, Reserved,
  Lost).
