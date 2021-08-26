//EQUIPO 10
//total a pagar
console.log("\n------------------EJERCICIO TOTAL A PAGAR------------------------\n");

function totalAPagar(vehiculo, litros) {
    let precio = 0;
    if (vehiculo === "coche") {
        precio = 86;
    } else if (vehiculo === "moto") {
        precio = 70;
    } else {
        precio = 55;
    }

    if (litros >= 0 && litros <= 25) {
        precio = precio + 50;
    } else {
        precio = precio + 25;
    }
    console.log(` Vehiculo: ${vehiculo}, Litros : ${litros},  Total a pagar = ${precio}`);
}
totalAPagar("coche", 50);
totalAPagar("moto", 30);
totalAPagar("autobus", 20);

//local de sandwiches
console.log("\n------------------EJERCICIO SANDWICHES------------------------\n");

function calcularCostoSandwitch(tipoSandwitch, tipoPan, queso, tomate, lechuga, cebolla, mayonesa, mostaza) {
    console.log("Pedido :");
    let valorSandwitch = 0;
    let valorPan = 0;
    let total = 0;

    if (tipoSandwitch === 'Pollo') {
        valorSandwitch = 150;
    } else if (tipoSandwitch === 'Carne') {
        valorSandwitch = 200;
    } else if (tipoSandwitch === 'Vegetariano') {
        valorSandwitch = 100;
    }

    if (tipoPan === 'Blanco c/orégano y parmesanoPan') {
        valorPan = 150;
    } else if (tipoPan === 'Negro c/avena') {
        valorPan = 60;
    } else if (tipoPan === 'Sin gluten') {
        valorPan = 75;
    }


    total = valorSandwitch + valorPan;
    if (queso) {
        total = total + 20;
    }
    if (tomate) {
        total = total + 15;
    }
    if (lechuga) {
        total = total + 10;
    }
    if (cebolla) {
        total = total + 15;
    }
    if (mayonesa) {
        total = total + 5;
    }
    if (mostaza) {
        total = total + 5;
    }
    console.log(` Sandwitch: ${tipoSandwitch}`);
    console.log(` Tipo Pan : ${tipoPan}`);
    console.log(` Con Queso? ${queso}`);
    console.log(` Con Tomate? ${tomate}`);
    console.log(` Con Lechuga? ${lechuga}`);
    console.log(` Con Cebolla? ${cebolla}`);
    console.log(` Con Mayonesa? ${mayonesa}`);
    console.log(` Con Mostaza? ${mostaza}`);
    console.log(` >> Total a pagar = ${total}`);
}
calcularCostoSandwitch('Pollo', 'Blanco c/orégano y parmesanoPan', true, true, true, true, true, true);

console.log("\n------------------EJERCICIO NÚMERO SECRETO------------------------\n");

function numeroSecreto(numero) {
    let random = Math.random() * 20;
    let secreto = Math.trunc(random);
    if (secreto === numero) {
        console.log(` Felicitaciones!!! haz adivinado el número.`);
    } else {
        console.log(` Sigue intentando, el número secreto es: ${secreto}`);
    }
}
numeroSecreto(10);
numeroSecreto(5);
numeroSecreto(12);
numeroSecreto(17);
numeroSecreto(18);
numeroSecreto(9);
numeroSecreto(7);
numeroSecreto(1);
numeroSecreto(2);

console.log("\n------------------EJERCICIO ABRIR PARACAIDAS------------------------\n");

function abrirParacaidas(velocidad, altura) {
    let abrir = false;
    if (velocidad < 1000 && (altura >= 2000 && altura < 3000)) {
        abrir = true;
    }
    console.log(` Abrir paracaidas ?: ${abrir}`);
}
abrirParacaidas(800, 2500);
abrirParacaidas(2000, 3500);


console.log("\n------------------EJERCICIO TRADUCTOR CONDICIONAL------------------------\n");

function traductor(palabra) {
    let word;

    switch (palabra) {
        case 'casa':
            word = 'home';
            break;
        case 'perro':
            word = 'dog';
            break;
        case 'pelota':
            word = 'ball';
            break;
        case 'arbol':
            word = 'tree';
            break;
        case 'genio':
            word = 'genius';
            break;
        default:
            word = 'no defined';

    }
    return word;
}
console.log(` Traducir: casa >>  ${traductor('casa')}`);
console.log(` Traducir: perro >>  ${traductor('perro')}`);
console.log(` Traducir: pelota >>  ${traductor('pelota')}`);
console.log(` Traducir: arbol >>  ${traductor('arbol')}`);
console.log(` Traducir: genio >>  ${traductor('genio')}`);
console.log(` Traducir: oso >>  ${traductor('oso')}`);


console.log("\n------------------EJERCICIO VALORACION DE PELICULAS------------------------\n");

function valorarPelicula(valor) {
    let calificacion = "";
    switch (valor) {
        case 1:
            calificacion = "Muy mala";
            break;
        case 2:
            calificacion = "Mala";
            break;
        case 3:
            calificacion = "Mediocre";
            break;
        case 4:
            calificacion = "Buena";
            break;
        case 5:
            calificacion = "Muy buena";
            break;
        default:
            calificacion = "";
    }

    if (valor > 3 && valor <= 5) {
        console.log("Muchas gracias por tu calificación");
    } else if (valor >= 1 && valor <= 3) {
        console.log(` Calificaste la película como ${calificacion}. Lo lamentamos mucho.`);
    } else {
        console.log("Ingresaste un valor inválido");
    }

}

valorarPelicula(1);
valorarPelicula(4);
valorarPelicula(10);