#include <stdio.h>
#include <stdlib.h>

//pedir dos numeros y mostrar el promedio de los mismos

int main()
{
    int numero1;
    int numero2;
    int suma;
    float promedio;

    printf("Ingrese un numero: ");
    scanf("%d",&numero1);
    printf("Ingrese otro numero: ");
    scanf("%d",&numero2);
    suma=numero1+numero2;
    promedio=(float)suma/2;// tambien se puede poner suma/2.

    printf("el promedio es: %.2f",promedio);

    return 0;
}
