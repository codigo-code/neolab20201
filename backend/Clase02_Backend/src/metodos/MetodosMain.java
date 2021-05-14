package metodos;

public class MetodosMain {

    public static void main(String[] args) {

        Metodos.noRetornoValor();

        // Retorno de valor
        System.out.println(Metodos.retornarValor("Rosario", 20));

        // Uso de varArgs
        System.out.println(Metodos.utilizarVarArgs(
                "valor1",
                "valor2",
                "valor3" ,
                "valor4",
                "valor5"));
    }
}
