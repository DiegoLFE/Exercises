#include <stdio.h>
#include <stdlib.h>

int main()
{
    /*mascaras %d decimal %i generico %d entero  system("pause"); */
    int edad;
    float peso;
    char sexo;
    char nombre[20];//="jorge"

    //printf("ingrese edad: ");
    //scanf("%d",&edad);
    printf("Ingrese nombre: ");
    scanf("%s", nombre);//cuando le pasamos un vector no es necesario el &
    //system("cls"); sirve para limpiar la consola---system(pause)
    /*edad = 20;
    peso = 78.5;
    sexo='f';*/

   // fflush(stdin); siempre usar cuando se piden caracteres o una cadena de los mismos


    printf("Ingresaste el valo de edad igual a %d",edad);
    //printf("La edad vale: %d \n el peso vale : %.2f y agrego el sexo que es : %c y se llama %s",edad,peso,sexo,nombre);
    return 0;
}
