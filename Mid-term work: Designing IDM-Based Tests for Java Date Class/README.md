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

## Define the test requirements for Date

## Refine Tests for JUnit tests
