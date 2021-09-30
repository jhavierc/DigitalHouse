const v = "\x1b[32m%s\x1b[0m"; // NO TOCAR
const o = "*".repeat(80) + "\n"; // NO TOCAR
const oo = "*".repeat(25); // NO TOCAR
const jsonHelper = require('./jsonHelper');
/*******************************/
/* Desarrollo de las consignas */
/*******************************/
console.table(jsonHelper.leerJson('bicicletas'))
let listaCiclistas = jsonHelper.leerJson('bicicletas');

const carrera = {
        bicicletas: listaCiclistas,
        bicicletasPorTanda: 4,
        ciclistasHabilitados: function() {
            return this.bicicletas.filter(element => !element.dopaje);
        },
        listarBicicletas: function(array) {
            array.forEach(element => {
                console.log(` Ciclista:${element.ciclista}, marca:${element.marca}, rodado:${element.rodado}, peso:${element.peso}kg , largo:${element.largo}cm, estado:${element.dopaje?'inhabilitado':'habilitado'}`);
            });
        },
        buscarPorId: function(id) {
            return this.bicicletas.find(elemnt => elemnt.id == id);
        },
        filtrarPorPeso: function(peso) {
            return this.ciclistasHabilitados().filter(element => element.peso <= peso);
        },
        ordenarPorRodado: function() {
            return this.bicicletas.sort((a, b) => a.rodado - b.rodado);
        },
        largoPromedio: function() {
            console.log(`El promedio de lago es: ${this.bicicletas.reduce((sum, element) => sum + element.largo, 0) / this.bicicletas.length}`);
        },
        aumentarPeso: function(id, peso) {
            let ciclista = this.buscarPorId(id);
            if (ciclista) {
                ciclista.peso += peso;
                jsonHelper.escribirJson('bicicletas', this.bicicletas);
            }
        },
        generarTanda: function(rodado, peso) {
            return this.ciclistasHabilitados().filter(element => element.peso >= peso && element.rodado <= rodado).slice(0, this.bicicletasPorTanda);
        },
        calcularPodio: function(array) {
            let temp = array.sort((a, b) => b.puntaje - a.puntaje);
            console.log(`El ganador es: ${temp[0].ciclista}, con un puntaje de ${temp[0].puntaje}`);
            console.log(`El segundo puesto es para: ${temp[1].ciclista}, con un puntaje de ${temp[1].puntaje}`);
            console.log(`El tercer puesto es para: ${temp[2].ciclista}, con un puntaje de ${temp[2].puntaje}`);
        }


    }
    //console.table(carrera.bicicletas);



/******************************/
/* Ejecución de las consignas */
/******************************/

console.log(v, "\n" + oo + " .D. ");
console.table(carrera.ciclistasHabilitados());
console.log(o);

console.log(v, oo + " .E.");
carrera.listarBicicletas(listaCiclistas)
console.log(o);

console.log(v, oo + " .F.");
console.log(carrera.buscarPorId(1));
console.log(o);

console.log(v, oo + " .G.");
console.table(carrera.filtrarPorPeso(1));
console.log(o);

console.log(v, oo + " .H.");
console.table(carrera.ordenarPorRodado());
console.log(o);

console.log(v, oo + " .I.");
carrera.largoPromedio();
console.log(o);

console.log(v, oo + " .J. ");
console.log(carrera.buscarPorId(1));
carrera.aumentarPeso(1, 10);
console.log(carrera.buscarPorId(1));
console.log(o);

console.log(v, oo + " .K. ");
console.table(carrera.generarTanda(26, 7));
console.log(o);

console.log(v, oo + " .L. ");
carrera.calcularPodio(carrera.generarTanda(26, 7));
console.log(o);