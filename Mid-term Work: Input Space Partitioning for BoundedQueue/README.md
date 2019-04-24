# BoundedQueue
## List all of the input variables, including the state variables.
-   public BoundedQueue(int capacity); // The Maximum number of elements
	- input variable : capacity
-   public void enQueue(Object X);
	- input variable : Object X. Add an element.
-   public Object deQueue();
	- param : state. Remove the element.
-   public boolean isEmpty();
	- param : state. Return True if no element.
-   public boolean isFull();
	- param : state. Return True if (size == capacity)
  
## Define the characteristics of the input variables. Make sure you cover all input variables.
![GitHub](https://raw.githubusercontent.com/LeonCiou/NCTU-Software-Testing-2019/master/Mid-term%20Work%3A%20Input%20Space%20Partitioning%20for%20BoundedQueue/(b).png?token=AIHBNCY6EDG2Z7DQM5BGT5S4ZFXC6)
## Partition the characteristics into blocks. Designate one block in each partition as the "Base" block.
## Define values for each block.
## Define a test set that satisfies Base Choice Coverage (BCC). Write your tests with the values from the previous step. Be sure to include the test oracles.
