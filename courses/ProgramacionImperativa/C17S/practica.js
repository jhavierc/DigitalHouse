let nombre = "carlos";

const persona = {
    nombre: 'Agustin',

    decirNombre: function() {
        console.log(this.nombre)
    },
    decirNombreFuncionFlecha: () => {
        let nombre = 'cepeda';
        console.log(this.nombre);
    }

}

persona.decirNombreFuncionFlecha();