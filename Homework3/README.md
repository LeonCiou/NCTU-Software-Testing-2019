# Homework3
For homework3, I must design tests to satisfy PC(predicates coverage), CC(clause coverage), and CACC(correlated active clause coverage) for Themostat .

## PC(predicates coverage)
- Look at `src/Thermostat.java`, we find out two predicates
  - Line(28-30) : (((curTemp < dTemp - thresholdDiff) ||  
            (override && curTemp < overTemp - thresholdDiff)) &&  
            (timeSinceLastRun > minLag))  
  - Line (34) : (override)  

- Simplity  
a : curTemp < dTemp - thresholdDiff  
b : Override  
c : curTemp < overTemp - thresholdDiff  
d : timeSinceLastRun > minLag)  
Line(28-30) : (a || (b && c)) && d  
Line(34) : b  
a : curTemp < dTemp - thresholdDiff  
b : Override  
c : curTemp < overTemp - thresholdDiff  
d : timeSinceLastRun > minLag)  

- Truth table  
![truth table (a||(b&&c)) && d](images/TF_Table.png?raw=true)

### (a || (b && c)) && d  
- True  
a(true) : 63 < 69 - 5  
b(true) : true  
c(true) : 63 < 70 - 5  
d(true) : 12 > 10  

- False  
a(false) : 66 < 69 - 5  
b(false) : false  
c(false) : 63 < 67 - 5  
d(false) : 8 > 10  

### b
- precondition: ((a || (b && c)) && d) == true  
- True  
a(true) : 63 < 69 - 5  
b(true) : true  
c(true) : 63 < 70 - 5  
d(true) : 12 > 10  

- False  
a(true) : 63 < 69 - 5  
b(false) : false  
c(true) : 63 < 70 - 5  
d(true) : 12 > 10  

## CC(clause coverage)  
### (a || (b && c)) && d  
- two cases  

- a = b = c = d = true  
a(true) : 63 < 69 - 5  
b(true) : true  
c(true) : 63 < 70 - 5  
d(true) : 12 > 10  

- a = b = c = d = false  
a(false) : 66 < 69 - 5  
b(false) : false  
c(false) : 63 < 67 - 5  
d(false) : 8 > 10  

### b  
- precondition: ((a || (b && c)) && d) == true  
- two cases  

- True  
a(true) : 63 < 69 - 5  
b(true) : true  
c(true) : 63 < 70 - 5  
d(true) : 12 > 10  

- False  
a(true) : 63 < 69 - 5  
b(false) : false  
c(true) : 63 < 70 - 5  
d(true) : 12 > 10  

## CACC(correlated active clause coverage)  
### (a || (b && c)) && d  
|                |  a  |  b  |  c  |  d  |
|----------------|-----|-----|-----|-----|
|P<sub>a</sub>   |  T  |  t  |  f  |  t  |
|                |  F  |  t  |  f  |  t  |
|P<sub>b</sub>   |  f  |  T  |  t  |  t  |
|                |  f  |  F  |  t  |  t  |
|P<sub>c</sub>   |  f  |  t  |  T  |  t  |
|                |  f  |  t  |  F  |  t  |
|P<sub>d</sub>   |  t  |  t  |  t  |  T  |
|                |  t  |  t  |  t  |  F  |  

### b  
- precondition: ((a || (b && c)) && d) == true  

|                |  a  |  b  |  c  |  d  |
|----------------|-----|-----|-----|-----|
|P<sub>b</sub>   |  t  |  T  |  t  |  t  |
|                |  t  |  F  |  t  |  t  |


## The set of test cases I need  
|         |  a  |  b  |  c  |  d  |
|---------|-----|-----|-----|-----|
|  case1  |  T  |  T  |  F  |  T  |
|  case2  |  F  |  T  |  F  |  T  |
|  case3  |  F  |  T  |  T  |  T  |
|  case4  |  F  |  F  |  T  |  T  |
|  case5  |  T  |  T  |  T  |  T  |
|  case6  |  T  |  T  |  T  |  F  |
|  case7  |  F  |  F  |  F  |  F  |
|  case8  |  T  |  F  |  T  |  T  |



