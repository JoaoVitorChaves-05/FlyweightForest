# FlyweightForest

Projeto simples que demonstra o padrao de design Flyweight com uma fabrica de arvores que reutiliza instancias com os mesmos atributos.

## Conceito
O padrao Flyweight reduz uso de memoria ao compartilhar objetos semelhantes. Neste exemplo, a classe `TreeFactory` mantem um pool de `Tree` e retorna a mesma instancia quando `size`, `leafs` e `species` sao iguais. O estado intrinseco fica no flyweight (`size`, `leafs`, `species`) e o estado extrinseco e fornecido no `render` (`id`).

## Estrutura
- `classes/Main.java`: executa o exemplo e imprime os dados usando `render`.
- `classes/Tree.java`: implementacao concreta do flyweight.
- `classes/TreeFactory.java`: fabrica com cache de instancias por especie.
- `interfaces/IFlyweightTree.java`: contrato do flyweight.
- `interfaces/ITreeFactory.java`: contrato da fabrica.

## Como executar
1) Compile:

```bash
javac classes/*.java interfaces/*.java
```

2) Rode:

```bash
java classes.Main
```

## Observacoes
- Ao chamar `create` com os mesmos valores de `size`, `leafs` e `species`, a instancia e reutilizada.
- O flyweight e imutavel e guarda `size`, `leafs` e `species`; apenas `id` e extrinseco e varia por uso.

## Autores
- Joao Vitor Mancio Chaves
- Felipe Bagnatori Rolim