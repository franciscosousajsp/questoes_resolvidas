<h1> Desafio de programação - academia capgemini - 2022 </h1>

O desafio é composta por 03 questoes para testar a lógicas dos candidatos, que estão participando desse terceiro desafio, 
Então conseguir  solucionar todas as questoes usando o java usando classe e metodos.
Foram feitas e testada de acordo com descrição do exercicio, também foi utilizado java na seguinte versão
version "15.0.1" 2020-10-20 Java(TM) SE Runtime Environment (build 15.0.1) Java HotSpot(TM) 64-Bit Server VM (build 15.0.1+9-18, mixed mode, sharing)

<h4>Ferramenta Utilizada</h4>
Eclipse IDE for Enterprise Java and Web Developers

<h4>Questao 01</h4>
Desenvolva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e
espaços.

<h4>Solução da Questao 01</h4>
Foram criada duas classe com o nome principal uma é a Main que servirá para testar o algoritmo.
a outra classe com o nome asterisco que composta do método mostraEscada aonde nela contém a estrutura de repetição FOR 
que fará a manipulação dos espaço e do asterisco de acordo com o valor fornecida pelo o usuario.

<h4>Questao 02</h4>
Desenvolva um algoritmo para uma criação de uma senha forte com os seguintes critérios:
Possui no mínimo 6 caracteres, Contém no mínimo 1 digito, Contém no mínimo 1 letra em minúsculo
Contém no mínimo 1 letra em maiúsculo, Contém no mínimo 1 caractere especial.

<h4>Solução da Questao 02</h4>
Foram criada duas classe com o nome principal uma é a Main que servirá para testar o algoritmo.
a outra classe com o nome senha é composta por dois metodos:
criacaoSenha - servirá para concatenar as strings caso o usuario não digitar a senha completa.
testarSenha - servirá para testar todos os criterios para a criação da senha forte.

<h4>Questao 03</h4>
Desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.

<h4>Solução da Questao 03</h4>
Foram criada duas classe com o nome principal uma é a Main que servirá para testar o algoritmo.
a outra classe com o nome senha é composta por dois metodos:
criaVetor - Recebe o parametro que será atribuido pra um vetor de char e no final compara se existe caracteres iguais
montandoAnagrama - recebe o vetor de char limitado com a ultima variavel repetida esse vetor será atribuido pra duas string, e também recebe o tamanho do vetor. 
testaAnagrama - recebe as duas String vindo do método montandoAnagrama, também testará se é um anagrama retornará true ou false de acordo com a situação.
