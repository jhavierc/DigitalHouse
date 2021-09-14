const v = "\x1b[32m%s\x1b[0m";
const o = "*".repeat(80) + "\n";
const oo = "*".repeat(25);
// Te proveemos la siguiente plantilla que tiene tres partes:
// - Array de objetos que está colapsado aquí debajo.
// - Desarrollo de las consignas, donde escribirás el código que responda a los enunciados
// - Ejecución de las consignas, donde ejecutarás los métodos correspondientes mostrando por consola sus resultados
const nombre = "Carlos Javier Cepeda";
const tema = "TEMA 1";

const profesionales = [{
        id: 0,
        estaHabilitado: false,
        honorarioConsulta: 2007.68,
        edad: 29,
        nombre: "huber Wilkins",
        email: "huberwilkins@speedbolt.com",
        especialidad: "Neumonologia",
        cantidadConsultas: 0,
        puntaje: 8,
    },
    {
        id: 1,
        estaHabilitado: true,
        honorarioConsulta: 2325.56,
        edad: 21,
        nombre: "goldie Haley",
        email: "goldiehaley@speedbolt.com",
        especialidad: "Cardiologia",
        cantidadConsultas: 0,
        puntaje: 7,
    },
    {
        id: 2,
        estaHabilitado: false,
        honorarioConsulta: 2208.17,
        edad: 36,
        nombre: "pena Landry",
        email: "penalandry@speedbolt.com",
        especialidad: "Dermatologia",
        cantidadConsultas: 0,
        puntaje: 7,
    },
    {
        id: 3,
        estaHabilitado: false,
        honorarioConsulta: 3266.71,
        edad: 20,
        nombre: "leanne Burch",
        email: "leanneburch@speedbolt.com",
        especialidad: "Neumonologia",
        cantidadConsultas: 1,
        puntaje: 5,
    },
    {
        id: 4,
        estaHabilitado: false,
        honorarioConsulta: 2674.09,
        edad: 31,
        nombre: "haynes Fuentes",
        email: "haynesfuentes@speedbolt.com",
        especialidad: "Cardiologia",
        cantidadConsultas: 0,
        puntaje: 4,
    },
    {
        id: 5,
        estaHabilitado: true,
        honorarioConsulta: 1851.37,
        edad: 27,
        nombre: "tamika Fuentes",
        email: "tamikanewman@speedbolt.com",
        especialidad: "Cardiologia",
        cantidadConsultas: 0,
        puntaje: 6,
    },
    {
        id: 6,
        estaHabilitado: true,
        honorarioConsulta: 2568.94,
        edad: 34,
        nombre: "russo Baldwin",
        email: "russobaldwin@speedbolt.com",
        especialidad: "Dermatologia",
        cantidadConsultas: 4,
        puntaje: 10,
    },
    {
        id: 7,
        estaHabilitado: true,
        honorarioConsulta: 2601.76,
        edad: 36,
        nombre: "dodson Shaffer",
        email: "dodsonshaffer@speedbolt.com",
        especialidad: "Cardiologia",
        cantidadConsultas: 0,
        puntaje: 0,
    },
    {
        id: 8,
        estaHabilitado: true,
        honorarioConsulta: 1949.92,
        edad: 40,
        nombre: "guerra Bright",
        email: "guerrabright@speedbolt.com",
        especialidad: "Neumonologia",
        cantidadConsultas: 8,
        puntaje: 0,
    },
    {
        id: 9,
        estaHabilitado: true,
        honorarioConsulta: 3898.11,
        edad: 20,
        nombre: "dina Navarro",
        email: "dinanavarro@speedbolt.com",
        especialidad: "Cardiologia",
        cantidadConsultas: 6,
        puntaje: 8,
    },
    {
        id: 10,
        estaHabilitado: false,
        honorarioConsulta: 2745.73,
        edad: 27,
        nombre: "stafford Watts",
        email: "staffordwatts@speedbolt.com",
        especialidad: "Cardiologia",
        cantidadConsultas: 0,
        puntaje: 6,
    },
    {
        id: 11,
        estaHabilitado: false,
        honorarioConsulta: 2808.98,
        edad: 39,
        nombre: "joni Avery",
        email: "joniavery@speedbolt.com",
        especialidad: "Neumonologia",
        cantidadConsultas: 3,
        puntaje: 9,
    },
    {
        id: 12,
        estaHabilitado: true,
        honorarioConsulta: 1941.13,
        edad: 21,
        nombre: "mayra Tran",
        email: "mayratran@speedbolt.com",
        especialidad: "Oftamologia",
        cantidadConsultas: 8,
        puntaje: 3,
    },
    {
        id: 13,
        estaHabilitado: false,
        honorarioConsulta: 3930.0344999999998,
        edad: 23,
        nombre: "ward Dale",
        email: "warddale@speedbolt.com",
        especialidad: "Cardiologia",
        cantidadConsultas: 1,
        puntaje: 3,
    },
];

