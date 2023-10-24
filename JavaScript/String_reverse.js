function reverseWords(sentence) {
  let words = [];
  let currentWord = '';
  for (let i = 0; i < sentence.length; i++) {
    if (sentence[i] !== ' ') {
      currentWord = sentence[i] + currentWord;
    } else {
      words.push(currentWord);
      currentWord = '';
    }
  }
  words.push(currentWord); // Handle the last word
  let reversedWords = words.join(' ');
  return reversedWords;
}

// Example usage:
let inputSentence = "This is a sunny day";
let reversed = reverseWords(inputSentence);
console.log(reversed);
