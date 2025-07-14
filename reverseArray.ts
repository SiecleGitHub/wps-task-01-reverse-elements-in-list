// reverseArray.ts

// npm install --save-dev typescript ts-node
// npx tsc --init
// npx ts-node reverseArray.ts

function reverseArray<T>(arr: T[]): T[] {
  return arr.slice().reverse();
}

// Beispiel-Daten
const numbers = [1, 2, 3, 4, 5];
const strings = ['a', 'b', 'c', 'd'];

// Ergebnisse anzeigen
console.log('Original numbers:', numbers);
console.log('Reversed numbers:', reverseArray(numbers));

console.log('Original strings:', strings);
console.log('Reversed strings:', reverseArray(strings));

// Original numbers: [ 1, 2, 3, 4, 5 ]
// Reversed numbers: [ 5, 4, 3, 2, 1 ]
// Original strings: [ 'a', 'b', 'c', 'd' ]
// Reversed strings: [ 'd', 'c', 'b', 'a' ]
