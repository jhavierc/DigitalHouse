exports.sumar = (a, b) => {

    //if(a typeof number && b typeof number){
    return a + b;
    //}
    //return "Los parametros no son validos";
}

exports.restar = (a, b) => {
    return a - b;
}

exports.multiplicar = (a, b) => {
    return a * b;
}


exports.division = (a, b) => {
    return a / b;
}

exports.login = (user, pass) => {
    if (!user || !pass) {
        return false;
    }
    return "Bienvenido : " + user;
}

exports.lista = () => {
        return shoppingList = [
            'diapers',
            'kleenex',
            'trash bags',
            'paper towels',
            'milk',
        ];
    }
    //console.assert(sumar(1, 2) == 3, 'Exitoso: El sultado espereado de 1 y 2 es 3')
    //console.assert(sumar(1, 2) == 1, 'Error:  El sultado espereado de 1 y 2 es 3')