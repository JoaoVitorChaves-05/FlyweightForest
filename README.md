# FlyweightForest

Projeto simples que demonstra o padrao de design Flyweight com uma fabrica de arvores que reutiliza instancias com a mesma especie.

## Conceito
O padrao Flyweight reduz uso de memoria ao compartilhar objetos semelhantes. Neste exemplo, a classe `TreeFactory` mantem um pool de `Tree` e retorna a mesma instancia quando a especie ja existe. O estado intrinseco fica no flyweight (`species`) e o estado extrinseco e fornecido no `render` (id, size, leafs).

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
- Ao chamar `create` com a mesma especie, a instancia e reutilizada.
- O flyweight e imutavel e guarda apenas `species`; `id`, `size` e `leafs` sao extrinsecos e variam por uso.

## Autores
- Joao Vitor Mancio Chaves
- Felipe Bagnatori Rolim