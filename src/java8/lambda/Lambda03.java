package java8.lambda;

/**
 * 具有泛型类型的函数式接口
 * Created by zfz on 2017/11/11.
 */
public class Lambda03 {

    public static void main(String[] args) {
        GenericFunc<String> stringGenericFunc = (str)->{
            String result = str.toUpperCase();
            return result;
        };

        GenericFunc<Integer> integerGenericFunc = (n)->{
            int result = 0;
            for (int index=0; index<n; index++){
                 result+=index;
            }
            return result;
        };
        String strResult = stringGenericFunc.func("hello world!");
        Integer integerResult = integerGenericFunc.func(10);
        System.out.println("strResult "+strResult);
        System.out.println("intResult "+integerResult);

    }

    public interface GenericFunc<T>{
        T func(T t);
    }
}
