console.log("Hola mundo!!");

const anio = 2021
var telefono = 3333
var name = "Carlos"

function saludo() {
    let nombre = "javi"
    console.log(nombre);
    nombre = "cepeda"
    console.log(nombre);

    const apellido = "cepeda"
    console.log(apellido);

    const anio = 2022
    console.log(anio);

}

console.log(telefono);
console.log(name);

saludo()

let objetoLiteral = { nombre: "Carlos", apellido: "cepeda", edad: 33 }
console.log(objetoLiteral.nombre);
console.log(objetoLiteral.apellido);
console.log(objetoLiteral.edad);
console.log(objetoLiteral);

let miArray = ["uno", "dos", "tres"];
console.log(miArray);



let var1 = 1;
let var2 = 1;
let var3 = '1';

//comparacion simple
console.log(var1 == var2);
console.log(var1 == var3);

//coparacion estricta
console.log(var1 === var3);

//incremento y decremento
let cont = 1;
let cont2 = 100;
console.log(cont++);
console.log(++cont);


console.log(cont2--);
console.log(--cont2);

function anterior(num) {
    return --num;
}

function triple(num) {
    return num * 3;
}

function anteriorDelTriple(num) {
    let dato = 0;
    if (num != null && num != undefined) {
        dato = triple(num);
    }
    return anterior(dato);
}

function anteriorDelTriple2(num) {
    return anterior(num != null && num != undefined ? triple(num) : 0);
}
console.log("resultado : ", anteriorDelTriple(3));
console.log("resultado : ", anteriorDelTriple2(3));