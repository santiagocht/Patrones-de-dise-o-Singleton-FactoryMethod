# Nómina · Patrones creacionales — Programación I

Universidad Libre · Ingeniería de Sistemas · IV Semestre

Cada carpeta compila y funciona por sí sola. Los cambios de cada paso están marcados con comentarios `// Paso X: …`.
Si su código no compila, copie la carpeta anterior y continúe desde ahí.

```
cd 00-inicio && javac *.java && java Main
```

| Carpeta | Qué cambia |
|---|---|
| `00-inicio` | La nómina actual, con los tres síntomas |
| `01-singleton` | Una sola `ConfiguracionNomina` para todo el sistema |
| `02-factory` | `FabricaEmpleados` crea empleados desde una línea de texto (entra `Contratista`) |
| `03-builder` | `ReciboNomina` se arma con `ReciboNomina.Builder` |
| `solucion-docente/04-reto` | Solución del reto (Practicante). No entregar a los estudiantes |

Para la práctica, cada estudiante trabaja sobre la carpeta anterior y compara con la siguiente.
