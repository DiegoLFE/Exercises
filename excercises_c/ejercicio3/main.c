#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
/*
1)De 5  personas que ingresan al hospital se deben tomar y
validar los siguientes datos.
temperatura hasta 45, sexo f/m y edad 15 y 90. inicial del nombre
a)informar la cantidad de personas de cada sexo.
b)la edad promedio en total
c)la mujer con más temperatura(si la hay)
pedir datos por prompt y mostrar por document.write o console.log
*/
// para pasar a minuscula nombreVariable= tolower(nombreVariable); y mayuscula toupper();
int main()
{
    char inicialNombre;
    char sexo;
    char inicialMaxTemp;
    int edad;
    int contadorPersonas;
    int contadorM;
    int contadorf;
    int acumuladorEdades;
    float temperatura;
    float promedioEdad;
    float maxTemperatura;
    contadorPersonas=0;
    contadorM=0;
    contadorf=0;
    acumuladorEdades=0;

    for(int i=0; i<5; i++)
    {
        printf("Ingrese su inicial del nombre: ");
        fflush(stdin);
        scanf("%c",&inicialNombre);
        printf("Ingrese su temperatura: ");
        scanf("%f",&temperatura);
        while(temperatura<33||temperatura>45)
        {
            printf("temperatura invalida: ");
            scanf("%f",&temperatura);
        }

        printf("Ingrese su sexo: ");
        fflush(stdin);
        scanf("%c",&sexo);
        sexo=tolower(sexo);
        while(sexo!="m"&&sexo!="f")
        {
            printf("Ingrese su sexo: ");
            scanf("%c",&sexo);
        }

        printf("Ingrese su edad: ");
        scanf("%d",&edad);

        while(edad<15||edad>90)
        {
            printf("Ingrese su edad mayor a 14 y menor que 91: ");
            scanf("%d",&edad);
        }

        if(sexo=="f")
        {
            if (contadorf== 0 || temperatura>maxTemperatura)
            {
                maxTemperatura=temperatura;
                inicialMaxTemp=inicialNombre;
            }
            contadorf++;
        }
        else
        {
            contadorM++;
        }


        acumuladorEdades=edad+acumuladorEdades;//acumuladorEdades+=edad;

                         contadorPersonas++;
    }
    if(contadorf==0)
    {
        printf("no se registraron mujeres\n");
    }
    promedioEdad=(float)acumuladorEdades/5;
    printf("El promedio de las edades es: %.2f \n La cantidad de mujeres es de %d y la cantidad de hombes es de %d \n La mujer con mayor temperatura es de: %f",promedioEdad,contadorf,contadorM,maxTemperatura);

    return 0;
}