/*******************************/
/* Desarrollo de las consignas */
/*******************************/

// A
const appProfesionales = {
    profesionales: profesionales
}

//console.log(appProfesionales.profesionales);
// B
function listarProfesionales() {
    if (appProfesionales.profesionales) {
        for (let index = 0; index < appProfesionales.profesionales.length; index++) {
            const element = appProfesionales.profesionales[index];
            console.log(` id ${element.id} ${element.estaHabilitado?'ok':'inactivo'}, ${element.especialidad}, ${element.nombre}, valor consulta $${element.honorarioConsulta}, puntaje: ${element.puntaje}`);
        }
    }

}

// C
function filtrarMejoresPuntajes() {
    let listaRetorno = []
    if (appProfesionales.profesionales) {
        for (let index = 0; index < appProfesionales.profesionales.length; index++) {
            if (appProfesionales.profesionales[index].puntaje >= 7) {
                listaRetorno.push(appProfesionales.profesionales[index])
            }
        }
    }
    return listaRetorno;
}
// D
function buscarPorID(idProfesional) {
    if (appProfesionales.profesionales) {
        for (let index = 0; index < appProfesionales.profesionales.length; index++) {
            if (appProfesionales.profesionales[index].id === idProfesional) {
                return appProfesionales.profesionales[index];
            }
        }
    }
    return null;
}
// E
function habilitarProfesional(idProfesional) {
    let profesional = buscarPorID(idProfesional);
    if (profesional) {
        profesional.estaHabilitado = true;
    }
}

// F
function corregirNombres() {
    if (appProfesionales.profesionales) {
        for (let index = 0; index < appProfesionales.profesionales.length; index++) {
            appProfesionales.profesionales[index].nombre = cambiarLetraAMayusculas(appProfesionales.profesionales[index].nombre);
        }
    }
}

//Funcion extra que permite cambiar las primeras letras del nombre en mayusculas
function cambiarLetraAMayusculas(nombre) {
    var nombres = nombre.split(" ");
    let nombresSeparado = [];
    for (let i = 0; i < nombres.length; i++) {
        nombresSeparado.push(nombres[i].charAt(0).toUpperCase() + nombres[i].slice(1));
    }
    return nombresSeparado.join().replace(',', ' ');
}

/******************************/
/* Ejecución de las consignas */
/******************************/
console.table([{ alumno: nombre, tema: tema }]);

console.log(v, "\n" + oo + "   B. listarProfesional");
listarProfesionales();
console.log(o);

console.log(v, oo + "   C. filtrarMejoresPuntajes");
console.log(filtrarMejoresPuntajes());
console.log(o);

console.log(v, oo + " D. buscarPorId(1)");
let idProfesionalBuscar = 1;
let profesional = buscarPorID(idProfesionalBuscar);
if (profesional) {
    console.log(profesional);
} else {
    console.log('El profesional no existe!!');
}

console.log(v, oo + "  E. habilitarProfesional");
habilitarProfesional(2);
console.log(o);

console.log(v, oo + " F. corregirNombres");
corregirNombres();
console.log(appProfesionales.profesionales);
console.log(o);