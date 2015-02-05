#include <iostream>
using namespace std;

int fibonacci (int n);
int main(){

	int i = 0;
	while(i <= 20){
		cout << "fib( " << i << " )" << " is " << fibonacci(i) << endl;
		i++;
	}

return 0;
}

int fibonacci (int n){
	if (n <= 2){
		return n;
	}else{
		return fibonacci( n - 1 ) + fibonacci( n - 2 );
	}
}