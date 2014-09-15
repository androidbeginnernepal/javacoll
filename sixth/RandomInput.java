/*
a * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sixth;

/**
 *
 * @author anuj
 */
import java.util.Random;
import java.util.*;
import java.util.Collections;
public class RandomInput
{
    public static void main(String [] args)
    {
        Random rand=new Random(System.currentTimeMillis());
        int n;
        n=rand.nextInt(100);
        System.out.print(n);
        Collections.sort(null);
    }
}
