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

To execute the program, click the run icon on the top of the jGrasp window (it looks like a person walking)

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

In Java, two forward slashes "//" comments out a line, meaning that line is not execute by the program.  Take a look at this link - https://github.com/timmyquivy/ThirdTurnJava/blob/master/TestTokens.java#L58

Beginning on line 58 is where the program begins to assign various attributes to each result row. However, the first line that actually does anything is line 62 - "start = st.nextToken();". Lines 58-61 are commented out. (Note: The finish attribute is always presumed to be the first value and should never be manipulated). You'll notice the author uses the "crap" variable to indicate that value is meaningless to our codebase and will never be published as part of the code. For instance, the "crap" variable here references the driver earnings field, which is never used in our statistical program (at this time).

Now, say that the race result you are copying over does not have these things in the same order. It's much simpler of course to change the order in which the the program processes elements rather than rewrite the text file every time to match the order in the program. 

You have two ways to do this. The preferred way is to simply comment out fields you aren't going to use; supposing for instance that the race results provided by the series does not include a lap count per competitor. Commenting out is much cleaner than removing entirely. The other way to do it is to cut and paste the lines in the order needed. Say for instance that a laps led count actually comes before status (in the program as provided, it comes after). Simply move the 


==HELPFUL HINTS==

Obviously, sometimes values are not provided in a tabular format online. A common example is where you see a race report simply say "1. Winner's Name (line break) 2. Runner Up's Name". If you are not sure if the format you have is tabular, copy and paste it into the TestRace.txt file and then cut it out from there and paste in Excel (doing this prevents Excel from copying over the HTML style.) If the format appears to be in nice even columns in Excel, it is in tabular format. If everything appears to just run wild from the first column, then it is NOT in tabular format.

What you can do is copy that into a Microsoft Word format. Then you can use find & replace using Word wildcards to add tabs (^t). In the example just given, the author would suggest replacing all instances of "." with "^t". This will add a tab between the finishing position and the driver's name.

Sometimes the cleanest way to do this is just replace all instances of spaces (" ") with ^t. This usually works fine BUT it will mean the driver's name is spread against two tabs. You can uncomment out this line - https://github.com/timmyquivy/ThirdTurnJava/blob/master/TestTokens.java#L66 - for this example.

When you do a wildcard replace, always do a visual scan of the input to double check it looks right and then spend an extra second reviewing the output once saved in a page. Sometimes wildcard replacements cause unexpected things.

Sometimes, when you make changes and run the program, you see this:

Exception in thread "main" java.util.NoSuchElementException
	at java.util.StringTokenizer.nextToken(StringTokenizer.java:349)
	at TestTokens.main(TestTokens.java:95)
	
It means that you are telling the program to assign values to too many things (i.e. you have 6 tabs in your input file and are asking the program to assign 7 values). There is something in the program that needs to be commented out. Just scroll through the program and double check each uncommented line with each tab in the TestRace.txt file.

FinalistPoints.java and Points.txt work very similarly to TestTokens and TestRace. 
