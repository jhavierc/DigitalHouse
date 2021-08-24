//Practica clase

console.log(`!true = ${!true}`);
console.log(`!false = ${!false}`);
console.log(`!!true = ${!!true}`);
console.log(`!!false = ${!!false}`);
console.log(`!1 = ${!1}`);
console.log(`!!1 = ${!!1}`);
console.log(`!0 = ${!0}`);
console.log(`!!0 = ${!!0}`);
console.log(`!!"" = ${!!""}`);

console.log("---------------------------");
console.log(` false || true = ${false || true}`);
console.log(` true || false = ${true || false}`);
console.log(` false && true = ${false && true}`);
console.log(` true && true = ${true && true}`);

console.log("---------------------------");

let x = 5;
let y = 9;
console.log(`x<10 && x!==5 : ${x<10 && x!==5}`);
console.log(`x>9 || x===5 : ${x>9 || x===5}`);
console.log(`!(x===y) : ${!(x===y)}`);

console.log("---------------------------");

console.log(`23 | 112 : ${23 | 110}`);
console.log(`23 & 112 : ${23 & 110}`);
console.log(`23 << 112 : ${23 << 110}`);
console.log(`23 >> 112 : ${23 >> 110}`);
console.log(`23 >>> 112 : ${23 >> 110}`);


console.log("---------------------------");

x = 10;
y = "a";
console.log(`y==="b" || x>=10  : ${y==="b" || x>=10}`);

x = 3;
y = 8;
console.log(`!(x=="3" || x===y) && !(y!==8 && x<=y) : ${!(x=="3" || x===y) && !(y!==8 && x<=y)}`);

let str = "";
let msj = "jaja!";
let esGracioso = "false";
console.log(`!((str || msj) && esGracioso) : ${!((str || msj) && esGracioso)}`);
console.log(esGracioso);

//Practica grupo
console.log("---------------------------");

let edad = 12;
let estatura = 1.31;

if (edad > 12 && estatura > 1.30) {
    console.log("Apto!!");
} else {
    console.log("No Apto!!");
}
console.log(`Aceptado ? :  ${edad > 12 && estatura > 1.30}`);

let luz = true;
let velocidad = "rapido";
if (luz && velocidad === "rapido") {
    console.log("Usar Flash");
} else {
    console.log("No usasr flash");
}
console.log(`Usar Flash ? :  ${luz && velocidad === "rapido"}`);

let eval1 = 4;
let eval2 = 2;
let evalFinal = 4;

console.log(`Aprobado ? :  ${((eval1 + eval2) >= 7) && evalFinal >= 4}`);

if (((eval1 + eval2) >= 7) && evalFinal >= 4) {
    console.log("Aprobado!!");
} else {
    console.log("No aprobado!!!");
}

let realizoTareas=true;
let tocoPiano=true;
let memoria =true;
console.log(`Ver TV ? :  ${realizoTareas && tocoPiano && memoria}`);

