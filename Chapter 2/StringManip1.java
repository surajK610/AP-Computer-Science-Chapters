
/**This program tests out many functions of Strings.
 */
public class StringManip1
{
    public static void main (String [] args)
    {
        String str, str2, concat, replace, substring1, substring2, toLowerCase, toUpperCase;
        char charAt;
        int compareTo, indexOf, length;
        boolean equals, equalsIgnoreCase;
        
        str = new String("Life is Death");
        System.out.println(str);
        
        str2 = new String("life is death");
        System.out.println(str2);

        concat = str.concat(" and Life is Life");
        System.out.println(concat);
        
        replace = str.replace( 'i', 'a');
        System.out.println(replace);
        
        substring1 = str.substring(0, 6);
        System.out.println(substring1);
        
        substring2 = str.substring(3);
        System.out.println(substring2);
        
        toLowerCase = str.toLowerCase();
        System.out.println(toLowerCase);
        
        toUpperCase = str.toUpperCase();
        System.out.println(toUpperCase);
        
        charAt = str.charAt(3);
        System.out.println(toUpperCase);
        
        compareTo = str.compareTo(str2);
        System.out.println(compareTo);
        
        indexOf = str.indexOf('f');
        System.out.println(indexOf);
        
        length = str.length();
        System.out.println(length);
        
        equals = str.equals(str2);
        System.out.println(equals);
        
        equalsIgnoreCase = str.equalsIgnoreCase(str2);
        System.out.println(equalsIgnoreCase);
        
    }
}
