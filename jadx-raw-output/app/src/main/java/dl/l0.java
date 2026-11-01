package dl;

import java.util.Arrays;

/* JADX INFO: compiled from: JsonToStringWriter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f52164a = m.f52166c.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f52165b;

    @Override // dl.r0
    public void a(char c10) {
        e(1);
        char[] cArr = this.f52164a;
        int i10 = this.f52165b;
        this.f52165b = i10 + 1;
        cArr[i10] = c10;
    }

    public final int f(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = this.f52164a;
        if (cArr.length <= i12) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, ik.k.d(i12, i10 * 2));
            ck.p.i(cArrCopyOf, "copyOf(this, newSize)");
            this.f52164a = cArrCopyOf;
        }
        return i10;
    }

    @Override // dl.r0
    public void b(String str) {
        ck.p.j(str, "text");
        e(str.length() + 2);
        char[] cArr = this.f52164a;
        int i10 = this.f52165b;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        for (int i13 = i11; i13 < i12; i13++) {
            char c10 = cArr[i13];
            if (c10 < a1.a().length && a1.a()[c10] != 0) {
                d(i13 - i11, i13, str);
                return;
            }
        }
        cArr[i12] = '\"';
        this.f52165b = i12 + 1;
    }

    @Override // dl.r0
    public void c(String str) {
        ck.p.j(str, "text");
        int length = str.length();
        if (length == 0) {
            return;
        }
        e(length);
        str.getChars(0, str.length(), this.f52164a, this.f52165b);
        this.f52165b += length;
    }

    public final void e(int i10) {
        f(this.f52165b, i10);
    }

    public void g() {
        m.f52166c.c(this.f52164a);
    }

    public String toString() {
        return new String(this.f52164a, 0, this.f52165b);
    }

    public final void d(int i10, int i11, String str) {
        byte b10;
        int length = str.length();
        while (i10 < length) {
            int iF = f(i11, 2);
            char cCharAt = str.charAt(i10);
            if (cCharAt >= a1.a().length || (b10 = a1.a()[cCharAt]) == 0) {
                int i12 = iF + 1;
                this.f52164a[iF] = cCharAt;
                i11 = i12;
            } else if (b10 == 1) {
                String str2 = a1.b()[cCharAt];
                ck.p.g(str2);
                int iF2 = f(iF, str2.length());
                str2.getChars(0, str2.length(), this.f52164a, iF2);
                i11 = iF2 + str2.length();
                this.f52165b = i11;
            } else {
                char[] cArr = this.f52164a;
                cArr[iF] = '\\';
                cArr[iF + 1] = (char) b10;
                i11 = iF + 2;
                this.f52165b = i11;
            }
            i10++;
        }
        int iF3 = f(i11, 1);
        this.f52164a[iF3] = '\"';
        this.f52165b = iF3 + 1;
    }

    @Override // dl.r0
    public void writeLong(long j10) {
        c(String.valueOf(j10));
    }
}
