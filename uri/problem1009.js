var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split("\n");

let nome = lines.shift();
let salarioFixo = parseFloat(lines.shift());
let totalVendas = parseFloat(lines.shift());

let comissao = totalVendas * 0.15;
let salarioFinal = salarioFixo + comissao;

console.log("TOTAL = R$ " + salarioFinal.toFixed(2));
