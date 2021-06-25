#include <stdio.h>
#include <stdlib.h>

//Pedir dos numeros y mostrar la suma de los mismos

int main()
{
    int numeroUno;
    int numeroDos;
    int resultadoSuma;

    printf("Ingrese un numero: ");
    scanf("%d",&numeroUno);
    printf("Ingrese otro numero: ");
    scanf("%d",&numeroDos);
    resultadoSuma=numeroUno+numeroDos;
    printf("la suma da: %d",resultadoSuma);
    return 0;
}
