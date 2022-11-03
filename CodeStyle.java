package net.rupyber_studios.code_style;

public class CodeStyle {
    private int intField;
    private static int staticField;
    private final int FINAL_FIELD;

    public CodeStyle(int intField) {
        this.intField = intField;
    }

    static {
        staticField = 1;
    }

    {
        FINAL_FIELD = 1;
    }

    public void setIntField(int intField) {
        this.intField = intField;
    }

    public int getIntField() {
        return intField;
    }

    public int intMethod(int parameter) {
        if(parameter == 0)
            return 5;
        else if(parameter == 5)
            return 0;
        
        switch(parameter) {
            case 1 -> {
                return 2;
            }
            case 2 -> {
                return 1;
            }
            default -> {
                if((parameter % 2) == 0)
                    return parameter / 2;
            }
        }
        return parameter++;
    }
}