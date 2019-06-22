# Homework3
For homework3, I must design tests to satisfy PC(predicates coverage), CC(clause coverage), and CACC(correlated active clause coverage) for Themostat .

## PC(predicates coverage)
- Look at `src/Thermostat.java`, we find out two predicates
  - Line(28-30):(((curTemp < dTemp - thresholdDiff) ||
           (override && curTemp < overTemp - thresholdDiff)) &&
           (timeSinceLastRun > minLag))
  - Line (34):(override)

## CC(clause coverage)


## CACC(correlated active clause coverage)
