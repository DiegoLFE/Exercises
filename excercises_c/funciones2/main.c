#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
//Para brindar primer hay que saludar para despedirse primero hay que brindar
int main()
{
    char salir='n';
    int flagA=0;
    int flagB=0;
    int flagC=0;

    do
    {
        switch(opcion)
        {
        case 'a':
            printf("Hola\n");
            flagA=1;
            break;
        case 'b':
            if(brindar(flagA))
            {
                flagB=1
            }
            break;
        case 'c':
            if(flagB==0)
            {
                printf("Primero hay que brindar!");
            }
            else
            {
                printf("Chau\n");
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
