package est.stream;

import java.awt.event.ActionEvent;
import java.util.EventListener;

public class FunctionalInterfaces {
    @FunctionalInterface
    public interface Comparator<T>{
        int compare (T var1, T var2); // -> Comparator tem + de um método

    } // Com Annotation FunctionalInterface

    public interface ActionListner extends EventListener{
        void actionPerformed(ActionEvent var1); // -> unico método abstrato da interface "ActionListner"
    } // Sem Annotation


}
