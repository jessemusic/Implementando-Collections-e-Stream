package Optional;

import java.util.Optional;

public class ExemploOptional {


    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of( "Valor Opcional" );

    //    System.out.println(optionalString.isPresent());
    //    System.out.println(optionalString.isEmpty());

//
//     optionalString.ifPresentOrElse(System.out::println,
        //        () -> System.out.println("Valor não está presente"));
/*
        if (optionalString.isPresent()) {
            String valor = optionalString.get();

            System.out.println(valor + "+");
        }

        optionalString.map((z) -> z.concat("*ops*")).ifPresent(System.out::println);
        }
*/
        System.out.println(optionalString.orElseThrow(IllegalStateException::new));

    }
}
