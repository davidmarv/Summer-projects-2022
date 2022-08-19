#include <stdio.h>
#include <math.h>


int main() {
//user input numbers
float num1;
float num2;
//user input math operation
char operation;
//final return value
float value;

//user input for all values
printf("enter first number \n"); 
scanf("%f", &num1);

printf("enter operation \n"); 
scanf(" %c", &operation);

printf("enter second number \n"); 
scanf("%f", &num2);


//cases for math 
switch (operation)
{
    case '+': value = num1 + num2;
    break;

        case '*': value = num1 * num2;
    break;

        case '-': value = num1 - num2;
    break;

        case '/': value = num1 / num2;
    break;

        case '^': value = pow(num1,num2);
    break;
    default: printf("invalid operator");
    return 0;
}
printf("your answer is \n");
printf("%f", value);


return 0; 
}