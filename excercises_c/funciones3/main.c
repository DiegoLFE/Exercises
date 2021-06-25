#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <conio.h>

int factorial(int num);
int factorialRecursiva(int num);

int main()
{
    int n;
    int fact;

    printf("ingrese un numero:");
    scanf("%d",&n);

    fact=factorial(n);



    printf("el factorial de %d es %d\n",n,fact);

    return 0;
}

int factorial(int num)
{
    int fact=1;

    for(int i =1; i<=num; i++)
    {
    fact=fact*i;
    }
    return fact;
}
int factorialRecursiva(int num)
{
    int factorial=1;
    if(num>1)
    {
        factorial=num*factorialRecursiva(num-1);
    } else{
    factorial=1;
    }
    return factorial;

}
