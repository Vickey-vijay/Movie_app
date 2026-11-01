package yads;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class va3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f83864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f83865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f83866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f83867d;

    public final String a(String str, long j10, int i10, long j11) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            int i12 = this.f83867d;
            if (i11 >= i12) {
                sb2.append(this.f83864a[i12]);
                return sb2.toString();
            }
            sb2.append(this.f83864a[i11]);
            int i13 = this.f83865b[i11];
            if (i13 == 1) {
                sb2.append(str);
            } else if (i13 == 2) {
                sb2.append(String.format(Locale.US, this.f83866c[i11], Long.valueOf(j10)));
            } else if (i13 == 3) {
                sb2.append(String.format(Locale.US, this.f83866c[i11], Integer.valueOf(i10)));
            } else if (i13 == 4) {
                sb2.append(String.format(Locale.US, this.f83866c[i11], Long.valueOf(j11)));
            }
            i11++;
        }
    }

    public va3(String[] strArr, int[] iArr, String[] strArr2, int i10) {
        this.f83864a = strArr;
        this.f83865b = iArr;
        this.f83866c = strArr2;
        this.f83867d = i10;
    }
}
