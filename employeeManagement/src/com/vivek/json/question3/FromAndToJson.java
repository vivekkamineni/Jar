package com.vivek.json.question3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;

/* class that stores employees in Json 
   Also reads Json file to map to employee objects
*/

public class FromAndToJson {
	
    List <Employee> employees = new ArrayList <Employee>(); 
    
    
	
	//Method to save object details in  Json format in a file 
	public void saveTOJson(String filePath, List <Employee> employees) throws IOException{
	try{	
		File f = new File (filePath);
		FileWriter fw = new FileWriter(f);
		Gson gson = new Gson();
		for (Employee Employee : employees ){
			String jsonLine = gson.toJson(Employee);  //converts objects to Json format
			fw.append(jsonLine);
			
		}
		fw.close();
		
	}
	 catch (IOException e) {  
		   e.printStackTrace();  
		  }  
	}
	
	// Method to read a Json file and map to the Employee objects
	public void jsonToObject(String filepath, List <Employee> employees) throws FileNotFoundException{
		try{
			
		
		File f = new File (filepath);
		Scanner fileInput = new Scanner(f);
		Gson gson = new Gson();
		while (fileInput.hasNextLine()){
			String jsonLine = fileInput.nextLine();
			Employee Employee  = gson.fromJson(jsonLine, Employee.class);  // mapping Json to emp. class
			employees.add(Employee);
	        	}
		fileInput.close();
		}
		catch (FileNotFoundException e){
			 e.printStackTrace(); 
		}
	}
	
	
	
	
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		List <Employee> employees = new ArrayList <Employee>(); 
		Employee e1 = new Employee();
		e1.setEmployeeId(1);
		e1.setEmployeeAage(25);
		e1.setEmployeeName("John");
		e1.setEmployeeSkill("Java");
		e1.setSalary(85000);
		
		
		Employee e2 = new Employee();
		e2.setEmployeeId(2);
		e2.setEmployeeAage(22);
		e2.setEmployeeName("Gordon");
		e2.setEmployeeSkill("Python");
		e2.setSalary(95000);
		employees.add(e1);
		employees.add(e2);
		
		FromAndToJson j = new FromAndToJson();
		j.saveTOJson("C:\\EmployeeGSON.json", employees);
		j.jsonToObject("C:\\EmployeeGSON.json", employees);
		
		
		 
		
	}

}
