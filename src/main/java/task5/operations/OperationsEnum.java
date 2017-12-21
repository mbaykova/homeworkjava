package task5.operations;

public enum OperationsEnum {
	  Сумма("+"),
    Разность("-"),
    Умножение("*"),
    Деление("/");

    private final String sign;

    OperationsEnum(String value) {
        sign = value;
    }

    public String getValue() {
        return sign;
    }
}