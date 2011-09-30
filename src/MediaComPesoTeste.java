import static org.junit.Assert.*;

import org.junit.Test;


public class MediaComPesoTeste {

	@Test
	public void mediaPeso() {
		double resultado = CalculandoMediaComPeso.pesoNotas(10,9,8,7);
			assertEquals(8, resultado, 0);
	}

}
 