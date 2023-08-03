public class PrintFactory{

      public static Print getPrint(String respo){
        if(respo.equalsIgnoreCase("arquivo")) {
          return new PrintTxt();
        } else if (respo.equalsIgnoreCase("console")){
          return new PrintConsole();
        }
        return null;
      }

}