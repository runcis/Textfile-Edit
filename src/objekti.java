import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class objekti {

	private static final String FILENAME = "src/saraksts.txt";
	
	public static void apskatitVisu() {
		try {
			FileReader fr = new FileReader(FILENAME);
			BufferedReader br = new BufferedReader(fr);
			
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str + "\n");
			}
			br.close();
		} catch (IOException e) {
			System.out.println("File not Found");
			e.printStackTrace();
		}	
			
	}
	
	public static void readFile() throws IOException {
		FileReader fin = new FileReader("src/saraksts.txt");
		BufferedReader br = new BufferedReader(fin);
		String s;
		while ((s = br.readLine()) != null) {
			System.out.println(s);
			
		}
		br.close();

		
	}
	
	public static void outputFile() throws IOException {
		FileReader fin = new FileReader("src/saraksts.txt");
		Scanner sc = new Scanner(fin);
		String s;
		while (sc.hasNextLine()) {
			s = sc.nextLine();
			System.out.println(s);
		}
		sc.close();		
	}
	
	
	public static void rFile(String vards, String uzvards, String date, double cost, double payed) throws IOException{
		BufferedWriter bw = null;
		FileWriter fw = null;
	
		try {


			File file = new File("src/saraksts.txt");

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			// true = append file
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);
			bw.newLine();
			bw.write(vards + " ");
			bw.write(uzvards + " ");
			bw.write(date + " ");
			bw.write(String.valueOf(cost) + " ");
			bw.write(String.valueOf(payed));

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}

	}

	
	public static void deleteFile(String searchId) {
		

		ArrayList<String> tempArray = new ArrayList<>();
    	
    	try {
    		try(FileReader fr = new FileReader("src/saraksts.txt")){
    			Scanner reader = new Scanner(fr);
    			String line;
    			String[] lineArr;
    			
    			while((line = reader.nextLine()) != null) {
    				lineArr = line.split(" ");
    				if(lineArr[0].equals(searchId) || lineArr[1].equals(searchId)) {
    				
    					tempArray.remove(line);

    	    			System.out.println(line + " veiksmīgi izdzēsts");
    				}else {
    					tempArray.add(line);
    				}
    			}
    			
    			fr.close();
    			reader.close();
    		}catch (Exception e) {
			}
    	}catch (Exception e) {
		}
    	
    	try {
    		try (PrintWriter pr = new PrintWriter("src/saraksts.txt")){
    			for(String str : tempArray) {
    				
    				pr.println(str);
    				
    			}
    			pr.close();
    		}catch (Exception e) {
			}
    	}catch (Exception e) {
		}
	}
	
	public static boolean atrada = false;
	
	public static void displayLine(String searchId1){
    	
    	ArrayList<String> tempArray1 = new ArrayList<>();
    	try {
    		try(FileReader fr = new FileReader("src/saraksts.txt")){
    			Scanner reader = new Scanner(fr);
    			String line;
    			String[] lineArr;
    			
    			while((line = reader.nextLine()) != null) {
    				lineArr = line.split(" ");
    				if(lineArr[0].equals(searchId1) || lineArr[1].equals(searchId1)) {
    					System.out.println(line);
    					tempArray1.add(line);
    					atrada = true;
    				}
    				else {
    					tempArray1.add(line);
    					
    				}
    			}
    			
    		
    			fr.close();
    			reader.close();
    		}catch (Exception e) {
			}
    	}catch (Exception e) {
		}
    	
    	try {
    		try (PrintWriter pr = new PrintWriter("src/saraksts.txt")){
    			for(String str : tempArray1) {
    				pr.println(str);
    			}
    			pr.close();
    		}catch (Exception e) {
			}
    	}catch (Exception e) {
		}
	}
	
	
	public static boolean atrada2 = false;
	public static void displayLine1(String searchId1){
    	
    	ArrayList<String> tempArray1 = new ArrayList<>();
    	try {
    		try(FileReader fr = new FileReader("src/saraksts.txt")){
    			Scanner reader = new Scanner(fr);
    			String line;
    			String[] lineArr;
    			
    			while((line = reader.nextLine()) != null) {
    				lineArr = line.split(" ");
    				if(lineArr[0].equals(searchId1) || lineArr[1].equals(searchId1) || lineArr[2].equals(searchId1) || lineArr[3].equals(searchId1) || lineArr[4].equals(searchId1)) {
    					
    					tempArray1.add(line);
    					atrada2 = true;
    				}
    				else {
    					tempArray1.add(line);
    					
    				}
    			}
    			
    		
    			fr.close();
    			reader.close();
    		}catch (Exception e) {
			}
    	}catch (Exception e) {
		}
    	
    	try {
    		try (PrintWriter pr = new PrintWriter("src/saraksts.txt")){
    			for(String str : tempArray1) {
    				pr.println(str);
    			}
    			pr.close();
    		}catch (Exception e) {
			}
    	}catch (Exception e) {
		}
	}
	
	
	
	public static void redigetFile(String searchId1, String searchId2){
    	
    	
    	ArrayList<String> tempArray1 = new ArrayList<>();
    	
    	try {
    		try(FileReader fr = new FileReader("src/saraksts.txt")){
    			Scanner reader = new Scanner(fr);
    			String line;
    			String[] lineArr;
    			boolean redig = true;
    			
    			while((line = reader.nextLine()) != null) {
    				lineArr = line.split(" ");
    				for (int i = 0; i < lineArr.length; i++) {
	    				if(lineArr[i].equals(searchId1)) {
	    					lineArr[i] = searchId2+" ";
	    					line = lineArr[0] +" "+ lineArr[1] +" "+ lineArr[2] +" "+ lineArr[3] +" "+ lineArr[4];
	    					System.out.println("Lauks ir rediģēts veiksmīgi:" + line);
	    					redig = false;
	    				}
    				}
    				
    				tempArray1.add(line);
    				
    			}
    			
    			if(redig) {
					System.out.println("Lauku neizdevās rediģēt!");
    			}
    			
    			fr.close();
    			reader.close();
    		}catch (Exception e) {
			}
    	}catch (Exception e) {
		}
    	
    	try {
    		try (PrintWriter pr = new PrintWriter("src/saraksts.txt")){
    			for(String str : tempArray1) {
    				pr.println(str);
    			}
    			pr.close();
    		}catch (Exception e) {
			}
    	}catch (Exception e) {
		}
	}

