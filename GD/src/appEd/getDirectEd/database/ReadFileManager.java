package appEd.getDirectEd.database;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;

public class ReadFileManager {
	 
	//constructor
	/**
	 * ReadFileManager
	 * 
	 * Default constructor, nothing to declare
	 */
	public ReadFileManager(){
		
	}//end of constructor

	/**	
	 * ReadFile
	 * 
	 * Takes a file name, context and a number and reads in the file.
	 * Splitting it the number of times designated by splitNumber 
	 * This method skips the first line as to not read in the column names in the .csv file
	 * 
	 * @param fileName
	 * @param context
	 * @param splitNumber
	 * @return
	 */
	public List<String[]> ReadFile(int fileName, Context context, Integer splitNumber){
		String line = null;
		String fields[] = null;
		List<String[]> list = new ArrayList<String[]>();
		BufferedReader br = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(fileName)));
		try {
			br.readLine();
			while( (line = br.readLine()) != null){
			fields = line.split(",", splitNumber);
			list.add(fields);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}//end of ReadFile
}//end of class		