# Homework3
For homework3, I must design tests to satisfy PC(predicates coverage), CC(clause coverage), and CACC(correlated active clause coverage) for my own project.  
First, I simply introduce my project. My project is "free5gc". It is a project that implements 5G core network. And it has existed some tests of its functions. However, these test cases is simple and only check of the capability of function. Hence, I can design new tests(PC, CC, CACC) to make these tests as much as possible. Because there are so many functions, I choose one of these functions to test.  

## PC(predicates coverage)  
- Look at `free5gc/lib/nextepc/core/src/sha2_hmac.c`. I want to test `void hmac_sha256_init(hmac_sha256_ctx *ctx, c_uint8_t *key, c_uint32_t key_size)` on line 126.  
- we find out two predicates  
  - Line(136) : (key_size == SHA256_BLOCK_SIZE)  
  - Line(140) : (key_size > SHA256_BLOCK_SIZE)  

- Simplity  
a : key_size == SHA256_BLOCK_SIZE   
b : key_size > SHA256_BLOCK_SIZE  
Line(136) : a   
Line(140) : b  

- Truth table  
 - `a`  
 ![truth table (key_size == SHA256_BLOCK_SIZE)](images/1.png?raw=true)
 -  `b`  
 ![truth table (key_size > SHA256_BLOCK_SIZE)](images/2.png?raw=true)

### a
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
- precondition: (a == b) == false
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
