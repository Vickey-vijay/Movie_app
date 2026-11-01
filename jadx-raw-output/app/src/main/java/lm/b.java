package lm;

import java.io.UnsupportedEncodingException;
import org.eclipse.jetty.util.MultiMap;
import org.eclipse.jetty.util.UrlEncoded;

/* JADX INFO: compiled from: EncodedHttpURI.java */
/* JADX INFO: loaded from: classes.dex */
public class b extends n {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f63740q;

    @Override // lm.n
    public void b(MultiMap multiMap) {
        int i10 = this.f63856k;
        int i11 = this.f63857l;
        if (i10 == i11) {
            return;
        }
        UrlEncoded.decodeTo(xm.o.h(this.f63847b, i10 + 1, (i11 - i10) - 1, this.f63740q), multiMap, this.f63740q);
    }

    @Override // lm.n
    public void c(MultiMap multiMap, String str) throws UnsupportedEncodingException {
        int i10 = this.f63856k;
        int i11 = this.f63857l;
        if (i10 == i11) {
            return;
        }
        if (str == null) {
            str = this.f63740q;
        }
        UrlEncoded.decodeTo(xm.o.h(this.f63847b, i10 + 1, (i11 - i10) - 1, str), multiMap, str);
    }

    @Override // lm.n
    public String d() {
        int i10 = this.f63854i;
        int i11 = this.f63858m;
        if (i10 == i11) {
            return null;
        }
        return xm.o.h(this.f63847b, i10, i11 - i10, this.f63740q);
    }

    @Override // lm.n
    public String e() {
        int i10 = this.f63854i;
        int i11 = this.f63855j;
        if (i10 == i11) {
            return null;
        }
        return xm.q.e(this.f63847b, i10, i11 - i10);
    }

    @Override // lm.n
    public String g() {
        int i10 = this.f63851f;
        int i11 = this.f63852g;
        if (i10 == i11) {
            return null;
        }
        return xm.o.h(this.f63847b, i10, i11 - i10, this.f63740q);
    }

    @Override // lm.n
    public String h() {
        int i10 = this.f63854i;
        int i11 = this.f63855j;
        if (i10 == i11) {
            return null;
        }
        return xm.o.h(this.f63847b, i10, i11 - i10, this.f63740q);
    }

    @Override // lm.n
    public String i() {
        int i10 = this.f63854i;
        int i11 = this.f63856k;
        if (i10 == i11) {
            return null;
        }
        return xm.o.h(this.f63847b, i10, i11 - i10, this.f63740q);
    }

    @Override // lm.n
    public int j() {
        int i10 = this.f63852g;
        int i11 = this.f63854i;
        if (i10 == i11) {
            return -1;
        }
        return xm.p.f(this.f63847b, i10 + 1, (i11 - i10) - 1, 10);
    }

    @Override // lm.n
    public String k() {
        int i10 = this.f63856k;
        int i11 = this.f63857l;
        if (i10 == i11) {
            return null;
        }
        return xm.o.h(this.f63847b, i10 + 1, (i11 - i10) - 1, this.f63740q);
    }

    @Override // lm.n
    public String m() {
        int i10 = this.f63849d;
        int i11 = this.f63850e;
        if (i10 == i11) {
            return null;
        }
        int i12 = i11 - i10;
        if (i12 == 5) {
            byte[] bArr = this.f63847b;
            if (bArr[i10] == 104 && bArr[i10 + 1] == 116 && bArr[i10 + 2] == 116 && bArr[i10 + 3] == 112) {
                return "http";
            }
        }
        if (i12 == 6) {
            byte[] bArr2 = this.f63847b;
            if (bArr2[i10] == 104 && bArr2[i10 + 1] == 116 && bArr2[i10 + 2] == 116 && bArr2[i10 + 3] == 112 && bArr2[i10 + 4] == 115) {
                return "https";
            }
        }
        return xm.o.h(this.f63847b, i10, (i11 - i10) - 1, this.f63740q);
    }

    @Override // lm.n
    public boolean n() {
        return this.f63857l > this.f63856k;
    }

    @Override // lm.n
    public String toString() {
        if (this.f63848c == null) {
            byte[] bArr = this.f63847b;
            int i10 = this.f63849d;
            this.f63848c = xm.o.h(bArr, i10, this.f63858m - i10, this.f63740q);
        }
        return this.f63848c;
    }

    public b(String str) {
        this.f63740q = str;
    }
}
