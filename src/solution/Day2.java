/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

/**
 *
 * @author antonis
 */
public class Day2 {

    public int calculateTheArray(int[] a) {

        OUTER:
        for (int i = 0; i < a.length; i = i + 4) {
            switch (a[i]) {
                case 1: {
                    int place1 = a[i + 1];
                    int place2 = a[i + 2];
                    int place3 = a[i + 3];
                    if (place1 > a.length || place2 > a.length || place3 > a.length) {
                        break;
                    }
                    int sum = a[place1] + a[place2];
                    a[place3] = sum;
                    break;
                }
                case 2: {
                    int place1 = a[i + 1];
                    int place2 = a[i + 2];
                    int place3 = a[i + 3];
                    if (place1 > a.length || place2 > a.length || place3 > a.length) {
                        break;
                    }
                    int mult = a[place1] * a[place2];
                    a[place3] = mult;
                    break;
                }
                case 99:
                    break OUTER;
                default:
                    break;
            }
        }

        return a[0];
    }
}
