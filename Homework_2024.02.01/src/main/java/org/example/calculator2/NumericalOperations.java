package org.example.calculator2;

public interface NumericalOperations<T extends Number> {

        T add(T a, T b); // method 'add'

        T sub(T a, T b);// method 'sub'

        T multi(T a, T b);// method 'multi'

        T div(T a, T b);// method 'div'

}
