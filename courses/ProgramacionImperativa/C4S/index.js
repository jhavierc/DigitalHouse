//verificar ingresos a la discoteca
let edadMinima = 18;
let capacidadMaxima = 1000;

console.log(edadMinima);
console.log(capacidadMaxima);

edadMinima = 21;
capacidadMaxima = 800;

console.log("edadMinima=", edadMinima);
console.log("capacidadMaxima=", capacidadMaxima);


//variables numericas
let uno = 33;

let dos = uno;

let tres = 100;

uno = 32;

console.log("uno= ", uno);
console.log("dos=", dos);
console.log("El valor de la variable dos mantiene el primer valor asignado a la variable uno.");

//mensajes con variables
let nombre = "Carlos Cepeda";
let edad = 33;
let cumpleanios = "Febrero 3";
let ciudad = "Medellin";
let ocupacion = "Estudiante DH";
let hobbie = "Dev";

console.log("Nombre: %s, Edad: %d, Cumpleaños: %s, Ciudad :%s, Ocupación:%s, Mis hobbies :%s", nombre, edad, cumpleanios, ciudad, ocupacion, hobbie);
console.log(`Nombre: ${nombre}, Edad:  ${edad}, Cumpleaños:  ${cumpleanios}, Ciudad:  ${ciudad}, Ocupacion:  ${ocupacion}, Hobbies:  ${hobbie}`);

let var1 = "v1"
var2 = "v2",
    var3 = "v3";
console.log(var1, var2, var3);

//calculadora de edad
let edad1 = 12,
    edad2 = 33,
    edad3 = 22,
    edad4 = 32,
    edad5 = 24,
    edad6 = 12,
    edad7 = 43,
    edad8 = 23;
console.log("edad1 =%d dias de vida", (edad1 * 365));
console.log("edad2 =%d dias de vida", (edad2 * 365));
console.log("edad3 =%d dias de vida", (edad3 * 365));
console.log("edad4 =%d dias de vida", (edad4 * 365));
console.log("edad5 =%d dias de vida", (edad5 * 365));
console.log("edad6 =%d dias de vida", (edad6 * 365));
console.log("edad7 =%d dias de vida", (edad7 * 365));
console.log("edad8 =%d dias de vida", (edad8 * 365));

//suma de valores
let num1 = 727,
    num2 = 23
let resultado = num1 + num2;
console.log("El resultado es : ", resultado);

//Ejercicio 1
console.log("Ejericio 1: ¿Cuántos snacks vas a comer por el resto de tu vida?");
let miEdad = 34;
let edadMaxima = 85;
let snak = "dulces";
let snakXdia = 1;
let snaksRestantes = ((edadMaxima - miEdad) * 365) * snakXdia;
console.log("La cantidad de snaks hasta el %d a consumir son:%d", edadMaxima, snaksRestantes);

let precioUnidad = 300;
console.log("Gastos en snaks:%d pesos", (snaksRestantes * precioUnidad));

//Ejercicio 2
console.log("Estás organizando tus vacaciones y tenés que calcular cuánto dinero vas a necesitar para la comida.");

let dias = 15;
let presupuesto = 10000000;
let comida;
let numComidas = 45;
let costoComida = 12000;
console.log(`Podes gastar ${costoComida*numComidas} en comida para que te alcance la plata durante los ${dias} de viaje`);

//Calculador de IMC
console.log("\n*** Calculadora de IMC ***\n");
let persona1 = { nombre: "Nicolas", apellido: "Lopez", edad: 27, peso: 83.5, altura: 170, prepaga: true, imc: 0 };
let persona2 = { nombre: "Esteban", apellido: "Piazza", edad: 28, peso: 80.1, altura: 176, prepaga: true, imc: 0 };
let persona3 = { nombre: "Jose", apellido: "Fermoso", edad: 33, peso: 63.7, altura: 153, prepaga: false, imc: 0 };
let persona4 = { nombre: "Juana", apellido: "Fernandez", edad: 26, peso: 55.0, altura: 162, prepaga: true, imc: 0 };
let yo = { nombre: "Carlos", apellido: "Cepeda", edad: 34, peso: 73, altura: 165, prepaga: true, imc: 0 };
const METROS = 0.01;
//se trabaja con un array de personas
let pacientes = [persona1, persona2, persona3, persona4, yo];

//se recorre el array para obtener los valores de cada persona mediante el uso del ciclo for
for (var i = 0; i < pacientes.length; i++) {
    //console.log(pacientes[i]);
    let temp = pacientes[i].altura * METROS; // se pasa de centrimetros a metros: 1cm = 0.01mtrs
    let altura = temp * temp; //la altura en mts se eleva al cuadrado, eso es igual a altura * altura
    let imc = pacientes[i].peso / altura; //se calcula el imc= peso (kg)/ altura (mts)
    pacientes[i].imc = imc; //se actualiza el valor del imc para cada persona
}
console.log("----resultados----");
//console.log(pacientes);

for (var i = 0; i < pacientes.length; i++) {
    console.log(`${pacientes[i].nombre} ${pacientes[i].apellido} tiene ${pacientes[i].edad} y su indice de masa corporal es de ${pacientes[i].imc}`);
}

console.log("\n¿Cuales son variables ?: las variables son todos los valores asociados a cada uno de los afiliados");
console.log("¿Cuales son constantes?: La constantes puede ser el valor en metros de un centimetro (METROS)");
console.log("¿De que tipo son? : Hay variables de tipo string, numericos, boolean");