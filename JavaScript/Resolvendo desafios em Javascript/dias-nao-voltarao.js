let lines = gets().split("\n");

let n = parseInt(lines.shift());
let frase = "life is not a problem to be solved";
if (n <= 34 && n >= 1)console.log(frase.substr(0, n).toUpperCase());