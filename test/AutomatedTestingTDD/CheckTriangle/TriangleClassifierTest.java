package AutomatedTestingTDD.CheckTriangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TriangleClassifierTest {

    @Test
    void TriangleClassifier1(){
        assertEquals("Tam giác đều",TriangleClassifier.checkTriangle(3,3,3));
    }
    @Test
    void TriangleClassifier2(){
        assertEquals("Tam giác cân",TriangleClassifier.checkTriangle(2,2,3));
    }
    @Test
    void TriangleClassifier3(){
        assertEquals("Tam giác thường",TriangleClassifier.checkTriangle(3,5,7));
    }
    @Test
    void TriangleClassifier4(){
        assertEquals("Không phải tam giác",TriangleClassifier.checkTriangle(3,5,12));
    }
}