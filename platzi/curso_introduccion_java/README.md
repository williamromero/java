## JAVA

### Datatypes

| Tipo de Dato | Tamaño  | Rango de Valores                                      | Comentarios                                      |
|--------------|---------|------------------------------------------------------|--------------------------------------------------|
| `byte`       | 1 byte  | -128 a 127                                           | Entero con signo.                                |
| `short`      | 2 bytes | -32,768 a 32,767                                     | Entero con signo.                                |
| `int`        | 4 bytes | -2,147,483,648 a 2,147,483,647                       | Entero con signo, el tipo entero más común.      |
| `long`       | 8 bytes | -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807| Entero con signo, para números muy grandes.      |
| `float`      | 4 bytes | Aproximadamente ±3.40282347E+38F (6-7 dígitos)       | Para números decimales con precisión simple.     |
| `double`     | 8 bytes | Aproximadamente ±1.79769313486231570E+308 (15 dígitos)| Para números decimales con precisión doble.      |
| `char`       | 2 bytes | 0 a 65,535                                           | Carácter Unicode sin signo (incluye símbolos).   |
| `boolean`    | 1 bit*  | `true` o `false`                                     | Representa valores de verdad (no tiene tamaño fijo en memoria). |

\* El tamaño de un `boolean` no es fijo y depende de la implementación de la JVM.

### Commands

Tu run a builded app:

```bash
  java -jar [filename].jar
```