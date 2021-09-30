// 1. Obtener el listado de posibles participantes
const fs = require('fs')
let autosJson = fs.readFileSync(__dirname + '/autos.json', 'utf8')
let autos = JSON.parse(autosJson)

// 2. Crear un objeto literal que represente la carrera
let carrera = {
    // 2.A. Agregar una propiedad llamada autos que contenga los autos obtenidos en el punto anterior.
    autos: autos,

    // 2.B. Agregar una propiedad llamada autosPorTanda que contenga el valor 6. Este valor representará la cantidad máxima de autos por tanda.
    autosPorTanda: 6,

    // 2.C. Agregar un método autosHabilitados, que retorne todos los autos habilitados, es decir, aquellos que no estén sancionados.
    autosHabilitados: function() {
        return this.autos.filter(auto => !auto.sancionado);
    },

    // 2.D. Agregar un método listarAutos que reciba como parámetro un array de autos e imprima por consola la siguiente información:
    listarAutos: function(arrayAutos) {
        arrayAutos.forEach(auto => {
            let estado = auto.sancionado ? "sancionado" : "habilitado";
            console.log(
                "Piloto: " + auto.piloto +
                ", patente: " + auto.patente +
                ", peso en kg: " + auto.peso +
                ", estado: " + estado + "."
            );
        });
    },

    // 2.E. Agregar un método buscarPorPatente que permita buscar el auto en función de su patente.
    buscarPorPatente: function(patente) {
        return this.autos.find(auto => auto.patente === patente);
    },

    // 2.F. Agregar un método buscarPorCilindrada que permite filtrar los autos habilitados, siempre y cuando su propiedad cilindrada sea menor o igual a la cilindrada enviada como argumento.
    buscarPorCilindrada(cilindrada) {
        let autosHabilitados = this.autosHabilitados();
        return autosHabilitados.filter(auto => auto.cilindrada <= cilindrada);
    },

    // 2.G. Agregar un método ordenarPorVelocidad que ordene los autos de menor a mayor según su velocidad.
    ordenarPorVelocidad: function(arrayAutos) {
        return arrayAutos.sort((a, b) => a.velocidad - b.velocidad);
    },

    // 2.H. Agregar un método generarTanda que permita retornar un array de autos, que cumplan con las siguientes condiciones:
    // - Su piloto esté habilitado.
    // - Su cilindrada sea menor o igual a un valor enviado como argumento.
    // - Su peso sea menor o igual a un valor enviado como argumento.
    // - La cantidad devuelta sea como máximo la expresada en la propiedad autosPorTanda.
    generarTanda: function(cilindrada, peso) {
        let autosHabilitados = this.autosHabilitados();
        let autosTanda = [];
        autosHabilitados.forEach(function(auto) {
            if (auto.cilindrada <= cilindrada && auto.peso <= peso) {
                autosTanda.push(auto)
                if (autosTanda.length >= this.autosPorTanda) return
            }
        })
        return autosTanda
    },

    // 2.I. Agregar un método listarPodio, que calcule el podio en función del puntaje de los pilotos y muestre el resultado por consola.
    listarPodio: function(tanda) {
        let tandaDeMayorAMenor = tanda.sort((a, b) => b.puntaje - a.puntaje);
        let primero = tandaDeMayorAMenor[0];
        let segundo = tandaDeMayorAMenor[1];
        let tercero = tandaDeMayorAMenor[2];

        console.log("El primero es " + primero.piloto + "con un puntaje de " + primero.puntaje);
        console.log("El segundo puesto es para " + segundo.piloto + " con un puntaje de " + segundo.puntaje);
        console.log("El tercer puesto es para " + tercero.piloto + " con un puntaje de " + tercero.puntaje);
    }

    // calcularPodio: function (tanda = [], puestos) { 
    //     let arrayPodio = [];
    //     for (let i = 0; i < puestos; i++) {
    //       const element = tanda[i];
    //       let indexPodio = Math.floor(Math.random() * (tanda.length));
    //       arrayPodio.push(tanda[indexPodio]);
    //     }
    //   return arrayPodio;
    // }
}

/* EJ 2.C. */
console.log("****** autosHabilitados *****");
console.log(carrera.autosHabilitados())
console.log();

/* EJ 2.D. */
console.log("***** listarAutos *****");
carrera.listarAutos(carrera.autos)
console.log();

/* EJ 2.E. */
console.log("***** buscarPorPatente *****");
console.log(carrera.buscarPorPatente('JQK433'));
console.log();

/* EJ 2.F. */
console.log("***** buscarPorCilindrada ******");
carrera.listarAutos(carrera.buscarPorCilindrada(1500))
console.log();

/* EJ 2.G. */
console.log("****** ordenarPorVelocidad ******");
carrera.listarAutos(carrera.ordenarPorVelocidad())
console.log();

/* EJ 2.H. */
console.log("****** generar tanda ******");
carrera.listarAutos(carrera.generarTanda(1500, 2000))
console.log();


/* EJ 2.I. */
console.log("****** listarPodio ******");
carrera.listarPodio(carrera.generarTanda(1500, 2000));
console.log();