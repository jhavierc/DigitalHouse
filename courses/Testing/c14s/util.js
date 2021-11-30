exports.generateText = (name, age) => {
    // Returns output text
    return `${name} (${age} years old)`;
};

exports.createElement = (type, text, className) => {
    // Creates a new HTML element and returns it
    const newElement = document.createElement(type);
    newElement.classList.add(className);
    newElement.textContent = text;
    return newElement;
};

exports.validateInput = (text, notEmpty, isNumber) => {
    // Validate user input with two pre-defined rules
    if (!text) {
        return false;
    }

    if (notEmpty && text.trim().length === 0) {
        console.log("entro aqui!!! 2");
        return false;
    }
    if (isNumber && text === NaN) {
        console.log("entro aqui!!! 3");
        return false;
    }
    console.log("entro aqui!!! 4");
    return true;
};