/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;

import java.util.ArrayList;
import java.util.Scanner;

// to store student information and properties
public class Student {
    ArrayList arrayList = new ArrayList();

    void add() {
        {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList.add(a);
            }


        }
    }
}
