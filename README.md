# LLD Interview Prep

A Java/Maven scaffold for practicing Low-Level Design (LLD) interview questions
by actually writing code, not just drawing diagrams.
I have already written codes for all, you can remove them and try your own.

## How to use this

1. Open this folder in VS Code (`code .` from inside `lld-prep/`).
2. Install the "Extension Pack for Java" (Microsoft) if you don't have it —
   gives you IntelliSense, run/debug buttons, refactoring.
3. Each problem lives in its own package under `src/main/java/lld/<problem>/`.
   Every package currently has:
   - A `README.md` — the problem statement, clarifying questions to ask,
     and the core entities/design decisions worth thinking through.
   - Skeleton interfaces/classes with `// TODO` markers where you write the code.
   - A `Main.java` (or `Demo.java`) you can run to manually test your design.
4. Work through a problem the way you would in a real interview:
   - Spend 5 min on requirements/clarifying questions (write them at the top of the README).
   - Spend 5-10 min sketching entities/relationships (can be a comment block, doesn't need a diagram tool).
   - Spend the rest actually implementing classes, interfaces, enums.
   - Run `Main.java` to sanity-check behavior.
5. Once done, compare against the "things interviewers probe for" notes in each README.

## Suggested order (easy → hard)

1. `parkinglot` — classic OOP modeling, strategy pattern for pricing/spot allocation
2. `vendingmachine` — state machine design
3. `tictactoe` — simple game state + win-condition logic
4. `lrucache` — data structure + Big-O correctness under the hood
5. `ratelimiter` — concurrency-adjacent, algorithm choice (token bucket / sliding window)
6. `library` — relationships between entities, availability tracking
7. `splitwise` — graph-ish balance simplification, harder domain modeling
8. `elevator` — concurrency + scheduling strategy, a common "hard" LLD question
9. `bookmyshow` — biggest one: booking/locking, concurrency, multiple actors
10. `parkinglot`
## Running things

Compile everything:
```bash
mvn compile
```

Run a specific problem's Main class, e.g. Parking Lot:
```bash
mvn compile exec:java -Dexec.mainClass="lld.parkinglot.Main"
```
(If `exec:java` isn't available, just run the class directly from VS Code's
"Run" lens above `main()` — that's usually the faster loop during practice.)

## General LLD interview approach (applies to every problem here)

1. **Clarify scope** — what's in scope vs out of scope? Single-process or distributed?
2. **Identify core objects/actors** — nouns become classes, verbs become methods.
3. **Define relationships** — composition vs aggregation, who owns whom.
4. **Pick key design patterns where they genuinely fit** — don't force it.
   Common fits: Strategy (pricing, allocation), State (status transitions),
   Observer (notifications), Factory (object creation), Singleton (registries/managers).
5. **Handle concurrency explicitly if asked** — where could two threads race?
   (e.g., two people booking the same seat/spot at once)
6. **Write real code** — interfaces first, then concrete classes, then wire them
   together in a manager/service class.
7. **Talk about extensibility** — how would you add a new spot type / payment
   method / notification channel without rewriting existing code?

## Folder map

```
src/main/java/lld/
  common/         shared enums/utilities if a problem needs them
  parkinglot/
  vendingmachine/
  tictactoe/
  lrucache/
  ratelimiter/
  library/
  splitwise/
  elevator/
  bookmyshow/
```
