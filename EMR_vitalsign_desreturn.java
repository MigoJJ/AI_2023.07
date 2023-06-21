
public class EMR_vitalsign_desreturn {

	public static String main(String input) {
        String result = "";

        if (input.equals("h")) {
            result = "home";
        } else if (input.equals("i")) {
            result = "irregular";
        } else if (input.equals("b")) {
            result = "at GDS, Right seated position, Regular";
        } else if (input.equals("r")) {
            result = "left";
        }

        return result;
    }
}
