package pkg.Apache_Commons;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\\\Users\\\\sunil_Anil\\\\Desktop\\\\Attra-CoreJavaTraining\\\\File01.txt");
		FileUtils.write(file, "Drink more water, stay healthy","UTF-8",true);

	}

}
