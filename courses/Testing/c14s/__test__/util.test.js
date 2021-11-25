const { generateText } = require('../util.js');

test('should generateText', () => {
    expect(generateText('Carlos','35')).toBe('Carlos (35 years old)') 
})
test('should generateText', () => {
    expect(generateText('Andres','35')).toBe('Andres (35 years old)') 
})
