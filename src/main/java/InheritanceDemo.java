public class InheritanceDemo {

    public static void main(String[] args){

        // class to class
        Chrome c1 = new Chrome();

        // converting child to parent: upcast: you can access the methods of that parent only.
        // here you cannot access the method of child class
        Browser b1 = new Chrome();
        b1.openURL();

        ((Chrome)b1).devTools();  //downcasting is only allowed when you have already done upcasting
        ((Chrome)b1).openURL();
        ((Chrome)b1).cliInspect();

        //Converting parent to child: downcast:
        //Chrome c2 = new Browser();  //Compilation error : not allowed //default downcast
        /*
        Chrome c2 = (Chrome) new Browser(); // Specific downcast not allowed
        c2.openURL(); // No Compilation errors: but Runtime errors
        c2.cliInspect(); // No Compilation errors: but Runtime errors
        c2.devTools(); // No Compilation errors: but Runtime errors
        */



    }

    public void go(){

        /*
        Browser b1 = new Browser();

        Chromium ch = new Chromium();
        Browser ch1 = new Chromium();

        Chrome c1 = new Chrome();
        Chromium c2 = new Chrome(); // make instance of child but behave as parent
        NonChromium nc = new NonChromium();
        Edge e1 = new Edge();

         */
    }


}
