 class ReadFromFile {
public static void main(String arg[]){
try{
File f=new File("D:/JavaProgram/Hi.txt");
Scanner s=new Scanner(f);
while(s.hasNextLine()){
String fileData=s.nextLine();
System.out.println(fileData);}
s.close();
}catch(FileNotFoundException fnf) {
fnf.printStackTrace();}
}
}