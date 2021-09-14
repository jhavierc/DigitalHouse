const jsonHelper = require("./inventario")

let nombreArhivo = 'vehiculos.json';

let vehiculos = jsonHelper.leerJson(nombreArhivo);

console.log(vehiculos)

let vehiculoNuevo = {
    "marca": "Dodge",
    "modelo": "Caravan",
    "anio": 2001,
    "precio": 317621,
    "patente": "RDH130",
    "vendido": true
};

vehiculos.push(vehiculoNuevo);

jsonHelper.escribirJson(nombreArhivo, vehiculos);

console.log(jsonHelper.leerJson(nombreArhivo));



/*
let vehiculos = [{
        "marca": "Ford",
        "modelo": "Probe",
        "anio": 1992,
        "precio": 652770,
        "patente": "WAU329",
        "vendido": false
    },
    {
        "marca": "Dodge",
        "modelo": "Caravan",
        "anio": 2001,
        "precio": 317621,
        "patente": "RDH130",
        "vendido": true
    },
    {
        "marca": "Ford",
        "modelo": "Bronco",
        "anio": 1986,
        "precio": 135000,
        "patente": "ULD543",
        "vendido": false
    },
    {
        "marca": "Dodge",
        "modelo": "Ram 2500",
        "anio": 1997,
        "precio": 942278,
        "patente": "GDZ224",
        "vendido": false
    },
    {
        "marca": "Mercedes-Benz",
        "modelo": "CLK-Class",
        "anio": 2000,
        "precio": 943146,
        "patente": "JHC968",
        "vendido": false
    },
    {
        "marca": "Chevrolet",
        "modelo": "Impala",
        "anio": 1994,
        "precio": 441151,
        "patente": "WBA844",
        "vendido": false
    },
    {
        "marca": "Mitsubishi",
        "modelo": "Montero",
        "anio": 2000,
        "precio": 374326,
        "patente": "SAL913",
        "vendido": true
    },
    {
        "marca": "Lexus",
        "modelo": "GX",
        "anio": 2011,
        "precio": 303410,
        "patente": "FAF752",
        "vendido": false
    },
    {
        "marca": "Toyota",
        "modelo": "Land Cruiser",
        "anio": 2007,
        "precio": 932684,
        "patente": "AFR109",
        "vendido": false
    },
    {
        "marca": "Chevrolet",
        "modelo": "Malibu",
        "anio": 2006,
        "precio": 172447,
        "patente": "UDF868",
        "vendido": true
    },
    {
        "marca": "Lexus",
        "modelo": "HS",
        "anio": 2011,
        "precio": 563981,
        "patente": "AAX134",
        "vendido": true
    },
    {
        "marca": "Nissan",
        "modelo": "Altima",
        "anio": 1993,
        "precio": 490806,
        "patente": "WBA806",
        "vendido": false
    },
    {
        "marca": "Toyota",
        "modelo": "Xtra",
        "anio": 1995,
        "precio": 443983,
        "patente": "MCU947",
        "vendido": false
    },
    {
        "marca": "Mercury",
        "modelo": "Sable",
        "anio": 2008,
        "precio": 404945,
        "patente": "JTH240",
        "vendido": false
    },
    {
        "marca": "Dodge",
        "modelo": "Dakota",
        "anio": 1995,
        "precio": 574793,
        "patente": "WAV703",
        "vendido": false
    }
];
*/