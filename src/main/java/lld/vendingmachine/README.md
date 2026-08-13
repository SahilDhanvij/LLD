# Vending Machine

## Problem
Design a vending machine: select a product, insert money, dispense product
and change, handle out-of-stock and insufficient-funds cases.

## Clarifying questions
- Single machine or a chain-managed fleet?
- Coins/notes or card payment, or both?
- Can a user cancel mid-transaction and get a refund?
- Restocking/admin operations in scope?

## Core entities
- `Product` — name, price, quantity
- `Inventory` — slot -> product mapping
- `VendingMachineState` (interface) — Idle, HasMoney, Dispensing, OutOfStock
- `VendingMachine` — context holding current state, delegates behavior to it
- `Coin`/`Payment` — accepted denominations

## Things interviewers probe for
- **State pattern**: this is the textbook example. Each state class implements
  the same interface (`selectProduct`, `insertCoin`, `dispense`, `refund`) but
  behaves differently.
- Correct state transitions on edge cases (insert money then cancel, select
  out-of-stock item, exact change unavailable).
