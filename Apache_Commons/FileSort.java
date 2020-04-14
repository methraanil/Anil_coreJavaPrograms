package pkg.Apache_Commons;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileSort {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\\\\\\\Users\\\\\\\\sunil_Anil\\\\\\\\Desktop\\\\\\\\Attra-CoreJavaTraining\\\\\\\\File01.txt");
		//String s=FileUtils.readFileToString(file);
		List<String> list=FileUtils.readLines(file, "UTF-8");
		Collections.sort(list);
		//System.out.println(list);
		FileUtils.write(file, "","UTF-8",false);
		for(String s:list) {
			FileUtils.write(file,s+"\n","UTF-8",true);
			System.out.println(s);
		}
	//	FileUtils.
		
		

	}

}
