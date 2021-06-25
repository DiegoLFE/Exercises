#include <stdio.h>
#include <stdlib.h>
#define TAM 10

int contarVocal(char vec[], int tam, char vocal);

int main()
{
    printf("Hello world!\n");
    return 0;

}


int contarVocal(char vec[], int tam, char vocal)
{
    int contador=0;
    for(int i=0;i<tam;i++)
    {
        if(vec[i]==vocal)
        {
            contador++
        }
    }
    return contador;
}
