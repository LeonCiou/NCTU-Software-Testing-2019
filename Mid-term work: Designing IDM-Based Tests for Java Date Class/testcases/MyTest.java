// Test BoundedQueue
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MyTest {
   private Date myDate ;
   private Date myDate2 ;
   @Before public void setUp(){         // set up test fixture      
   		myDate = new Date() ;
        myDate2 = new Date() ;        
   }
   // C1-T
   @Test public void Test_C1T(){
   		assertTrue(myDate.getTime() != 0) ;
   }
   // C2-T
   @Test public void Test_C2T(){
   		myDate = new Date(1000) ;
   		assertTrue(myDate.getTime() != 0) ;
   }
   // C1-T, C2-T, C3-T
   @Test public void Test_C1T_C2T_C3T(){
   		myDate = new Date() ;
		myDate2 = new Date(1000) ;
		assertTrue(myDate.after(myDate2));
   }
   // C1-T, C2-T, C3-F
   @Test public void Test_C1T_C2T_C3F(){
		myDate = new Date() ;
		myDate2 = new Date(1000) ;
		assertFalse(myDate2.after(myDate));
   }
   // C1-T, C2-T, C4-T
   @Test public void Test_C1T_C2T_C4T(){
   		myDate = new Date() ;
		myDate2 = new Date(1000) ;
		assertTrue(myDate2.before(myDate)) ;
   }
   // C1-T, C2-T, C4-F
   @Test public void Test_C1T_C2T_C4F(){
   		myDate = new Date() ;
		myDate2 = new Date(1000) ;
		assertFalse(myDate.before(myDate2)) ;
   }
   // C1-T, C2-T, C5-T
   @Test public void Test_C1T_C2T_C5T(){
   		myDate = new Date() ;
		myDate2 = new Date(1000) ;
		assertTrue (myDate.equals(myDate));
		assertTrue (myDate2.equals(myDate2)) ;
   }
   // C1-T, C2-T, C5-F
   @Test public void Test_C1T_C2T_C5F(){
   		myDate = new Date() ;
		myDate2 = new Date(1000) ;
		assertFalse (myDate.equals(myDate2)) ;
   }
   // C1-T, C2-T, C6-b1
   @Test public void Test_C1T_C2T_C6b1(){
   		myDate = new Date() ;
		myDate2 = new Date(1000) ;
		assertTrue (myDate.compareTo(myDate) == 0);
		assertTrue (myDate2.compareTo(myDate2) == 0) ;
   }
   // C1-T, C2-T, C6-b2
   @Test public void Test_C1T_C2T_C6b2(){
   		myDate = new Date() ;
		myDate2 = new Date(1000) ;
		assertTrue (myDate.compareTo(myDate2) > 0) ;
   }
   // C1-T, C2-T, C6-b3
   @Test public void Test_C1T_C2T_C6b3(){
   		myDate = new Date() ;
		myDate2 = new Date(1000) ;
		assertTrue (myDate2.compareTo(myDate) < 0) ;
   }
}	
