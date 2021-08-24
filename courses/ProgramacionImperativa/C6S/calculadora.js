function sumar(a, b) {
    return a + b;
}

function restar(a, b) {
    return a - b;
}

function multiplicar(a, b) {
    return a * b;
}

function dividir(a, b) {
    return a / b;
}
console.log("---------- Testeo de Operaciones/Calculadora--------------");

console.log(`Resultado de 12 + 5 = ${sumar(12,5)} `);
console.log(`Resultado de 12 - 5 = ${restar(12,5)} `);
console.log(`Resultado de 12 * 5 = ${multiplicar(12,5)} `);
console.log(`Resultado de 12 / 5 = ${dividir(12,5)} `);
console.log(`Resultado de 12 / 0 = ${dividir(12,0)}`);

function cuadradoDeUnNumero(a) {
    return multiplicar(a, a)
}
console.log(`Resultado de 12 al cuadrado = ${cuadradoDeUnNumero(12)}`);

function promedioDeTresNumeros(a, b, c) {
    return dividir(sumar(a + b, c), 3);
}
console.log(`El promedio de 3,4,5 = ${promedioDeTresNumeros(3,4,5)}`);

function calcularPorcentaje(num, porcentaje) {
    return dividir(multiplicar(num, porcentaje), 100);
}
console.log(`El 45% de 300 = ${calcularPorcentaje(300,45)}`);
console.log(`El 10% de 300 = ${calcularPorcentaje(300,10)}`);

function generadorDePorcentajes(a, b) {
    return dividir(multiplicar(a, 100), b);
}
console.log(`generador = ${generadorDePorcentajes(2,200)}`);


console.log(typeof(Infinity));