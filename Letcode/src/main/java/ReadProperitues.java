import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperitues {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		Properties properties = new Properties();
		
		properties.load(new FileInputStream("./letCodeFrench"));
		
		String property = properties.getProperty("welcome");
		System.out.println(property);

	}

}
