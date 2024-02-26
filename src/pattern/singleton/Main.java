package pattern.singleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		
	}
	
	public static Country country;

    static {
        try {
            readKeyFromConsoleAndInitCountry();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readKeyFromConsoleAndInitCountry() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String consoleInput = reader.readLine();
        switch (consoleInput) {
            case Country.RUSSIA:
                country = Russia.getRussia();
                break;
            case Country.USA:
            	country = USA.getUSA();
            	break;
            case Country.INDIA:
            	country = India.getIndia();
            	break;
            case Country.CHINA:
            	country = China.getChina();
            	break;
            case Country.ARGENTINA:
            	country = Argentina.getArgentina();
            	break;
            default:
                country = null;
                break;
        }
    }
}

