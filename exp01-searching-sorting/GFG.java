classGFG{
//Functionforlinear search
publicstaticintsearch(intarr[],int x)
{
intn= arr.length;s

//Traversearrayarr[]
for(inti=0;i<n; i++){

//Ifelementfoundthen
//returnthatindex if (arr[i] == x)
returni;
}
return-1;
}
//DriverCode
publicstaticvoidmain(Stringargs[])
{
//Givenarr[]
intarr[]={2, 3, 4,10, 40};
//Elementtosearch int x = 10;
//FunctionCall
intresult=search(arr,x); if (result == -1)
System.out.print(
"Elementisnotpresentinarray");
else
System.out.print("Elementispresent"
+"atindex"
+result);
}
}

