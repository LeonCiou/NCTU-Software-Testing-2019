# Homework3
For homework3, I must design tests to satisfy PC(predicates coverage), CC(clause coverage), and CACC(correlated active clause coverage) for Themostat .

## PC(predicates coverage)
- Look at `src/Thermostat.java`, we find out two predicates
  - Line(28-30) : (((curTemp < dTemp - thresholdDiff) ||
            (override && curTemp < overTemp - thresholdDiff)) &&
            (timeSinceLastRun > minLag))
  - Line (34) : (override)

Simplity

a : curTemp < dTemp - thresholdDiff
b : Override
c : curTemp < overTemp - thresholdDiff
d : timeSinceLastRun > minLag)
Line(28-30) : (a || (b && c)) && d

Line(34) : b

## CC(clause coverage)


## CACC(correlated active clause coverage)
