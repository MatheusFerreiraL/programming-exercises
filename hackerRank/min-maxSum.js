const arr = [1, 3, 5, 7, 9];
let lower = arr[0];
let greater = 0;
let max = 0;
let min = 0;

for (let number of arr) {
  if (number > greater) {
    greater = number;
  }
  if (number < lower) {
    lower = number;
  }
  max += number;
  min += number;
}
max -= lower;
min -= greater;

console.log(min, max);
