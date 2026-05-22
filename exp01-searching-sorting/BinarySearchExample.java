class BinarySearchExample{
publicstaticvoidbinarySearch(intarr[],intfirst,intlast,intkey){ int mid = (first + last)/2;
while( first <= last ){ if(arr[mid]<key){ first = mid + 1;
}elseif(arr[mid] ==key){
System.out.println("Elementisfoundatindex:"+mid); break;
}else{
last=mid- 1;
}
mid=(first+last)/2;
}
if (first>last){
System.out.println("Elementisnotfound!");
}
}
public static void main(Stringargs[]){ int arr[] = {10,20,30,40,50};
int key=30;
int last=arr.length-1; binarySearch(arr,0,last,key);
}
}

