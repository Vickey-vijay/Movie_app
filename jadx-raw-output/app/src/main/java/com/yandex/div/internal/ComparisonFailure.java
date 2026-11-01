package com.yandex.div.internal;

import ck.i;
import ck.p;

/* JADX INFO: compiled from: ComparisonFailure.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ComparisonFailure extends AssertionError {
    private static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 1;
    private final String actual;
    private final String expected;

    /* JADX INFO: compiled from: ComparisonFailure.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: ComparisonFailure.kt */
    public static final class ComparisonCompactor {
        public static final Companion Companion = new Companion(null);
        private final String actual;
        private final int contextLength;
        private final String expected;
        private int prefix;
        private int suffix;

        /* JADX INFO: compiled from: ComparisonFailure.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }
        }

        private final void findCommonPrefix() {
            this.prefix = 0;
            String str = this.expected;
            p.g(str);
            int length = str.length();
            String str2 = this.actual;
            p.g(str2);
            int iMin = Math.min(length, str2.length());
            while (true) {
                int i10 = this.prefix;
                if (i10 >= iMin || this.expected.charAt(i10) != this.actual.charAt(this.prefix)) {
                    return;
                } else {
                    this.prefix++;
                }
            }
        }

        private final boolean areStringsEqual() {
            return p.e(this.expected, this.actual);
        }

        private final String compactString(String str) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            String strSubstring = str.substring(this.prefix, (str.length() - this.suffix) + 1);
            p.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(strSubstring);
            sb2.append(']');
            String string = sb2.toString();
            if (this.prefix > 0) {
                string = computeCommonPrefix() + string;
            }
            if (this.suffix <= 0) {
                return string;
            }
            return string + computeCommonSuffix();
        }

        private final String computeCommonPrefix() {
            String str = this.prefix > this.contextLength ? "..." : "";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            String str2 = this.expected;
            p.g(str2);
            String strSubstring = str2.substring(Math.max(0, this.prefix - this.contextLength), this.prefix);
            p.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(strSubstring);
            return sb2.toString();
        }

        private final String computeCommonSuffix() {
            String str = this.expected;
            p.g(str);
            int iMin = Math.min((str.length() - this.suffix) + 1 + this.contextLength, this.expected.length());
            String str2 = (this.expected.length() - this.suffix) + 1 < this.expected.length() - this.contextLength ? "..." : "";
            StringBuilder sb2 = new StringBuilder();
            String str3 = this.expected;
            String strSubstring = str3.substring((str3.length() - this.suffix) + 1, iMin);
            p.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(strSubstring);
            sb2.append(str2);
            return sb2.toString();
        }

        private final void findCommonSuffix() {
            String str = this.expected;
            p.g(str);
            int length = str.length() - 1;
            String str2 = this.actual;
            p.g(str2);
            int length2 = str2.length() - 1;
            while (true) {
                int i10 = this.prefix;
                if (length2 < i10 || length < i10 || this.expected.charAt(length) != this.actual.charAt(length2)) {
                    break;
                }
                length2--;
                length--;
            }
            this.suffix = this.expected.length() - length;
        }

        public final String compact(String str) {
            if (this.expected == null || this.actual == null || areStringsEqual()) {
                return Assert.format(str, this.expected, this.actual);
            }
            findCommonPrefix();
            findCommonSuffix();
            return Assert.format(str, compactString(this.expected), compactString(this.actual));
        }

        public ComparisonCompactor(int i10, String str, String str2) {
            this.contextLength = i10;
            this.expected = str;
            this.actual = str2;
        }
    }

    public final String getActual() {
        return this.actual;
    }

    public final String getExpected() {
        return this.expected;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return new ComparisonCompactor(20, this.expected, this.actual).compact(super.getMessage());
    }

    public ComparisonFailure(String str, String str2, String str3) {
        super(str);
        this.expected = str2;
        this.actual = str3;
    }
}
