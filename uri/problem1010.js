var input = require("fs").readFileSync("stdin", "utf8");
var lines = input.split("\n");

var item1 = lines.shift().split(" ");
var item2 = lines.shift().split(" ");

console.log("Item 1: ", item1);
console.log("Item 2: ", item2);

let idItem1 = item1.shift();
let qtdItem1 = item1.shift();
let valorItem1 = item1.shift();
let idItem2 = item2.shift();
let qtdItem2 = item2.shift();
let valorItem2 = item2.shift();
let valorTotal = qtdItem1 * valorItem1 + qtdItem2 * valorItem2;

console.log("VALOR A PAGAR: R$ " + valorTotal.toFixed(2));
