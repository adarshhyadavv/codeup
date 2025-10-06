#include<iostream>
using namespace std;
int sumOfDigit(int input){
    int sum = 0;
        while(input>0){
            int ones = input % 10;
            sum = sum + ones;
            input = input/10;
        }
    return sum;
}
void asciiTransformation(char arr[],int shift,int size){
    for (int i = 0; i < size; i++) {
        char encoded = arr[i] + shift; 
        cout << encoded << " ";
    }
}
string CaesarCipher(string input,int shift){
    for (int i = 0; i < input.length();i++){
        input[i] = input[i] + shift;
    }
    return input;
}
vector<string> ans;
void solve(int open, int close, int n, string curr) {
    if (open + close == 2 * n && open == close) {
        ans.push_back(curr);
        return;
    }
    if (open < n) {
        solve(open + 1, close, n, curr + "(");
    }
    if (close < open) {
        solve(open, close + 1, n, curr + ")");
    }
}
vector<string> generateParenthesis(int n) {
    string s = "";
    solve(0, 0, n, s);
    return ans;
}
int consecutiveNumSum(int n){
    int count = 1;
        for( int i = 2; i * i < 2 * n; i++ ) {
            if ( ( n - ( i * ( i - 1 )/2) ) % i == 0) count++;
        }
    return count;
}
bool option() {
    string opt;
    string input;
    int shift;
    char arr[100];
    int size;
    int num;

    cout << "\nChoose operation to perform:\n"
         << "1. Valid Parenthesis Check\n"
         << "2. Sum of Digits\n"
         << "3. Consecutive Number Sum (count ways)\n"
         << "4. Caesar Cipher Encoding\n"
         << "5. Encoded ASCII Transformation\n"
         << "0. Exit\n"
         << "Enter your choice: " << flush;
    cin>>opt;     

    switch (opt[0]) {
        case '0':
            cout << "Operation ends." << endl;
            return false;

        case '1':
            cout << "Enter parentheses num:";
            cin >> num;
            {
            vector<string> result = generateParenthesis(num);
            cout << "Generated Parentheses: ";
            for (string s : result) {
                cout << s << " ";
            }
            cout << endl;
            }
            break;

        case '2':
            cout << "Enter the number: ";
            cin >> num;
            cout << "Sum of digits is: " << sumOfDigit(num) << endl;
            break;

        case '3':
            cout << "Enter a positive integer: ";
            cin >> num;
            cout << "Number of ways: " << consecutiveNumSum(num) << endl;
            break;

         case '4':
            cout << "Enter the string (no spaces): ";
            cin >> input;
            cout << "Enter shift value: ";
            cin >> shift;
            cout << "String after shifting is: " << CaesarCipher(input, shift) << endl;
            break;

        case '5':
            cout<<"enter the size of array:";
            cin>>size;
            cout<< "enter the elements of array:";
            for(int i = 0 ; i < size ; i++){
                cin>>arr[i];
            }
            cout<<"enter how much to shift:";
            cin>>shift;
            cout << "array after ASCII manipulation is : ";
            asciiTransformation(arr,shift,size);
            cout << endl;
            break;

        default:
            cout << "Invalid input please enter again:" << endl;
            break;

    }
    return true;
}
int main(){
    while(true) {
        bool repeat = option();
        if(!repeat) break;
    }
    return 0;
}  
