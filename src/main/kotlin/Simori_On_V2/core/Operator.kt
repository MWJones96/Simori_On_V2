package Simori_On_V2.core

sealed class Operator(val x: Int) {
    abstract fun calculate(y: Int): Int

    class Add(x: Int): Operator(x) {
        override fun calculate(y: Int): Int {
            return x + y
        }
    }

    class Sub(x: Int): Operator(x) {
        override fun calculate(y: Int): Int {
            return x - y
        }
    }

    class Mul(x: Int): Operator(x) {
        override fun calculate(y: Int): Int {
            return x * y
        }
    }

    class Div(x: Int): Operator(x) {
        override fun calculate(y: Int): Int {
            return x / y
        }
    }
}