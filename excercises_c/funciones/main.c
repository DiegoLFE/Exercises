#include <stdio.h>
#include <stdlib.h>
#define compotaDeCiruela fflush
#include <ctype.h>

int main()
{
    char opcion;
    char salir='n';

    do
    {
        system("cls");//limpia la consola
        printf("***Menu de opciones***\n\n");
        printf("a Saludar \n");
        printf("b Felicitar \n");
        printf("c Retar \n");
        printf("d Salir \n\n");
        printf("Ingrese opcion: ");
        compotaDeCiruela(stdin);
        scanf("%c", &opcion);
        opcion=tolower(opcion);

        switch(opcion)
        {
        case 'a':
            printf("Hola, como andas..\n");
            break;
        case 'b':
            printf("Te felicito, sos groso..\n");
            break;
        case 'c':
            printf("Sos malo..\n");
            break;
        case 'd':
            printf("Estas seguro que queres salir?: \n");
            compotaDeCiruela(stdin);
            scanf("%c",&salir);
            break;
        default:
            printf("Opcion invalida\n");
        }

        system("pause");

    }
    while(salir=='n');
    return 0;
}

    /*if(opcion=='a')
    {
        printf("Hola");
    }
    else
    {
        if(opcion=='b')
        {
            printf("Felicidades");
        }
        else
        {
            if(opcion=='c')
            {
                printf("Muy mal!");
            }
            else
            {
                printf("Chau");
            }
        }
    }
   int edad;
    char sexo;
    float peso;

    printf("Ingrese edad: ");
    scanf("%d",&edad);
    printf("Ingrese sexo: ");
    scanf("%c",&sexo);
    printf("Ingrese peso: ");
    scanf("%f",&peso);

    printf("Usted ingreso edad: %d\n",edad);
    printf("Usted ingreso sexo: %c\n",sexo);
    printf("Usted ingreso peso: %f\n",peso);
*/
