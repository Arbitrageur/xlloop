/*******************************************************************************
 * This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     Peter Smith
 *******************************************************************************/
package org.boris.expr.function;

import org.boris.expr.Expr;
import org.boris.expr.ExprDouble;
import org.boris.expr.ExprException;

public abstract class DoubleInOutFunction extends AbstractFunction
{
    public final Expr evaluate(Expr[] args) throws ExprException {
        assertArgCount(args, 1);
        return new ExprDouble(evaluate(asDouble(args[0], true)));
    }

    protected abstract double evaluate(double value) throws ExprException;
}
