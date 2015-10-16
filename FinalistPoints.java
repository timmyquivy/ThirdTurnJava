import java.io.*;
import java.util.*;


public class FinalistPoints {  

public static String readKeyboard()
{
  BufferedReader standard = new BufferedReader(new InputStreamReader(System.in));
    try {
      String reading = standard.readLine();
      return reading;
    }
    catch (IOException e){return null;}
} // End of readKeyboard
 
public static void main(String[] args) throws Exception
  { boolean flag = true; 
    String finish = "";
	 int num = 0;
    String fname = "";
	 String lname = "";
	 String crap = "";
	 String points = "";
	 String starts = "";
	 String p = "";
	 String yup = "";
	 String track = "";
	 String tracktest = "";
	 String w = "";
	 String t5 = "";
	 boolean yorn = true;
	 String t10 = "";
	 String money = "";
	   FileReader fr = new FileReader("points.txt");
            BufferedReader br = new BufferedReader(fr);        
			String inLine = br.readLine();
			inLine = inLine.trim();
	while (inLine  != null) {
       StringTokenizer st = new StringTokenizer(inLine,"\t");

finish = st.nextToken();
 //  crap = st.nextToken();        
fname = st.nextToken();
//fname = fname+" "+st.nextToken();
if (finish.equals("-1")) { finish = ""; points = ""; }
//fname = fname+" "+st.nextToken();
points = st.nextToken();
//points = points+"|D-IV";
//points = points+"|"+st.nextToken();
 if (points.equals("-1")) { points = ""; finish = ""; }
starts = st.nextToken();
//starts = "1+";
//starts = starts+"+";
w = st.nextToken();
t5 = st.nextToken();
t10 = st.nextToken();
//t10 = t5;
//p = "0";
//p =st.nextToken();

//fname = fname.toLowerCase();
// fname = toTitleCase(fname);
//p = p+"|"+st.nextToken();
fname = fname.trim();
finish = finish.trim();
points = points.trim();
fname = DriverStrip(fname);

// System.out.println("{{LocalTrack-Points|"+fname+"|"+finish+"|"+points+"}}");
 System.out.println("{{Points|"+fname+"|"+finish+"|"+points+"|"+starts+"|"+w+"|"+t5+"|"+t10+"|"+p+"|}}");
		inLine =	br.readLine();
	} // end while
 } // end function
 
 public static String SponStrip(String spon) {
        	String delimiter = ",";
	String[] tokens= spon.split(delimiter);
  spon = tokens[0];
        return spon;
    }
	 public static String DriverStrip(String driver) {
        	String delimiter = " \\(Rookie";
	String[] tokens= driver.split(delimiter);
  driver = tokens[0];
 delimiter = "/";
 tokens= driver.split(delimiter);
  driver = tokens[0];
  driver = driver.replace("ó", "o");
    driver = driver.replace("é", "e");
  driver = driver.replace("ú", "u");
  driver = driver.replace("Ó", "O");
  driver = driver.replace("í", "i");
driver = driver.replace("á", "a");
   driver = driver.trim();
   //driver = driver.toLowerCase();
   //driver = toTitleCase(driver);
   return driver;
 
    }
    
    
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

} // end class
