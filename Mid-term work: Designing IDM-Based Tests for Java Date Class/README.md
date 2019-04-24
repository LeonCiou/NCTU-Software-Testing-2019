# Date class

## Determine the characteristics of Date
- Date() - Allocates a Date object and initializes it so that it represents the time at which it was allocated, measured to the nearest millisecond.
- Date(long date) - Allocates a Date object and initializes it to represent the specified number of milliseconds since the standard base time known as "the epoch", namely January 1, 1970, 00:00:00 GMT.
- boolean after(Date when) - Tests if this date is after the specified date.
  - Exception: NullPointerException
- boolean before(Date when) - Tests if this date is before the specified date.
  - Expception: NullPointerException
- boolean equals(Object obj) - Compares two dates for equality.
- int compareTo(Date anotherDate) - Compares two Dates for ordering.
  - Exception: NullPointerException
  
### Devolop characteristics
![Github](images/a.png?raw=true)

### Relevant characteristics for each method
![Github](images/b.png?raw=true)

## Define the test requirements for Date
![Github](images/c.png?raw=true)
C1=F: doesn’t initialize
C2=F: doesn’t initialize

## Refine Tests for JUnit tests
![Github](images/d.png?raw=true)
