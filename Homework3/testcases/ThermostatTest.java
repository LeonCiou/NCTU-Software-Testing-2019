import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ThermostatTest{
    
    private Thermostat thermostat ;
    private ProgrammedSettings proSet ;
    @Before 
    public void setUp(){
        proSet = new ProgrammedSettings();
        thermostat = new Thermostat();
        proSet.setSetting(Period.MORNING, DayType.WEEKDAY, 69) ;
        thermostat.setDay(DayType.WEEKDAY) ;
        thermostat.setPeriod(Period.MORNING) ;
    }
    
    // TTFT
    @Test public void test1(){
        thermostat.setCurrentTemp(63) ;
        thermostat.setThresholdDiff(5) ;
        thermostat.setOverride(true) ;
        thermostat.setOverTemp(67) ;
        thermostat.setMinLag(10) ;
        thermostat.setTimeSinceLastRun(12) ;
        
        assertTrue (thermostat.turnHeaterOn(proSet));
    }
    
    // FTFT
    @Test public void test2(){
        thermostat.setCurrentTemp(66) ;
        thermostat.setThresholdDiff(5) ;
        thermostat.setOverride(true) ;
        thermostat.setOverTemp(67) ;
        thermostat.setMinLag(10) ;
        thermostat.setTimeSinceLastRun(12) ;

        assertFalse (thermostat.turnHeaterOn(proSet));
    }
    
    // FTTT
    @Test public void test3(){
        thermostat.setCurrentTemp(66) ;
        thermostat.setThresholdDiff(5) ;
        thermostat.setOverride(true) ;
        thermostat.setOverTemp(72) ;
        thermostat.setMinLag(10) ;
        thermostat.setTimeSinceLastRun(12) ;

        assertTrue (thermostat.turnHeaterOn(proSet));
    }

    // FFTT
    @Test public void test4(){
        thermostat.setCurrentTemp(66) ;
        thermostat.setThresholdDiff(5) ;
        thermostat.setOverride(false) ;
        thermostat.setOverTemp(72) ;
        thermostat.setMinLag(10) ;
        thermostat.setTimeSinceLastRun(12) ;

        assertFalse (thermostat.turnHeaterOn(proSet));
    }
    
    // TTTT
    @Test public void test5(){
        thermostat.setCurrentTemp(63) ;
        thermostat.setThresholdDiff(5) ;
        thermostat.setOverride(true) ;
        thermostat.setOverTemp(72) ;
        thermostat.setMinLag(10) ;
        thermostat.setTimeSinceLastRun(12) ;

        assertTrue (thermostat.turnHeaterOn(proSet));
    }

    // TTTF
    @Test public void test6(){
        thermostat.setCurrentTemp(63) ;
        thermostat.setThresholdDiff(5) ;
        thermostat.setOverride(true) ;
        thermostat.setOverTemp(72) ;
        thermostat.setMinLag(10) ;
        thermostat.setTimeSinceLastRun(8) ;

        assertFalse (thermostat.turnHeaterOn(proSet));
    }

    // FFFF
    @Test public void test7(){
        thermostat.setCurrentTemp(66) ;
        thermostat.setThresholdDiff(5) ;
        thermostat.setOverride(false) ;
        thermostat.setOverTemp(67) ;
        thermostat.setMinLag(10) ;
        thermostat.setTimeSinceLastRun(8) ;

        assertFalse (thermostat.turnHeaterOn(proSet));
    }

    // TFTT
    @Test public void test8(){
        thermostat.setCurrentTemp(63) ;
        thermostat.setThresholdDiff(5) ;
        thermostat.setOverride(false) ;
        thermostat.setOverTemp(72) ;
        thermostat.setMinLag(10) ;
        thermostat.setTimeSinceLastRun(12) ;

        assertTrue (thermostat.turnHeaterOn(proSet));
    }
    
}