const numbers = [5, 2, 9, 1, 5, 6];

// Custom sorting function for descending order
function compareDescending(a, b) {
  return b - a;
}

// Using the sort() method with the custom comparison function
numbers.sort(compareDescending);

console.log(numbers);

