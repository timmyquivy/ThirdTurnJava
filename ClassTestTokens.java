import java.io.*;
import java.util.*;
public class ClassTestTokens {   

    public static void main(String [] args) throws Exception {  // Main string
    
    /* DECLARE BASE PARAMETERS */
	 int finish = 0;
    String start = "";
	 String num = "";
    boolean foofoo = false;
    boolean foo = false;
    String driver = "";
	 String spon = "";
    String make = "";
	 String spontest = "";
    int classfinish = 0;
   int classstart = 0;
   int class1fin = 0;
   int class1start = 0;
   int class2fin = 0;
   int class2start = 0;
   int class3fin = 0;
   int class3start = 0;
   int class4fin = 0;
   int class4start = 0;
      int class5fin = 0;
   int class5start = 0;
      int class6fin = 0;
   int class6start = 0;

    String laps = "";
    boolean noqualify = false;
    String DNQ = "";
    String raceclass = "";
	 String checkLaps = "foo";
	 String led = "";
    String class1 = "";
    String class2 = "";
    String class3 = "";
    String class4 = "";
        String class5 = "";
    String class6 = "";

    int position = 0;
	 String pts = "";
	 String fin = "";
	 String crap = "";
	 String money = "";
	 String status = "";
	 	int serfinish = 0;
				int L1 = 1;
     //  DNQ = "Mike Spencer;Tony Jones;Levi Jones;Shane Hmiel;Chad Boat;Henry Clarke;Greg Bragg;Jerry Coons Jr.;Damion Gardner;Tracy Hines;Dave Darland;Chris Windom;Bryan Clauson;David Cardey;Jimmy Crawford;R.J. Johnson;Rickie Gaunt;Cory Kruseman;Matt Mitchell;Robert Ballou;Bud Kaeding;Casey Shuman;Seth Wilson;Ricky Williams;Brad Sweet;Austin Williams;Keith Bloom, Jr.;Kyle Cummins;Ronnie Gardner;Blake Miller;Cody Kershaw;Danny Sheridan;Matt Shedarowich;Austin Mero;Cody Williams;Jerry Welton;Kenny Perkins;";
       String div = "";					
              int L2 = 1;
					int S1 = 1;
					int S2 = 1;
					int E1 = 1;
	   FileReader fr = new FileReader("TestRace.txt"); // File must be in directory called "TestRace.txt"
            BufferedReader br = new BufferedReader(fr);     
			String inLine = br.readLine();
         inLine = inLine.trim();
			while (inLine  != null) {
         inLine = InputWork(inLine);
        // inLine = inLine.replace("/","\t");
					foo = false;
			      StringTokenizer st = new StringTokenizer(inLine,"\t");
					crap = st.nextToken();
              crap = crap.replace(".", "");
              crap = crap.replace("  ", "\t");
            crap = crap.trim();
            crap = crap.replace(" (DNF)", "");
                crap = crap.replace("(", "");
				   crap = crap.replace(")", "");
			if (checkIfNumber(crap))
					{ foo = true;
					
					if (finish != 0) { 
               if (noqualify) {
         String finalresult = "{{ClassRace/Result|"+fin+"|"+start+"|"+raceclass+"|"+classfinish+"|";
     //     if (classstart >=1) { finalresult = finalresult+classstart; } 
          finalresult = finalresult+"|"+num+"|"+driver+"|"+spon+"|"+make+"|"+laps+"|"+led+"|"+status+"|"+pts+"|"+div+"}}"; // print last resultant
          finalresult = finalresult.replace(" |", "|");
          System.out.println(finalresult);    
          }
    
    
          }
               
               					  finish = Integer.parseInt(crap); }
					else { driver = driver+";"+crap; }
					
				if (foo) {
				status = ""; pts = ""; noqualify = true;
/* GRAB DATA FROM INPUT */
// crap = st.nextToken(); 
   // crap = st.nextToken();
///spon = "";
//   start = st.nextToken();
   //     raceclass = "Pro";
//clas//sfinish = finish;
              num = st.nextToken();
                   raceclass = st.nextToken();
  //  classfinish = Integer.parseInt(st.nextToken());
  // start = st.nextToken();
      //div = "2021 Trans Am Championship TA2 Class";
       // else { div = "2019 ARCA CRA Super Series Powered by JEGS"; }

         // 
//spon = st.nextToken();
//raceclass = "Pro";
   // num = st.nextToken();

      //  spon = st.nextToken(); 
   // raceclass = st.nextToken();
//   classfinish = Integer.parseInt(st.nextToken());



   /*
if (raceclass.equals("Am")) { div = "2019 Pirelli GT4 America SprintX Class"; } 
if (raceclass.equals("Pro-Am")) { div = "2019 Pirelli GT4 America SprintX Class"; } 
if (raceclass.equals("EPro-Am")) { div = "2019 GT4 America East"; } 
if (raceclass.equals("EAm")) { div = "2019 GT4 America East"; } 
if (raceclass.equals("WPro-Am")) { div = "2019 GT4 America West"; } 
if (raceclass.equals("WAm")) { div = "2019 GT4 America West"; } 
*/
  // spon = st.nextToken();

        driver = st.nextToken();
   driver = driver+" "+st.nextToken();
 //     driver = driver+" "+st.nextToken();
 //  driver = driver+" "+st.nextToken();

   //  crap = st.nextToken();
//num = st.nextToken();
//    spon = st.nextToken();
   spon = st.nextToken();
//

 // crap = st.nextToken(); 
 //  crap = st.nextToken();
  make = st.nextToken();

 //         driver = st.nextToken();
 //   crap = st.nextToken();
  // driver = driver+ "; "+st.nextToken();

  // make = make+" "+st.nextToken();
 // crap = st.nextToken();
  //spon = st.nextToken();
     // raceclass = st.nextToken();

         if (raceclass.equals ("PEAK")) { div="2021 NASCAR PEAK Mexico Series presented by Telcel"; }
            if (raceclass.equals ("Challenge")) { div="2021 NASCAR Mexico Challenge Series"; }
            if (raceclass.equals ("CUPPA")) { div="2021 GT Cup Open Europe"; }
            if (raceclass.equals ("CUPAM")) { div="2021 GT Cup Open Europe"; }
 
     //  else { div = "2021 NSW Production Car Series"; raceclass="NSWP"; } 
     //  if (raceclass.equals ("B")) { raceclass="1200"; }
// laps = st.nextToken();

        //      if (raceclass.equals ("SCA")) { div="2021 Stock Cars Australia National Series"; }
      // if (raceclass.equals ("V16")) { raceclass = "Vee 1600"; div="2021 Formula Vee South Australia State Championship"; }

      //          if (raceclass.equals ("A")) { raceclass = "Am"; }
   //  num = st.nextToken();
       //         num = st.nextToken();
 // classfinish = Integer.parseInt(st.nextToken());
 // crap = st.nextToken();

   laps = st.nextToken();

 //// driver = driver+" "+st.nextToken();
 // crap = st.nextToken();
 //crap = st.nextToken();


 //spon = st.nextToken();
  //   crap = st.nextToken();
 //   spon = st.nextToken();
  //  driver = "|"+driver;
// driver = st.nextToken()+" "+driver
   //    crap = st.nextToken();
  
        //   raceclass = st.nextToken();
       //                  laps = st.nextToken();

            if (raceclass.equals("ARCA/CRA")) { div = "2021 ARCA CRA Super Series powered by JEGS"; }
                      if (raceclass.equals("CRA/JEGS")) { div = "2021 CRA JEGS All-Stars Tour presented by Chevrolet Performance"; }
    /*
  if (raceclass.equals("WA Street Car")) { div = "2021 WA Street Car State Series"; }
         if (raceclass.equals("WA IPRA")) { div = "2021 Improved Production Racing Association Western Australia Championship"; }
  */       
 //  num = st.nextToken();
   //start = st.nextToken();
 //////make = make.replace(", ", "/");
//laps = st.nextToken();
 //laps = laps.replace(" Laps", "");
    //         raceclass = st.nextToken();
  
  //  crap = st.nextToken();
  /*
while (!foofoo) {
    try {
      crap = st.nextToken();
        } catch (NoSuchElementException ex) {
         foofoo = false;   
        }    
if (foofoo) {
 if (checkIfNumber(crap)) 
   { laps = crap; }
   
char[] chars = crap.toCharArray();
for(char c : chars){
   if(Character.isDigit(c)){
   laps = crap;
      }
   } // end for
   try {
     laps = st.nextToken();
  }
    catch (NoSuchElementException ex) {
         foofoo = false;
         }
}
}
*/
   // spon = st.nextToken();
//   laps = st.nextToken();
 ///////make = make+"/"+st.nextToken();
    //  make = st.nextToken();
   // crap = st.nextToken();
     //  raceclass = st.nextToken();
       // laps = st.nextToken();

//crap = st.nextToken();
   // status = st.nextToken();
  // pts = st.nextToken();
// /  crap = st.nextToken();
  // led = st.nextToken();
//
 //   crap = st.nextToken();
//int DriverString = driver.indexOf("(");
// driver = driver.substring(0,(DriverString-1));
  //led = st.nextToken();
// pts = st.nextToken();
 // crap = st.nextToken();
  // laps = st.nextToken();
//// spon = st.nextToken();
// crap = st.nextToken();
 //status = st.nextToken();
  //  led = st.nextToken();
 //  pts = st.nextToken();
  //  start = st.nextToken();
 //   led = "0";
   //   laps ="10";
//inLine = br.readLine();

//status = status.trim();
if (status.equals("did not qualify")) { 
driver = driver.trim();
DNQ = DNQ+driver+"; ";
noqualify = false;
 }


/* MANIPULATE DATA */


	start = start.trim();
	  spon = SponStrip(spon);
	driver = driver.trim();
	spon = spon.trim();
	make = make.trim();
   num = num.replace ("#", "");
	num = num.trim();
   num = NumStrip(num);
	led = led.trim();
	laps = laps.trim();
	status = status.trim();
   raceclass = raceclass.trim();
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
   
   /* Handle Class Data */
   
   raceclass = raceclass+"xxxx";
   if (class1.equals("")) { class1 = raceclass; }
   else if (!(class1.equals(raceclass)) && class2.equals("")) { class2 = raceclass; }
   else if (!(class1.equals(raceclass)) && !(class2.equals(raceclass)) && class3.equals("")) { class3 = raceclass; }
   else if (!(class1.equals(raceclass)) && !(class2.equals(raceclass)) && !(class3.equals(raceclass)) && class4.equals("")) { class4 = raceclass; }
   else if (!(class1.equals(raceclass)) && !(class2.equals(raceclass)) && !(class3.equals(raceclass)) && !(class4.equals(raceclass)) && class5.equals("")) { class5 = raceclass; }
   else if (!(class1.equals(raceclass)) && !(class2.equals(raceclass)) && !(class3.equals(raceclass)) && !(class4.equals(raceclass)) && !(class5.equals(raceclass)) && class6.equals("")) { class6 = raceclass; }


   
   if (raceclass.equals(class1)) { 
        classfinish = class1fin+1; 
        class1fin++; 
        
       if (!(start.equals(""))) { 
         classstart = class1start+1;
         class1start=class1start+1; 
         } 
         
        }
  else if (raceclass.equals(class2)) { 
       classfinish = class2fin+1; 
       class2fin++; 
       
          if (!(start.equals(""))) { 
         classstart = class2start+1;
         class2start=class2start+1; 
         } 
       }
   else if (raceclass.equals(class3)) { 
       classfinish = class3fin+1; 
       class3fin++;
       
           if (!(start.equals(""))) { 
         classstart = class3start+1;
         class3start=class3start+1; 
         } 
       }
   else if (raceclass.equals(class4)) { 
       classfinish = class4fin+1; 
       class4fin++;
            if (!(start.equals(""))) { 
         classstart = class4start+1;
         class4start=class4start+1; 
           }
       }
      else if (raceclass.equals(class5)) { 
       classfinish = class5fin+1; 
       class5fin++;
            if (!(start.equals(""))) { 
         classstart = class5start+1;
         class5start=class5start+1; 
           }
       }
   else if (raceclass.equals(class6)) { 
       classfinish = class6fin+1; 
       class6fin++;
            if (!(start.equals(""))) { 
         classstart = class6start+1;
         class6start=class6start+1; 
           }
       }
    
       
 
       raceclass = raceclass.replace("xxxx","");
 
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
			 String finalresult = "{{ClassRace/Result|"+fin+"|"+start+"|"+raceclass+"|"+classfinish+"|";
      //    if (classstart >=1) { finalresult = finalresult+classstart; } 
          finalresult = finalresult+"|"+num+"|"+driver+"|"+spon+"|"+make+"|"+laps+"|"+led+"|"+status+"|"+pts+"|"+div+"}}"; // print last resultant
          finalresult = finalresult.replace(" |", "|");
          finalresult = finalresult+" "+class1+" "+class2+" "+class3+" "+class4;
          System.out.println(finalresult);
          }
         
          DNQ = DNQ.replace(" Jr", ", Jr.");
            DNQ = DNQ.replace(",," , ",");
            DNQ = DNQ.replace("..", "."); 
       
          System.out.println("{{RacePage/Middle\n|DNQ=" + DNQ);
       
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

 driver = driver.replace(" (NSW)", "");
  driver = driver.replace(" (NZL)", "");
  driver = driver.replace(" (TAS)", "");
 driver = driver.replace(" (Qld)", "");
 driver = driver.replace("John Ownbey", "John Owenby");
  driver = driver.replace(" ®", "");
  driver = driver.replace(" (R)", "");
  driver = driver.replace(" – R", "");
    driver = driver.replace(" (N)", "");
    driver = driver.replace(" (J)", "");
    driver = driver.replace(" (L)", "");
    driver = driver.replace("  (R)", "");
        driver = driver.replace("(G)", "");
    driver = driver.replace("(F)", "");
       driver = driver.replace("JR ", "J.R. ");
       driver = driver.replace("RC ", "R.C. ");
      // driver = driver.replace("; J", "");
       driver = driver.replace("RD ", "R.D. ");
        driver = driver.replace(" (C)", "");
            driver = driver.replace(" (J)", "");
	   driver = driver.replace("  (R)", "");
driver = driver.replace(" ©", "");
  driver = driver.replace("ó", "o");
    driver = driver.replace("10 ", "");

      driver = driver.replace("11 ", "");
  driver = driver.replace("12 ", "");
  driver = driver.replace("13 ", "");
  driver = driver.replace("14 ", "");
  driver = driver.replace("15 ", "");
  driver = driver.replace("16 ", "");
  driver = driver.replace("17 ", "");
  driver = driver.replace("18 ", "");
  driver = driver.replace("19 ", "");
  driver = driver.replace("20 ", "");
  driver = driver.replace("21 ", "");
  driver = driver.replace("22 ", "");
  driver = driver.replace("23 ", "");
  driver = driver.replace("24 ", "");
  driver = driver.replace("25 ", "");
  driver = driver.replace("26 ", "");
  driver = driver.replace("27 ", "");
  driver = driver.replace("28 ", "");
  driver = driver.replace("29 ", "");
  driver = driver.replace("30 ", "");
  driver = driver.replace("31 ", "");
    driver = driver.replace("1 ", "");
    driver = driver.replace("2 ", "");
  driver = driver.replace("3 ", "");
  driver = driver.replace("4 ", "");
  driver = driver.replace("5 ", "");
  driver = driver.replace("6 ", "");
  driver = driver.replace("7 ", "");
  driver = driver.replace("8 ", "");
  driver = driver.replace("9 ", "");


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
      	   driver = driver.replace("Jimmy Burns", "Jim Burns");
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
 driver = driver.toLowerCase();
    driver = toTitleCase(driver);
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
