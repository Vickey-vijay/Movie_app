package com.yandex.div.evaluable.internal;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Parser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class Parser {
    public static final Parser INSTANCE = new Parser();

    /* JADX INFO: compiled from: Parser.kt */
    public static final class ParsingState {
        private int index;
        private final String rawExpr;
        private final List<Token> tokens;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParsingState)) {
                return false;
            }
            ParsingState parsingState = (ParsingState) obj;
            return p.e(this.tokens, parsingState.tokens) && p.e(this.rawExpr, parsingState.rawExpr);
        }

        public int hashCode() {
            return (this.tokens.hashCode() * 31) + this.rawExpr.hashCode();
        }

        public String toString() {
            return "ParsingState(tokens=" + this.tokens + ", rawExpr=" + this.rawExpr + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ParsingState(List<? extends Token> list, String str) {
            p.j(list, "tokens");
            p.j(str, "rawExpr");
            this.tokens = list;
            this.rawExpr = str;
        }

        public final Token currentToken() {
            return this.tokens.get(this.index);
        }

        public final int forward() {
            int i10 = this.index;
            this.index = i10 + 1;
            return i10;
        }

        public final String getRawExpr() {
            return this.rawExpr;
        }

        public final boolean isAtEnd() {
            return this.index >= this.tokens.size();
        }

        public final Token next() {
            return this.tokens.get(forward());
        }

        public final boolean isNotAtEnd() {
            return !isAtEnd();
        }
    }

    private Parser() {
    }

    private final Evaluable method(ParsingState parsingState) {
        Evaluable evaluableCall$default = call$default(this, parsingState, null, 2, null);
        while (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.Dot)) {
            parsingState.forward();
            evaluableCall$default = call(parsingState, evaluableCall$default);
        }
        return evaluableCall$default;
    }

    public static /* synthetic */ Evaluable call$default(Parser parser, ParsingState parsingState, Evaluable evaluable, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            evaluable = null;
        }
        return parser.call(parsingState, evaluable);
    }

    public final Evaluable parse(List<? extends Token> list, String str) {
        p.j(list, "tokens");
        p.j(str, "rawExpression");
        if (list.isEmpty()) {
            throw new EvaluableException("Expression expected", null, 2, null);
        }
        ParsingState parsingState = new ParsingState(list, str);
        Evaluable evaluableExpression = expression(parsingState);
        if (parsingState.isNotAtEnd()) {
            throw new EvaluableException("Expression expected", null, 2, null);
        }
        return evaluableExpression;
    }

    private final Evaluable and(ParsingState parsingState) {
        Evaluable evaluableEqual = equal(parsingState);
        while (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.Binary.Logical.And)) {
            parsingState.forward();
            evaluableEqual = new Evaluable.Binary(Token.Operator.Binary.Logical.And.INSTANCE, evaluableEqual, equal(parsingState), parsingState.getRawExpr());
        }
        return evaluableEqual;
    }

    private final Evaluable call(ParsingState parsingState, Evaluable evaluable) {
        if (!parsingState.isAtEnd()) {
            Token next = parsingState.next();
            if (evaluable != null && !(next instanceof Token.Function)) {
                throw new EvaluableException("Method expected after .", null, 2, null);
            }
            if (next instanceof Token.Operand.Literal) {
                return new Evaluable.Value((Token.Operand.Literal) next, parsingState.getRawExpr());
            }
            if (next instanceof Token.Operand.Variable) {
                return new Evaluable.Variable(((Token.Operand.Variable) next).m3364unboximpl(), parsingState.getRawExpr(), null);
            }
            if (next instanceof Token.Function) {
                return parseFunction((Token.Function) next, parsingState, evaluable);
            }
            if (next instanceof Token$Bracket$LeftRound) {
                Evaluable evaluableExpression = expression(parsingState);
                if (!(parsingState.next() instanceof Token$Bracket$RightRound)) {
                    throw new EvaluableException("')' expected after expression", null, 2, null);
                }
                return evaluableExpression;
            }
            if (next instanceof Token$StringTemplate$Start) {
                ArrayList arrayList = new ArrayList();
                while (parsingState.isNotAtEnd() && !(parsingState.currentToken() instanceof Token$StringTemplate$End)) {
                    if (!(parsingState.currentToken() instanceof Token$StringTemplate$StartOfExpression) && !(parsingState.currentToken() instanceof Token$StringTemplate$EndOfExpression)) {
                        arrayList.add(expression(parsingState));
                    } else {
                        parsingState.forward();
                    }
                }
                if (parsingState.next() instanceof Token$StringTemplate$End) {
                    return new Evaluable.StringTemplate(arrayList, parsingState.getRawExpr());
                }
                throw new EvaluableException("expected ''' at end of a string template", null, 2, null);
            }
            throw new EvaluableException("Expression expected", null, 2, null);
        }
        throw new EvaluableException("Expression expected", null, 2, null);
    }

    private final Evaluable comparison(ParsingState parsingState) {
        Evaluable evaluableSum = sum(parsingState);
        while (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.Binary.Comparison)) {
            Token next = parsingState.next();
            Evaluable evaluableSum2 = sum(parsingState);
            p.h(next, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator.Binary");
            evaluableSum = new Evaluable.Binary((Token.Operator.Binary) next, evaluableSum, evaluableSum2, parsingState.getRawExpr());
        }
        return evaluableSum;
    }

    private final Evaluable equal(ParsingState parsingState) {
        Evaluable evaluableComparison = comparison(parsingState);
        while (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.Binary.Equality)) {
            Token next = parsingState.next();
            Evaluable evaluableComparison2 = comparison(parsingState);
            p.h(next, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator.Binary");
            evaluableComparison = new Evaluable.Binary((Token.Operator.Binary) next, evaluableComparison, evaluableComparison2, parsingState.getRawExpr());
        }
        return evaluableComparison;
    }

    private final Evaluable exponent(ParsingState parsingState) {
        Evaluable evaluableMethod = method(parsingState);
        if (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.Binary.Power)) {
            parsingState.forward();
            return new Evaluable.Binary(Token.Operator.Binary.Power.INSTANCE, evaluableMethod, unary(parsingState), parsingState.getRawExpr());
        }
        return evaluableMethod;
    }

    private final Evaluable expression(ParsingState parsingState) {
        Evaluable evaluableM3339try = m3339try(parsingState);
        if (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.TernaryIf)) {
            parsingState.forward();
            Evaluable evaluableExpression = expression(parsingState);
            if (!parsingState.isAtEnd() && (parsingState.currentToken() instanceof Token.Operator.TernaryElse)) {
                parsingState.forward();
                return new Evaluable.Ternary(Token.Operator.TernaryIfElse.INSTANCE, evaluableM3339try, evaluableExpression, expression(parsingState), parsingState.getRawExpr());
            }
            throw new EvaluableException("':' expected in ternary-if-else expression", null, 2, null);
        }
        return evaluableM3339try;
    }

    private final Evaluable factor(ParsingState parsingState) {
        Evaluable evaluableUnary = unary(parsingState);
        while (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.Binary.Factor)) {
            Token next = parsingState.next();
            p.h(next, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator.Binary");
            evaluableUnary = new Evaluable.Binary((Token.Operator.Binary) next, evaluableUnary, unary(parsingState), parsingState.getRawExpr());
        }
        return evaluableUnary;
    }

    private final Evaluable or(ParsingState parsingState) {
        Evaluable evaluableAnd = and(parsingState);
        while (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.Binary.Logical.Or)) {
            parsingState.forward();
            evaluableAnd = new Evaluable.Binary(Token.Operator.Binary.Logical.Or.INSTANCE, evaluableAnd, and(parsingState), parsingState.getRawExpr());
        }
        return evaluableAnd;
    }

    private final Evaluable parseFunction(Token.Function function, ParsingState parsingState, Evaluable evaluable) {
        if (parsingState.next() instanceof Token$Bracket$LeftRound) {
            ArrayList arrayList = new ArrayList();
            if (evaluable != null) {
                arrayList.add(evaluable);
            }
            while (!(parsingState.currentToken() instanceof Token$Bracket$RightRound)) {
                arrayList.add(expression(parsingState));
                if (parsingState.currentToken() instanceof Token.Function.ArgumentDelimiter) {
                    parsingState.forward();
                }
            }
            if (parsingState.next() instanceof Token$Bracket$RightRound) {
                if (evaluable == null) {
                    return new Evaluable.FunctionCall(function, arrayList, parsingState.getRawExpr());
                }
                return new Evaluable.MethodCall(function, arrayList, parsingState.getRawExpr());
            }
            throw new EvaluableException("expected ')' after a function call", null, 2, null);
        }
        throw new EvaluableException("'(' expected after function call", null, 2, null);
    }

    private final Evaluable sum(ParsingState parsingState) {
        Evaluable evaluableFactor = factor(parsingState);
        while (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.Binary.Sum)) {
            Token next = parsingState.next();
            p.h(next, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator.Binary");
            evaluableFactor = new Evaluable.Binary((Token.Operator.Binary) next, evaluableFactor, factor(parsingState), parsingState.getRawExpr());
        }
        return evaluableFactor;
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    private final Evaluable m3339try(ParsingState parsingState) {
        Evaluable evaluableOr = or(parsingState);
        if (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.Try)) {
            Token next = parsingState.next();
            Evaluable evaluableExpression = expression(parsingState);
            p.h(next, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator.Try");
            return new Evaluable.Try((Token.Operator.Try) next, evaluableOr, evaluableExpression, parsingState.getRawExpr());
        }
        return evaluableOr;
    }

    private final Evaluable unary(ParsingState parsingState) {
        if (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.Unary)) {
            Token next = parsingState.next();
            p.h(next, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator");
            return new Evaluable.Unary((Token.Operator) next, unary(parsingState), parsingState.getRawExpr());
        }
        return exponent(parsingState);
    }
}
