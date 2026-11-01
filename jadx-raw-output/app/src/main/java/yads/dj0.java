package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class dj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76686a;

    public static dj0 a(jb2 jb2Var) {
        String str;
        jb2Var.e(jb2Var.f78967b + 2);
        int iM = jb2Var.m();
        int i10 = iM >> 1;
        int iM2 = ((jb2Var.m() >> 3) & 31) | ((iM & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(iM2 >= 10 ? "." : ".0");
        sb2.append(iM2);
        return new dj0(sb2.toString());
    }

    public dj0(String str) {
        this.f76686a = str;
    }
}
