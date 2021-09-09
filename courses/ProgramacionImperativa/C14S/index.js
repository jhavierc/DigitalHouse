const v = "\x1b[32m%s\x1b[0m";
const o = "*".repeat(80) + "\n";
const oo = "*".repeat(25);
// Te proveemos la siguiente plantilla que tiene tre partes:
// - Array de objetos que está colapsado aquí debajo.
// - Desarrollo de las consignas, donde escribirás el código que responda a los enunciados
// - Ejecución de las consignas, donde ejecutarás los métodos correspondientes mostrando por consola sus resultados
const nombre = "tu nombre aquí";
const tema = "el tema que te tocó";

const departamentos = [{
        id: 1,
        propietarios: "Dueño: Luis Perez",
        cantidadHabitacion: 2,
        disponible: true,
        aceptaMascotas: true,
        cantidadPersonas: 2,
        precioAlquiler: 2395.8
    },
    {
        id: 2,
        propietarios: "Dueños: Luis Perez y María Martinez",
        cantidadHabitacion: 1,
        disponible: false,
        aceptaMascotas: true,
        cantidadPersonas: 2,
        precioAlquiler: 1597.2
    },
    {
        id: 3,
        propietarios: "Dueña: Laura García",
        cantidadHabitacion: 2,
        disponible: false,
        aceptaMascotas: false,
        cantidadPersonas: 4,
        precioAlquiler: 3993
    },
    {
        id: 4,
        propietarios: "Dueña: Julieta Tols",
        cantidadHabitacion: 1,
        disponible: true,
        aceptaMascotas: true,
        cantidadPersonas: 1,
        precioAlquiler: 1996.5
    },
    {
        id: 5,
        propietarios: "Dueños: Julieta Tols y Pablo Groming",
        cantidadHabitacion: 1,
        disponible: false,
        aceptaMascotas: false,
        cantidadPersonas: 1,
        precioAlquiler: 11979
    },
    {
        id: 6,
        propietarios: "Dueño: Pablo Groming",
        cantidadHabitacion: 2,
        disponible: false,
        aceptaMascotas: true,
        cantidadPersonas: 3,
        precioAlquiler: 4658.5
    },
    {
        id: 7,
        propietarios: "Dueño: Luis Perez",
        cantidadHabitacion: 2,
        disponible: true,
        aceptaMascotas: true,
        cantidadPersonas: 3,
        precioAlquiler: 3327.5
    },
    {
        id: 8,
        propietarios: "Dueña: Julieta Tols",
        cantidadHabitacion: 3,
        disponible: false,
        aceptaMascotas: true,
        cantidadPersonas: 4,
        precioAlquiler: 7986
    },
    {
        id: 9,
        propietarios: "Dueñas: Julieta Tols y Laura García",
        cantidadHabitacion: 3,
        disponible: true,
        aceptaMascotas: true,
        cantidadPersonas: 4,
        precioAlquiler: 7986
    },
    {
        id: 10,
        propietarios: "Dueñas: Julieta Tols y Laura García",
        cantidadHabitacion: 3,
        disponible: false,
        aceptaMascotas: true,
        cantidadPersonas: 4,
        precioAlquiler: 7986
    },
    {
        id: 11,
        propietarios: "Dueño: Luis Perez",
        cantidadHabitacion: 3,
        disponible: true,
        aceptaMascotas: true,
        cantidadPersonas: 4,
        precioAlquiler: 7986
    },
    {
        id: 12,
        propietarios: "Dueño: Juan Pablo Martinez",
        cantidadHabitacion: 3,
        disponible: false,
        aceptaMascotas: true,
        cantidadPersonas: 4,
        precioAlquiler: 7986
    },
    {
        id: 13,
        propietarios: "Dueño: Juan Pablo Martinez",
        cantidadHabitacion: 2,
        disponible: true,
        aceptaMascotas: true,
        cantidadPersonas: 2,
        precioAlquiler: 4059.55
    },
    {
        id: 14,
        propietarios: "Dueño: Juan Pablo Martinez",
        cantidadHabitacion: 1,
        disponible: true,
        aceptaMascotas: true,
        cantidadPersonas: 2,
        precioAlquiler: 3993
    },
    {
        id: 15,
        propietarios: "Dueños: Martín Gutierrez y José Torres",
        cantidadHabitacion: 0,
        disponible: false,
        aceptaMascotas: true,
        cantidadPersonas: 1,
        precioAlquiler: 798.6
    },
    {
        id: 16,
        propietarios: "Dueños: Martín Gutierrez y José Torres",
        cantidadHabitacion: 0,
        disponible: false,
        aceptaMascotas: true,
        cantidadPersonas: 1,
        precioAlquiler: 798.6
    },
    {
        id: 17,
        propietarios: "Dueños: Martín Gutierrez y José Torres",
        cantidadHabitacion: 0,
        disponible: true,
        aceptaMascotas: true,
        cantidadPersonas: 1,
        precioAlquiler: 665.5
    }
]


