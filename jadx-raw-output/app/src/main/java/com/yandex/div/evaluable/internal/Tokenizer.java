package com.yandex.div.evaluable.internal;

import ck.p;
import com.ironsource.mediationsdk.metadata.a;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.TokenizingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lk.x;
import nj.b0;

/* JADX INFO: compiled from: Tokenizer.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class Tokenizer {
    public static final Tokenizer INSTANCE = new Tokenizer();

    /* JADX INFO: compiled from: Tokenizer.kt */
    public static final class TokenizationState {
        private int index;
        private final char[] source;
        private final List<Token> tokens;

        public static /* synthetic */ int forward$default(TokenizationState tokenizationState, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = 1;
            }
            return tokenizationState.forward(i10);
        }

        public static /* synthetic */ char nextChar$default(TokenizationState tokenizationState, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = 1;
            }
            return tokenizationState.nextChar(i10);
        }

        public static /* synthetic */ char prevChar$default(TokenizationState tokenizationState, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = 1;
            }
            return tokenizationState.prevChar(i10);
        }

        public final char charAt(int i10) {
            if (i10 >= 0 && i10 < this.source.length) {
                return this.source[i10];
            }
            return (char) 0;
        }

        public String toString() {
            return "TokenizationState(source=" + Arrays.toString(this.source) + ')';
        }

        public TokenizationState(char[] cArr) {
            p.j(cArr, "source");
            this.source = cArr;
            this.tokens = new ArrayList();
        }

        public final char currentChar() {
            int i10 = this.index;
            char[] cArr = this.source;
            if (i10 >= cArr.length) {
                return (char) 0;
            }
            return cArr[i10];
        }

        public final boolean currentCharIsEscaped() {
            int i10 = this.index;
            if (i10 >= this.source.length) {
                return false;
            }
            int i11 = 0;
            for (int i12 = i10 - 1; i12 > 0 && this.source[i12] == '\\'; i12--) {
                i11++;
            }
            return i11 % 2 == 1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!p.e(TokenizationState.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            p.h(obj, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Tokenizer.TokenizationState");
            return Arrays.equals(this.source, ((TokenizationState) obj).source);
        }

        public final int forward(int i10) {
            int i11 = this.index;
            this.index = i10 + i11;
            return i11;
        }

        public final int getIndex() {
            return this.index;
        }

        public final List<Token> getTokens() {
            return this.tokens;
        }

        public int hashCode() {
            return Arrays.hashCode(this.source);
        }

        public final char nextChar(int i10) {
            int i11 = this.index;
            int i12 = i11 + i10;
            char[] cArr = this.source;
            if (i12 >= cArr.length) {
                return (char) 0;
            }
            return cArr[i11 + i10];
        }

        public final String part(int i10, int i11) {
            return x.y(this.source, i10, i11);
        }

        public final char prevChar(int i10) {
            int i11 = this.index;
            if (i11 - i10 >= 0) {
                return this.source[i11 - i10];
            }
            return (char) 0;
        }
    }

    private Tokenizer() {
    }

    private final boolean isAlphabetic(char c10) {
        if ('a' <= c10 && c10 < '{') {
            return true;
        }
        return ('A' <= c10 && c10 < '[') || c10 == '_';
    }

    private final boolean isAtEnd(char c10) {
        return c10 == 0;
    }

    private final boolean isAtEndOfExpression(char c10) {
        return c10 == '}';
    }

    private final boolean isDot(char c10) {
        return c10 == '.';
    }

    private final boolean isNumber(char c10) {
        return '0' <= c10 && c10 < ':';
    }

    private final boolean isStartOfExpression(char c10, TokenizationState tokenizationState) {
        return c10 == '@' && TokenizationState.prevChar$default(tokenizationState, 0, 1, null) != '\\' && TokenizationState.nextChar$default(tokenizationState, 0, 1, null) == '{';
    }

    private final boolean isWhiteSpace(char c10) {
        return c10 == ' ' || c10 == '\t' || c10 == '\r' || c10 == '\n';
    }

    private final void processStringTemplate(TokenizationState tokenizationState, List<Token> list, boolean z10) {
        if (z10) {
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
        }
        ArrayList arrayList = new ArrayList();
        String strM3365processStringwB4SYI = m3365processStringwB4SYI(tokenizationState, z10);
        if (isAtEnd(tokenizationState.currentChar())) {
            if (z10) {
                throw new TokenizingException("''' expected at end of string literal at " + tokenizationState.getIndex(), null, 2, null);
            }
            if (strM3365processStringwB4SYI != null) {
                list.add(Token.Operand.Literal.Str.m3352boximpl(strM3365processStringwB4SYI));
                return;
            }
            return;
        }
        if (isAtEndOfStringLiteral(tokenizationState.currentChar(), tokenizationState)) {
            if (strM3365processStringwB4SYI == null) {
                strM3365processStringwB4SYI = Token.Operand.Literal.Str.m3353constructorimpl("");
            }
            list.add(Token.Operand.Literal.Str.m3352boximpl(strM3365processStringwB4SYI));
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
            return;
        }
        if (strM3365processStringwB4SYI != null && isStartOfExpression(tokenizationState.currentChar(), tokenizationState)) {
            arrayList.add(Token$StringTemplate$Start.INSTANCE);
            arrayList.add(Token.Operand.Literal.Str.m3352boximpl(strM3365processStringwB4SYI));
        }
        while (isStartOfExpression(tokenizationState.currentChar(), tokenizationState)) {
            ArrayList arrayList2 = new ArrayList();
            processExpression(tokenizationState, arrayList2);
            String strM3365processStringwB4SYI2 = m3365processStringwB4SYI(tokenizationState, z10);
            if (!z10 && arrayList.isEmpty() && strM3365processStringwB4SYI2 == null && !isStartOfExpression(tokenizationState.currentChar(), tokenizationState)) {
                list.addAll(arrayList2);
                return;
            }
            if (arrayList.isEmpty()) {
                arrayList.add(Token$StringTemplate$Start.INSTANCE);
            }
            arrayList.add(Token$StringTemplate$StartOfExpression.INSTANCE);
            arrayList.addAll(arrayList2);
            arrayList.add(Token$StringTemplate$EndOfExpression.INSTANCE);
            if (strM3365processStringwB4SYI2 != null) {
                arrayList.add(Token.Operand.Literal.Str.m3352boximpl(strM3365processStringwB4SYI2));
            }
        }
        if (z10 && !isAtEndOfStringLiteral(tokenizationState.currentChar(), tokenizationState)) {
            throw new TokenizingException("''' expected at end of string literal at " + tokenizationState.getIndex(), null, 2, null);
        }
        if (!arrayList.isEmpty()) {
            list.addAll(arrayList);
            list.add(Token$StringTemplate$End.INSTANCE);
        }
        if (z10) {
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
        }
    }

    public final List<Token> tokenize(String str) {
        p.j(str, "input");
        char[] charArray = str.toCharArray();
        p.i(charArray, "this as java.lang.String).toCharArray()");
        return tokenize(charArray);
    }

    private final EvaluableException invalidToken(TokenizationState tokenizationState) {
        return new EvaluableException("Invalid token '" + tokenizationState.currentChar() + "' at position " + tokenizationState.getIndex(), null, 2, null);
    }

    private final boolean isAtEndOfStringLiteral(char c10, TokenizationState tokenizationState) {
        return c10 == '\'' && !tokenizationState.currentCharIsEscaped();
    }

    private final boolean processKeyword(String str, List<Token> list) {
        Token.Operand.Literal.Bool boolM3340boximpl;
        if (p.e(str, "true")) {
            boolM3340boximpl = Token.Operand.Literal.Bool.m3340boximpl(Token.Operand.Literal.Bool.m3341constructorimpl(true));
        } else {
            boolM3340boximpl = p.e(str, a.f29886h) ? Token.Operand.Literal.Bool.m3340boximpl(Token.Operand.Literal.Bool.m3341constructorimpl(false)) : null;
        }
        if (boolM3340boximpl == null) {
            return false;
        }
        list.add(boolM3340boximpl);
        return true;
    }

    public static /* synthetic */ void processStringTemplate$default(Tokenizer tokenizer, TokenizationState tokenizationState, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        tokenizer.processStringTemplate(tokenizationState, list, z10);
    }

    private final List<Token> tokenize(char[] cArr) {
        TokenizationState tokenizationState = new TokenizationState(cArr);
        try {
            processStringTemplate(tokenizationState, tokenizationState.getTokens(), false);
            return tokenizationState.getTokens();
        } catch (EvaluableException e10) {
            if (!(e10 instanceof TokenizingException)) {
                throw e10;
            }
            throw new EvaluableException("Error tokenizing '" + x.x(cArr) + "'.", e10);
        }
    }

    private final boolean isAtEndOfString(TokenizationState tokenizationState, boolean z10) {
        if (!isAtEnd(tokenizationState.currentChar()) && !isStartOfExpression(tokenizationState.currentChar(), tokenizationState) && (!z10 || !isAtEndOfStringLiteral(tokenizationState.currentChar(), tokenizationState))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0033  */
    /* JADX WARN: Code duplicated, block: B:22:0x0035  */
    private final boolean isDecimal(char c10, char c11, char c12) {
        boolean z10;
        boolean z11;
        boolean zIsDigit;
        if (!Character.isDigit(c10)) {
            if (c10 == '.') {
                zIsDigit = Character.isDigit(c12);
            } else {
                if (c10 == 'e' || c10 == 'E') {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (Character.isDigit(c11) && (Character.isDigit(c12) || c12 == '+' || c12 == '-')) {
                        zIsDigit = true;
                    } else {
                        zIsDigit = false;
                    }
                } else {
                    if (c10 == '+' || c10 == '-') {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 && ((c11 == 'e' || c11 == 'E') && Character.isDigit(c12))) {
                        zIsDigit = true;
                    } else {
                        zIsDigit = false;
                    }
                }
            }
            if (!zIsDigit) {
                return false;
            }
        }
        return true;
    }

    private final boolean isOperator(List<? extends Token> list) {
        if (list.isEmpty() || (b0.r0(list) instanceof Token.Operator.Unary)) {
            return false;
        }
        if (!(b0.r0(list) instanceof Token.Operand) && !(b0.r0(list) instanceof Token$Bracket$RightRound)) {
            return false;
        }
        return true;
    }

    private final boolean isUnaryOperator(List<? extends Token> list) {
        if (!isOperator(list) && !(b0.s0(list) instanceof Token.Operator.Unary)) {
            return true;
        }
        return false;
    }

    private final boolean isValidIdentifier(char c10) {
        if (!isAlphabetic(c10) && !isNumber(c10)) {
            return false;
        }
        return true;
    }

    private final boolean processExpression(TokenizationState tokenizationState, List<Token> list) {
        Token token;
        Token token2;
        if (!isStartOfExpression(tokenizationState.currentChar(), tokenizationState)) {
            return false;
        }
        tokenizationState.forward(2);
        while (!isAtEnd(tokenizationState.currentChar()) && tokenizationState.currentChar() != '}') {
            char cCurrentChar = tokenizationState.currentChar();
            if (cCurrentChar == '?') {
                list.add(Token.Operator.TernaryIf.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (cCurrentChar == ':') {
                list.add(Token.Operator.TernaryElse.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (cCurrentChar == '+') {
                if (isUnaryOperator(list)) {
                    token = Token.Operator.Unary.Plus.INSTANCE;
                } else if (isOperator(list)) {
                    token = Token.Operator.Binary.Sum.Plus.INSTANCE;
                } else {
                    throw invalidToken(tokenizationState);
                }
                list.add(token);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (cCurrentChar == '-') {
                if (isUnaryOperator(list)) {
                    token2 = Token.Operator.Unary.Minus.INSTANCE;
                } else if (isOperator(list)) {
                    token2 = Token.Operator.Binary.Sum.Minus.INSTANCE;
                } else {
                    throw invalidToken(tokenizationState);
                }
                list.add(token2);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (cCurrentChar == '*') {
                list.add(Token.Operator.Binary.Factor.Multiplication.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (cCurrentChar == '/') {
                list.add(Token.Operator.Binary.Factor.Division.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (cCurrentChar == '%') {
                list.add(Token.Operator.Binary.Factor.Modulo.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (cCurrentChar == '!') {
                if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) == '=') {
                    list.add(Token.Operator.Binary.Equality.NotEqual.INSTANCE);
                    tokenizationState.forward(2);
                } else if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) == ':') {
                    list.add(Token.Operator.Try.INSTANCE);
                    tokenizationState.forward(2);
                } else if (isUnaryOperator(list)) {
                    list.add(Token.Operator.Unary.Not.INSTANCE);
                    TokenizationState.forward$default(tokenizationState, 0, 1, null);
                } else {
                    throw invalidToken(tokenizationState);
                }
            } else if (cCurrentChar == '&') {
                if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) == '&') {
                    list.add(Token.Operator.Binary.Logical.And.INSTANCE);
                    tokenizationState.forward(2);
                } else {
                    throw invalidToken(tokenizationState);
                }
            } else if (cCurrentChar == '|') {
                if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) == '|') {
                    list.add(Token.Operator.Binary.Logical.Or.INSTANCE);
                    tokenizationState.forward(2);
                } else {
                    throw invalidToken(tokenizationState);
                }
            } else if (cCurrentChar == '<') {
                if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) == '=') {
                    list.add(Token.Operator.Binary.Comparison.LessOrEqual.INSTANCE);
                    tokenizationState.forward(2);
                } else {
                    list.add(Token.Operator.Binary.Comparison.Less.INSTANCE);
                    TokenizationState.forward$default(tokenizationState, 0, 1, null);
                }
            } else if (cCurrentChar == '>') {
                if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) == '=') {
                    list.add(Token.Operator.Binary.Comparison.GreaterOrEqual.INSTANCE);
                    tokenizationState.forward(2);
                } else {
                    list.add(Token.Operator.Binary.Comparison.Greater.INSTANCE);
                    TokenizationState.forward$default(tokenizationState, 0, 1, null);
                }
            } else if (cCurrentChar == '=') {
                if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) == '=') {
                    list.add(Token.Operator.Binary.Equality.Equal.INSTANCE);
                    tokenizationState.forward(2);
                } else {
                    throw invalidToken(tokenizationState);
                }
            } else if (cCurrentChar == '(') {
                list.add(Token$Bracket$LeftRound.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (cCurrentChar == ')') {
                list.add(Token$Bracket$RightRound.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (cCurrentChar == ',') {
                list.add(Token.Function.ArgumentDelimiter.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (cCurrentChar == '\'') {
                processStringTemplate$default(this, tokenizationState, list, false, 4, null);
            } else if (isWhiteSpace(tokenizationState.currentChar())) {
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (isDecimal(tokenizationState.currentChar(), TokenizationState.prevChar$default(tokenizationState, 0, 1, null), TokenizationState.nextChar$default(tokenizationState, 0, 1, null))) {
                processNumber(tokenizationState, list);
            } else if (isAlphabetic(tokenizationState.currentChar())) {
                processIdentifier(tokenizationState, list);
            } else if (isDot(tokenizationState.currentChar())) {
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
                list.add(Token.Operator.Dot.INSTANCE);
            } else {
                throw invalidToken(tokenizationState);
            }
        }
        if (isAtEndOfExpression(tokenizationState.currentChar())) {
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
            return true;
        }
        throw new TokenizingException("'}' expected at end of expression at " + tokenizationState.getIndex(), null, 2, null);
    }

    private final void processIdentifier(TokenizationState tokenizationState, List<Token> list) {
        Token.Function function;
        int iIntValue;
        int index = tokenizationState.getIndex();
        Integer numValueOf = null;
        while (true) {
            int index2 = tokenizationState.getIndex();
            while (isValidIdentifier(tokenizationState.currentChar())) {
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            }
            if (isDot(tokenizationState.currentChar())) {
                numValueOf = Integer.valueOf(tokenizationState.getIndex() + 1);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
                if (numValueOf.intValue() - index2 <= 1) {
                    throw new EvaluableException("Unexpected token: .", null, 2, null);
                }
            }
            if (!isValidIdentifier(tokenizationState.currentChar()) && !isDot(tokenizationState.currentChar())) {
                int index3 = tokenizationState.getIndex();
                while (isWhiteSpace(tokenizationState.currentChar())) {
                    TokenizationState.forward$default(tokenizationState, 0, 1, null);
                }
                if (tokenizationState.currentChar() == '(') {
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = index;
                    }
                    function = new Token.Function(tokenizationState.part(iIntValue, index3));
                    if (numValueOf == null) {
                        list.add(function);
                        return;
                    }
                    index3 = numValueOf.intValue() - 1;
                } else {
                    function = null;
                }
                String strPart = tokenizationState.part(index, index3);
                Tokenizer tokenizer = INSTANCE;
                if (!tokenizer.processKeyword(strPart, list)) {
                    if (!tokenizer.isDot(tokenizationState.charAt(index3 - 1))) {
                        list.add(Token.Operand.Variable.m3358boximpl(Token.Operand.Variable.m3359constructorimpl(strPart)));
                    } else {
                        throw new EvaluableException("Unexpected token: .", null, 2, null);
                    }
                }
                if (function != null) {
                    list.add(Token.Operator.Dot.INSTANCE);
                    list.add(function);
                    return;
                }
                return;
            }
        }
    }

    private final void processNumber(TokenizationState tokenizationState, List<Token> list) {
        String strPart;
        String strPart2;
        int index = tokenizationState.getIndex();
        boolean z10 = b0.s0(list) instanceof Token.Operator.Unary.Minus;
        if (z10) {
            nj.x.L(list);
        }
        do {
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
        } while (Character.isDigit(tokenizationState.currentChar()));
        if (tokenizationState.charAt(index) != '.' && !isDecimal(tokenizationState.currentChar(), TokenizationState.prevChar$default(tokenizationState, 0, 1, null), TokenizationState.nextChar$default(tokenizationState, 0, 1, null))) {
            if (z10) {
                strPart2 = '-' + tokenizationState.part(index, tokenizationState.getIndex());
            } else {
                strPart2 = tokenizationState.part(index, tokenizationState.getIndex());
            }
            try {
                list.add(Token.Operand.Literal.Num.m3346boximpl(Token.Operand.Literal.Num.m3347constructorimpl(Long.valueOf(Long.parseLong(strPart2)))));
                return;
            } catch (Exception unused) {
                throw new EvaluableException("Value " + strPart2 + " can't be converted to Integer type.", null, 2, null);
            }
        }
        while (isDecimal(tokenizationState.currentChar(), TokenizationState.prevChar$default(tokenizationState, 0, 1, null), TokenizationState.nextChar$default(tokenizationState, 0, 1, null))) {
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
        }
        if (z10) {
            strPart = '-' + tokenizationState.part(index, tokenizationState.getIndex());
        } else {
            strPart = tokenizationState.part(index, tokenizationState.getIndex());
        }
        try {
            list.add(Token.Operand.Literal.Num.m3346boximpl(Token.Operand.Literal.Num.m3347constructorimpl(Double.valueOf(Double.parseDouble(strPart)))));
        } catch (Exception unused2) {
            throw new EvaluableException("Value " + strPart + " can't be converted to Number type.", null, 2, null);
        }
    }

    /* JADX INFO: renamed from: processString-wB-4SYI, reason: not valid java name */
    private final String m3365processStringwB4SYI(TokenizationState tokenizationState, boolean z10) {
        boolean z11;
        int index = tokenizationState.getIndex();
        while (true) {
            z11 = true;
            if (isAtEndOfString(tokenizationState, z10)) {
                break;
            }
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
        }
        String strProcess$default = LiteralsEscaper.process$default(LiteralsEscaper.INSTANCE, tokenizationState.part(index, tokenizationState.getIndex()), null, 2, null);
        if (strProcess$default.length() <= 0) {
            z11 = false;
        }
        if (!z11) {
            return null;
        }
        return Token.Operand.Literal.Str.m3353constructorimpl(strProcess$default);
    }
}
