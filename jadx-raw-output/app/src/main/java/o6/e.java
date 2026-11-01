package o6;

import com.google.zxing.NotFoundException;

/* JADX INFO: compiled from: AI013x0x1xDecoder.java */
/* JADX INFO: loaded from: classes11.dex */
public final class e extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f65093d;

    @Override // o6.i
    public void h(StringBuilder sb2, int i10) {
        sb2.append('(');
        sb2.append(this.f65093d);
        sb2.append(i10 / 100000);
        sb2.append(')');
    }

    public e(c6.a aVar, String str, String str2) {
        super(aVar);
        this.f65092c = str2;
        this.f65093d = str;
    }

    @Override // o6.j
    public String d() throws NotFoundException {
        if (c().l() == 84) {
            StringBuilder sb2 = new StringBuilder();
            f(sb2, 8);
            j(sb2, 48, 20);
            k(sb2, 68);
            return sb2.toString();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // o6.i
    public int i(int i10) {
        return i10 % 100000;
    }

    public final void k(StringBuilder sb2, int i10) {
        int iF = b().f(i10, 16);
        if (iF == 38400) {
            return;
        }
        sb2.append('(');
        sb2.append(this.f65092c);
        sb2.append(')');
        int i11 = iF % 32;
        int i12 = iF / 32;
        int i13 = (i12 % 12) + 1;
        int i14 = i12 / 12;
        if (i14 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i14);
        if (i13 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i13);
        if (i11 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i11);
    }
}
