/*
 * L09.karpRabinV2Test
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:09 PM
 */

package L09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class karpRabinV2Test
{
    karpRabinV2 testClass = new karpRabinV2();

@Test
    void search()
    {
        assertTrue(testClass.Search("A", "BCDEFGHI").isEmpty());
    }

    @Test
    void hash()
    {
        System.out.println(testClass.hash("Saurabh"));
        assertNotEquals(testClass.hash("Saurabh"), testClass.hash("M"));
    }
}