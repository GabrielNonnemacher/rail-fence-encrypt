public class RailFenceEncrypt {
    public static String encrypt(String text, int rails) {
        if (rails <= 1) return text;

        StringBuilder[] rail = new StringBuilder[rails];
        for (int i = 0; i < rails; i++) {
            rail[i] = new StringBuilder();
        }

        int line = 0;
        boolean isDown = true;

        for (char c : text.toCharArray()) {
            rail[line].append(c);

            if (line == 0) {
                isDown = true;
            } else if (line == rails - 1) {
                isDown = false;
            }

            line += isDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : rail) {
            result.append(sb);
        }

        return result.toString();
    }

    public static String decrypt(String text, int rails) {
        if (rails <= 1) return text;

        int n = text.length();
        char[][] grid = new char[rails][n];

        boolean isDown = true;
        int line = 0;
        for (int col = 0; col < n; col++) {
            grid[line][col] = '*';

            if (line == 0) isDown = true;
            else if (line == rails - 1) isDown = false;

            line += isDown ? 1 : -1;
        }

        int index = 0;
        for (int i = 0; i < rails; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '*' && index < n) {
                    grid[i][j] = text.charAt(index++);
                }
            }
        }

        StringBuilder resultado = new StringBuilder();
        line = 0;
        isDown = true;
        for (int col = 0; col < n; col++) {
            resultado.append(grid[line][col]);

            if (line == 0) isDown = true;
            else if (line == rails - 1) isDown = false;

            line += isDown ? 1 : -1;
        }

        return resultado.toString();
    }
}
