# Examen Práctico – Ordenamiento y Búsqueda de Autos

## Enunciado

Se tiene una estructura de datos con:

- Una clase `Brand` (Marca), que contiene un arreglo de `CarModel` (Modelos).
- Cada `CarModel` contiene un arreglo de `CarYear` (Años).
- Cada `CarYear` tiene un año (int) y un atributo booleano `isValid`.

## Objetivo

Implementar los siguientes requerimientos:

1. **REQUERIMIENTO CRÍTICO**: Crear el método `getTotalValidYears()` en la clase `Brand`. Este método debe calcular y retornar cuántos años **válidos** tiene la marca (sumando todos los años válidos de todos sus modelos).
   - **Nota**: Un año se considera válido si su atributo `isValid` es `true`.
   - **IMPORTANTE**: Sin este método implementado correctamente, el resto del examen no funcionará.

```java
public class Brand {
    // ... otros atributos y métodos
    
    /**
     * Calcula el total de años válidos de todos los modelos de esta marca
     * @return número total de años con isValid = true
     */
    public int getTotalValidYears() {
        // Implementar aquí
    }
}
```
```java
public Brand[] sortSelectionDesc(Brand[] brands) {
    // Implementación del método
}
```

3. Implementar un método de **búsqueda binaria** para encontrar una marca según la **cantidad de años válidos**. El método debe recibir como parámetro un valor booleano que indique si el arreglo de marcas fue ordenado de forma ascendente (`true`) o descendente (`false`), y realizar la búsqueda acorde al tipo de orden utilizado.

El nombre del método debe ser `binarySearchByValidYears` y debe recibir un arreglo de marcas, un número de años válidos y un booleano que indique el orden.

El método deberá servir para ascendente y descendente, por lo que se debe tener en cuenta el orden de los datos al realizar la búsqueda.

Para la implementación mandar el parámetro `isAscending` como `true` si el arreglo fue ordenado de forma ascendente, o `false` si fue ordenado de forma descendente, según el ordenamiento que se haya realizado previamente.

No puede cambiar el nombre del método ni su firma. El método debe retornar la marca encontrada o `null` si no se encuentra.

```java
public Brand binarySearchByValidYears(
    Brand[] brands, 
    int validYears,
    boolean isAscending
    ) {
    // Implementación del método
}
```
Cada fila deberá utilizar el método `binarySearchByValidYears` para buscar dos valores diferentes de años válidos, según la siguiente tabla:

## Requisitos de Implementación

1. **El método `getTotalValidYears()` es OBLIGATORIO** y debe estar en la clase `Brand`
2. **Los tests deben ejecutarse sin errores** - esto valida que su implementación es correcta
3. **La salida en consola es OBLIGATORIA** - debe ejecutar `App.java` y copiar la salida completa
4. **NO MODIFICAR los datos de prueba** - La clase `TestData.java` contiene el método `createBrands()` que genera 7 marcas con sus respectivos modelos y años. **NO debe modificar estos datos**, debe usarlos tal como están proporcionados.




## ℹNota para estudiantes
* **Los nombres de los métodos deben ser EXACTOS** a los especificados.
* **El archivo `student.env` debe estar configurado correctamente** con su fila asignada.
* **Los tests deben pasar** - esto valida que su implementación es correcta.
* **La salida en consola es OBLIGATORIA** - debe ejecutar `App.java` y copiar el resultado completo.




