# Streams-Files-And-Directories
Java Advance - SoftUni Lab + Exercises


Lab: Streams, Files and Directories
This document defines the lab for "Java Advanced" course @ Software University. Please submit your solutions (source code) of all below described problems in Judge.
For this lab exercises you are given a zipped folder with resources, that you will need to use. For each exercise submit the output of the program, not the code.
1.	Read File
You are given a file named "input.txt". Read and print all of its contents as a sequence of bytes (the binary representation of the ASCII code for each character) separated by a single comma. 
Submit in Judge only the output of the program.
Examples
Input	Output
On January 1 , 1533 , Michael Angelo, then fifty-seven years old, writes…	11101111 10111011 10111111 1001111 1101110 100000 1001010 1100001 1101110 1110101…
Two households, both alike in dignity,
In fair Verona, where we lay our scene…	1010100 1110111 1101111 100000 1101000 1101111 1110101 1110011 1100101 1101000…
Hints
•	Create a string variable holding the path to the file. If, for example, the file is located in "D:\"
 
•	Use try-with-resources to open the file and to be sure that it will be closed after you are done with it
 
•	Use the read() method to read each byte of the file until it returns -1
 
•	Select the output of the program and copy it [Ctrl + C]
 
•	Paste the output in Judge
 
2.	Write to File
Read the file named "input.txt" that is provided for this exercise and write all its content to a file while skipping any punctuation. Skip the following symbols: ',', '.', '!', '?'.
Submit in Judge only the output of the program.
Examples
Input	Output
On January 1 , 1533 , Michael Angelo, then fifty-seven years old, writes	On January 1  1533  Michael Angelo then fifty-seven years old writes
Two households, both alike in dignity.
In fair Verona, where we lay our scene.	Two households both alike in dignity
In fair Verona where we lay our scene
Hints
•	Create a FileInputStream to read the file
•	Create a FileOutputStream to write to a file
•	Create a list, containing all characters that you need to skip and check if the current char is contained in it
 
3.	Copy Bytes
Read the file named "input.txt" and write to another file every character's ASCII representation.
Write every space or new line as it is, e.g. as a space or a new line.
Examples
Input	Output
On January 1 , 1533 , Michael Angelo, then fifty-seven years old, writes
…	79110 749711011797114121 49 44 49535151 44 771059910497101108 6511010310110811144 116104101110 10210510211612145115101118101110 12110197114115 11110810044 119114105116101115
Hints
•	Get the value of every byte as string and then write its every digit one by one
 
4.	Extract Integers
Read the file provided, named "input.txt" and extracts all integers that are not a part of a word in a separate file. A valid integer is surrounded with white spaces.
Submit in Judge only the output of the program.
Examples
Input	Output
On January 1 , 1533 , Michael Angelo, then fifty-seven years old, writes
…	1
1533
…
Hints
•	Wrap a FileInputStream in a Scanner and use the methods, hasNext(), hasNextInt() and nextInt()
 
5.	Write Every Third Line
Read the file provided, named "input.txt" and write to another file all lines which number is divisible by 3. Line numbers start from one.
Submit in Judge only the output of the program.
Examples
Input	Output
On January 1 , 1533 , 
Michael Angelo, 
then fifty-seven years old, 
writes
from Florence to 
Tommaso de' Cavalieri, 
a youth of noble Roman family,	then fifty-seven years old, 
Tommaso de' Cavalieri, 

Hints
•	To get the functionality to read and write lines use BufferedReader and PrintWriter
•	Wrap streams appropriately
 
6.	Sort Lines
Read the file provided, named "input.txt" and sort all lines. Write text to another text file. Use Path and Files Classes.
Submit in Judge only the output of the program.
Examples
Input	Output
C
A
B
D	A
B
C
D
Hints
•	To read all lines together use Files.readAllLines()
 
•	To sort the list of strings use Collections.sort()
 
7.	List Files
You are provided a folder named "Files-and-Streams". Create a program that lists the names and file sizes (in bytes) of all files that are placed directly in it (do not include files in nested folders).
Submit in Judge only the output of the program.
Examples
Input	Output
 	input.txt: [size in bytes]
output.txt: [size in bytes]

Hints
•	Use the File class and its method listFiles()
8.	Nested Folders
You are provided a folder named "Files-and-Streams". Create a program that lists the names of all directories in it (including all nested directories).
On the last line, print the count of all folders, including the root folder.
Submit in Judge only the output of the program.
Examples
Input	Output
 	…
Streams-and-Files
Files-and-Streams
Streams-and-Files
Serialization
Streams-and-Files
[folder count] folders
Hints
•	Use the File class and its method listFiles()
9.	Serialize Custom Object
Create a class called "Cube". It should have properties for color, width, height and depth.
Create an instance of the class with the following values:
•	Color: "green"
•	Width: 15.3
•	Height: 12.4
•	Depth: 3.0
Serialize and deserilalize the instance created. When saved to a file the object should look like something like the example below.
Examples
Input	Output
(no input)	 
Hints
•	Create a class called Cube, which should implement the Serializable interface:
 
•	Create a new instance of the Cube class and set its properties:
 
•	Use ObjectOutputStream to serialize the object:
 



