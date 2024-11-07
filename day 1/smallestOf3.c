// 14. Find smallest of 3 distinct numbers
#include <stdio.h>
int main() {
    int num1, num2, num3;
    printf("Enter three distinct numbers: ");
    scanf("%d %d %d", &num1, &num2, &num3);
    
    if (num1 < num2 && num1 < num3) {
        printf("The smallest number is %d.\n", num1);
    } else if (num2 < num3) {
        printf("The smallest number is %d.\n", num2);
    } else {
        printf("The smallest number is %d.\n", num3);
    }
    return 0;
}