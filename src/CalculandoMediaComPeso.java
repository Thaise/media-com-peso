import java.math.BigDecimal;
import java.text.DecimalFormat;


public class CalculandoMediaComPeso {

	public static double pesoNotas(double i, double j, double k, double l) {
		
		double mediaComPeso = (i + (j*2) + (k*3) + l) / 7;
		
		double  mediaComPesoFinal = (Math.round(mediaComPeso));
		
		return mediaComPesoFinal;
	}

}
