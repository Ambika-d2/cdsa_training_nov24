// 11. Check if a number is 2 digit number
#include <stdio.h>
int main() {
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);
    
    if (num >= 10 && num <= 99) {
        printf("The number is a 2-digit number.\n");
    } else {
        printf("The number is not a 2-digit number.\n");
    }
    return 0;
}