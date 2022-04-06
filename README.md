TEST CON SELENIUM Y CUCUMBER

Nombre del proyecto: Selenium testing
Objetivo: probar dos funcionalidades de la página web de Alten.es

ESTRUCTURA

La estructura del proyecto cumple con el patrón de diseño Page object Model (POM).

Con un objeto de página base podemos abstraer todas las acciones comunes en una ubicación 
central y aprovecharlas en cualquier objeto de página que consideremos adecuado.

En el package src/main/java/pages se localiza la clase "Base" de la que 
extienden las clases "HomePage", "NewsPage" y "RegistrationPage".

Para disponer de un código más limpio se han unificado todos los strings con direcciones y rutas 
en src/main/java/constants/PathResources

En la parte de src/test tenemos el package runner con el RunnerTest del proyecto y los 
stepsDefinition "NavigateToJobPage" y "NavigateToNewsPage".

Por último en src/test/resources está el package con drive con el chromedriver y features con
el fichero *.feature de cucumber.

INSTALACIÓN DEL PROYECTO

Comprobar que la versión de Java que utilizamos con Maven es la misma que está 
configurada en el fichero pom.xml.

- `mvn -version`

Si es distinta a 1.8 cambiarlo por el valor de nuestra versión y actualizar maven.

    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>

Añadir las dependencias en el archivo pom.xml

`<dependencies>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.1.2</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>7.2.3</version>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>7.2.3</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>commons-io</groupId>
            <artifactId>commons-io</artifactId>
            <version>2.6</version>
        </dependency>
        <dependency>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.10.1</version>
            <type>maven-plugin</type>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>1.7.36</version>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-log4j12</artifactId>
            <version>1.7.22</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-csv</artifactId>
            <version>1.4</version>
        </dependency>
    </dependencies>
    <build>
        <plugins>
            <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-surefire-plugin</artifactId>
                    <version>3.0.0-M5</version>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-site-plugin</artifactId>
                <version>3.11.0</version>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-project-info-reports-plugin</artifactId>
                <version>3.2.2</version>
            </plugin>
        </plugins>
    </build>
    <reporting>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-report-plugin</artifactId>
                <version>3.0.0-M5</version>
            </plugin>
        </plugins>
    </reporting>`

Configurar el fichero Log4j.properties con la ruta donde guardaremos los logs. Estos logs
los podemos crear en la parte del código que necesitemos. La ruta del fichero es:

/src/main/java/resources/Log4j.properties

Realizamos la instalación del proyecto

- `mvn clean install`

Para ejecutar los test lo podemos hacer con

- `mvn test`

Por defecto las capturas de pantalla del proceso se guardarán en

/home/user

Para logs con más info y que se puedan visualizar en el navegador:

- `mvn site`

Se nos generará el fichero que podemos visualizar en navegador y nos tomará los estilos generados en
el mismo directorio.

/target/site/surefire-report.html

