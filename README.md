# Tarea ARSW Inter (Tablero Multiusuario React)

## Autor
**Julian Adolfo Peña Marin**

## Descripcion
La aplicacion es un tablero multiusuario desarrollado en react, con la finalidad de que los usuarios puedan dibujar y todos puedan ver que es lo que se dibuja, para esto:

 * Cada usuario dibuja con color diferente para que se distinga.
 * Hay un boton de borrar, que elimina todo lo que se dibujo.
 * Para dibujar se utiliza el mouse, leyendo los eventos del mismo.

## Documentacion
Para obtener la documentacion del proyecto, con el siguiente comando se puede generar:

```
    mvn javadoc:javadoc
```

## Como Correrlo
Primero se debe clonar el repositorio, para esto puede utilizar el siguiente comando de git, con la url del repositorio que se quiere clonar, como se muestra a continuación

```
    git clone https://github.com/JulianP-24/Tablero-MultiUsuario-React-Arsw-Inter.git
```

Una vez clonado para generar el JAR, debe poner el siguiente comando

```
    mvn package
```

Despues puede correrlo con el siguiente comando, ubicandose en la carpeta raiz
```
    java -cp "./target/classes/" edu.escuelaing.arsw.App  
```

Otra forma para correrlo, ya generado el JAR, es con el siguiente comando

```
    "target/TableroMultiusuario-1.0-SNAPSHOT.jar" edu.escuelaing.arsw.App
```
y sino corre, la aplicacion tambien se puede probar con el link de heroku

## Link heroku

https://gentle-falls-19705.herokuapp.com/

## Funcionamiento de la Aplicacion en Heroku

Para verificar el funcionamiento de la aplicacion en Heroku, solo se accede al link de heroku, mostrado anteriormente, como se muestra a continuacion:

```
    https://gentle-falls-19705.herokuapp.com/
```

Como resultado se obtiene una pagina de inicio con el tablero para dibujar

![](img/img1.png)

y como se observa, se dibuja un circulo en el canvas

![](img/img2.png)

y a su vez si abrimos otro navegador se puede ver que tambien aparece lo dibujado anteriormente

![](img/img3.png)



## Diagrama de Clases
A continuacion se presenta el diagrama de clases de la arquitectura para la tarea propuesta

![](img/diagramaClases.png)


## Built con

* [Maven](https://maven.apache.org/) - Dependency Management
* [JAVA JDK 8](http://www.oracle.com/technetwork/java/javase/overview/index.html) - construcción


## Licencia

This project is licensed under the GNU General Public License - see the [LICENSE](LICENSE) file for details

