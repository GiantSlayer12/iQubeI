#include <iostream>
using namespace std;

int binarySearch(int array[],int first,int last,int value);

int main(){
	
	int emptyArray[10];
	for(int i = 0; i < 10; i++){
		emptyArray[i] = 2 * i + 1; // assign odd numbers to array elements
	}
	
	cout << "Binary Search Results for 14: " << binarySearch(emptyArray,1,21,11)<< endl;
}

int binarySearch(int array[], int first,int last,int value){
	int index = ( first + last ) / 2;
	
	if(array[index] == value){
		return index;
	}else if( first > last){
		return -1;
	}else{
		if(array[index] < value){
			return binarySearch(array,index + 1,last,value);
		}else{
			return binarySearch(array,first, index - 1 , value);
		}
		
	}

	return index;

}