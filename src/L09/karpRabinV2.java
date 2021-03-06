/*
 * L09.karpRabinV2
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:09 PM
 */

package L09;

public class karpRabinV2 extends karpRabin
{
    public karpRabinV2()
    {
    }

    @Override
    public int hash(String s)
    {
        int hash=0;
        try
        {
            hash+=(int)s.charAt(0);
        } catch (Exception e)
        { }

        try
        {
            hash+=(int)s.charAt(s.length()/2);
        } catch (Exception e)
        { }

        try
        {
            hash+=(int)s.charAt(s.length()-1);
        } catch (Exception e)
        { }

        return hash;
    }
}
