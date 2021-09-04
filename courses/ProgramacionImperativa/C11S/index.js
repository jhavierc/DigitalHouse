//Extra bonus
//Concurso de clavados
let parcipanteA = [5, 8, 4, 9, 5];
let parcipanteB = [8, 7, 8, 6, 8]
let parcipanteC = [7, 5, 10, 8, 3]

function puntajePromedio(puntajes) {
    let suma = 0;
    for (let i = 0; i < puntajes.length; i++) {
        suma += puntajes[i];
    }
    return suma / puntajes.length;
}

function puntajeMayor(puntajes) {
    let mayor = 0;
    for (let i = 0; i < puntajes.length; i++) {
        if (puntajes[i] > mayor) {
            mayor = puntajes[i];
        }
    }
    return mayor;
}


function competencia(participante1, parcipante2, participante3) {
    let var1 = puntajePromedio(parcipanteA);
    let var2 = puntajePromedio(parcipanteB);
    let var3 = puntajePromedio(parcipanteC);
    sacarGanador(var1, var2, var3, "promedio");


    var1 = puntajeMayor(parcipanteA);
    var2 = puntajeMayor(parcipanteB);
    var3 = puntajeMayor(parcipanteC);
    sacarGanador(var1, var2, var3, "mayor");

}

function sacarGanador(var1, var2, var3, texto) {
    if (var1 > var2 && var1 > var3) {
        console.log(` El participante A es el ganador con un puntaje ${texto} máximo de: ${var1}`);
    } else if (var2 > var1 && var2 > var3) {
        console.log(` El participante B es el ganador con un puntaje ${texto} máximo de: ${var2}`);
    } else if (var3 > var1 && var3 > var2) {
        console.log(` El participante C es el ganador con un puntaje ${texto} máximo de : ${var3}`);
    }
}



competencia(parcipanteA, parcipanteB, parcipanteC)

//---------------- Practicas playground-----------------
function noParesDeContarImparesHasta(numero) {
    // Escribe aqui tu código
    cont = 0;
    for (let i = 0; i <= numero; i++) {
        if ((i % 2) !== 0) {
            cont++;
        }
    }
    return cont;
}
//console.log(noParesDeContarImparesHasta(10));

function encontreUn5(numeros) {
    let cont = 0;
    do {
        console.log(numeros[cont]);
        cont++;
        if (numeros[cont] === 5) {
            console.log("Se encontró un 5!");
        }
    } while (numeros[cont] != 5)
}
//encontreUn5([1, 2, 3, 4, 5, 6, 7]);

function tablaDeMultiplicar(numero) {
    let cont = 1;
    while (cont <= 10) {
        console.log(`${numero} * ${cont} = ${numero*cont}`);
        console.log(numero + " * " + cont + " = " + numero * cont);
        cont++;
    }
}
//tablaDeMultiplicar(5)