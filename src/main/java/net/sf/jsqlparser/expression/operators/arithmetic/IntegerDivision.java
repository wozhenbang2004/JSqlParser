/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2019 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package net.sf.jsqlparser.expression.operators.arithmetic;

import net.sf.jsqlparser.expression.BinaryExpression;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.ExpressionVisitor;

public class IntegerDivision extends BinaryExpression {

    private final String operator;

    public IntegerDivision() {
        this("DIV");
    }

    /** {@code operator} is {@code DIV} or DuckDB's {@code //}. */
    public IntegerDivision(String operator) {
        this.operator = operator;
    }

    public IntegerDivision(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
        operator = "DIV";
    }

    @Override
    public <T, S> T accept(ExpressionVisitor<T> expressionVisitor, S context) {
        return expressionVisitor.visit(this, context);
    }

    @Override
    public String getStringExpression() {
        return operator;
    }

    @Override
    public IntegerDivision withLeftExpression(Expression arg0) {
        return (IntegerDivision) super.withLeftExpression(arg0);
    }

    @Override
    public IntegerDivision withRightExpression(Expression arg0) {
        return (IntegerDivision) super.withRightExpression(arg0);
    }
}
