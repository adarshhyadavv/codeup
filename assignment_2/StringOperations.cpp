/* to perform append,reverse,replace and sort function on a string
   Name : Yadav Adarsh Ramesh
   Date : 19/9/2025          
*/
#include<iostream>
using namespace std;

// append 
string append(string newString){
    string toBeAdded;
    cout<<"enter the string you want to add:";
    getline(cin,toBeAdded);
    string final = "your updated string is: " + newString + toBeAdded;
    return final;
}

// reverse
string reverse(string newString){
    int n = newString.length();
    for( int i = 0; i < n / 2; i++ ){
        char temp = newString[i];
        newString[i] = newString[n-i-1];
        newString[n-i-1] = temp; 
    }
    return newString;
}
// sort
string sort(string newString) {
    int n = newString.length();
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (newString[j] > newString[j + 1]) {   
                char temp = newString[j];
                newString[j] = newString[j + 1];
                newString[j + 1] = temp;
            }
        }
    }
    return newString;
}

// replace
string replace(string inputString) {
    char oldChar, newChar;
    cout << "Enter character to replace: ";
    cin >> oldChar;
    cout << "Enter new character to insert: ";
    cin >> newChar;
    cin.ignore();
    for(int i = 0; i < inputString.length(); i++) {
        if( inputString[i] == oldChar) inputString[i] = newChar;
    }
    return inputString;
}

bool option(string &inputString) {
    string opt ;
    cout << "Choose operation to perform with string by its sequence:\n"
         << "1. Append new string to current string\n"
         << "2. Replace character\n"
         << "3. Sort characters in string in alphabetical order\n"
         << "4. Reverse a string\n"
         << "5. Enter 0 to exit()\n"
         << "enter your choice:";
    getline(cin, opt);
    
    switch(opt[0]) {
        case '0':
            cout << "operation ends" << endl;
            return false;
        break;
        case '1':
            inputString = append(inputString);
            cout <<  inputString << endl;
        break;
        case '2':
            inputString = replace(inputString);
            cout << "your string after replacement is:" << inputString << endl;
        break;
        case '3':
            inputString = sort(inputString);
            cout << "String after sorting all characters in alphabetical order: " << inputString << endl;
        break;
        case '4':
            inputString = reverse(inputString);
            cout << "String after reverse: " << inputString << endl;
        break;
        default:
            cout << "Invalid input please enter again:" << endl;
        break;
    }
    return true;
}

int main(){
    string currentString;
    cout<<"enter the string:";
    getline(cin,currentString);
    while(true) {
        bool repeat = option(currentString);
        if(!repeat) break;
    }
}