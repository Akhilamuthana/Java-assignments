function reverseWordsInSentence(sentence) {
    // Split the sentence into words using a space as the delimiter
    const words = sentence.split(' ');

    // Reverse each word and store them in an array
    const reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });

    // Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

const inputSentence = "Take a sentence as an input and reverse every word";
const reversedSentence = reverseWordsInSentence(inputSentence);

console.log("Original Sentence: " + inputSentence);
console.log("Reversed Sentence: " + reversedSentence);
