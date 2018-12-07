package calc;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class Plus implements Operation {
	
	private Logger logger = Logger.getLogger(Plus.class);
	
	public int operate(int i, int j) {
		int result = i+j;
		logger.info(String.format("Ergebnis: %d", result));
		return result;
	}
	
}
