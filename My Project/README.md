# Homework3
For homework3, I must design tests to satisfy PC(predicates coverage), CC(clause coverage), and CACC(correlated active clause coverage) for my own project.  
First, I simply introduce my project. My project is "free5gc". It is a project that implements 5G core network. And it has existed some tests of its functions. However, these test cases is simple and only check of the capability of function. Hence, I can design new tests(PC, CC, CACC) to make these tests as much as possible. Because there are so many functions, I choose one of these functions to test.  

## Screenshot
- Test result  
![test result](images/screenshot.png?raw=true)

## PC(predicates coverage)  
- Look at `src/sha2_hmac.c`. I want to test `void hmac_sha256_init(hmac_sha256_ctx *ctx, c_uint8_t *key, c_uint32_t key_size)` on line 126.  
- we find out two predicates  
  - Line(136) : (key_size == SHA256_BLOCK_SIZE)  
  - Line(140) : (key_size > SHA256_BLOCK_SIZE)  

- Simplity  
a : key_size == SHA256_BLOCK_SIZE   
b : key_size > SHA256_BLOCK_SIZE  
Line(136) : a   
Line(140) : b  
`SHA256_BLOCK_SIZE` is a fixed value.  
`SHA256_BLOCK_SIZE = 64`  

- Truth table  
 - a  
 ![truth table (key_size == SHA256_BLOCK_SIZE)](images/1.png?raw=true)
 - b  
 ![truth table (key_size > SHA256_BLOCK_SIZE)](images/2.png?raw=true)

### a
- True  
a(true) : 64 == 64  

- False  
a(false) : 4 == 64  

### b
- precondition: a = false  
- True  
a(false) : 128 == 64  
b(true) :  128 > 64  

- False  
a(false) : 4 == 64
b(false) : 4 > 64  

## CC(clause coverage)  
### a
- two cases  

- True  
a(true) : 64 == 64  

- False  
a(false) : 4 == 64  


### b  
- precondition: a = false  
- True  
a(false) : 128 == 64  
b(true) :  128 > 64  

- False  
a(false) : 4 == 64
b(false) : 4 > 64  

## CACC(correlated active clause coverage)  
### a  
|                |  a  |  
|----------------|-----|  
|P<sub>a</sub>   |  T  |  
|                |  F  |  

### b  
- precondition: a = false  

|                |  a  |  b  |  
|----------------|-----|-----|  
|P<sub>b</sub>   |  F  |  T  |  
|                |  F  |  F  |  


## The set of test cases I need  
|         |  a  |  b  |
|---------|-----|-----|
|  case1  |  T  |     |
|  case2  |  F  |  T  |
|  case3  |  F  |  F  |

