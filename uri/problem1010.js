var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split("\n");

let codigo1 = parseInt(lines.shift());
let codigo2 = parseInt(lines.shift());
let qtdPeca1 = parseInt(lines.shift());
let qtdPeca2 = parseInt(lines.shift());
let valorPeca1 = parseFloat(lines.shift());
let valorPeca2 = parseFloat(lines.shift());

let valorTotal = qtdPeca1 * valorPeca1 + qtdPeca2 * valorPeca2;
console.log("VALOR A PAGAR: R$ " + valorTotal);
