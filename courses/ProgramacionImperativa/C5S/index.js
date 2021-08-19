//---Funciones simples---

//1:
function convertirPulgadasACentimetros(num) {
    return num * 2.54;
}
console.log(convertirPulgadasACentimetros(1));

//2:
function crearUrl(nombre) {
    return `http://wwww.${nombre}.com`;
}
console.log(crearUrl('google'));
console.log(crearUrl('carlos'));

//3:
function fraseAdmiracion(frase) {
    return `${frase}!!`;
}
console.log(fraseAdmiracion("hola mundo"));

//4:
function calcularEdadPerruna(num) {
    return num * 7;
}

console.log("La edad de mi perrita es %s años", calcularEdadPerruna(4));

//5:
function calcularHoraDeTrabajo(salario) {
    return salario / 40;
}
console.log("Valor de la hora = ", calcularHoraDeTrabajo(10000000));

//6:
function calcularIMC(altura, peso) {
    const METROS = 0.01;
    let temp = altura * METROS; // se pasa de centrimetros a metros: 1cm = 0.01mtrs
    let alturaC = temp * temp; //la altura en mts se eleva al cuadrado, eso es igual a altura * altura
    return peso / alturaC;
}

console.log("Mi IMC es : ", calcularIMC(165, 75));


//ejercicios avanzados
//1:
function convertirMinuscula(cadena) {
    return cadena.toLowerCase();
}
console.log("Cadena en minusculas :", convertirMinuscula("Carlos"));

//2:
function validarTipoDato(valor) {
    return typeof(valor)
}

console.log("Tipo de dato :", validarTipoDato("carlos"));
console.log("Tipo de dato :", validarTipoDato(222));
console.log("Tipo de dato :", validarTipoDato(true));

//3:
function calcularCircunferencia(radio) {
    return Math.PI * Math.pow(radio, 2);
}
console.log("Circunferencia : ", calcularCircunferencia(3));

function saludar() {
    return "hola mundo!!";
    let a = 4;
    return a;
}
console.log(saludar());