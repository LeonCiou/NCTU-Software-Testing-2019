# BoundedQueue
## List all of the input variables, including the state variables.
-   public BoundedQueue(int capacity); // The Maximum number of elements
	- parameters: capacity
-   public void enQueue(Object X);
	- parameters: Object X. 
	- Add an element.
-   public Object deQueue();
	- parameters: state.
	- Remove the element.
-   public boolean isEmpty();
	- parameters: state. 
	- Return True if no element.
-   public boolean isFull();
	- parameters: state.
	- Return True if (size == capacity)
  
## Define the characteristics of the input variables. Make sure you cover all input variables.
![GitHub]((b).png?raw=true)

## Partition the characteristics into blocks. Designate one block in each partition as the "Base" block.
![Github]((c).png?raw=true)
Base block
- For BoundedQueue: C1b1
- For enQueue: C2b1 C3b1
- For deQueue: C4b1
- For isEmpty: C5b1
- For isFull: C6b1

## Define values for each block.
![Github]((d).png?raw=true)

## Define a test set that satisfies Base Choice Coverage (BCC). Write your tests with the values from the previous step. Be sure to include the test oracles.
BCC :
- For BoundedQueue: C1b1, C1b2, C1b3
- For enQueue: C2b1 C3b1, C2b2 C3b1, C2b1 C3b2, C3b1 C3b3
- For deQueue: C4b1, C4b2
- For isEmpty: C5b1, C5b2
- For isFull: C6b1, C6b2
