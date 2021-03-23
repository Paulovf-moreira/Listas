import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
class AulaLista {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    list.add("Paulo");
    list.add("Ferreira");
    list.add("Vinicius");
    list.add("Peste");
    list.add(2,"boa tarde");//Para adicionar elemento em determinada posição da lista.

    System.out.println(list.size()); //Mostra o tamanho da lista

    list.remove(2); //remover elementos da lista



    for (String lista:list){
      System.out.println(lista);
    }
 System.out.println("-----------------------------------");

    list.removeIf(lista-> lista.charAt(0) == 'F');//Predicado

    for(String lista:list){

      System.out.println(lista);
    }

    System.out.println("----------------------------------");

    System.out.println("Index of Paulo:"+list.indexOf("Paulo"));// Encontrar posição na lista
    
    System.out.println("----------------------------------------d");
   List<String> result = list.stream().filter(lista -> lista.charAt(0) == 'x').collect(Collectors.toList()); //filtra os elementos da lista com a inicial solicitada.

    for (String lista: result){
      System.out.println(lista);
    }

    System.out.println("----------------------------------");

    String name = list.stream().filter(lista -> lista.charAt(0)=='t').findFirst().orElse(null);

    System.out.println(name);

  }
}