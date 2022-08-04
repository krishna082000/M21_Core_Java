package com.cg.lamexp;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLExp {

	public static void main(String[] args) {
		//Lambda Expression
		FileFilter obj=(File pathname)-> pathname.getName().endsWith(".pptx");
		File dir=new File("C:\\Users\\krishna\\Downloads");
		File[]contents=dir.listFiles(obj);
		for(File i:contents)
		{
			System.out.println(i);
		}
	}

}
