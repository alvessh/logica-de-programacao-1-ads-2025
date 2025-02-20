# Unidade I - Conceitos e a Lógica de Programas de Computador

## Introdução à Programação e sua Importância

### O que é Programação?

Programação é o processo de escrever e organizar instruções que um computador pode entender e executar. Essas instruções são chamadas de código-fonte e são escritas em linguagens de programação, como Python, Java, C, entre outras.

Um computador, por si só, não é capaz de tomar decisões ou realizar tarefas de forma independente. Ele precisa ser programado para executar determinadas ações de acordo com as necessidades do usuário.

### Por que a Programação é Importante na Computação?

A programação é essencial na computação porque permite:

- **Automatizar processos**: Programas podem executar tarefas repetitivas de forma rápida e eficiente.
- **Criar soluções tecnológicas**: Desde sistemas operacionais até aplicativos móveis e sistemas embarcados.
- **Resolver problemas complexos**: A programação possibilita a análise e a resolução de problemas lógicos e matemáticos.
- **Melhorar a eficiência**: Um código bem estruturado pode otimizar processos, economizando tempo e recursos.


## Tipos de Programação

A programação pode ser classificada em diferentes tipos, dependendo da área de aplicação:

- **Desktop**: Desenvolvimento de aplicativos para computadores, como editores de texto e softwares de produtividade.
- **Web**: Desenvolvimento de páginas e aplicações para a internet.
- **Mobile**: Aplicações voltadas para dispositivos móveis, como smartphones e tablets.
- **Embarcado**: Programação para dispositivos específicos, como microcontroladores e sistemas industriais.

## Variáveis na Programação e na Computação

As variáveis são fundamentais na programação, pois armazenam valores que podem ser manipulados pelos programas. Em diferentes linguagens, as variáveis podem ser declaradas e utilizadas de diferentes formas.

### Exemplos de Declaração de Variáveis

#### Python
```python
x = 10
nome = "João"
preco = 19.99
print(f"O valor de x é {x}, o nome é {nome} e o preço é {preco}")
```

#### C
```c
#include <stdio.h>

int main() {
    int x = 10;
    char nome[] = "João";
    float preco = 19.99;
    printf("O valor de x é %d, o nome é %s e o preço é %.2f", x, nome, preco);
    return 0;
}
```

#### Java
```java
public class Main {
    public static void main(String[] args) {
        int x = 10;
        String nome = "João";
        double preco = 19.99;
        System.out.println("O valor de x é " + x + ", o nome é " + nome + " e o preço é " + preco);
    }
}
```

#### Assembly (x86 NASM)
```assembly
section .data
    nome db "João",0
    preco dd 19.99

section .bss
    x resd 1

section .text
    global _start

_start:
    mov dword [x], 10
    ; Aqui poderíamos imprimir os valores usando chamadas de sistema
    mov eax, 1  ; syscall exit
    xor ebx, ebx
    int 0x80
```

## Operadores Aritméticos

Os operadores aritméticos são usados para realizar cálculos em variáveis e constantes.

### Exemplos de Operações Aritméticas

#### Python
```python
a = 10
b = 5
soma = a + b
multiplicacao = a * b
divisao = a / b
print(f"Soma: {soma}, Multiplicação: {multiplicacao}, Divisão: {divisao}")
```

#### C
```c
#include <stdio.h>

int main() {
    int a = 10, b = 5;
    printf("Soma: %d, Multiplicação: %d, Divisão: %.2f", a+b, a*b, (float)a/b);
    return 0;
}
```

#### Java
```java
public class Main {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Soma: " + (a + b) + ", Multiplicação: " + (a * b) + ", Divisão: " + ((double)a / b));
    }
}
```

#### Assembly (x86 NASM)
```assembly
section .data
    a dd 10
    b dd 5

section .bss
    resultado resd 1

section .text
    global _start

_start:
    mov eax, dword [a]
    add eax, dword [b]
    mov dword [resultado], eax
    ; Outras operações podem ser implementadas de forma semelhante
    mov eax, 1
    xor ebx, ebx
    int 0x80
```

## Conclusão

Nesta unidade, abordamos os conceitos fundamentais da programação, explorando a importância da computação, os diferentes tipos de programação, a declaração de variáveis e os operadores aritméticos em diversas linguagens. Com essa base, podemos avançar para tópicos mais avançados, como estruturas de controle e algoritmos.

## Exercícios de Fixação

1. Explique com suas palavras o que é um programa de computador.
2. Qual a diferença entre programação web e programação mobile?
3. O que é uma variável na programação? Dê um exemplo.
4. Qual a função do operador % na programação?
