package yads;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class lw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cv1 f79951a;

    public /* synthetic */ lw2() {
        this(new cv1());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:8:0x002c  */
    public final String a(String str) {
        int i10;
        int i11;
        int i12;
        this.f79951a.getClass();
        String[] strArr = (String[]) lk.a0.N0("7.18.1", new String[]{"."}, false, 0, 6, null).toArray(new String[0]);
        if (strArr.length > 0) {
            String str2 = strArr[0];
            int i13 = tb.f82950b;
            if (str2 != null) {
                try {
                    i10 = Integer.parseInt(str2);
                } catch (NumberFormatException unused) {
                    i10 = 0;
                }
            } else {
                i10 = 0;
            }
        } else {
            i10 = 0;
        }
        if (strArr.length > 1) {
            String str3 = strArr[1];
            int i14 = tb.f82950b;
            if (str3 != null) {
                try {
                    i11 = Integer.parseInt(str3);
                } catch (NumberFormatException unused2) {
                    i11 = 0;
                }
            } else {
                i11 = 0;
            }
        } else {
            i11 = 0;
        }
        if (strArr.length > 2) {
            String str4 = strArr[2];
            int i15 = tb.f82950b;
            if (str4 != null) {
                try {
                    i12 = Integer.parseInt(str4);
                } catch (NumberFormatException unused3) {
                    i12 = 0;
                }
            } else {
                i12 = 0;
            }
        } else {
            i12 = 0;
        }
        ck.w wVar = ck.w.f6066a;
        String str5 = String.format(Locale.US, str, Arrays.copyOf(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)}, 3));
        ck.p.i(str5, "format(...)");
        return str5;
    }

    public lw2(cv1 cv1Var) {
        this.f79951a = cv1Var;
    }
}
