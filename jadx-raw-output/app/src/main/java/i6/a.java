package i6;

/* JADX INFO: compiled from: ASCIIEncoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements g {
    public int c() {
        return 0;
    }

    public static char b(char c10, char c11) {
        if (j.f(c10) && j.f(c11)) {
            return (char) (((c10 - '0') * 10) + (c11 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c10 + c11);
    }

    @Override // i6.g
    public void a(h hVar) {
        if (j.a(hVar.d(), hVar.f54073f) >= 2) {
            hVar.r(b(hVar.d().charAt(hVar.f54073f), hVar.d().charAt(hVar.f54073f + 1)));
            hVar.f54073f += 2;
            return;
        }
        char c10 = hVar.c();
        int iN = j.n(hVar.d(), hVar.f54073f, c());
        if (iN != c()) {
            if (iN != 1) {
                if (iN != 2) {
                    if (iN != 3) {
                        if (iN != 4) {
                            if (iN == 5) {
                                hVar.r((char) 231);
                                hVar.o(5);
                                return;
                            }
                            throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(iN)));
                        }
                        hVar.r((char) 240);
                        hVar.o(4);
                        return;
                    }
                    hVar.r((char) 238);
                    hVar.o(3);
                    return;
                }
                hVar.r((char) 239);
                hVar.o(2);
                return;
            }
            hVar.r((char) 230);
            hVar.o(1);
            return;
        }
        if (j.g(c10)) {
            hVar.r((char) 235);
            hVar.r((char) ((c10 - 128) + 1));
            hVar.f54073f++;
        } else {
            hVar.r((char) (c10 + 1));
            hVar.f54073f++;
        }
    }
}
