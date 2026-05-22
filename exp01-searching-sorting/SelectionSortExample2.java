importjava.util.Scanner;
publicclass SelectionSortExample2
{
publicstaticvoidmain(Stringargs[])
{
intsize,i,j,temp;
intarr[]=new int[50];
Scannerscan=newScanner(System.in); 
System.out.print("Enter Array Size : "); 
size = scan.nextInt();
System.out.print("EnterArrayElements:"); 
for(i=0; i<size; i++)
{
arr[i]= scan.nextInt();
}
System.out.print("SortingArrayusingSelectionSortTechnique..\n"); 
for(i=0; i<size; i++)
{
for(j=i+1;j<size; j++)
{
if(arr[i]>arr[j])
{
temp=arr[i]; arr[i]=arr[j]; 
arr[j]=temp;
}
}
}
System.out.print("NowtheArrayafterSortingis:\n"); 
for(i=0; i<size; i++)
{
System.out.print(arr[i]+"");
}
}
}
