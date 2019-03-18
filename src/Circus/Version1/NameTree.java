package Circus.Version1;

import Circus.Employee;
import SelfCreations.Trees.*;

/**
 * Created by Jacks on 5/30/18.
 */

public class NameTree extends AVLTree<Employee> {

    @Override
    public void print() {
        System.out.println("All employees, printed in alphabetical order.");
        super.print();
    }

}
