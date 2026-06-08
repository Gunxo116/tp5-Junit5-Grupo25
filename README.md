# TP5 - Automatización de Pruebas con JUnit 5 y Maven

Este proyecto consiste en el desarrollo e integración de una suite de pruebas unitarias utilizando JUnit 5 y Maven para una calculadora básica. El trabajo ha sido realizado en grupo, distribuyendo los puntos de la actividad de la siguiente manera:

---

## Estructura del Proyecto y División de Tareas

### 👤 Persona 1 — La Base + Ciclo de Vida (Puntos 1 y 2)
* **Calculadora.java** (`src/main/java/com/ulp/Calculadora.java`): Clase que contiene los cuatro métodos de operaciones matemáticas básicas (`sumar`, `restar`, `multiplicar` y `dividir`). Suma y resta operan con números de tipo decimal (`double`), y el método de división lanza una excepción del tipo `ArithmeticException` si el divisor es igual a `0`.
* **CalculadoraTest.java** (`src/test/java/com/ulp/CalculadoraTest.java`): Archivo de pruebas de caja negra que implementa el ciclo de vida completo de JUnit 5:
  * `@BeforeAll`: Inicializa la instancia de la calculadora y muestra un mensaje de bienvenida.
  * `@BeforeEach`: Obtiene e imprime de forma dinámica el nombre del método de prueba en ejecución (utilizando `TestInfo`).
  * `@AfterEach`: Imprime un mensaje indicando la finalización de la prueba.
  * `@AfterAll`: Muestra el mensaje de finalización total del ciclo de pruebas.
  * `@Test`: Casos de prueba para la suma y resta utilizando `assertEquals` con un margen de tolerancia (delta) de `0.001`.

### 👤 Persona 2 — Caja Blanca + Pruebas Parametrizadas (Puntos 3 y 4)
* **DivisionTest.java** (`src/test/java/com/ulp/DivisionTest.java`): Prueba de caja blanca enfocada en la validación del camino crítico para la división por cero. Implementa el método `testDivisionCero()` y verifica que se lance la excepción mediante `assertThrows(ArithmeticException.class, ...)`.
* **CalculadoraParametrizadaTest.java** (`src/test/java/com/ulp/CalculadoraParametrizadaTest.java`): Implementa pruebas parametrizadas utilizando el motor de parámetros de JUnit 5. Emplea la anotación `@ParameterizedTest` junto con `@CsvSource` para evaluar el método de suma en tres escenarios distintos:
  * `(8, 7) -> 15`
  * `(2, 0) -> 2`
  * `(10, -1) -> 9`

### 👤 Persona 3 — Suite + Integración y Configuración (Punto 5)
* **MiSweetSuite.java** (`src/test/java/com/ulp/MiSweetSuite.java`): Clase suite vacía encargada de agrupar y ejecutar en orden centralizado las tres clases de pruebas anteriores. Para esto utiliza las anotaciones de JUnit 5 Platform Suite: `@Suite` y `@SelectClasses`.
* **pom.xml**: Configuración y verificación de las dependencias correctas para el motor de pruebas y suites de JUnit 5:
  * `junit-jupiter` (incluyendo `junit-jupiter-api`, `junit-jupiter-engine` y `junit-jupiter-params`)
  * `junit-platform-suite` (para el soporte de `@Suite`)

---

## Cómo Ejecutar las Pruebas

Para compilar el proyecto y correr los casos de prueba desde una terminal con Maven configurado, puedes utilizar los siguientes comandos:

1. **Ejecutar todas las pruebas del proyecto:**
   ```bash
   mvn test
   ```

2. **Ejecutar únicamente la Suite de pruebas (MiSweetSuite):**
   ```bash
   mvn test -Dtest=MiSweetSuite
   ```
