// Test BoundedQueue
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MyTest {
   private BoundedQueue myQueue ;
   @Before public void setUp(){         // set up test fixture      
   		myQueue = new BoundedQueue(2) ;
   }

   // Test C1b1, use isEmpty to prove the constructor function success.
   @Test public void testC1_1()
   {
	  assertTrue (myQueue.isEmpty()) ;
   }
   // Test C1b2
   @Test public void testC1_2(){
   	  myQueue = new BoundedQueue(0) ;
      assertTrue (myQueue.isEmpty()) ;
   }
   // Test C1b3
   @Test(expected = IllegalArgumentException.class) 
   public void testC1_3()
   {
	  myQueue = new BoundedQueue(-1) ;
   }
   // C2b1 C3b1
   @Test(expected=IllegalStateException.class) 
   public void test_C2b1_C3b1(){
   		myQueue.enQueue(1);
		myQueue.enQueue(1);
		myQueue.enQueue(1);
   }
   // C2b2 C2b2 
   @Test(expected=NullPointerException.class) 
   public void test_C2b2_C3b1(){
   		myQueue.enQueue(1);
		myQueue.enQueue(1);
		myQueue.enQueue(null);
   }
   // C2b1 C3b2
   @Test
   public void test_C2b1_C3b2(){
   		myQueue.enQueue(1);
		// at this time, capacity > size > 0
		myQueue.enQueue(1);
		assertTrue(myQueue.isFull());
   }
   // C2b1 C3b3
   @Test
   public void test_C2b1_C3b3(){
   		myQueue.enQueue(1) ;
		assertFalse(myQueue.isEmpty());
   }
   // C4b1
   @Test(expected=IllegalStateException.class) 
   public void test_C4b1(){
   		myQueue.deQueue();
   }
   // C4b2
   @Test
   public void test_C4b2(){
   		myQueue.enQueue(1);
		myQueue.deQueue() ;
		assertTrue(myQueue.isEmpty());
   }
   // C5b1
   @Test
   public void test_C5b1(){
   		assertTrue(myQueue.isEmpty()) ;
   }
   // C5b2
   @Test
   public void test_C5b2(){
   		myQueue.enQueue(1) ;
		assertFalse (myQueue.isEmpty()) ;
   }
   // C6b1
   @Test
   public void test_C6b1(){
   		myQueue.enQueue(1);
		myQueue.enQueue(1);
		assertTrue (myQueue.isFull()) ;
   }
   // C6b2
   @Test
   public void test_C6b2(){
   		myQueue.enQueue(1);
		assertFalse (myQueue.isFull()) ;
   }
}
