// 13. Find biggest of 2 distinct numbers
#include <stdio.h>
int main() {
    int num1, num2;
    printf("Enter two distinct numbers: ");
    scanf("%d %d", &num1, &num2);
    
    if (num1 > num2) {
        printf("The biggest number is %d.\n", num1);
    } else {
        printf("The biggest number is %d.\n", num2);
    }
    return 0;
}

