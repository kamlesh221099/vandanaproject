function reverseWords(input) {
  const words = input.split(" ");
  const reverseWords = words.map((word) => {
    return word.split("").reverse().join("");
  });

  const output = reverseWords.join(" ");
  return output;
}

const input = "This is a sunny day";
const reversedString = reverseWords(input);
console.log(reversedString);
