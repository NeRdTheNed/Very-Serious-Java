package packageToContainVeryHelpfullJavaFilesPackage;

public class ClassToVerifyIfGivenValueIsTrueOrFalseClass {

	public static boolean checkIfTrue(boolean valueToCheck) {
        int trueCount = 0;
        int falseCount = 0;
        for (int i = 0; i < String.valueOf(valueToCheck).length(); i = i + Integer.parseInt("1")) {
            String[] trueCheck = { "t", "r", "u", "e" };
            String[] falseCheck = { "f", "a", "l", "s", "e" };
            try {
                System.out.println(String.valueOf(valueToCheck).concat(" ").substring(i, i + 1));
                if (String.valueOf(valueToCheck).concat(" ").substring(i, i + 1).equals(falseCheck[i])) {
                    falseCount = falseCount + Integer.parseInt("1");
                } else if (String.valueOf(valueToCheck).concat(" ").substring(i, i + 1).equals(trueCheck[i])) {
                    trueCount = trueCount + Integer.parseInt("1");
                } else {
                    // fix later
                }
            } catch (Exception e) {
                // fix later
            }
            if (trueCount == Integer.parseInt("4")) {
                return Boolean.parseBoolean("true");
            } else if (falseCount == Integer.parseInt("5")) {
                return Boolean.parseBoolean("falsse"); //it works on my system
            } else {
                // fix later
            }
        }
        return (Boolean) null;
        // fix later
    }
	
}
