# Splitwise (Expense Sharing)

## Problem
Design an expense-splitting system: add expenses among a group, split
equally/exactly/by percentage, show each user's net balance with others,
settle up.

## Clarifying questions
- Which split types are in scope: equal, exact amounts, percentage?
- Do we need "simplify debts" (minimize number of transactions to settle a
  group), or just show pairwise balances?
- Multi-currency? (usually out of scope unless they push)

## Core entities
- `User` — id, name
- `Expense` — payer, amount, participants, `SplitStrategy`
- `Split` (interface) — `EqualSplit`, `ExactSplit`, `PercentSplit`
- `Group` — members, expenses
- `BalanceSheet`/`Ledger` — pairwise net balances between users

## Things interviewers probe for
- **Strategy pattern** for split types.
- Correct balance bookkeeping: if A pays for B and C, update A→B and A→C
  balances (or a net matrix), and make sure repeated expenses net out
  correctly.
- Bonus/hard-mode: debt simplification algorithm (minimize total transactions
  to settle a group) — greedy max-creditor/max-debtor matching.
