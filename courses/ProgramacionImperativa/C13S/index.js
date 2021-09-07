//Ejecicio Banco

let ArrayCuentas = [{
        nroCuenta: 5486273622,
        tipoDeCuenta: "Cuenta Corriente",
        saldoEnPesos: 27771,
        titularCuenta: "Abigael Natte",
    },
    {
        nroCuenta: 1183971869,
        tipoDeCuenta: "Caja de Ahorro",
        saldoEnPesos: 8675,
        titularCuenta: "Ramon Connell",
    },
    {
        nroCuenta: 9582019689,
        tipoDeCuenta: "Caja de Ahorro",
        saldoEnPesos: 27363,
        titularCuenta: "Jarret Lafuente",
    },
    {
        nroCuenta: 1761924656,
        tipoDeCuenta: "Cuenta Corriente",
        saldoEnPesos: 32415,
        titularCuenta: "Ansel Ardley",
    },
    {
        nroCuenta: 7401971607,
        tipoDeCuenta: "Cuenta Unica",
        saldoEnPesos: 18789,
        titularCuenta: "Jacki Shurmer",
    },
];


let Banco = {
    clientes: ArrayCuentas,
    consultarCliente: function(titular) {
        for (let i = 0; i < this.clientes.length; i++) {
            if (this.clientes[i].titularCuenta == titular) {
                return this.clientes[i];
            }
        }
    },
    deposito: function(titular, monto) {
        for (let i = 0; i < this.clientes.length; i++) {
            if (this.clientes[i].titularCuenta == titular) {
                this.clientes[i].saldoEnPesos += monto;
                console.log(`Depósito realizado, su nuevo saldo es  ${this.clientes[i].saldoEnPesos}`);
            }
        }
    },
    extraccion: function(titular, montoARetirar) {
        for (let i = 0; i < this.clientes.length; i++) {
            if (this.clientes[i].titularCuenta == titular) {
                if (this.clientes[i].saldoEnPesos > 0) {
                    this.clientes[i].saldoEnPesos = this.clientes[i].saldoEnPesos - montoARetirar;
                    console.log(`Extracción realizada correctamente, su nuevo saldo es  ${this.clientes[i].saldoEnPesos}`);
                } else {
                    console.log("Fondos insuficientes");
                }


            }
        }
    }
}

//console.log(Banco);
let cliente = Banco.consultarCliente("Ramon Connell");
console.log(cliente);
Banco.deposito("Abigael Natte", 9);
Banco.extraccion("Abigael Natte", 1000);

//--- BONUS EXTRA ---
//Programa: Propiedad Unica
let array = [{ nombre: "Lean", edad: 27 }, { nombre: "Eze", edad: 49 }]

function propiedadUnica(array, propiedad) {
    let arraySalida = [];
    for (let i = 0; i < array.length; i++) {
        if (array[i].hasOwnProperty(propiedad)) {
            let obj = {
                [propiedad]: array[i][propiedad]
            };
            arraySalida.push(obj);
        }
    }
    return arraySalida;
}
console.log(propiedadUnica(array, "nombre"));
console.log(propiedadUnica(array, "edad"));

//Calculadora de notas
let nota = {
    descripcion: "",
    valor: 22.1
}

let alumno = {
    nombre: "Carlos Cepeda",
    numeroLegajo: 7777,
    listaNotas: [],
    agregarNotas: function(nota) {
        this.listaNotas.push(nota);
    },
    calcularPromedio: function() {
        let total = 0;
        for (let i = 0; i < this.listaNotas.length; i++) {
            total += this.listaNotas[i];
        }
        return total / this.listaNotas.length;
    },
    estaAprobado(notaBase) {
        if (this.calcularPromedio() >= notaBase) {
            console.log("El estudiante esta aprobado");
        } else {
            console.log("El estudiante reprobo");
        }
    }
}

alumno.agregarNotas(4);
alumno.agregarNotas(4.6);
alumno.agregarNotas(3.9);
alumno.agregarNotas(5);
alumno.estaAprobado(4);