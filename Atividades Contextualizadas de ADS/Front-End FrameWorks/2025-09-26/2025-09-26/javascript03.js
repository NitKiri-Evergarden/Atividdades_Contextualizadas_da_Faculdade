let nome = "NitKiri";
let idade = 25;
let login = false;

console.log("O Usuario: " + nome + " tem Idade: " + idade + " esta logado: " + login);
console.log(`O usuario: ${nome} tem idade: ${idade} esta logado: ${login}`);

console.log(idade == 25); //true
console.log( idade == "25"); //true
console.log(idade === 25); //true
console.log(idade === "25"); //false