import java.io.*;
import java.util.*;
//import org.jsoup.select;

import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
//import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
//import org.w3c.dom.Elements;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import java.io.IOException;
public class RMonitor {   



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
      Document doc = Jsoup.connect("http://www.race-monitor.com/Results/Session/7308517").get();
      Element table = doc.select("table").get(1);
      Elements rows = table.select("tr");
      String checkLaps = "foo";
      String led = "";
      int position = 0;
      String pts = "";
      String finfin = "";
      String crap = "";
      String money = "";
      int LapsInRace= 0;
      String status = "";
      String div = "";
      int i = 0;
      int serfinish = 0;
      int L1 = 1;
      int E1 = 1;
     // FileReader fr = new FileReader("TestRace.txt"); // File must be in directory called "TestRace.txt"
       //     BufferedReader br = new BufferedReader(fr);     
   	//	String inLine = br.readLine();
       //  inLine = inLine.trim();
   	//	while (inLine  != null) {
      while (i < rows.size()) { 
         Element row = rows.get(i);
         Elements cols = row.select("td");
         Element temp = cols.get(0);
         crap = temp.text();
         finish = Integer.parseInt(crap);
         String finalresult = "{{Race/Result|"+finish;
         Element temp2 =  cols.get(1);
         Elements temp3 = temp2.select("span");
         temp2 = temp3.get(0);
         crap = temp2.text();
         String word = "";
         if (crap.equals("")) { crap = "foo foo"; }
         
            if (!crap.contains(" ")) { crap = "1 foo foo"; }
                     int j = crap.indexOf(' ');

    
               word = crap.substring(0, j);

                   word = word.replace("#", "");
         String rest = "";
         rest = crap.substring(0, j);
          
      //   led = "0";
       rest = crap.substring(j);

   rest = rest.toLowerCase();
      rest = toTitleCase(rest);
         finalresult = finalresult+"||"+word+"|"+rest;
         finalresult = finalresult.replace("| ", "|");
         finalresult = finalresult+"|||";
         Element temprow = rows.get(i+2);
         Elements tempcols = temprow.select("td");
         Element lapscompleted = tempcols.get(0);
         crap = lapscompleted.text();
         try {
            Integer.parseInt(crap);
         }
         catch (NumberFormatException ex) {
            crap = "0";
         }
        
         if (finish == 1) { LapsInRace = Integer.parseInt(crap); }
         if (Integer.parseInt(crap) < LapsInRace ) { status = ""; } 
         else { status = "running"; }
         finalresult = finalresult+crap+"|"+led+"|"+status+"}}";
         System.out.println(finalresult);  
         i = i+4;
      
      
      }
           
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

public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.isEmpty())
            return false;
        return true;
    }


}