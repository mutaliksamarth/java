package termwork;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Work4 {
public static void main(String args[]){
FileInputStream fin = null;
FileOutputStream fout = null;
try{
fin = new FileInputStream("E:/AOOP/Alphabets.txt");
fout = new FileOutputStream("E:/AOOP/Consonants.txt");
int ch;
while((ch=fin.read())!=-1){
if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u')
throw new VowelNotAllowedException();
else
fout.write(ch);
}
}
catch(Exception e){
System.out.println(e.toString());
}
}
}
class VowelNotAllowedException extends Exception {
VowelNotAllowedException() {
}
public String toString() {
return super.toString() + " : Vowels Not Allowed";
}
}
