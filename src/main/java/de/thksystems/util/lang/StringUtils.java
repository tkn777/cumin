/*
 * tksCommons
 *
 * Author : Thomas Kuhlmann (ThK-Systems, http://www.thk-systems.de) License : LGPL (https://www.gnu.org/licenses/lgpl.html)
 */
package de.thksystems.util.lang;

public final class StringUtils {

    private StringUtils() {
    }

    /**
     * Extract all capitals (uppercase characters) of a string.
     * <ul>
     * <li>"hello" -&gt; ""</li>
     * <li>"Hello" -&gt; "H"</li>
     * <li>"HelLo" -&gt; "HL"</li>
     * <li>"hello World. Here I am." -&gt; "WHI"</li>
     * <li>null -&gt; null</li>
     * </ul>
     */
    public static String getCapitals(String s) {
        if (s == null) {
            return null;
        }
        return s.chars().filter(Character::isUpperCase)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }

}
