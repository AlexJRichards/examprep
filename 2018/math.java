Random rand = new Random();
nextInt(n) // returns a random integer between 0 and n (exclusive)
nextDouble() // returns random foat between 0 and 1 (excluding)

Math.pow(x, y) // calc x^y
Math.sqrt(x) // square root

factorial code :
public static long factorial( int n )
{
if ( n == 0 || n == 1)
    return 1;
else
{
    long result = 1;
    for (int i = 2; i <= n; i++ )
        result = result * i;
        return result;
}
}

recursion (When method calls itself):
public static long factorial (int n){
    if (n==0) return 1;
    else {
        long result = n * factorial (n-1);
        return result;
        }
}

String = immutable
StringBuffer default = no chars in it, initial capacity 16.
Methods :
length() - returns current num of chars
capacity() returns num of more chars to be stored without inc memory
toString() - converts to string
insert(int offset, String str) - insert string at specified offset;
append(String str): append a string to this StringBuffer.
– reverse(): replace the character sequence contained in this
StringBuffer by the reverse of the sequence.
– delete(int start, int end): removes the characters in a
substring of this StringBuffer, start inclusive, end exclusive,
0-based.
– replace(int start, int end, String str): replaces the
characters in a substring of this StringBuffer.
StringBuffer(int capacity)
StringBuffer(String content) - init str + 16 chars

StringBuilder is similar with same methods
StringBuffer is  thread safe(Synchronised)
StringBuilder is faster
Both are faster than manipulating string

Collections :
Arrays are useful and efficient but have problems -
Fixed size pre defined, no methods

Collections help manage data collections using typical data structures
Provide algorithms to manipulate data
java.util

List : Ordered list of objects
Set : Objects with no repetition and order not important
Map : pairs of objects (Key value pair)

