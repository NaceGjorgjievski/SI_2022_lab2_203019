import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private List<String> createList(String... elems){
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void EveryStatemntTest(){
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class,()->SILab2.function(new ArrayList<>()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class,()-> SILab2.function(createList("0","#","0","#","#")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        assertEquals(createList("2","#","2","#","4","#","2","#","#"),SILab2.function(createList("0","#","0","#","0","#","0","#","#")));
    }

    @Test
    void EveryBranchTest(){
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class,()->SILab2.function(new ArrayList<>()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class,()-> SILab2.function(createList("0","#","0","#","#")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        assertEquals(createList("#","3","#","3","#","#","#","2","1"),SILab2.function(createList("#","0","#","0","#","#","#","0","0")));
    }
}