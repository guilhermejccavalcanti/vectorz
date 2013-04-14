package mikera.arrayz;

import static org.junit.Assert.*;
import mikera.matrixx.AMatrix;
import mikera.vectorz.AVector;
import mikera.vectorz.Vectorz;

import org.junit.Test;

public class TestMiscArrayOps {
	@Test public void testOuterProducts() {
		AVector v=Vectorz.createUniformRandomVector(5);
		INDArray a=v.outerProduct(v);
		assertTrue(a instanceof AMatrix);
	}

}
