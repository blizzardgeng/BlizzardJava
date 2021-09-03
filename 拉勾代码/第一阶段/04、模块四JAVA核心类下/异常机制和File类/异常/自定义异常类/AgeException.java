package 异常机制和File类.异常.自定义异常类;

public class AgeException extends Exception {
    static final long serialVersionUID = -3387516993124229948L;     //序列化版本号。序列化操作有关

    public AgeException() {
    }

    public AgeException(String message) {
        super(message);
    }
}
