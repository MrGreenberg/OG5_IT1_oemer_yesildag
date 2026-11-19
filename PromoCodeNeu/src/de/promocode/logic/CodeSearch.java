

package de.promocode.logic;

public class CodeSearch {

    public static final int NOT_FOUND = -1;

    /**
     * Sucht einen Promo-Code mit binaerer Suche.
     *
     * @param list Liste der Promo-Codes (aufsteigend sortiert)
     * @param searchValue Gesuchter Promo-Code
     * @return Index des Codes oder NOT_FOUND
     */
    public static int findPromoCode(long[] list, long searchValue) {

        int left = 0;
        int right = list.length - 1;

        while (left <= right) {

            int middle = left + (right - left) / 2;

            if (list[middle] == searchValue) {
                return middle;
            }

            if (list[middle] < searchValue) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return NOT_FOUND;
    }
}
