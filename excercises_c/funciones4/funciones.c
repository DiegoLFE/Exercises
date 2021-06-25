#include "funciones.h"
#include <ctype.h>
#include <stdlib.h>
#include <stdio.h>


float calcularPromedio(int a, int b)
{
    float promedio;
    promedio= (float)(a+b)/2;
    return promedio;
}
int duplicar(int a)
{
    a=a*2;

    return a;
}
char menu()
{
    char opcion;
    system("cls");//limpia la consola
    printf("***Menu de opciones***\n\n");
    printf("a Saludar \n");
    printf("b Brindar \n");
    printf("c Saludar \n");
    printf("d Salir \n\n");
    printf("Ingrese opcion: ");
    fflush(stdin);
    scanf("%c", &opcion);
    opcion=tolower(opcion);
    return opcion;
}
int saludar()
{
    int cantidad;
    int error=0;
    cantidad=printf("Hola, como andas...\n");
    if (cantidad!=19)
    {
        error++;
    }
    return error;
}
int brindar(int saludo)
{
    int error;
    if(saludo)
    {
        printf("Chin Chin\n");
        error=0;
    }
    else
    {
        printf("Primero hay que brindar!");
        error=1;
    }
    return error;
}
int despedir(int brindis)
{
    int error=0;

    if(brindis==0)
    {
        printf("Primero hay que brindar!");
        error=1;
    }
    else
    {
        printf("Chau\n");
    }
    return error;
}
