#include <stdio.h>
#include <stdlib.h>
#include "funciones.h"
#include <ctype.h>


void sumar2(int num1,int num2);
int sumar(int num1, int num2);
int sumar3();
void sumar4();
char menu();
int saludar();
int brindar(int saludo);
int despedir(int brindis);


int main()
{
    char salir='n';
    int flagA=0;
    int flagB=0;
    int flagC=0;
    //int a;
    //int b;
    //int rdo;
    //float rta;
    //printf("ingrese un numero: ");
    //scanf("%d", &a);
   // printf("ingrese otro numero: ");
    //scanf("%d", &b);

    //rdo=sumar(a,b);//sumar1
    //printf("resultado: %d\n",rdo);


    //sumar2(a,b);//sumar2


    //rdo=sumar3();
    //printf("El resultado es %d\n",rdo);//sumar3

    //sumar4();//sumar4 hace todo solo

    //rta=calcularPromedio(a,b);
   // printf("el promedio es: %.2f\n",rta);//promedio

   //duplicar(a);
   //printf("el doble de a es: %d\n",a);
    do
    {
        switch(menu())
        {
        case 'a':
            if(!saludar())
            {
                flagA=1;
            }
            break;
        case 'b':
             if(brindar(flagA))
            {
                flagB=1;
            }
            break;
        case 'c':
            if(despedir(flagB))
            {
             flagC=1;
            }
            break;
        case 'd':
            if(flagC==0)
            {
                printf("Primero hay que saludar!!\n");
            }
            else
            {
                printf("Estas seguro que queres salir?: \n");
                fflush(stdin);
                scanf("%c",&salir);
            }
            break;
        default:
            printf("Opcion invalida\n");
        }

        system("pause");

    }
    while(salir=='n');

    return 0;
}

int sumar (int num1, int num2)
{
    int resultado;
    resultado=num1+num2;
    return resultado;
}
void sumar2(int num1, int num2)
{
    int rdo;
    rdo = num1+ num2;
    printf("El resultado es %d\n", rdo);

}
int sumar3()
{
    int num1;
    int num2;
    int resultado;

    printf("ingrese un numero: ");
    scanf("%d", &num1);
    printf("ingrese otro numero: ");
    scanf("%d", &num2);

    resultado=num1+num2;

    return resultado;
}
void sumar4()
{
    int num1;
    int num2;
    int resultado;

    printf("ingrese un numero: ");
    scanf("%d", &num1);
    printf("ingrese otro numero: ");
    scanf("%d", &num2);

    resultado=num1+num2;

    printf("El resultado es %d\n", resultado);

}
