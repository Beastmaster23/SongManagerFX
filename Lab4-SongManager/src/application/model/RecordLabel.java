package application.model;

import java.io.File;
import java.util.ArrayList;

public class RecordLabel {
	private String name;
	private ArrayList<Record> records;
	
	public RecordLabel() {
		name="";
		records=new ArrayList<Record>();
		
	}
	
	public ArrayList<Record> loadRecords(String recordsPath) {
		ArrayList<Record> loadedRecords=new ArrayList<Record>();
		try {
			File recordsFile=new File(recordsPath);
			if(recordsFile.isFile()&&recordsFile.canRead()) {
				
			}
		}catch(NullPointerException e){
			System.err.println("Path is null");
		}
		
		
		return loadedRecords;
	}
}
