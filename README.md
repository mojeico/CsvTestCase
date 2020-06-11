# CsvTestCase
Reading csv file and save into SQLITE

Instruction for my project.

To start my project you need to run the following command:
java -jar CsvTestCase.jar

I divided my project into 4 packages.
1) Entity package contain class which are model for database and describe Labels of table.
2) Repo package contain class to connect to the database.
3) Service package contain class to parse csv file.
4) Statistics package contain class to create log.txt file.


 

Customer X just informed us that we need to churn out a code enhancement ASAP for a new project.  Here is what they need:
 
1. We need a Java application that will consume a CSV file, parse the data and insert to a SQLite In-Memory database.  
a. Table X has 10 columns A, B, C, D, E, F, G, H, I, J which correspond with the CSV file column header names.
b. Include all DDL in submitted repository
c. Create your own SQLite DB
 
2. The data sets can be extremely large so be sure the processing is optimized with efficiency in mind.  
 
3. Each record needs to be verified to contain the right number of data elements to match the columns.  
a. Records that do not match the column count must be written to the bad-data-<timestamp>.csv file
b. Elements with commas will be double quoted
 
4. At the end of the process write statistics to a log file
a. # of records received
b. # of records successful
c. # of records failed


