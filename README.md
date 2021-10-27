# [Programação Orientada a Objetos 2020 2021](https://elearning.ual.pt/course/view.php?id`2334) - [UAL](https://autonoma.pt/)

## Laboratório 3

Pretende-se a implementação da estrutura de dados *lista simplesmente ligada*, em Java.

Uma lista simplesmente ligada é suportada por um conjunto de nós que guardam os vários elementos da lista, e se associam entre si. Cada nó conhece o próximo nó na lista.

A lista mantém o primeiro nó (i.e., raiz), o número de elemento, e, eventualmente, o último nó.

# Tarefas

## Parte 1

Construir a classe nó de lista simplesmente ligada, com o nome `SingleListNode`. Deve incluir os seguintes métodos:

- `getElement()` - Obter elemento
- `getNext()` - Obter o próximo nó
- `setNext(SingleListNode  node)` - Alterar o próximo no

## Parte 2

Construir a classe lista simplesmente ligada, com o nome `SinglyLinkedList`. Deve incluir os seguintes métodos:

- `getFirst()` - Obter o primeiro elemento
- `getLast()` - Obter o último elemento
- `get(int position)` - Obter o elemento na posição *n*
- `insertFirst(Object element)` - Inserir elemento no início da lista
- `insertLast(Object element)` - Inserir elemento no final da lista
- `insert(Object element, int position)` -  Inserir elemento na posição *n* da lista;
- `removeFirst()` - Remover elemento do início da lista
- `removeLast()` - Remover elemento do final da lista
- `remove(int position)` - Remover elemento da posição *n* da lista

## Parte 3

1. Construir uma classe para o iterador da lista, com o nome `SinglyLinkedListIterator`. Deve incluir os seguintes métodos:
   - `hasNext()` - Verificar se existe próximo elemento
   - `next()` - Avançar para o próximo elemento
   - `rewind()` - Recomeçar
2. Adicionar método à lista para obter um iterador.

## Parte 4

Construir testes unitários para o nó e lista. Deve testar todos os métodos das partes 1 e 2.

## Parte 5

1. Atualizar os testes unitários da lista para incluir o método gerador de iterador;
2. Construir testes unitários para o iterador.
