package utils;

public class Colores {

        // Códigos ANSI
        public static final String RESET = "\u001B[0m";
        public static final String BLACK = "\u001B[30m";
        public static final String RED = "\u001B[31m";
        public static final String GREEN = "\u001B[32m";
        public static final String YELLOW = "\u001B[33m";
        public static final String BLUE = "\u001B[34m";
        public static final String PURPLE = "\u001B[35m";
        public static final String CYAN = "\u001B[36m";
        public static final String WHITE = "\u001B[37m";
        public static final String ORANGE = "\u001B[38;5;208m";
        public static final String PINK = "\u001B[38;5;213m";
        public static final String HOT_PINK = "\u001B[38;5;198m";
        public static final String GRAY_LIGHT = "\u001B[38;5;250m";
        public static final String GRAY_DARK = "\u001B[38;5;240m";
        public static final String MINT = "\u001B[38;5;121m";
        public static final String SKY_BLUE = "\u001B[38;5;117m";
        public static final String GOLD = "\u001B[38;5;220m";

        public static final String BOLD = "\u001B[1m";
        public static final String UNDERLINE = "\u001B[4m";

        public static final String BG_RED = "\u001B[41m";
        public static final String BG_GREEN = "\u001B[42m";
        public static final String BG_YELLOW = "\u001B[43m";
        public static final String BG_BLUE = "\u001B[44m";

        public static void logHeader(String title) {
        System.out.println(colorText("==============================", PURPLE));
        System.out.println(colorText("   " + title.toUpperCase(), BOLD + PURPLE));
        System.out.println(colorText("==============================", PURPLE));
        }

        public static final String RED_BRIGHT = "\u001B[91m";
        public static final String GREEN_BRIGHT = "\u001B[92m";
        public static final String YELLOW_BRIGHT = "\u001B[93m";
        public static final String CYAN_BRIGHT = "\u001B[96m";

        public static String colorText(String text, String colorCode) {
            return colorCode + text + RESET;
        }
        public static void logSuccess(String message) {
            System.out.println(colorText("✔ SUCCESS: " + message, GREEN));
        }
        public static void logError(String message) {
            System.out.println(colorText("✖ ERROR: " + message, RED));
        }
        public static void logWarning(String message) {
            System.out.println(colorText("⚠ WARNING: " + message, YELLOW));
        }
        public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        }


        public static void main(String[] args) {
        /*
            // Opción 1: Usar los colores directamente
            System.out.println(ConsoleUtils.colorText("Hola en azul", ConsoleUtils.BLUE));

            // Opción 2: Usar las funciones rápidas
            ConsoleUtils.logSuccess("Conexión establecida");
            ConsoleUtils.logError("Fallo al cargar el archivo");
            ConsoleUtils.logWarning("Poca batería");

         */
            System.out.println(colorText("Azul", BLUE));

            logSuccess("todo ok");
            logWarning("ten cuidado");
            logError("la has cagado");
        }

}
