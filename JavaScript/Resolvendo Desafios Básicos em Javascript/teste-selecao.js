let x = gets().split(" ");
let a = parseInt(x[0]);
let b = parseInt(x[1]);
let c = parseInt(x[2]);
let d = parseInt(x[3]);

if (b>c && d>a && (c+d) > (a+b) && c >= 0 && d >= 0 && a%2===0) {
    print("Valores aceitos");
} else {
    print("Valores nao aceitos");
}