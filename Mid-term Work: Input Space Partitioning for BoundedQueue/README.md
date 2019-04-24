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
![GitHub](https://raw.githubusercontent.com/LeonCiou/NCTU-Software-Testing-2019/master/Mid-term%20Work%3A%20Input%20Space%20Partitioning%20for%20BoundedQueue/(b).png?token=AIHBNCY6EDG2Z7DQM5BGT5S4ZFXC6)

## Partition the characteristics into blocks. Designate one block in each partition as the "Base" block.
![Github]((c).png?raw=true)
## Define values for each block.

## Define a test set that satisfies Base Choice Coverage (BCC). Write your tests with the values from the previous step. Be sure to include the test oracles.
