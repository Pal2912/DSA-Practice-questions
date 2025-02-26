class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        process(sb, ' ', 'M', ' ', num / 1000); // 'M' is the symbol for thousands
        num = num % 1000;

        process(sb, 'M', 'C', 'D', num / 100); // 'C' (100), 'D' (500), 'M' (1000)
        num = num % 100;

        process(sb, 'C', 'X', 'L', num / 10); // 'X' (10), 'L' (50), 'C' (100)
        num = num % 10;

        process(sb, 'X', 'I', 'V', num); // 'I' (1), 'V' (5), 'X' (10)

        return sb.toString();
    }

    void process(StringBuilder sb, char major, char minor, char middle, int val) {
        if (val <= 3) {
            for (int i = 1; i <= val; i++) {
                sb.append(minor);
            }
        } else if (val == 4) {
            sb.append(minor);
            sb.append(middle);
        } else if (val <= 8) {
            sb.append(middle);
            for (int i = 6; i <= val; i++) {
                sb.append(minor);
            }
        } else if (val == 9) {
            sb.append(minor);
            sb.append(major);
        }
    }
}
