Author: Timothy Quievryn (timmyquivy@gmail.com)
Program: TestTokens.java
Purpose: A tool to convert result information from online sources into wikicode for TheThirdTurn.com

==DOWNNLOAD INSTRUCTIONS==

1. Download jGrasp - http://spider.eng.auburn.edu/user-cgi/grasp/grasp.pl?;dl=download_jgrasp.html
2. During installation, make sure jGrasp maintains its default settings and will the program that opens .JAVA files.
3. Make sure you also have the Java SDK installed - http://www.oracle.com/technetwork/java/javase/downloads/index.html
4. Download the current ZIP file from here: https://github.com/timmyquivy/ThirdTurnJava
5. Extricate the ZIP file to a folder. It is important to keep all the files in the same folder.

==FILE INFORMATION==

Thsis folder contains four files - FinalistPoints.java, Points.txt, TestRace.txt, TestTokens.java

Let's look at TestTokens.java, which is the real heart of The Third Turn. This is a basic JAVA StringTokenizer. 
What it does is look at the input file - TestRace.txt - and split it into certain key elements.
For instance, look at TestRace.txt which came in the zip file. The line currently is:

1	3	22	   Joey Logano	Shell / Pennzoil   (Roger Penske)	Ford	334	347,373	running	227	48

Logically speaking, you know the first string is the finish, the second finish is the starting position, third position is the number, followed by driver, sponsor, make, laps, money, status, led, and points.
The question is how a program should know this. TestTokens.java does this by separating each value into tabs.
For instance, in the TestRace.txt file, since "1" and "3" at the start of the line are separated by tabs, TestTokens.java knows that the "1" value is its own spearate value.

TestTokens.java then runs down a loop for each line (so the second place finisher in the race should have a line break after the first place finisher)
Based on what the program tells it is in the file, it then assigns each value into its appropriate slot (more on thiat in a moment).
After each line is finished, the jGrasp spits out the code in the run I/O tab (which should be open by default).
When done, it will say "Operation complete".

Simply copy the code directly from the run I/O bit directly into The Third Turn's edit window and save the page. 
Viola. You have added the results to a race on our site in approx. 20 seconds.

==TINKERING WITH THE PROGRAM==

That said, race results found on the internet can be found in various sources. 
Each series website has an infurinately inconsistent way of presenting race results.
TestTokens.java is designed to be robust enough and the author has added a lot of conditions that make this process as easy as possible for the end user.
That said, there are a few things you will need to know in order to have the program run smoothly.

In Java, two forward slashes "//" indiciate a comment 
==HELPFUL HINTS==
