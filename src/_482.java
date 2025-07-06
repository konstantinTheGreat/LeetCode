public class _482 {
    public String licenseKeyFormatting(String s, int k) {
        int amountOfCharacters = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '-') {
                amountOfCharacters++;
            }
        }

        int amountOfGroups = 0;
        int firstGroup = 0;
        if (amountOfCharacters % k == 0) {
            amountOfGroups = amountOfCharacters % k;
        } else {
            amountOfGroups = amountOfCharacters % k + 1;
            firstGroup = amountOfGroups % k;
        }

        int count = 0;
        int i = 0;
        int groupNumber = 0;
        StringBuilder result = new StringBuilder();
        while (groupNumber < amountOfGroups) {
            if (s.charAt(i) != '-') {
                count++;
                char character = s.charAt(i);
                if (character - 'a' >= 0) {
                    character -= 32;
                }
                result.append(character);
            }

            if (count == k || groupNumber == 0 && firstGroup != 0 && count == firstGroup) {
                result.append('-');
                count = 0;
                groupNumber++;
            }
            i++;
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
}
