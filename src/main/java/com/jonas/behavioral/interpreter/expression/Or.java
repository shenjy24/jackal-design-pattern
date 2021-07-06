package com.jonas.behavioral.interpreter.expression;

import com.jonas.behavioral.interpreter.Context;

/**
 * 非终结符表达式：或操作
 */
public class Or extends Expression {

    private Expression left, right;

    public Or(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(Context ctx) {
        return left.interpret(ctx) || right.interpret(ctx);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Or) {
            return left.equals(((Or) obj).left) && right.equals(((Or) obj).right);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " OR " + right.toString() + ")";
    }
}
