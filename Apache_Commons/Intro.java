package pkg.Apache_Commons;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Intro {

	public static void main(String[] args) throws Exception {
	//	File file=new File{"C:\\Users\\sunil_Anil\\Desktop\\Attra-CoreJavaTraining\\File01.txt"};
	//	String x= FileUtils.readFileToString{file,"UTF-8"};
		File file = new File("C:\\\\Users\\\\sunil_Anil\\\\Desktop\\\\Attra-CoreJavaTraining\\\\File01.txt");

		String x = FileUtils.readFileToString(file, "UTF-8");

		System.out.println(x);
		
		List<String> list = FileUtils.readLines(file,"UTF-8");
		
		System.out.println(list);

}
}
