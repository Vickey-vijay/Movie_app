package dl;

import com.ironsource.C3426d4;
import java.util.ArrayList;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: AbstractJsonLexer.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f52133a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f52135c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f52134b = new g0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public StringBuilder f52136d = new StringBuilder();

    public abstract CharSequence D();

    public final boolean E(char c10) {
        return !(((c10 == '}' || c10 == ']') || c10 == ':') || c10 == ',');
    }

    public abstract int H(int i10);

    public abstract boolean M();

    public abstract boolean f();

    public abstract String k();

    public abstract String l(String str, boolean z10);

    public abstract byte m();

    public void v() {
    }

    public final Void z(byte b10) {
        String str;
        if (b10 == 1) {
            str = "quotation mark '\"'";
        } else if (b10 == 4) {
            str = "comma ','";
        } else if (b10 == 5) {
            str = "colon ':'";
        } else if (b10 == 6) {
            str = "start of the object '{'";
        } else if (b10 == 7) {
            str = "end of the object '}'";
        } else if (b10 == 8) {
            str = "start of the array '['";
        } else {
            str = b10 == 9 ? "end of the array ']'" : "valid token";
        }
        y(this, "Expected " + str + ", but had '" + ((this.f52133a == D().length() || this.f52133a <= 0) ? "EOF" : String.valueOf(D().charAt(this.f52133a - 1))) + "' instead", this.f52133a - 1, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ boolean O(a aVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return aVar.N(z10);
    }

    public static /* synthetic */ Void y(a aVar, String str, int i10, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i11 & 2) != 0) {
            i10 = aVar.f52133a;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        return aVar.x(str, i10, str2);
    }

    public final void A(String str) {
        ck.p.j(str, C3426d4.i.W);
        x("Encountered an unknown key '" + str + '\'', lk.a0.r0(K(0, this.f52133a), str, 0, false, 6, null), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new KotlinNothingValueException();
    }

    public final StringBuilder C() {
        return this.f52136d;
    }

    public final void I(boolean z10) {
        ArrayList arrayList = new ArrayList();
        byte bF = F();
        if (bF != 8 && bF != 6) {
            s();
            return;
        }
        while (true) {
            byte bF2 = F();
            boolean z11 = true;
            if (bF2 != 1) {
                if (bF2 != 8 && bF2 != 6) {
                    z11 = false;
                }
                if (z11) {
                    arrayList.add(Byte.valueOf(bF2));
                } else if (bF2 == 9) {
                    if (((Number) nj.b0.r0(arrayList)).byteValue() != 8) {
                        throw f0.f(this.f52133a, "found ] instead of } at path: " + this.f52134b, D());
                    }
                    nj.x.K(arrayList);
                } else if (bF2 == 7) {
                    if (((Number) nj.b0.r0(arrayList)).byteValue() != 6) {
                        throw f0.f(this.f52133a, "found } instead of ] at path: " + this.f52134b, D());
                    }
                    nj.x.K(arrayList);
                } else if (bF2 == 10) {
                    y(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                m();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z10) {
                s();
            } else {
                k();
            }
        }
    }

    public int J() {
        int iH;
        char cCharAt;
        int i10 = this.f52133a;
        while (true) {
            iH = H(i10);
            if (iH == -1 || !((cCharAt = D().charAt(iH)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i10 = iH + 1;
        }
        this.f52133a = iH;
        return iH;
    }

    public final String L() {
        String str = this.f52135c;
        ck.p.g(str);
        this.f52135c = null;
        return str;
    }

    public final void P(char c10) {
        int i10 = this.f52133a - 1;
        this.f52133a = i10;
        if (i10 >= 0 && c10 == '\"' && ck.p.e(s(), "null")) {
            x("Expected string literal but 'null' literal was found", this.f52133a - 4, "Use 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.");
            throw new KotlinNothingValueException();
        }
        z(b.a(c10));
        throw new KotlinNothingValueException();
    }

    public final int d(CharSequence charSequence, int i10) {
        int i11 = i10 + 4;
        if (i11 < charSequence.length()) {
            this.f52136d.append((char) ((B(charSequence, i10) << 12) + (B(charSequence, i10 + 1) << 8) + (B(charSequence, i10 + 2) << 4) + B(charSequence, i10 + 3)));
            return i11;
        }
        this.f52133a = i10;
        v();
        if (this.f52133a + 4 < charSequence.length()) {
            return d(charSequence, this.f52133a);
        }
        y(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public void e(int i10, int i11) {
        this.f52136d.append(D(), i10, i11);
    }

    public final long p() {
        boolean z10;
        int iH = H(J());
        if (iH >= D().length() || iH == -1) {
            y(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (D().charAt(iH) == '\"') {
            iH++;
            if (iH == D().length()) {
                y(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = iH;
        long j10 = 0;
        boolean z11 = true;
        boolean z12 = false;
        while (z11) {
            char cCharAt = D().charAt(i10);
            if (cCharAt != '-') {
                if (b.a(cCharAt) != 0) {
                    break;
                }
                i10++;
                z11 = i10 != D().length();
                int i11 = cCharAt - '0';
                if (!(i11 >= 0 && i11 < 10)) {
                    y(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                j10 = (j10 * ((long) 10)) - ((long) i11);
                if (j10 > 0) {
                    y(this, "Numeric value overflow", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                if (i10 != iH) {
                    y(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                i10++;
                z12 = true;
            }
        }
        if (iH == i10 || (z12 && iH == i10 - 1)) {
            y(this, "Expected numeric literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (z10) {
            if (!z11) {
                y(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (D().charAt(i10) != '\"') {
                y(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            i10++;
        }
        this.f52133a = i10;
        if (z12) {
            return j10;
        }
        if (j10 != Long.MIN_VALUE) {
            return -j10;
        }
        y(this, "Numeric value overflow", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final String q() {
        return this.f52135c != null ? L() : k();
    }

    public final String r(CharSequence charSequence, int i10, int i11) {
        int iH;
        ck.p.j(charSequence, "source");
        char cCharAt = charSequence.charAt(i11);
        boolean z10 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                iH = H(c(i10, i11));
                if (iH == -1) {
                    y(this, "EOF", iH, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                i11++;
                if (i11 >= charSequence.length()) {
                    e(i10, i11);
                    iH = H(i11);
                    if (iH == -1) {
                        y(this, "EOF", iH, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    continue;
                }
                cCharAt = charSequence.charAt(i11);
            }
            z10 = true;
            i10 = iH;
            i11 = i10;
            cCharAt = charSequence.charAt(i11);
        }
        String strK = !z10 ? K(i10, i11) : u(i10, i11);
        this.f52133a = i11 + 1;
        return strK;
    }

    public final String s() {
        if (this.f52135c != null) {
            return L();
        }
        int iJ = J();
        if (iJ >= D().length() || iJ == -1) {
            y(this, "EOF", iJ, null, 4, null);
            throw new KotlinNothingValueException();
        }
        byte bA = b.a(D().charAt(iJ));
        if (bA == 1) {
            return q();
        }
        if (bA != 0) {
            y(this, "Expected beginning of the string, but got " + D().charAt(iJ), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        boolean z10 = false;
        while (b.a(D().charAt(iJ)) == 0) {
            iJ++;
            if (iJ >= D().length()) {
                e(this.f52133a, iJ);
                int iH = H(iJ);
                if (iH == -1) {
                    this.f52133a = iJ;
                    return u(0, 0);
                }
                iJ = iH;
                z10 = true;
            }
        }
        String strK = !z10 ? K(this.f52133a, iJ) : u(this.f52133a, iJ);
        this.f52133a = iJ;
        return strK;
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) D()) + "', currentPosition=" + this.f52133a + ')';
    }

    public final Void x(String str, int i10, String str2) {
        String str3;
        ck.p.j(str, "message");
        ck.p.j(str2, "hint");
        if (str2.length() == 0) {
            str3 = "";
        } else {
            str3 = '\n' + str2;
        }
        throw f0.f(i10, str + " at path: " + this.f52134b.a() + str3, D());
    }

    public final int B(CharSequence charSequence, int i10) {
        boolean z10;
        boolean z11;
        char cCharAt = charSequence.charAt(i10);
        boolean z12 = true;
        if ('0' <= cCharAt && cCharAt < ':') {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return cCharAt - '0';
        }
        char c10 = 'a';
        if ('a' <= cCharAt && cCharAt < 'g') {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            c10 = 'A';
            if ('A' > cCharAt || cCharAt >= 'G') {
                z12 = false;
            }
            if (!z12) {
                y(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        return (cCharAt - c10) + 10;
    }

    public final byte F() {
        CharSequence charSequenceD = D();
        int i10 = this.f52133a;
        while (true) {
            int iH = H(i10);
            if (iH != -1) {
                char cCharAt = charSequenceD.charAt(iH);
                if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                    this.f52133a = iH;
                    return b.a(cCharAt);
                }
                i10 = iH + 1;
            } else {
                this.f52133a = iH;
                return (byte) 10;
            }
        }
    }

    public final String G(boolean z10) {
        String strQ;
        byte bF = F();
        if (z10) {
            if (bF != 1 && bF != 0) {
                return null;
            }
            strQ = s();
        } else {
            if (bF != 1) {
                return null;
            }
            strQ = q();
        }
        this.f52135c = strQ;
        return strQ;
    }

    public String K(int i10, int i11) {
        return D().subSequence(i10, i11).toString();
    }

    public final boolean N(boolean z10) {
        int iH = H(J());
        int length = D().length() - iH;
        if (length < 4 || iH == -1) {
            return false;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if ("null".charAt(i10) != D().charAt(iH + i10)) {
                return false;
            }
        }
        if (length > 4 && b.a(D().charAt(iH + 4)) == 0) {
            return false;
        }
        if (z10) {
            this.f52133a = iH + 4;
            return true;
        }
        return true;
    }

    public final boolean Q() {
        if (D().charAt(this.f52133a - 1) != '\"') {
            return true;
        }
        return false;
    }

    public final int b(int i10) {
        int iH = H(i10);
        if (iH != -1) {
            int i11 = iH + 1;
            char cCharAt = D().charAt(iH);
            if (cCharAt == 'u') {
                return d(D(), i11);
            }
            char cB = b.b(cCharAt);
            if (cB != 0) {
                this.f52136d.append(cB);
                return i11;
            }
            y(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        y(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final int c(int i10, int i11) {
        e(i10, i11);
        return b(i11 + 1);
    }

    public final boolean g() {
        return h(J());
    }

    public final boolean h(int i10) {
        int iH = H(i10);
        if (iH < D().length() && iH != -1) {
            int i11 = iH + 1;
            int iCharAt = D().charAt(iH) | ' ';
            if (iCharAt != 102) {
                if (iCharAt == 116) {
                    j("rue", i11);
                    return true;
                }
                y(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            j("alse", i11);
            return false;
        }
        y(this, "EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final boolean i() {
        boolean z10;
        int iJ = J();
        if (iJ != D().length()) {
            if (D().charAt(iJ) == '\"') {
                iJ++;
                z10 = true;
            } else {
                z10 = false;
            }
            boolean zH = h(iJ);
            if (z10) {
                if (this.f52133a != D().length()) {
                    if (D().charAt(this.f52133a) == '\"') {
                        this.f52133a++;
                    } else {
                        y(this, "Expected closing quotation mark", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    y(this, "EOF", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
            return zH;
        }
        y(this, "EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final void j(String str, int i10) {
        if (D().length() - i10 >= str.length()) {
            int length = str.length();
            for (int i11 = 0; i11 < length; i11++) {
                if (str.charAt(i11) != (D().charAt(i10 + i11) | ' ')) {
                    y(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
            this.f52133a = i10 + str.length();
            return;
        }
        y(this, "Unexpected end of boolean literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final byte n(byte b10) {
        byte bM = m();
        if (bM == b10) {
            return bM;
        }
        z(b10);
        throw new KotlinNothingValueException();
    }

    public void o(char c10) {
        v();
        CharSequence charSequenceD = D();
        int i10 = this.f52133a;
        while (true) {
            int iH = H(i10);
            if (iH != -1) {
                int i11 = iH + 1;
                char cCharAt = charSequenceD.charAt(iH);
                if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                    this.f52133a = i11;
                    if (cCharAt == c10) {
                        return;
                    } else {
                        P(c10);
                    }
                }
                i10 = i11;
            } else {
                this.f52133a = iH;
                P(c10);
                return;
            }
        }
    }

    public final String t() {
        String strS = s();
        if (ck.p.e(strS, "null") && Q()) {
            y(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return strS;
    }

    public final String u(int i10, int i11) {
        e(i10, i11);
        String string = this.f52136d.toString();
        ck.p.i(string, "escapedString.toString()");
        this.f52136d.setLength(0);
        return string;
    }

    public final void w() {
        if (m() == 10) {
            return;
        }
        y(this, "Expected EOF after parsing, but had " + D().charAt(this.f52133a - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }
}
