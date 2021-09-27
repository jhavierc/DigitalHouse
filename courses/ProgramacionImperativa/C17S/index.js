//callbacks
const nombres = ['Martin', 'Homero', 'Cosme', 'Steven', 'Adam'];

function buscarNombre(nombre, callback) {

    let variable = nombres.filter(function(element) {
        return nombre == element;
    });
    return callback(variable);
}

function mostrarResultado(parametro) {
    if (parametro.length == 0) {
        return "Nombre no encontrado";
    }
    return "El Nombre fue encontrado";
}


//Ejemplo de invocacion
console.log(buscarNombre('Martin', mostrarResultado));


const array = [22, 33, 4];
let param = "";
for (let i = 0; i < array.length; i++) {
    param = param + "ids=" + array[i] + "&";
}
console.log(param);