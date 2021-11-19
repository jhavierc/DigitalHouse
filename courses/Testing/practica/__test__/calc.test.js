//const { expect } = require('@jest/globals');
//const { number, describe } = require('yargs');
const sumar = require('../calc');

describe('Conjunto de pruebas', () => {

    test('Suma 2 numeros', () => {
        expect(sumar(1, 2)).toBe(3);
    })

    test('Suma 2 numeros', () => {
        expect(sumar(15, 2)).toBe(17);
    })
    test('Suma 2 numeros', () => {
        expect(sumar(15, -2)).toBe(13);
    })
})