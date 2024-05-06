//O relógio mostra hhoras, mminutos e ssegundos depois da meia-noite.

//Sua tarefa é escrever uma função que retorne o tempo desde a meia-noite em milissegundos.

//Exemplo:
//h = 0
//m = 1
//s = 1

//result = 61000

public class Clock {
    public static int Past(int h, int m, int s) {
        h = h * 3600000;
        m = m * 60000;
        s = s * 1000;
        return h + m + s;
    }
}