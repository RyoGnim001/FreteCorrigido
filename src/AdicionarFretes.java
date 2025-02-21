import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;

public class AdicionarFretes {

    private List<Fretavel> todosFrete = new LinkedList<Fretavel>();

    public void adicionarFrete(Fretavel frete){
        todosFrete.add(frete);
    }

    public String valorTotal(){
        double total = 0;
        for( Fretavel frete : todosFrete){
            total += frete.calcularFrete();
        }
        DecimalFormat df = new DecimalFormat("#.00");

        return "Valor total dos fretes: " + df.format(total);

    }

    public void ExibirTodos(){

        for(Fretavel frete : todosFrete){
            System.out.println(frete.toString() + " Total:  R$" + frete.calcularFrete() );
            System.out.println("--------------------");
        }


    }
}
