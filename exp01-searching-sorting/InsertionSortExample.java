importjava.util.Scanner;
publicclassInsertionSortExample{
publicstaticvoidinsertionSort(intarray[]){ int n = array.length;
for(int j=1;j<n;j++){ int key = array[j];
inti= j-1;
while((i>-1)&&(array[i]>key)){ array [i+1] = array [i];
i--;
}
array[i+1]=key;
}
}
public static void main(String a[]){ 
int[]arr1={9,14,3,2,43,11,58,22};
System.out.println("BeforeInsertionSort"); 
for(int i:arr1){
System.out.print(i+"");
}
System.out.println();
insertionSort(arr1);
//sortingarrayusinginsertionsort System.out.println("After Insertion Sort");
for(inti:arr1){
System.out.print(i+"");
}
}
}
