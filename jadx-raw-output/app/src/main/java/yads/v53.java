package yads;

import android.text.TextUtils;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public final class v53 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f83775b = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u51 f83776c = u51.b(2, "auto", "none");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u51 f83777d = u51.b(3, "dot", "sesame", "circle");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u51 f83778e = u51.b(2, "filled", "open");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u51 f83779f = u51.b(3, "after", "before", "outside");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83780a;

    /* JADX WARN: Code duplicated, block: B:100:0x016f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0175  */
    /* JADX WARN: Code duplicated, block: B:105:0x0177  */
    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0138  */
    /* JADX WARN: Code duplicated, block: B:83:0x013d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0149  */
    /* JADX WARN: Code duplicated, block: B:88:0x014e  */
    /* JADX WARN: Code duplicated, block: B:94:0x015d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0165  */
    /* JADX WARN: Code duplicated, block: B:97:0x0167  */
    /* JADX WARN: Code duplicated, block: B:99:0x016d  */
    public static v53 a(String str) {
        u51 u51VarB;
        byte b10;
        int i10;
        int i11;
        gy2 gy2Var;
        Object next;
        String str2;
        int iHashCode;
        if (str == null) {
            return null;
        }
        String strA = ki.a(str.trim());
        if (strA.isEmpty()) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(strA, f83775b);
        int length = strArrSplit.length;
        byte b11 = 0;
        int i12 = 1;
        if (length != 0) {
            u51VarB = length != 1 ? u51.b(strArrSplit.length, (Object[]) strArrSplit.clone()) : new xz2(strArrSplit[0]);
        } else {
            u51VarB = ym2.f85051j;
        }
        u51 u51Var = f83779f;
        if (u51Var == null) {
            throw new NullPointerException("set1");
        }
        if (u51VarB == null) {
            throw new NullPointerException("set2");
        }
        gy2 gy2Var2 = new gy2(new hy2(u51Var, u51VarB));
        String str3 = (String) (gy2Var2.hasNext() ? gy2Var2.next() : "outside");
        int iHashCode2 = str3.hashCode();
        int i13 = -1;
        if (iHashCode2 != -1392885889) {
            if (iHashCode2 != -1106037339) {
                if (iHashCode2 == 92734940 && str3.equals("after")) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
            } else if (str3.equals("outside")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (str3.equals("before")) {
            b10 = 2;
        } else {
            b10 = -1;
        }
        if (b10 != 0) {
            i10 = b10 != 1 ? 1 : -2;
        } else {
            i10 = 2;
        }
        u51 u51Var2 = f83776c;
        if (u51Var2 == null) {
            throw new NullPointerException("set1");
        }
        hy2 hy2Var = new hy2(u51Var2, u51VarB);
        if (!Collections.disjoint(u51VarB, u51Var2)) {
            String str4 = (String) new gy2(hy2Var).next();
            int iHashCode3 = str4.hashCode();
            if (iHashCode3 == 3005871) {
                str4.equals("auto");
            } else if (iHashCode3 == 3387192 && str4.equals("none")) {
                i13 = 0;
            }
            return new v53(i13, 0, i10);
        }
        u51 u51Var3 = f83778e;
        if (u51Var3 == null) {
            throw new NullPointerException("set1");
        }
        hy2 hy2Var2 = new hy2(u51Var3, u51VarB);
        u51 u51Var4 = f83777d;
        if (u51Var4 == null) {
            throw new NullPointerException("set1");
        }
        hy2 hy2Var3 = new hy2(u51Var4, u51VarB);
        if (Collections.disjoint(u51VarB, u51Var3) && Collections.disjoint(u51VarB, u51Var4)) {
            return new v53(-1, 0, i10);
        }
        gy2 gy2Var3 = new gy2(hy2Var2);
        String str5 = (String) (gy2Var3.hasNext() ? gy2Var3.next() : "filled");
        int iHashCode4 = str5.hashCode();
        if (iHashCode4 != -1274499742) {
            if (iHashCode4 == 3417674 && str5.equals("open")) {
                i11 = 2;
            }
            gy2Var = new gy2(hy2Var3);
            if (gy2Var.hasNext()) {
                next = gy2Var.next();
            } else {
                next = "circle";
            }
            str2 = (String) next;
            iHashCode = str2.hashCode();
            if (iHashCode != -1360216880) {
                if (iHashCode != -905816648) {
                    if (iHashCode == 99657 || !str2.equals("dot")) {
                        b11 = -1;
                    }
                } else if (str2.equals("sesame")) {
                    b11 = 1;
                } else {
                    b11 = -1;
                }
            } else if (str2.equals("circle")) {
                b11 = 2;
            } else {
                b11 = -1;
            }
            if (b11 != 0) {
                i12 = 2;
            } else if (b11 == 1) {
                i12 = 3;
            }
            return new v53(i12, i11, i10);
        }
        str5.equals("filled");
        i11 = 1;
        gy2Var = new gy2(hy2Var3);
        if (gy2Var.hasNext()) {
            next = gy2Var.next();
        } else {
            next = "circle";
        }
        str2 = (String) next;
        iHashCode = str2.hashCode();
        if (iHashCode != -1360216880) {
            if (iHashCode != -905816648) {
                if (iHashCode == 99657) {
                    b11 = -1;
                } else {
                    b11 = -1;
                }
            } else if (str2.equals("sesame")) {
                b11 = 1;
            } else {
                b11 = -1;
            }
        } else if (str2.equals("circle")) {
            b11 = 2;
        } else {
            b11 = -1;
        }
        if (b11 != 0) {
            i12 = 2;
        } else if (b11 == 1) {
            i12 = 3;
        }
        return new v53(i12, i11, i10);
    }

    public v53(int i10, int i11, int i12) {
        this.f83780a = i10;
    }
}
