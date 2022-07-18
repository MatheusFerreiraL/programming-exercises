let str = "07:05:45PM";
let shift = 0; //flag -> 0 = AM, 1 = PM
let hours = parseInt(str.substring(0, 2));
let time = [];
let minutes = str.substring(3, 5);
let seconds = str.substring(6, 8);

for (let letter of str) {
  if (letter === "P") {
    shift = 1;
  }
}

if (shift > 0 && hours < 12) {
  hours += 12;
  time.push(hours.toString(), minutes, seconds);
  time = time.join(":");
  console.log(time);
} else if (shift > 0 && hours == 12) {
  hours -= 12;
  time.push(hours.toString(), minutes, seconds);
  time = time.join(":");
  console.log(time);
} else {
  time.push(hours.toString(), minutes, seconds);
  time = time.join(":");
  console.log(time);
}
