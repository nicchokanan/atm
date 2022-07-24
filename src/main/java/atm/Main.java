package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Bank bankXYZ = new Bank("XYZ Bank", new DataSourceDB());
//        Bank bankABC = new Bank("ABC Bank", new DataSourceFile("customersAB C.txt"));
//        ATM atm = new ATM(bankABC);

        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean.xml");
        AtmUI atmUI = context.getBean(AtmUI.class);
        atmUI.run();
    }
}
