import java.io.*;
import java.util.*;
public class SprintSource {   

    public static void main(String [] args) throws Exception {  // Main string
    
    /* DECLARE BASE PARAMETERS */
	 int finish = 0;
    String start = "";
	 String num = "";
    String driver = "";
	 String spon = "";
    String make = "";
	 boolean foo = false;
	 String spontest = "";
    String laps = "";
    boolean noqualify = false;
    String DNQ = "";
	 String checkLaps = "foo";
	 String led = "";
    int position = 0;
	 String pts = "";
	 String fin = "";
	 String crap = "";
	 String money = "";
	 String status = "";
    String div = "";
	 	int serfinish = 0;
				int L1 = 1;
			int E1 = 1;
	   FileReader fr = new FileReader("TestRace.txt"); // File must be in directory called "TestRace.txt"
            BufferedReader br = new BufferedReader(fr);     
			String inLine = br.readLine();
         inLine = inLine.trim();
			while (inLine  != null) {

         inLine = InputWork(inLine);
       // inLine = inLine.replace(", ","\t");
       //         inLine = inLine.replace(": ","\t");
      //          inLine = inLine.replace(" (","\t");

       //  inLine = inLine.replace(" ","\t");
  //   div = "Florida Modified";
					foo = false;
			      StringTokenizer st = new StringTokenizer(inLine,"\t");
					crap = st.nextToken();
            crap = crap.replace(".", "");
              crap = crap.replace("  ", "\t");
            crap = crap.trim();
            crap = crap.replace(" DNF", "");
                crap = crap.replace("(", "");
				   crap = crap.replace(")", "");
			if (checkIfNumber(crap))
					{ foo = true;
					
					if (finish != 0) { 
               if (noqualify) {
         String finalresult = "{{Race/Result|"+fin+"|"+start+"|"+num+"|"+driver+"|"+spon+"|"+make+"|"+laps+"|"+led+"|"+status+"|"+pts+"|"+div+"}}"; // print last resultant
          finalresult = finalresult.replace(" |", "|");
          System.out.println(finalresult);         
          }
    
    
          }
               
               					  finish = Integer.parseInt(crap); }
					else { driver = driver+";"+crap; }
					
				if (foo) {
				status = ""; pts = ""; noqualify = true;
            
/* GRAB DATA FROM INPUT */
//div = "Super Late Model";
 boolean foofoo = true;
 //crap = st.nextToken();
  start = st.nextToken();
   num = st.nextToken();
    driver = st.nextToken();
  //   led = "0";
    /*
    try {
      crap = st.nextToken();
        } catch (NoSuchElementException ex) {
         foofoo = false;   
        }    
if (foofoo) {
 if (checkIfNumber(crap)) 
   { num = crap; }
   
char[] chars = crap.toCharArray();
for(char c : chars){
   if(Character.isDigit(c)){
    num = crap;
      }
   } // end for
   try {
      num = st.nextToken();
  }
    catch (NoSuchElementException ex) {
         foofoo = false;
         }
}
*/
if (status.equals("did not qualify")) { 
driver = driver.trim();
DNQ = DNQ+driver+"; ";
noqualify = false;
 }
    if (finish == -1) { 
     status = "DNQ";
     start = "";
     led = "";
     laps = "";
   }
    if (finish == -2) { 
     status = "DNS";
     start = "";
     led = "";
     laps = "";
   }
 // led = "0";

/* MANIPULATE DATA */

  //start = "";
	start = start.trim();
	  spon = SponStrip(spon);
	driver = driver.trim();
	spon = spon.trim();
	make = make.trim();
   num = num.replace ("#", "");
	num = num.trim();
   num = num.replace(" ", "");
   laps = laps.replace("-", "0");
   num = NumStrip(num);
	led = led.trim();
	laps = laps.trim();
	status = status.trim();
   pts = pts.trim();
	driver = DriverStrip(driver);
   DNQ = DNQ.replaceAll(driver+";", "");
   pts = pts.replace(".00", "");
   pts = pts.replace("/0/0/0", "");
   start = start.replace("(", "");
   start = start.replace(")", "");
   num = num.replace("(", "");
   num = num.replace(")", "");
   num = num.replace(" ", "");
   start = start.replace("rd", "");
   start = start.replace("nd", "");
   start = start.replace("st", "");
   start = start.replace("th", "");

  // make = make.toLowerCase();
  // make = toTitleCase(make);
   // V8 Supercar Auto-Status
   /*
  if (pts.equals("0")) { status = "out"; }
  else { status = "running"; }
  */
  
	make = MakeStrip(make);
		 driver = returnName(driver);
	fin = Integer.toString(finish);
   if (fin.equals("311")) { fin = ""; status="non-qualifier"; }
   if (laps.equals("DQ")) { laps = ""; status="DQ"; }
// driver = "|"+driver;
/*
	// NASCAR North Instance
	if (!pts.equals(""))  {
	if (pts.equals("OC")) { div="||Yes||No"; }
	else {

   position = position + 1; 
	div = "||No||Yes|"+position;
	
}
}

*/
/* 
   // NASCAR West Instance
    if (num.contains("W")) { div = "||No||Yes"; }
*/

 // NASCAR Sweepstakes Instance
 /*
    if (make.contains("Convert")) { div = "||No||Yes"; }
   else { div = "||Yes||No"; }
*/
   
	if (fin.equals("-1")) { fin = ""; } 
	if (spon.equals(driver)) { spon = ""; }
	if (spon.equals("Foo")) { spon = ""; }
	if (start.equals("-1")) { start = ""; }
	if (fin.equals("1") && !laps.equals("")) { 
	checkLaps = laps; 
	} 
	if (checkLaps.equals(laps) && status.equals("")) { status = "running"; }
	if (make.equals("Imagine")) { make = ""; }
		if (status.equals("Unknown")) { status = ""; }
 if (status.equals("Did not finish")) { status = "out"; }
  if (status.equals("did not finish")) { status = "out"; }

		if (spon.equals("Imagine")) { spon = ""; }
  if (spon.equals("null")) { spon = ""; }
  spon = spon.replace("--", "");
if (spon.equals("-")) { spon = ""; }
  make = make.replace("--", "");
  if (make.equals("-")) { make = ""; }
  num.replace("(", "");
    num.replace(")", "");
   start = start.replace("]", "");
if (start.equals("-")) { start = ""; }
	if (led.equals("-1")) { led = ""; } 
		if (laps.equals("-1")) { laps = ""; } 
	if (num.equals("-1")) { num = ""; } 
		if (num.equals("??")) { num = ""; } 
   num = num.replace("*", "");
	if (status.equals("unknown")) { status = ""; }
   	if (status.equals("imagine")) { status = ""; }

				}
				inLine =	br.readLine();
          }
          if (noqualify) {
			 String finalresult = "{{Race/Result|"+fin+"|"+start+"|"+num+"|"+driver+"|"+spon+"|"+make+"|"+laps+"|"+led+"|"+status+"|"+pts+"|"+div+"}}"; // print last resultant
          finalresult = finalresult.replace(" |", "|");
          System.out.println(finalresult);
          }
         
          DNQ = DNQ.replace(" Jr", ", Jr.");
            DNQ = DNQ.replace(",," , ",");
            DNQ = DNQ.replace("..", "."); 
       
          System.out.println("{{Race/Middle\n|DNQ=" + DNQ);
       
        }  


public static String InputWork(String inLine) {
inLine = inLine.replace(" (R)", "");
inLine = inLine.replace(" (D)", "");
//inLine = inLine.replace(" - ","\t");
inLine = inLine.replace ("\t\t","\t");
inLine = inLine.replace ("\t ","\t");

// inLine = inLine.replace(" (","\t");
//inLine = inLine.replace(" ","\t");
//inLine = inLine.replace(") ","\t");
 //inLine = inLine.replace("-","\t");
//inLine = inLine.replace("/","\t");
//inLine = inLine.replace(". ","\t");
  // inLine = inLine.replace("$","\t");
  //  inLine = inLine.replace(". ","\t");
 //inLine = inLine.replace(" (","\t");
 //inLine = inLine.replace("\n\n", "\n");
//   inLine = inLine.replace("$","\t");
         inLine = inLine.replace("\t\t", "\t");
         inLine = inLine.replace("\t\t", "\t");
         inLine = inLine.replace("\t\t", "\t");
         inLine = inLine.replace("\t\t", "\t");
         inLine = inLine.replace("\t\t", "\t");
         inLine = inLine.replace("\t\t", "\t");
         return inLine;
         }

public static String DriverStrip(String driver) {
        	String delimiter = " \\(Rookie";
	String[] tokens= driver.split(delimiter);
  driver = tokens[0];
 delimiter = "/";
 tokens= driver.split(delimiter);
  driver = tokens[0];
 driver = driver.replace(" (SA)", "");
  driver = driver.replace(" (VIC)", "");
    driver = driver.replace(" (Vic)", "");
driver = driver.replace("VanderWeerd", "Vander Weerd");
 driver = driver.replace(" (NSW)", "");
  driver = driver.replace(" (NZL)", "");
  driver = driver.replace(" (TAS)", "");
 driver = driver.replace(" (Qld)", "");
 driver = driver.replace("John Ownbey", "John Owenby");
  driver = driver.replace(" ®", "");
  driver = driver.replace(" (R)", "");
  driver = driver.replace("  ", " ");
  driver = driver.replace(" – R", "");
    driver = driver.replace(" (N)", "");
    driver = driver.replace(" (J)", "");
    driver = driver.replace(" (L)", "");
    driver = driver.replace("  (R)", "");
    driver = driver.replace("ö", "o");
        driver = driver.replace("ä", "a");
        driver = driver.replace("Å", "A");

        driver = driver.replace("(G)", "");
    driver = driver.replace("(F)", "");
       driver = driver.replace("JR ", "J.R. ");
       driver = driver.replace("RC ", "R.C. ");
       driver = driver.replace("RD ", "R.D. ");
        driver = driver.replace(" (C)", "");
            driver = driver.replace(" (J)", "");
	   driver = driver.replace("  (R)", "");
driver = driver.replace(" ©", "");
  driver = driver.replace("ó", "o");
    driver = driver.replace("é", "é");
   driver = driver.replace("Shane van Gisbergen", "Shane Van Gisbergen");
       driver = driver.replace("Jacob Van Wazer", "Jake Van Wazer");
	   driver = driver.replace("Jean-François Dery", "Jean-François Déry");
      if (driver.equals("Ron Yuhas")) { driver = "Ron Yuhas, Jr."; }
            if (driver.equals("Ronnie Souders, Jr.")) { driver = "Ronnie Souders"; }
              if (driver.equals("Richard Boswell")) { driver = "Richard Boswell, III"; }
              if (driver.equals("C.E. Falk")) { driver = "C.E. Falk, III"; }
                            if (driver.equals("R.D. Smith")) { driver = "R.D. Smith, III"; }
      if (driver.equals("Bobby Santos III")) { driver = "Bobby Santos, III"; }
      if (driver.equals("Jack Jeffery")) { driver = "Jack Jeffrey"; }
            if (driver.equals("Mark Martin")) { driver = "Mark Martin (AR)"; }
 if (driver.equals("Dave Bushley")) { driver = "David Bushley"; }
      	   driver = driver.replace("Richard Houlihan", "Dick Houlihan");
            	   driver = driver.replace("Anthony Sesley", "Anthony Sesely");
      	   driver = driver.replace("Dave Bath", "David Bath");
                  	   driver = driver.replace("Richard Tibbets", "Richard Tibbetts");
                        driver = driver.replace("Gary Pulcifer", "Gary Pulcifur");

            	   driver = driver.replace("Mark Nesbitt", "Martin Nesbitt");
         driver = driver.replace("Jeff Oakley", "Jeffrey Oakley");                               
	 driver = driver.replace("ë", "e");
  driver = driver.replace("ú", "u");
  driver = driver.replace("Ó", "O");
  driver = driver.replace("í", "i");
        driver = driver.replace(" II", ", II");
      driver = driver.replace(" III", ", III");
      driver = driver.replace(" Sr", ", Sr.");
      driver = driver.replace(",Jr.", ", Jr.");
    driver = driver.replace(" Jr", ", Jr.");
    driver = driver.replace("..", ".");
    driver = driver.replace(",,", ",");
  driver = driver.replace(",,", ",");
  /*
  driver = driver.replace("É", "E");
  */
driver = driver.replace("á", "a");

	 driver = driver.trim();
  //   driver = driver.toLowerCase();
  //   driver = toTitleCase(driver);
        return driver;
    }
	 
public static String MakeStrip(String make) {

make = make.replace(" Intrepid", "");
make = make.replace(" Charger", "");
make = make.replace("Chev.", "Chevy");
make = make.replace("Pont.", "Pontiac");
make = make.replace(" Monte-Carlo", "");
make = make.replace(" Grand-Prix", "");
make = make.replace(" Taurus", "");
make = make.replace(" Fusion", "");
 make = toTitleCase(make);

          return make;
    }

public static String NumStrip(String num) {
        	String delimiter = " \\(";
	String[] tokens= num.split(delimiter);
  num = tokens[0];
        return num;
    }

		  
public static String SponStrip(String spon) {
        	String delimiter = " \\(";
	String[] tokens= spon.split(delimiter);
  spon = tokens[0];
        return spon;
    }

public static String returnName(String driver) {
       if (driver.equals("Brad Robbins")) { driver = "Bradley Robbins"; }
		 if (driver.equals("Oscar Ruiz De Azua")) { driver = "Oscar Ruiz"; }
		 if (driver.equals("Ashton Lewis")) { driver = "Ashton Lewis, Jr."; }
		 if (driver.equals("Franklin Butler III")) { driver = "Franklin Butler"; }
		if (driver.equals("Robert Richardson, Jr.")) { driver = "Robert Richardson"; }

        return driver;
    }

public static boolean  checkIfNumber(String in) {
        
        try {

            Integer.parseInt(in);
        
        } catch (NumberFormatException ex) {
            return false;
        }
        
        return true;
    }
    
    
public static String readKeyboard()
{
   BufferedReader standard = new BufferedReader(new InputStreamReader(System.in));
    try {
      String reading = standard.readLine();
      return reading;
    }
    catch (IOException e){return null;}
} // End of readKeyboard

public static String toTitleCase(String input) {
    StringBuilder titleCase = new StringBuilder();
    boolean nextTitleCase = true;

    for (char c : input.toCharArray()) {
        if (Character.isSpaceChar(c)) {
            nextTitleCase = true;
        } 
        
        else if (nextTitleCase) {
            c = Character.toTitleCase(c);
            nextTitleCase = false;
        }

        titleCase.append(c);
    }

    return titleCase.toString();
}

} 
