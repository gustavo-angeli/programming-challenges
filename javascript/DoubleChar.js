function doubleChar(str) {
    var newString = "";
    for (let index = 0; index < str.length; index++) {
        newString += str[index]+str[index];
    }
    return newString;
}