//	public static boolean atradaV = false;
//	
//	public static void checkFor(String edit) {
//    	
//    	try {
//    		try(FileReader fr = new FileReader("src/saraksts.txt")){
//    			Scanner reader = new Scanner(fr);
//    			String line;
//    			String[] lineArr;
//    			
//    			while((line = reader.nextLine()) != null) {
//    				
//    				lineArr = line.split(" ");
//    				for(int i = 0; i < lineArr.length; i++) {
//	    				if (edit == lineArr[i]) {
//	    					atradaV = true;
//	    				}
//    				}
//    			}
//    	
//    			
//    			fr.close();
//    			reader.close();
//    		}catch (Exception e) {
//			}
//    	}catch (Exception e) {
//		}
//
//	}
	
	public static void sortFile() {
		ArrayList<String> tempArray = new ArrayList<>();
    	
    	try {
    		try(FileReader fr = new FileReader("src/saraksts.txt")){
    			Scanner reader = new Scanner(fr);
    			String line;
    			String[] lineArr;
    			//ArrayList<String> lines = new ArrayList<String>();
    			
    			String change;
    			while((line = reader.nextLine()) != null) {
    				
    				lineArr = line.split(" ");
    				change = lineArr[0];
    				lineArr[0] = lineArr[1];
    				lineArr[1] = change;
    				line = lineArr[0] +" "+ lineArr[1] +" "+ lineArr[2] +" "+ lineArr[3] +" "+ lineArr[4];
    				tempArray.add(line);
    			}
    	
    			
    			
    			fr.close();
    			reader.close();
    		}catch (Exception e) {
			}
    	}catch (Exception e) {
		}
    	
    	Collections.sort(tempArray);
    	System.out.println("Veiksmīgi sašķirots pēc uzvārdiem.");
    	
    	try {
    		try (PrintWriter pr = new PrintWriter("src/saraksts.txt")){
    			for(String str : tempArray) {
    				
    				pr.println(str);
    				
    			}
    			pr.close();
    		}catch (Exception e) {
			}
    	}catch (Exception e) {
		}
	}
	
	//NESANAAK
	public static void sortFileDate() {
		ArrayList<String> tempArray = new ArrayList<String>();
    	
    	try {
    		try(FileReader fr = new FileReader("src/saraksts.txt")){
    			Scanner reader = new Scanner(fr);
    			String line;
    			String[] lineArr;
    			
    			String lineDate;
    			String[] lineArrDate;
    			//ArrayList<String> lines = new ArrayList<String>();
    			
    			String date;
    			
    			lineDate = reader.nextLine();
    				
    			lineArrDate = lineDate.split(" ");
    			date = lineArrDate[2];
    			Date firstdate=new SimpleDateFormat("dd/MM/yyyy").parse(date);
    			
    			while((line = reader.nextLine()) != null) {
    				
    				lineArr = line.split(" ");
    				date = lineArr[2];
    				Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(date);;
    				String change, change1;
    				
    				
    				change = lineArr[0];
    				change1 = lineArr[1];
    				lineArr[0] = date;
    				lineArr[1] = change;
    				lineArr[2] = change1;
    				
    				
    				
    				line = date +" "+ lineArr[1] +" "+ lineArr[2] +" "+ lineArr[3] +" "+ lineArr[4];
    				
    				
	    				if(date2.after(firstdate)){
		    				line = date +" "+ lineArr[0] +" "+ lineArr[1] +" "+ lineArr[3] +" "+ lineArr[4];
		    				tempArray.add(line);
	    				}
    				else {
	    					String lower = tempArray.get(tempArray.size()-1);
	    					tempArray.remove(tempArray.size()-1);
	    					
	    					tempArray.add(line);
	    					tempArray.add(lower);
	    				}
    				
    				
    					
    			
    			}
    		
    			
    			
    			fr.close();
    			reader.close();
    		}catch (Exception e) {
			}
    	}catch (Exception e) {
		}
    	
    	
    	
    	System.out.print(tempArray);
    	
    	try {
    		try (PrintWriter pr = new PrintWriter("src/saraksts.txt")){
    			for(String str : tempArray) {
    				
    				pr.println(str);
    				
    			}
    			pr.close();
    		}catch (Exception e) {
			}
    	}catch (Exception e) {
		}
	}
	

	public static void outputUnpayed() {
    	try {
    		try(FileReader fr = new FileReader("src/saraksts.txt")){
    			Scanner reader = new Scanner(fr);
    			String line;
    			String[] lineArr;
    			
    			System.out.println("Nepilnīgi vai nesamaksājuši klienti:");
    			while((line = reader.nextLine()) != null) {
    				lineArr = line.split(" ");
    				if (Double.parseDouble(lineArr[3]) - Double.parseDouble(lineArr[4]) != 0) {
    					System.out.println(line);
    				}
    			}
    			fr.close();
    			reader.close();
    		}catch (Exception e) {
			}
    	}catch (Exception e) {
		}
    
	}
	
	public static void kopaNauda() {
		Double sum = 0.00;
    	try {
    		try(FileReader fr = new FileReader("src/saraksts.txt")){
    			Scanner reader = new Scanner(fr);
    			String line;
    			String[] lineArr;
    			
    			while((line = reader.nextLine()) != null) {
    				lineArr = line.split(" ");
    				sum = sum + Double.parseDouble(lineArr[3]);
    				
    			}
    			
    			
    			fr.close();
    			reader.close();
    			
    		}catch (Exception e) {
			}
    	}catch (Exception e) {
		}
    	System.out.println("Kopējā pasūtijumu cena:" + sum);
	}
	
	
	
}

	
