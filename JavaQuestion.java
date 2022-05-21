
Java question:
1.Explain about the main method in java?
	*   Main method is starting point of JVM to start the execution of the program.
	*   Without the main method JVM cannot execute the program.
		Syntax:
			public static void main(String args[])
			
			public is the Access specifier,Static is the Keyword,Void is the return type,
			main is the method name,String args[] is the arrays of string type.
			
2.What are the different  Control flow Statements available in java?
	There are three different types of the control flow statement in java
		* Decision making statement
		* Loop statement
		* Jump statement.
					
3.What is the Difference betweeen break and continue statements?
	
        Break statement                 Continue statement
1.The break statement is used to     The continue statement is used to skip the 
  terminate the loop immediately.    current iteration of the loop.
2.The break keyword is used to       continue keyword is used to indicate the
  to indicate the break statement.   continue statement.
3. We can use a break with the       We can not use a continue with the 
   switch statement.                  switch statement.
4. It stop the execution of the      it does not stop the execution of 
   loop.		             the loop.
	
4.What is an Array? How will you declare an array in java?
  * Array is container object the hold the fixed number of the values of the single type.
  * The length of an array is established when the array is created.
  * After the creation is length is fixed.
  * Each item in the array is called element and each element is accessed with numerical index.
    Declaration of Array
      Literal  -int[] arr={1,2};
      New keyword -int[] arr= new int[3]

5.When will you get ArrayIndexOutOfBoundsException?
  * We get ArrayIndexOutofBoundsException when we try to put the greater,negative or equal to the length of the Index.
  * It is the run time exception.
  * java compiler does not check the error in the compilation time.
				
6.Define the Syntax to create an object for a class.What are the naming conventions to be followed while creating a class, method and a variable.Explain with examoles
  *  A object is a member of a class.it is also called instance of the class.
  * Each object has an identity,behavior and a state.
    Syntax:
    classname object=new classname();
    The naming convention:
       Java naming convention specifies that instances and othre variables must start with 
   lowercase and if there are multiple words in names,then you need to use Uppercase for starting letter for the word except the starting word.
      These is called lowerCame|Case.
    
7.What is Variable?How will you declare a variables in java?
  * Variables is the container that store the values during the program execution.
  * Every variable is assigned to the particular datatypes.
  * It is the memory location of name of the data.
Declaration:
   datatype variable_name=value;    		

8.What is String in java? Is it a Data Type?
 * String is a sequence of th character values.
 * String is a non primitive datatype.it is a class. 
 * An array of character works same as string.
Declaration:
 char [] var={'j','a','v','a'};
 String str=new String();	
 Srting is a datatype:
   A string is a generally a datatype and it is often implemented as an array data structure of bytes that store the sequence of the elements
typical character using some character encoding.
		
9.What are the different ways to create the String Object in java?
   There are two different way to create the String Object.
 1.By String Literal
   It is created by using double quotes.
   String str="hai";
 2.By New keyword
  it is created by using a new keyword.
  String str=new String("hai");
					
10.What is the Difference between .Equals and ==? 

 Equals:
   * Equal is a method of the object class.
   * it should be used for content comparison.
 ==
   * Should be used during reference comparison.
   * Check if both references point to same location or not.
   * Operator cannot be overriden.


