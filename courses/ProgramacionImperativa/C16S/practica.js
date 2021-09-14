const operacion = require("./operaciones")
let a = 5;
let b = 6;

let dividir = (a, b) => a / b;

console.log(operacion.sumar(a, b));
console.log(operacion.multiplicar(a, b));
console.log(dividir(a, b));


setTimeout(function() {
    console.log("hi!!!");
}, 1000)

let miCallback = () => console.log("hi michi!!");
setTimeout(miCallback, 1000);

function nombreCompleto(nombre, apellido) {
    return nombre + " " + apellido;
}

function saludar(nombre, apellido, callback) {
    return 'Hola ' + callback(nombre, apellido);
}
console.log(saludar('Carlos', 'Cepeda', nombreCompleto));