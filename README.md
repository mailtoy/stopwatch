# Stopwatch tasks by Kanchanok Kannee (5910545639)  

I ran the tasks on a Mac Pro , and got these results: 

Task | Time 
-------|-------:
 Append 50,000 chars to String | 1.235779 sec 
Append 100,000 chars to String | 3.064913 sec 
Append 100,000 chars to StringBuilder | 0.002083 sec 
Add 1 billion double using array | 1.556349 sec
Add 1 billion Double using array | 7.113212 sec
Add 1 billion BigDecimal using array | 9.991447 sec

> Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars? 
String is created by += . 

_Example_

String a = “old”;
String b = “new”;
a += a+b;

* the memory will have a String “old” ,”new”,and “olden” .
* In this case : appending 100,000 chars to a String take more than 2X the time to append 50,000 chars. Because it will use memory to keep a new result String and still keep the old String, *so every time a String is created, it takes time and use more memories.*


> Why is appending to StringBuilder so much different than appending to String? What is happening to the String? 

* Because StringBuilder  has a attribute char[] value.  StringBuilder able to add String or char  into this StringBuilder will just update the value inside the char[] value. Finally,it has only one String  .