/*******************************/
/* Desarrollo de las consignas */
/*******************************/
const inmobiliaria = {
    departamentos: departamentos,
    listarDepartamentos: function(array) {
        for (let i = 0; i < array.length; i++) {
            console.log(` id ${array[i].id}, precio $${array[i].precioAlquiler}, ${array[i].disponible?'está disponible':'no disponible'},${array[i].cantidadHabitacion} ambientes, máximo ${array[i].cantidadPersonas}, ${array[i].aceptaMascotas?'acepta mascotas':'no se acepta mascotas'}, propietarios:${array[i].propietarios}`);
        }
    },
    departamentosDisponibles: function() {
        let deptos = []
        for (let i = 0; i < this.departamentos.length; i++) {
            if (this.departamentos[i].disponible) {
                deptos.push(this.departamentos[i]);
                console.log(JSON.stringify(this.departamentos[i]));
            }
        }
        return deptos;
    },
    buscarPorId: function(idDepartamento) {
        for (let i = 0; i < this.departamentos.length; i++) {
            if (this.departamentos[i].id == idDepartamento) {
                return this.departamentos[i];
            }

        }
    },
    buscarPorPrecio: function(precio) {
        let deptos = []
        for (let i = 0; i < this.departamentos.length; i++) {
            if (this.departamentos[i].disponible && this.departamentos[i].precioAlquiler <= precio) {
                deptos.push(this.departamentos[i]);
            }

        }
        /* Opcion 2 */
        /*
        let deptosDisponibles = this.departamentosDisponibles()
        for (let i = 0; i < deptosDisponibles.length; i++) {
            if (deptosDisponibles[i].precioAlquiler <= precio) {
                deptos.push(deptosDisponibles[i]);
            }

        }
        */
        return deptos;
    },
    precioConImpuesto: function(impuesto) {
        let deptos = this.departamentos;
        for (let i = 0; i < deptos.length; i++) {
            deptos[i].precioAlquiler = deptos[i].precioAlquiler + ((deptos[i].precioAlquiler * impuesto) / 100);
        }
        return deptos;
    },
    simplificarPropietarios: function() {
        for (let i = 0; i < this.departamentos.length; i++) {
            this.departamentos[i].propietarios = this.departamentos[i].propietarios.replace("Dueños", "Prop.");
            this.departamentos[i].propietarios = this.departamentos[i].propietarios.replace("Dueño", "Prop.");
            this.departamentos[i].propietarios = this.departamentos[i].propietarios.replace("Dueñas", "Prop.");
            this.departamentos[i].propietarios = this.departamentos[i].propietarios.replace("Dueña", "Prop.");
        }
        return this.departamentos;
    }
}


/******************************/
/* Ejecución de las consignas */
/******************************/
console.table([{ alumno: nombre, tema: tema }]);

console.log(v, "\n" + oo + "   B. listarDepartamentos");
inmobiliaria.listarDepartamentos(departamentos);
console.log(o);

console.log(v, oo + "   C. departamentosDisponibles");
inmobiliaria.departamentosDisponibles();
console.log(o);

console.log(v, oo + " D. buscarPorId");
let depto = inmobiliaria.buscarPorId(100);
console.log(` ${depto == undefined?'El departamento no existe':depto}`);
console.log(o);

console.log(v, oo + "  E. buscarPorPrecio");
let listaDeptos = inmobiliaria.buscarPorPrecio(5000)
console.log(listaDeptos);
console.log(o);

console.log(v, oo + " F. precioConImpuesto");
let listaDeptoImpuestos = inmobiliaria.precioConImpuesto(1.9)
console.log(listaDeptoImpuestos);
console.log(o);

console.log(v, oo + " G. simplificarPropietarios");
// Ejecución aquí
console.log(inmobiliaria.simplificarPropietarios());
console.log(o);