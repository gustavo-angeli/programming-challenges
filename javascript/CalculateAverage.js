function findAverage(array) {
    if (array.length === 0) {
        return 0;
    }
    var value = array[0];

    for (let index = 1; index < array.length; index++) {
        value += array[index];
        
    }

    return value / array.length;
}