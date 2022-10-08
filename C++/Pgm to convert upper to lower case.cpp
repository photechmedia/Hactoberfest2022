#include <iostream>
using namespace std;

int main()
{
	char ch;
	cout<<"Enter a character in uppercase: "; 
        cin>>ch;
	//converting the uppercase char to lowercase by adding 32
	//to the ASCII value of the input character
	ch=ch+32;
	cout<<"Entered character in lowercase: "<<ch;
	return 0;
}
