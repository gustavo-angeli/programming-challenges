function squareSum(numbers){
    if (numbers.length === 0) {
        return 0;
    }

    var squareSum = 0;

    numbers.forEach(element => {
        squareSum += element * element;
    });
    
    return squareSum;
}