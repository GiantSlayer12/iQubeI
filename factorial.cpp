#include <iostream>
using namespace std;

int factorial (int n);
int main(){

	int i = 0;
	while(i <= 20){
		cout << i << " ! " << "is " << factorial(i)<< endl;
		i++;
	}

return 0;
}

int factorial (int n){
	if (n <= 1){
		return 1;
	}else{
		return n * factorial(n - 1);
	}
}