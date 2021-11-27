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

    test('test ok', () => {
        expect(validateInput('hola', 2, 2)).toBeTruthy()
    })

    test('test primer parametro error', () => {
        expect(validateInput(null, 2, 2)).toBeFalsy()
    })

    test('test segundo true error', () => {
        expect(validateInput('', true, false)).toBeFalsy()
    })

    test('test tercero true error', () => {
        expect(validateInput("", true, true)).toBeFalsy()
    })


})