const { generateText, validateInput } = require('../util.js');


describe('Test function generateText', () => {
    test('test ok', () => {
        expect(generateText('Carlos', '35')).toBe('Carlos (35 years old)')
    })
    test('test error', () => {
        expect(generateText('Andres', '40')).not.toBe('Andres (30 years old)')
    })
})


describe('Test function validateInput', () => {

    test('test sin parametros', () => {
        expect(validateInput()).toBeFalsy()
    })

    test('test ok', () => {
        expect(validateInput('hola', true, false)).toBeTruthy()
    })

    test('test primer parametro error', () => {
        expect(validateInput(" ", true)).toBeFalsy()
    })

    test('test con NAN en texto', () => {
        expect(validateInput(NaN, false, true)).toBeFalsy()
    })


    test('test tercero true error', () => {
        expect(validateInput("", false, true)).toBeFalsy()
    })


})