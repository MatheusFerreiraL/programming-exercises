const arr = [-4, 3, -9, 0, 4, 1];
let negative = 0;
let positive = 0;
let zero = 0;

for (let number of arr) {
  number < 0 ? ++negative : number > 0 ? ++positive : ++zero;
}
negative = negative / arr.length;
positive = positive / arr.length;
zero = zero / arr.length;

console.log(positive.toFixed(6));
console.log(negative.toFixed(6));
console.log(zero.toFixed(6));
