package l1;

import android.util.Log;

/* JADX INFO: compiled from: AndroidPrinter.java */
/* JADX INFO: loaded from: classes2.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f63389a;

    public a() {
        this(4063);
    }

    public a(int i10) {
        this.f63389a = i10;
    }

    public static int b(String str, int i10, int i11) {
        if (i11 == str.length() || str.charAt(i11) == '\n') {
            return i11;
        }
        for (int i12 = i11 - 1; i10 < i12; i12--) {
            if (str.charAt(i12) == '\n') {
                return i12 + 1;
            }
        }
        return i11;
    }

    @Override // l1.b
    public void a(int i10, String str, String str2) {
        if (str2.length() <= this.f63389a) {
            c(i10, str, str2);
            return;
        }
        int length = str2.length();
        int i11 = 0;
        while (i11 < length) {
            int iB = b(str2, i11, Math.min(this.f63389a + i11, length));
            c(i10, str, str2.substring(i11, iB));
            i11 = iB;
        }
    }

    public void c(int i10, String str, String str2) {
        Log.println(i10, str, str2);
    }
}
