//Concurso

const alicia = [23, 69, 32];
const bob = [12, 67, 43];

function encontrarGanador(alicia, bob) {
    let aliciaContador = 0;
    let bobContador = 0;

    for (let i = 0; i < alicia.length; i++) {
        if (alicia[i] > bob[i]) {
            aliciaContador++;
        } else if (alicia[i] < bob[i]) {
            bobContador++;
        }
    }
    return aliciaContador > bobContador ? "Alicia" : aliciaContador < bobContador ? "Bob" : "Empate";

}
console.log("El ganador es: " + encontrarGanador(alicia, bob) + " participante");

//Extra bonus
function digitalHouse(a, b) {
    for (let i = 1; i <= 100; i++) {
        if (i % a === 0 && i % b !== 0) {
            console.log("Digital");
        } else if (i % a !== 0 && i % b === 0) {
            console.log("House");
        } else if (i % a === 0 && i % b === 0) {
            console.log("Digital House");
        }
    }
}
digitalHouse(2, 3);

//Suma array realoaded
function sumArray(array) {
    let suma = 0;
    for (let i = 0; i < array.length; i++) {
        suma += array[i];
    }
    return suma;
}
console.log("la suma de los elementos del array es : ", sumArray([1, 2, 5]));
console.log("la suma de los elementos del array es : ", sumArray([10, 3, 10, 4]));
console.log("la suma de los elementos del array es : ", sumArray([-5, 100]));

//funcion join 
function join(array) {
    let texto = "";
    for (let i = 0; i < array.length; i++) {
        texto = texto + array[i];
    }
    return texto;
}
console.log(join(['h', 'o', 'l', 'a']));