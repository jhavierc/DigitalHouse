const fs = require('fs')

let carro = {
    marca: 'Mazda',
    linea: '3',
    cilindraje: '2000'
}
let carro2 = {
    marca: 'Chevrolet',
    linea: 'Optra',
    cilindraje: '2000'
}

let miscarros = []
miscarros.push(carro)
miscarros.push(carro2)

//fs.writeFileSync('archivo.json', JSON.stringify(carro)) //este remplaza todo el texto del archivo
fs.appendFileSync('archivo.json', JSON.stringify(miscarros)) //este agrega el nuevo texto al texto que ya existe en el archivo

let contenido = fs.readFileSync('archivo.json', 'utf-8')
console.log(contenido);
let carros = JSON.parse(contenido)
console.log(carros);


let array = [{ nombre: "Lean", edad: 27 }, { nombre: "Eze", edad: 49 }]
console.log(array[0].nombre);
console.log(array[0]['nombre']);