package dl;

import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: StringJsonLexer.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class z0 extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f52218e;

    public z0(String str) {
        ck.p.j(str, "source");
        this.f52218e = str;
    }

    @Override // dl.a
    public int J() {
        char cCharAt;
        int i10 = this.f52133a;
        if (i10 == -1) {
            return i10;
        }
        while (i10 < D().length() && ((cCharAt = D().charAt(i10)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i10++;
        }
        this.f52133a = i10;
        return i10;
    }

    @Override // dl.a
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public String D() {
        return this.f52218e;
    }

    @Override // dl.a
    public boolean f() {
        int i10 = this.f52133a;
        if (i10 == -1) {
            return false;
        }
        while (i10 < D().length()) {
            char cCharAt = D().charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f52133a = i10;
                return E(cCharAt);
            }
            i10++;
        }
        this.f52133a = i10;
        return false;
    }

    @Override // dl.a
    public String k() {
        o('\"');
        int i10 = this.f52133a;
        int iK0 = lk.a0.k0(D(), '\"', i10, false, 4, null);
        if (iK0 == -1) {
            z((byte) 1);
            throw new KotlinNothingValueException();
        }
        for (int i11 = i10; i11 < iK0; i11++) {
            if (D().charAt(i11) == '\\') {
                return r(D(), this.f52133a, i11);
            }
        }
        this.f52133a = iK0 + 1;
        String strSubstring = D().substring(i10, iK0);
        ck.p.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @Override // dl.a
    public String l(String str, boolean z10) {
        ck.p.j(str, "keyToMatch");
        int i10 = this.f52133a;
        try {
            if (m() != 6) {
                return null;
            }
            if (!ck.p.e(z10 ? k() : t(), str)) {
                return null;
            }
            if (m() != 5) {
                return null;
            }
            return z10 ? q() : t();
        } finally {
            this.f52133a = i10;
        }
    }

    @Override // dl.a
    public void o(char c10) {
        if (this.f52133a == -1) {
            P(c10);
        }
        String strD = D();
        while (this.f52133a < strD.length()) {
            int i10 = this.f52133a;
            this.f52133a = i10 + 1;
            char cCharAt = strD.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt == c10) {
                    return;
                } else {
                    P(c10);
                }
            }
        }
        P(c10);
    }

    @Override // dl.a
    public int H(int i10) {
        if (i10 >= D().length()) {
            return -1;
        }
        return i10;
    }

    @Override // dl.a
    public boolean M() {
        int iJ = J();
        if (iJ == D().length() || iJ == -1 || D().charAt(iJ) != ',') {
            return false;
        }
        this.f52133a++;
        return true;
    }

    @Override // dl.a
    public byte m() {
        byte bA;
        String strD = D();
        do {
            int i10 = this.f52133a;
            if (i10 != -1 && i10 < strD.length()) {
                int i11 = this.f52133a;
                this.f52133a = i11 + 1;
                bA = b.a(strD.charAt(i11));
            } else {
                return (byte) 10;
            }
        } while (bA == 3);
        return bA;
    }
}
