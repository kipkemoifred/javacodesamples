package tutorials.functional;

public interface Func<T> {

     T filter(T func);

     T  apply(T func);
}
