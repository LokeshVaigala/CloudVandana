function reverseWordsInSentence(sentence) {
  const words = sentence.split(' '); // Split the sentence into words
  const reversedWords = [];

  for (let i = 0; i < words.length; i++) {
    const word = words[i];
    const reversedWord = word.split('').reverse().join('');
    reversedWords.push(reversedWord);
  }

  const reversedSentence = reversedWords.join(' '); // Join the reversed words into a sentence
  return reversedSentence;
}

// Example usage:
const inputSentence = "this is sunny day";
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence); // Outputs: "siht si ynnus yad"
