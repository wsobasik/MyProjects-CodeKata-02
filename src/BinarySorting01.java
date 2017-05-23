import java.util.*;

/**
 * Created by wojteks on 22/05/2017.
 */
public class BinarySorting01 {


    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(11, 2, 8,5, 1, 6, 4 ));
       // displayAll(lista);
        Collections.sort(lista);
        displayAll(lista);
        Integer szukanyInt = 0;
        System.out.println("Podaj liczbę do odszukania");
        Scanner scanner = new Scanner(System.in);
        szukanyInt = Integer.parseInt(scanner.nextLine());
        System.out.println("Index szukanej liczby: " + szukanyInt + " to: " + chop(szukanyInt, lista));
    }

    private static Integer chop(Integer szukanyInt, List<Integer> lista) {

        int startPoint = 0;
        int endPoint = lista.size()-1;


        while (endPoint != startPoint) {
            int middleIndex = 0 ;
            //wez wartosc z polowy przedziału
            if (startPoint==0) {
                middleIndex = (endPoint - startPoint) / 2;
            }
            else
            {
                middleIndex = startPoint + (endPoint - startPoint) / 2;
            }

            Integer middleValue = lista.get(middleIndex);

            //jesli znalazles to wyjdz
            if (szukanyInt.equals(middleValue)) {
                return middleIndex;
            }
            if (endPoint -startPoint==1){
                if (szukanyInt.equals(lista.get(middleIndex+1))) {
                    return middleIndex+1;
                }
                else
                {
                    return -1;
                }

            }
            // jesli wartosc wieksza to wez dolny przedzial
            if (szukanyInt > middleValue) {
                startPoint = middleIndex;

            } else if (szukanyInt < middleValue) {// jesli wartos szukana jest mniejsza od srodkowej wez dolny przedzial
                {
                    endPoint = middleIndex;
                }
            }
        }
        return -1;
    }


    public static void displayAll(List<Integer> lista) {

        for (int i = 0; i < lista.size(); i++) {
            Integer integer = lista.get(i);
            System.out.println(i+": "+integer);

        }

        System.out.println();
    }

}
