# Programação concorrente

Uma unidade concorrente é um componente de
um programa que não exige a execução
seqüencial, ou seja, que sua execução seja
realizada antes ou após a execução de outros
componentes do programa

O termo programação concorrente é usado no
sentido abrangente, para designar a programação
paralela e a programação distribuída

Concorrência relaciona-se com fluxo de controle:
em um programa, existe mais de um fluxo de
controle ativo.

# Exemplo de Execução:

![Screenshot_2022-11-04_13-21-19](https://user-images.githubusercontent.com/82295321/200025831-7320384e-32aa-4904-9813-9ebcf1075fd0.png)


![Screenshot_2022-11-04_13-19-50](https://user-images.githubusercontent.com/82295321/200026019-96d6939e-823f-4a96-9932-cc056e3f1192.png)


![Screenshot_2022-11-04_13-19-59](https://user-images.githubusercontent.com/82295321/200026308-24d4d9b4-a2f9-4010-a491-345ac52fbd50.png)


![Screenshot_2022-11-04_13-20-11](https://user-images.githubusercontent.com/82295321/200026453-05da1e1f-b5d5-4d25-9fd5-e9558519d15a.png)

----------------------------------------------------------------------------------------

## Eu fiquei um pouqinho confuso em relação ao metodo Synchronized, você poderia me explicar um pouco melhor ? onde ele geralmente é usado?


Fala Dev, tudo tranquilo?

Então cara, o uso de synchronized em um método garante que a execução deste método seja realizada apenas por uma Thread por vez, utilizando um mecanismo de lock. A Thread que começa a executar o método “pega” o lock, liberando-o ao término da execução do método. Threads que não possuem o lock devem aguardar a liberação para poder invocar o método.

É importante lembrar que o synchronized funciona de modo diferente dependendo da maneira como é utilizado. O Java atualmente permite 3 modos de sincronização de código:

public synchronized void foo() { }
Esta versão de foo() é um método de instância, ou seja, threads diferentes podem invocar foo() simultaneamente desde que as chamadas sejam realizadas em instâncias diferentes. O lock é feito na instância em que foo() foi invocado.

public static synchronized void foo() { }
Já esta versão de foo() só pode ser executada por uma Thread por vez, pois o lock é feito no objeto Class do tipo em que foo() foi invocado.

Por último o Java ainda permite o uso de blocos synchronized:

public void foo() { synchronized(user) { .... } }
Neste caso, a política de execução vai depender do objeto passado no bloco. Se for de instância, a trava é feita na instância. Se for um atributo estático, a trava é feita no objeto Class. Ela te permite uma liberdade maior por permitir que apenas uma porção do método seja sincronizada.

Atente-se que tudo isso é válido dentro de uma instância de JVM. Se a aplicação possuir 2 ou mais JVMs rodando em paralelo, um lock na JVM A não interfere na JVM B. Cada JVM possui seus próprios “locks”. Espero ter ajudado :wink:

Abraço,

aqui um pequeno exemplo de codigo: 

```
public class SynchronizedCounter {

    private int c = 0;

    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }
}
```
por fim na duvida temos a  documentação do java na Oracle aqui o link 
https://docs.oracle.com/javase/tutorial/essential/concurrency/syncmeth.html
bons estudos!!



