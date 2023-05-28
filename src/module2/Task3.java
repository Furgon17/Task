package module2;

import java.util.Objects;

public class Task3 {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 4);
        ComplexNumber b = new ComplexNumber(4, 1);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
    public static class ComplexNumber{
    private final double re;
    private final double im;

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ComplexNumber that = (ComplexNumber) o; //приводим объект о к типу ComplexNumber
            return Double.compare(that.re, re) == 0 && Double.compare(that.im, im) == 0;//Метод Double.compare()
            // сравнивает два значения типа double. Он возвращает целое число, которое может принимать три значения:
            // отрицательное, если первое значение меньше второго; ноль, если оба значения равны; и положительное,
            // если первое значение больше второго
        }

        @Override
        public int hashCode() {
            double result = 31;
            result = result * getIm() + 6142 * 34;
            result = result * getRe() + 6142 * 34;
            return (int) result; // потому что метод возвращает инт
        }
    }
}
