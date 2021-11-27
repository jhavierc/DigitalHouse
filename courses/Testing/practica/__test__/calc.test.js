//const { expect } = require('@jest/globals');
//const { number, describe } = require('yargs');
const { sumar, restar, multiplicar, division, login, lista } = require('../calc');

describe('Pruebas suma', () => {

    test('Suma correcta', () => {
        expect(sumar(1, 2)).toBe(3);
    })

    test('Suma correcta numeros negativos', () => {
        expect(sumar(-3, -2)).toBe(-5);
    })

    test('Suma incorrecta', () => {
        expect(sumar(15, 2)).not.toBe(19);
    })
    test('Sumar un numero null', () => {
        expect(sumar(null, -2)).not.toBe(10);
    })

    test('Suma de nulls', () => {
        expect(sumar(null, null)).not.toBe(10);
    })
})

describe('Pruebas resta', () => {

    test('Resta correcta', () => {
        expect(restar(2, 1)).toBe(1);
    })

    test('Suma correcta', () => {
        expect(restar(10, 2)).toBe(8);
    })
    test('Suma erroneo', () => {
        expect(restar(-10, -2)).not.toBe(12);
    })
})

describe('Pruebas multiplicacion', () => {

    test('Multiplicacion correcta', () => {
        expect(multiplicar(4, 5)).toBe(20);
    })

    test('Multiplicación  incorrecta', () => {
        expect(multiplicar(3, 4)).toBe(12);
    })
    test('Multiplicacion erronea', () => {
        expect(multiplicar(null, 2)).not.toBe(12);
    })
})

describe('Pruebas división', () => {

    test('División correcta', () => {
        expect(division(10, 2)).toBe(5);
    })

    test('División  correcta', () => {
        expect(division(4, 8)).toBe(0.5);
    })
    test('Division erronea', () => {
        expect(division(12, 0)).not.toBe(12);
    })
})

describe('Pruebas login', () => {

    test('Usuario incorrecto', () => {
        expect(login(null, "asd")).toBeFalsy();
    })

    test('Passeword correcto', () => {
        expect(login("carlos", null)).toBeFalsy();
    })

    test('Datos correctos', () => {
        expect(login("carlos", "asc")).toBe('Bienvenido : carlos');
    })

})


describe('Prueba listas', () => {

    test('Dato en lista', () => {
        expect(lista()).toContain('milk');
    })

})