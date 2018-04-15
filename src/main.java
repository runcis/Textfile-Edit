import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class main {
	public static void main(String[] args) throws IOException, ParseException {
		Scanner scan = new Scanner(System.in);
		
		char ch;
		do{
		System.out.println("apskatīt faila saturu: 1");
		System.out.println("ierakstīt failā informāciju par jaunu pasūtījumu: 2");
		System.out.println("izslēgt no faila informāciju par pasūtījumu: 3");
		System.out.println("koriģēt informāciju par pasūtījumu: 4");
		System.out.println("sakārtot informāciju failā pēc datumiem un pasūtītāju uzvārdiem: 5");
		System.out.println("atrast informāciju par visiem pasūtītājiem, kas pagaidām nepilnīgi samaksāja par darbu: 6");
		System.out.println("aprēķināt kopīgo visu pasūtījumu cenu :7");
		
		int choice = scan.nextInt();    
		Scanner scanner = new Scanner(System.in);
		
        switch (choice){
        case 1 : 
        	objekti.apskatitVisu(); 
//    		objekti.readFile();
//    		objekti.outputFile();
            break;                          
        case 2 : 
        	System.out.println("Ievadiet pasūtītāja vārdu:");
        	String vards = scanner.nextLine();
        	
        	System.out.println("Ievadiet pasūtītāja uzvārdu:");
        	String uzvards = scanner.nextLine();
        	
        	System.out.println("Ievadiet pasūtījuma atgriešanas datumu:(dd/mm/yyyy)");
        	String date = scanner.nextLine();
    		//SimpleDateFormat formated = new SimpleDateFormat("dd/MM/yyyy");
    		//Date date1 = formated.parse(date);
            
    		System.out.println("Ievadiet pasūtījuma cenu:");
    		Double cost = scanner.nextDouble();
    		
    		System.out.println("Ievadiet priekšapmaksu:");
    		Double payed = scanner.nextDouble();;
    		
    		objekti.rFile(vards, uzvards, date, cost, payed);       
    			
            break;
        case 3:
        	System.out.println("Ievadiet pasūtītāja vardu, vai uzvārdu, kuru velaties izdzest:");
        	String searchId = scanner.nextLine();     
        	objekti.deleteFile(searchId);
            break; 

        case 4:
        	System.out.println("Ievadiet pasūtītāja vardu, vai uzvārdu, kuru velaties rediģet:");
        	String searchId1 = scanner.nextLine();
        	objekti.displayLine(searchId1);
        	if (objekti.atrada) {
        	System.out.println("Ievadiet lauku, kuru velaties rediģet:");
        	String searchId2 = scanner.nextLine();
        		objekti.displayLine1(searchId2);
	        	if(objekti.atrada2) {
	        	System.out.println("Ievadiet vertibu, ar kuru velaties aizstāt šo lauku:");
	        	String searchId3 = scanner.nextLine();
	        	objekti.redigetFile(searchId2, searchId3);
	        	}else {
	        		System.out.println( "Ievadītā vērtība nav atrasta.");
	        		break;
	        	}
        	
        	}else {
        		System.out.println("Nevarēja atrast šādu vārdu vai uzvārdu");
        		break;
        	}
        	break;
        	
        case 5:
        	System.out.println("Vai vēlaties sakārtot informāciju failā pēc datumiem(1) vai pasūtītāju uzvārdiem(2)");
        	char scanCh = scanner.next().charAt(0);    
			if(scanCh == '1') {
				//objekti.sortFileDate();
				System.out.println("Funkcija nestradā!");
				break;
			}else if (scanCh == '2') {
				objekti.sortFile();
			}else {
				System.out.println("Nepareiza ievade, prasības: [ 1 ; 2 ]");
				break;
			}
        	break;
        
		case 6:
			objekti.outputUnpayed();
        	break;
        
		case 7:
			objekti.kopaNauda();
	    	break;
	    default:
	    	System.out.println("Jāievada vērtība no 1 līdz 7");
	    	break;
	}
		System.out.println("\nVēlaties turpināt?(Ievadiet y lai turpinātu, vai n lai beigtu) \n");
        ch = scan.next().charAt(0);  
        if (ch == 'Y' || ch == 'y' || ch == 'n' || ch == 'N') {
        	
        }else {
        	System.out.println("Nepareiza ievade");
        	System.out.println("\nVēlaties turpināt?(Ievadiet y lai turpinātu, vai n lai beigtu) \n");
            ch = scan.next().charAt(0); 
        }
		} while (ch == 'Y'|| ch == 'y');
		System.out.println("Programma izslēgta.");
		scan.close();
	}

}
