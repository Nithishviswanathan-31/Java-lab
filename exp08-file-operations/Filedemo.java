importjava.io.*;importjava.util.*;
classfiledemo
{
publicstaticvoidmain(Stringargs[])
{
Stringfilename; 
Scanners=newScanner(System.in);
System.out.println("Enterthefilename");
filename=s.nextLine(); Filef1=newFile(filename);
System.out.println("*****************");
System.out.println("FILEINF ORMATION");
System.out.println("*****************");
System.out.println("NAMEOFTHEFILE "+f1.getName());
System.out.println("PATH OF THE FILE "+f1.getPath());
System.out.println("PARENT"+f1.getParent());
if(f1.exists()) System.out.println("THEFILEEXISTS");
else
System.out.println("THEFILEDOESNOTExISTS ");
if(f1.canRead()) 
System.out.println("THEFILECANBEREAD");
else System.out.println("THEFILECANNOTBEREAD");
if(f1.canWrite()) System.out.println("WRITEOPERATIONISPERMITTED");
else System.out.println("WRITEOPERATIONISNOTPERMITTED");
 
if
(f1.isDirectory()) 
System.out.println("ITISADIRECTORY");
else 
System.out.println("NOTADIRECTORY");
if
(f1.isFile()) 
System.out.println("ITISAFILE");
else
System.out.println("NOT A FILE");
System.out.println("Filelastmodified"+f1.lastModified()); 
System.out.println("LENGTHOFTHEFILE"+f1.length());
System.out.println("FILEDELETED"+f1.d elete());
}
}
