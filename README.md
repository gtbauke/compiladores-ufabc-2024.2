# Projeto Compiladores

Integrantes:
- Gustavo Teodoro Bauke     RA: 11202130481
- Matheus Machado de Araujo RA: 11202130496

Link para o vídeo: [Compiladores 2024.2 UFABC](https://youtu.be/ArXWvvfrGA0)

## Executando o projeto

Projeto foi criado utilizando a versão 22 do Java.

Baixe a versão pré-compilada do projeto no [GitHub](https://github.com/gtbauke/compiladores-ufabc-2024.2/releases/tag/v1.0.0).

Na pasta onde o arquivo baixado está localizado, execute o seguinte comando:

```bash
java -jar compiladores-2024-2-ufabc.jar --target <TARGET> --input <INPUT> --output <OUTPUT>
```

onde 'TARGET' é um dos seguintes valores:
- 'java': para gerar código Java
- 'c': para gerar código C
- 'interpret': para interpretar o código
- 'repl': para abrir o REPL (modo iterativo)

os valores de 'INPUT' e 'OUTPUT' são os caminhos para os arquivos de entrada e saída, respectivamente. Sendo ambos opcionais.

Caso 'INPUT' não seja fornecido, o programa irá ler o arquivo 'input.isi' da pasta em que foi executado. Caso 'OUTPUT' não seja fornecido, o compilador imprimirá na tela a versão do código para as linguagens alvo, caso seja especificado, o compilador criará um arquivo com o resultado da compilação.

## Itens obrigatórios
- Possui 2 tipos de variáveis: implementamos Strings, ints, floats e booleans
- Possui estrutura If..else
- Possui estrutura de controle while/do while: implementamos também estrutura for
- Operações aritméticas executadas corretamente
- Atribuições realizadas corretamente
- Possui operações de Entrada e Saída
- Aceita números decimais
- Verificar se a variável já foi previamente delcarada
- Verificar se a variável foi declarada e não foi usada
- Verificar se uma variável está sendo usada sem ter valor inicial

## Itens opcionais
- Avaliador de expressões aritméticas: implementamos um REPL responsável por fazer a avaliação de expressões
- Inserção de operadores lógicos: inserimos os operadores AND, OR e NOT
- Geração de várias linguagens alvo: geramos código para as linguagens C e Java
- Um interpretador (runtime) para a linguagem
