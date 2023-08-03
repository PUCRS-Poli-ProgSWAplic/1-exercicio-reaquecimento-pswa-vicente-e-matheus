public class PrintConsole implements Print {

      public PrintConsole(){
            
      }

      @Override
      public void print() {
             for (int i = 0; i < 10; i++) {
              Incremental inc = Incremental.getInstance();
              System.out.println(inc.toString());
            }
            
      }

}
