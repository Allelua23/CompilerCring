package generatorCode.compiler;

import symbols.Type;

public class ConstValue {
    String varName;
    Type type;
    String value;
    public ConstValue(String varName, Type type, String value) {
        this.varName = varName; this.type = type; this.value = value;
    }
    public String getType() {
        if (Type.Int.equals(type)) return "I";
        if (Type.Float.equals(type)) return "F";
        if (Type.Bool.equals(type)) return "Z";
        return "C";
    }
    public Object getValue() {
        if (Type.Int.equals(type))  return getIntValue();
        if (Type.Float.equals(type)) return getRealValue();
        if (Type.Bool.equals(type)) return getBoolValue();
        return getCharValue();
    }
    private Integer getIntValue()    { return Integer.parseInt(value); }
    private Character getCharValue() { return value.charAt(0); }
    private Boolean getBoolValue()   { return Boolean.parseBoolean(value); }
    private Float getRealValue()     { return Float.parseFloat(value); }
}
