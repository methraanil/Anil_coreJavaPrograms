package pkg.Apache_Commons;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Remove_duplicate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("C:\\\\Users\\\\sunil_Anil\\\\Desktop\\\\Attra-CoreJavaTraining\\\\file02.txt");
		String s=FileUtils.readFileToString(file, "UTF-8");
		s=s.replace("\n"," ");
		String[] s1=s.split(" ");
		String s3="";
		for(String x:s1) {
			if(!s3.contains(x)&&x.trim()!="") {
				s3=s3+" "+x;
			}
		}
		FileUtils.write(file, s3, "UTF-8",false);

	}

}
