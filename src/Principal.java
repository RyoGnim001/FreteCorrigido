public class Principal {
    public static void main(String[] args){
        AdicionarFretes todosOsFretes = new AdicionarFretes();

        Fretavel fretePadrao = new FretePadrao(3,3);
        Fretavel freteExpresso = new FreteExpresso(3, 3, 1);
        Fretavel freteSuperExpresso = new FreteSuperExpresso(3, 3 , 2, 20);

        todosOsFretes.adicionarFrete(fretePadrao);
        todosOsFretes.adicionarFrete(freteExpresso);
        todosOsFretes.adicionarFrete(freteSuperExpresso);

        todosOsFretes.ExibirTodos();
        System.out.println(todosOsFretes.valorTotal());
    }
}