Exercises: Streams, Files and Directories
This document defines the exercises for "Java Advanced" course @ Software University. Please submit your solutions (source code) of all below described problems in Judge.
For these exercises you are given a zipped folder with resources, that you will need to use. For each exercise submit the output of the program, not the code.
1.	Sum Lines
Write a program that reads a text file (input.txt from the Resources - Exercises) and prints on the console the sum of the ASCII symbols of each of its lines. Use BufferedReader in combination with FileReader.
Examples
Input	Output
On January 1 , 1533 , 
Michael Angelo, 
then fifty-seven years old, 
writes
from Florence to 
Tommaso de' Cavalieri, 
a youth of noble Roman family,	1452
1397
2606
670
1573
2028
2762
Hints
•	Use try-with-resources to handle file
 
•	Create a BufferedReader to read each line of the file
 
•	Get the ASCII code of each character in the line and add it to the sum for the current line and print the sum on the console
 
2.	Sum Bytes
Write a program that reads a text file (input.txt from the Resources - Exercises)  and prints on the console the sum of the ASCII symbols of all characters inside of the file. Use BufferedReader in combination with FileReader.
Input	Output
On January 1 , 1533 , 
Michael Angelo, 
then fifty-seven years old, 
writes
from Florence to 
Tommaso de' Cavalieri, 
a youth of noble Roman family,	12488
Hints
•	You can modify your solution to the previous problem
•	Use a type that will not overflow like long or BigInteger
3.	ALL CAPITALS!
Write a program that reads a text file (input.txt from the Resources - Exercises)  and changes the casing of all letters to upper. Write the output to another file (output.txt).
Examples
Input	Output
On January 1 , 1533 , 
Michael Angelo, 
then fifty-seven years old, 
writes
from Florence to 
Tommaso de' Cavalieri, 
a youth of noble Roman family,	ON JANUARY 1 , 1533 , 
MICHAEL ANGELO, 
THEN FIFTY-SEVEN YEARS OLD, 
WRITES
FROM FLORENCE TO 
TOMMASO DE' CAVALIERI, 
A YOUTH OF NOBLE ROMAN FAMILY,
Hints
•	Use BufferedReader and PrintWriter.
4.	Count Character Types
Write a program that reads a list of words from the file (input.txt from the Resources - Exercises)  and finds the count of vowels, consonants and punctuation marks. Assume that:
•	a, e, i, o, u are vowels, only lower case
•	All others are consonants
•	Punctuation marks are (!,.?)
•	Do not count whitespace.
Write the results to another file – output.txt. 
Examples
Input	Output
On January 1 , 1533 , Michael Angelo, then fifty-seven years old, writes
from Florence to Tommaso de' Cavalieri, a youth of noble Roman family,	Vowels: 41
Consonants: 72
Punctuation: 6
Hints
•	Use BufferedReader and PrintWriter.
5.	Line Numbers
Write a program that reads a text file (inputLineNumbers.txt from the Resources - Exercises) and inserts line numbers in front of each of its lines. The result should be written to another text file – output.txt. 
Examples
Input	Output
Two households, both alike in dignity,
In fair Verona, where we lay our scene,
From ancient grudge break to new,
Where civil blood makes civil hands.
From forth the fatal loins of these two
A pair of star-cross'd lovers take their life;
Whose misadventured piteous overthrows
Do with their death bury their parents' strife.	1. Two households, both alike in dignity,
2. In fair Verona, where we lay our scene,
3. From ancient grudge break to new,
4. Where civil blood makes civil hands.
5. From forth the fatal loins of these two 
6. A pair of star-cross'd lovers take their life;
7. Whose misadventured piteous overthrows
8. Do with their death bury their parents' strife.
6.	Word Count
Write a program that reads a list of words from the file words.txt (from the Resources - Exercises) and finds how many times each of the words is contained in another file text.txt (from the Resources – Exercises). Matching should be case-insensitive.
Write the results in file results.txt. Sort the words by frequency in descending order.
 
Input	Output
of which The	of - 6
which - 2
The - 1
7.	Merge Two Files
Write a program that reads the contents of two text files (inputOne.txt, inputTwo.txt from Resources Exercises) and merges them together into a third one.
File 1	File 2	Output
1
2
3
	4
5
6	1
2
3
4
5
6
8.	Get Folder Size
Write a program that traverses a folder and calculates its size in bytes. Use Folder Exercises Resources in Resources.
Input	Output
 	Folder size: 2878
9.	Copy a Picture
Write a program that makes a copy of a .jpg file using FileInputStream, FileOutputStream, and byte[] buffer. Set the name of the new file as picture-copy.jpg.
10.	Serialize Array List
Write a program that saves and loads an ArrayList of doubles to a file using ObjectInputStream and ObjectOutputStream. Set the name of the file as list.ser.
11.	*Serialize Custom Object
Write a program that saves and loads the information about a custom object using ObjectInputStream and ObjectOutputStream. 
Create a simple class called "Course" that has a String field containing its name and an integer field containing the number of students attending the course. Set the name of the save file as course.ser.
12.	*Create Zip Archive
Write a program that reads three .txt files and creates a zip archive named files.zip. Use FileOutputStream, ZipOutputStream, and FileInputStream.
