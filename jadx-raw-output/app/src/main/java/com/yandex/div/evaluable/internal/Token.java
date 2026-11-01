package com.yandex.div.evaluable.internal;

import ck.p;
import com.google.android.material.badge.BadgeDrawable;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: compiled from: Token.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface Token {

    /* JADX INFO: compiled from: Token.kt */
    public static final class Function implements Token {
        private final String name;

        /* JADX INFO: compiled from: Token.kt */
        public static final class ArgumentDelimiter implements Token {
            public static final ArgumentDelimiter INSTANCE = new ArgumentDelimiter();

            private ArgumentDelimiter() {
            }

            public String toString() {
                return StringUtils.COMMA;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Function) && p.e(this.name, ((Function) obj).name);
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return "Function(name=" + this.name + ')';
        }

        public Function(String str) {
            p.j(str, "name");
            this.name = str;
        }

        public final String getName() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: Token.kt */
    public interface Operand extends Token {

        /* JADX INFO: compiled from: Token.kt */
        public interface Literal extends Operand {

            /* JADX INFO: compiled from: Token.kt */
            public static final class Bool implements Literal {
                private final boolean value;

                /* JADX INFO: renamed from: box-impl, reason: not valid java name */
                public static final /* synthetic */ Bool m3340boximpl(boolean z10) {
                    return new Bool(z10);
                }

                /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
                public static boolean m3341constructorimpl(boolean z10) {
                    return z10;
                }

                /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
                public static boolean m3342equalsimpl(boolean z10, Object obj) {
                    return (obj instanceof Bool) && z10 == ((Bool) obj).m3345unboximpl();
                }

                /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
                public static int m3343hashCodeimpl(boolean z10) {
                    if (z10) {
                        return 1;
                    }
                    return z10 ? 1 : 0;
                }

                /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
                public static String m3344toStringimpl(boolean z10) {
                    return "Bool(value=" + z10 + ')';
                }

                public boolean equals(Object obj) {
                    return m3342equalsimpl(this.value, obj);
                }

                public int hashCode() {
                    return m3343hashCodeimpl(this.value);
                }

                public String toString() {
                    return m3344toStringimpl(this.value);
                }

                /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
                public final /* synthetic */ boolean m3345unboximpl() {
                    return this.value;
                }

                private /* synthetic */ Bool(boolean z10) {
                    this.value = z10;
                }
            }

            /* JADX INFO: compiled from: Token.kt */
            public static final class Num implements Literal {
                private final Number value;

                /* JADX INFO: renamed from: box-impl, reason: not valid java name */
                public static final /* synthetic */ Num m3346boximpl(Number number) {
                    return new Num(number);
                }

                /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
                public static Number m3347constructorimpl(Number number) {
                    p.j(number, "value");
                    return number;
                }

                /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
                public static boolean m3348equalsimpl(Number number, Object obj) {
                    return (obj instanceof Num) && p.e(number, ((Num) obj).m3351unboximpl());
                }

                /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
                public static int m3349hashCodeimpl(Number number) {
                    return number.hashCode();
                }

                /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
                public static String m3350toStringimpl(Number number) {
                    return "Num(value=" + number + ')';
                }

                public boolean equals(Object obj) {
                    return m3348equalsimpl(this.value, obj);
                }

                public int hashCode() {
                    return m3349hashCodeimpl(this.value);
                }

                public String toString() {
                    return m3350toStringimpl(this.value);
                }

                /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
                public final /* synthetic */ Number m3351unboximpl() {
                    return this.value;
                }

                private /* synthetic */ Num(Number number) {
                    this.value = number;
                }
            }

            /* JADX INFO: compiled from: Token.kt */
            public static final class Str implements Literal {
                private final String value;

                /* JADX INFO: renamed from: box-impl, reason: not valid java name */
                public static final /* synthetic */ Str m3352boximpl(String str) {
                    return new Str(str);
                }

                /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
                public static String m3353constructorimpl(String str) {
                    p.j(str, "value");
                    return str;
                }

                /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
                public static boolean m3354equalsimpl(String str, Object obj) {
                    return (obj instanceof Str) && p.e(str, ((Str) obj).m3357unboximpl());
                }

                /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
                public static int m3355hashCodeimpl(String str) {
                    return str.hashCode();
                }

                /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
                public static String m3356toStringimpl(String str) {
                    return "Str(value=" + str + ')';
                }

                public boolean equals(Object obj) {
                    return m3354equalsimpl(this.value, obj);
                }

                public int hashCode() {
                    return m3355hashCodeimpl(this.value);
                }

                public String toString() {
                    return m3356toStringimpl(this.value);
                }

                /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
                public final /* synthetic */ String m3357unboximpl() {
                    return this.value;
                }

                private /* synthetic */ Str(String str) {
                    this.value = str;
                }
            }
        }

        /* JADX INFO: compiled from: Token.kt */
        public static final class Variable implements Operand {
            private final String name;

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Variable m3358boximpl(String str) {
                return new Variable(str);
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static String m3359constructorimpl(String str) {
                p.j(str, "name");
                return str;
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m3360equalsimpl(String str, Object obj) {
                return (obj instanceof Variable) && p.e(str, ((Variable) obj).m3364unboximpl());
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m3361equalsimpl0(String str, String str2) {
                return p.e(str, str2);
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m3362hashCodeimpl(String str) {
                return str.hashCode();
            }

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m3363toStringimpl(String str) {
                return "Variable(name=" + str + ')';
            }

            public boolean equals(Object obj) {
                return m3360equalsimpl(this.name, obj);
            }

            public int hashCode() {
                return m3362hashCodeimpl(this.name);
            }

            public String toString() {
                return m3363toStringimpl(this.name);
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ String m3364unboximpl() {
                return this.name;
            }

            private /* synthetic */ Variable(String str) {
                this.name = str;
            }
        }
    }

    /* JADX INFO: compiled from: Token.kt */
    public interface Operator extends Token {

        /* JADX INFO: compiled from: Token.kt */
        public interface Binary extends Operator {

            /* JADX INFO: compiled from: Token.kt */
            public interface Comparison extends Binary {

                /* JADX INFO: compiled from: Token.kt */
                public static final class Greater implements Comparison {
                    public static final Greater INSTANCE = new Greater();

                    private Greater() {
                    }

                    public String toString() {
                        return ">";
                    }
                }

                /* JADX INFO: compiled from: Token.kt */
                public static final class GreaterOrEqual implements Comparison {
                    public static final GreaterOrEqual INSTANCE = new GreaterOrEqual();

                    private GreaterOrEqual() {
                    }

                    public String toString() {
                        return ">=";
                    }
                }

                /* JADX INFO: compiled from: Token.kt */
                public static final class Less implements Comparison {
                    public static final Less INSTANCE = new Less();

                    private Less() {
                    }

                    public String toString() {
                        return "<";
                    }
                }

                /* JADX INFO: compiled from: Token.kt */
                public static final class LessOrEqual implements Comparison {
                    public static final LessOrEqual INSTANCE = new LessOrEqual();

                    private LessOrEqual() {
                    }

                    public String toString() {
                        return "<=";
                    }
                }
            }

            /* JADX INFO: compiled from: Token.kt */
            public interface Equality extends Binary {

                /* JADX INFO: compiled from: Token.kt */
                public static final class Equal implements Equality {
                    public static final Equal INSTANCE = new Equal();

                    private Equal() {
                    }

                    public String toString() {
                        return "==";
                    }
                }

                /* JADX INFO: compiled from: Token.kt */
                public static final class NotEqual implements Equality {
                    public static final NotEqual INSTANCE = new NotEqual();

                    private NotEqual() {
                    }

                    public String toString() {
                        return "!=";
                    }
                }
            }

            /* JADX INFO: compiled from: Token.kt */
            public interface Factor extends Binary {

                /* JADX INFO: compiled from: Token.kt */
                public static final class Division implements Factor {
                    public static final Division INSTANCE = new Division();

                    private Division() {
                    }

                    public String toString() {
                        return "/";
                    }
                }

                /* JADX INFO: compiled from: Token.kt */
                public static final class Modulo implements Factor {
                    public static final Modulo INSTANCE = new Modulo();

                    private Modulo() {
                    }

                    public String toString() {
                        return "%";
                    }
                }

                /* JADX INFO: compiled from: Token.kt */
                public static final class Multiplication implements Factor {
                    public static final Multiplication INSTANCE = new Multiplication();

                    private Multiplication() {
                    }

                    public String toString() {
                        return "*";
                    }
                }
            }

            /* JADX INFO: compiled from: Token.kt */
            public interface Logical extends Binary {

                /* JADX INFO: compiled from: Token.kt */
                public static final class And implements Logical {
                    public static final And INSTANCE = new And();

                    private And() {
                    }

                    public String toString() {
                        return "&&";
                    }
                }

                /* JADX INFO: compiled from: Token.kt */
                public static final class Or implements Logical {
                    public static final Or INSTANCE = new Or();

                    private Or() {
                    }

                    public String toString() {
                        return ImpressionLog.P;
                    }
                }
            }

            /* JADX INFO: compiled from: Token.kt */
            public static final class Power implements Binary {
                public static final Power INSTANCE = new Power();

                private Power() {
                }

                public String toString() {
                    return "^";
                }
            }

            /* JADX INFO: compiled from: Token.kt */
            public interface Sum extends Binary {

                /* JADX INFO: compiled from: Token.kt */
                public static final class Minus implements Sum {
                    public static final Minus INSTANCE = new Minus();

                    private Minus() {
                    }

                    public String toString() {
                        return "-";
                    }
                }

                /* JADX INFO: compiled from: Token.kt */
                public static final class Plus implements Sum {
                    public static final Plus INSTANCE = new Plus();

                    private Plus() {
                    }

                    public String toString() {
                        return BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX;
                    }
                }
            }
        }

        /* JADX INFO: compiled from: Token.kt */
        public static final class Dot implements Operator {
            public static final Dot INSTANCE = new Dot();

            private Dot() {
            }

            public String toString() {
                return ".";
            }
        }

        /* JADX INFO: compiled from: Token.kt */
        public static final class TernaryElse implements Operator {
            public static final TernaryElse INSTANCE = new TernaryElse();

            private TernaryElse() {
            }

            public String toString() {
                return StringUtils.PROCESS_POSTFIX_DELIMITER;
            }
        }

        /* JADX INFO: compiled from: Token.kt */
        public static final class TernaryIf implements Operator {
            public static final TernaryIf INSTANCE = new TernaryIf();

            private TernaryIf() {
            }

            public String toString() {
                return "?";
            }
        }

        /* JADX INFO: compiled from: Token.kt */
        public static final class TernaryIfElse implements Operator {
            public static final TernaryIfElse INSTANCE = new TernaryIfElse();

            private TernaryIfElse() {
            }
        }

        /* JADX INFO: compiled from: Token.kt */
        public static final class Try implements Operator {
            public static final Try INSTANCE = new Try();

            private Try() {
            }

            public String toString() {
                return "!:";
            }
        }

        /* JADX INFO: compiled from: Token.kt */
        public interface Unary extends Operator {

            /* JADX INFO: compiled from: Token.kt */
            public static final class Minus implements Unary {
                public static final Minus INSTANCE = new Minus();

                private Minus() {
                }

                public String toString() {
                    return "-";
                }
            }

            /* JADX INFO: compiled from: Token.kt */
            public static final class Not implements Unary {
                public static final Not INSTANCE = new Not();

                private Not() {
                }

                public String toString() {
                    return "!";
                }
            }

            /* JADX INFO: compiled from: Token.kt */
            public static final class Plus implements Unary {
                public static final Plus INSTANCE = new Plus();

                private Plus() {
                }

                public String toString() {
                    return BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX;
                }
            }
        }
    }
}
