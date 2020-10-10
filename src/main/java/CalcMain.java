public class CalcMain {
    public static void main(String[] args) {
        RationalCalculator rc = new RationalCalculator((Number x, Number y) -> {
            Number r = new Number(x.getA() * y.getB(), x.getB() * y.getB());
            Number r2 = new Number(y.getA() * x.getB(), x.getB() * y.getB());
            return new Number(r.getA() + r2.getA(), x.getB() * y.getB());
        },(Number x,Number y) -> {
            Number r = new Number(x.getA() * y.getB(), x.getB() * y.getB());
            Number r2 = new Number(y.getA() * x.getB(), x.getB() * y.getB());
            return new Number(r.getA() - r2.getA(), x.getB() * y.getB());
        },(Number x,Number y)->{
            return new Number(x.getA() * y.getA(), x.getB() * y.getB());
        },(Number x,Number y) ->{
            return new Number(x.getA()/y.getB(),x.getB()/y.getA());
        });

        VectorCalculator vc = new VectorCalculator((Number x,Number y) -> {
            return new Number(x.getA() + y.getA(), x.getB() + y.getB());
        },(Number x,Number y)-> {
            return new Number(x.getA() - y.getA(), x.getB() - y.getB());

        },(Number x,Number y) -> {
            return new Number((x.getA() *y.getB()) - (x.getB()* y.getB()),0);
        },

        });

    }
}
