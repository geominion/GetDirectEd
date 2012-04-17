package appEd.getDirectEd.database;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;

public class ReadFileManager {
 
	//constructor
	public ReadFileManager(){
		
	}//end of constructor
   
	public List<String[]> ReadFacFile(int fileName, Context context){
		String line = null;
		String fields[] = null;
		List<String[]> list = new ArrayList<String[]>();
		BufferedReader br = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(fileName)));
		try {
			br.readLine();
			while( (line = br.readLine()) != null){
			fields = line.split(",", 8);
			list.add(fields);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}//end of ReadFileFromPorject

	public List<String[]> ReadActFile(int fileName, Context context){
		String line = null;
		String fields[] = null;
		List<String[]> list = new ArrayList<String[]>();
		BufferedReader br = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(fileName)));
		try {
			br.readLine();
			while( (line = br.readLine()) != null){
			fields = line.split(",", 5);
			list.add(fields);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<String[]> ReadSubActFile(int fileName, Context context){
		String line = null;
		String fields[] = null;
		List<String[]> list = new ArrayList<String[]>();
		BufferedReader br = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(fileName)));
		try {
			br.readLine();
			while( (line = br.readLine()) != null){
			fields = line.split(",", 5);
			list.add(fields);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<String[]> ReadActHoursFile(int fileName, Context context){
		String line = null;
		String fields[] = null;
		List<String[]> list = new ArrayList<String[]>();
		BufferedReader br = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(fileName)));
		try {
			br.readLine();
			while( (line = br.readLine()) != null){
			fields = line.split(",", 6);
			list.add(fields);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}//end of ReadFileFromPorject
	
	public List<String[]> ReadFacSuperActFile(int fileName, Context context){
		String line = null;
		String fields[] = null;
		List<String[]> list = new ArrayList<String[]>();
		BufferedReader br = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(fileName)));
		try {
			br.readLine();
			while( (line = br.readLine()) != null){
			fields = line.split(",", 2);
			list.add(fields);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}//end of ReadFileFromPorject
	
	public List<String[]> ReadFacTypeFile(int fileName, Context context){
		String line = null;
		String fields[] = null;
		List<String[]> list = new ArrayList<String[]>();
		BufferedReader br = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(fileName)));
		try {
			br.readLine();
			while( (line = br.readLine()) != null){
			fields = line.split(",", 2);
			list.add(fields);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}//end of ReadFileFromPorject

}//end of class	