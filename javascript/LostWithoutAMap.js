function maps1(x){
    var arr = [];
    for (let index = 0; index < x.length; index++) {
        arr[index] = x[index] * 2;
    }
    return arr;
}

function maps2(x){
    return x.map(n => n * 2);
}