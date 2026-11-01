package dl;

import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: JsonLexer.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class u0 extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v0 f52195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final char[] f52196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f52197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f52198h;

    public /* synthetic */ u0(v0 v0Var, char[] cArr, int i10, ck.i iVar) {
        this(v0Var, (i10 & 2) != 0 ? o.f52173c.d() : cArr);
    }

    @Override // dl.a
    public String l(String str, boolean z10) {
        ck.p.j(str, "keyToMatch");
        return null;
    }

    @Override // dl.a
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public h D() {
        return this.f52198h;
    }

    public final void U() {
        o.f52173c.c(this.f52196f);
    }

    @Override // dl.a
    public String k() {
        o('\"');
        int i10 = this.f52133a;
        int iS = S('\"', i10);
        if (iS == -1) {
            int iH = H(i10);
            if (iH != -1) {
                return r(D(), this.f52133a, iH);
            }
            z((byte) 1);
            throw new KotlinNothingValueException();
        }
        for (int i11 = i10; i11 < iS; i11++) {
            if (D().charAt(i11) == '\\') {
                return r(D(), this.f52133a, i11);
            }
        }
        this.f52133a = iS + 1;
        return K(i10, iS);
    }

    @Override // dl.a
    public void v() {
        int length = D().length() - this.f52133a;
        if (length > this.f52197g) {
            return;
        }
        T(length);
    }

    public u0(v0 v0Var, char[] cArr) {
        ck.p.j(v0Var, "reader");
        ck.p.j(cArr, "buffer");
        this.f52195e = v0Var;
        this.f52196f = cArr;
        this.f52197g = 128;
        this.f52198h = new h(cArr);
        T(0);
    }

    @Override // dl.a
    public int H(int i10) {
        boolean z10;
        if (i10 < D().length()) {
            return i10;
        }
        this.f52133a = i10;
        v();
        if (this.f52133a == 0) {
            if (D().length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return 0;
            }
            return -1;
        }
        return -1;
    }

    @Override // dl.a
    public String K(int i10, int i11) {
        return D().e(i10, i11);
    }

    @Override // dl.a
    public boolean M() {
        int iJ = J();
        if (iJ >= D().length() || iJ == -1 || D().charAt(iJ) != ',') {
            return false;
        }
        this.f52133a++;
        return true;
    }

    public int S(char c10, int i10) {
        h hVarD = D();
        int length = hVarD.length();
        while (i10 < length) {
            if (hVarD.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final void T(int i10) {
        char[] cArr = D().f52151b;
        if (i10 != 0) {
            int i11 = this.f52133a;
            nj.l.h(cArr, cArr, 0, i11, i11 + i10);
        }
        int length = D().length();
        while (i10 != length) {
            int iA = this.f52195e.a(cArr, i10, length - i10);
            if (iA == -1) {
                D().f(i10);
                this.f52197g = -1;
                break;
            }
            i10 += iA;
        }
        this.f52133a = 0;
    }

    @Override // dl.a
    public void e(int i10, int i11) {
        StringBuilder sbC = C();
        sbC.append(D().f52151b, i10, i11 - i10);
        ck.p.i(sbC, "this.append(value, start…x, endIndex - startIndex)");
    }

    @Override // dl.a
    public boolean f() {
        v();
        int i10 = this.f52133a;
        while (true) {
            int iH = H(i10);
            if (iH != -1) {
                char cCharAt = D().charAt(iH);
                if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                    this.f52133a = iH;
                    return E(cCharAt);
                }
                i10 = iH + 1;
            } else {
                this.f52133a = iH;
                return false;
            }
        }
    }

    @Override // dl.a
    public byte m() {
        v();
        h hVarD = D();
        int i10 = this.f52133a;
        while (true) {
            int iH = H(i10);
            if (iH != -1) {
                int i11 = iH + 1;
                byte bA = b.a(hVarD.charAt(iH));
                if (bA != 3) {
                    this.f52133a = i11;
                    return bA;
                }
                i10 = i11;
            } else {
                this.f52133a = iH;
                return (byte) 10;
            }
        }
    }
}
