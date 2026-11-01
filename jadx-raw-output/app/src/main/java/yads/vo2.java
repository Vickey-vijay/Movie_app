package yads;

import android.util.Base64;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public abstract class vo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ju1 f83970a;

    static {
        ju1 ju1Var = ju1.f79192b;
        f83970a = iu1.a();
    }

    public static final void a(long j10, po2 po2Var, e82 e82Var) {
        String strB;
        String str;
        String str2;
        byte[] bArrB = po2Var.b();
        String strB2 = null;
        if (bArrB != null) {
            try {
                strB = lk.x.B(bArrB);
            } catch (Exception unused) {
                strB = "UNKNOWN_CONTENT";
            }
            str = strB;
        } else {
            str = null;
        }
        byte[] bArr = e82Var.f76977b;
        if (bArr != null) {
            if (po2Var instanceof o41) {
                strB2 = "IMAGE_CONTENT";
            } else {
                try {
                    strB2 = lk.x.B(Base64.decode(bArr, 0));
                } catch (IllegalArgumentException unused2) {
                    strB2 = lk.x.B(bArr);
                } catch (Exception unused3) {
                    strB2 = "UNKNOWN_CONTENT";
                }
            }
        }
        ju1 ju1Var = f83970a;
        int i10 = po2Var.f81489c;
        if (i10 == 0) {
            str2 = "GET";
        } else if (i10 == 1) {
            str2 = "POST";
        } else if (i10 == 2) {
            str2 = "PUT";
        } else if (i10 == 3) {
            str2 = "DELETE";
        } else if (i10 == 4) {
            str2 = "HEAD";
        } else if (i10 == 5) {
            str2 = "OPTIONS";
        } else if (i10 == 6) {
            str2 = "TRACE";
        } else if (i10 == 7) {
            str2 = "PATCH";
        } else {
            str2 = "UNKNOWN";
        }
        String str3 = str2;
        String strG = po2Var.g();
        Map mapD = po2Var.d();
        Integer numValueOf = Integer.valueOf(e82Var.f76976a);
        Map map = e82Var.f76978c;
        ju1Var.getClass();
        if (eu1.f77193b) {
            hu1 hu1Var = new hu1(new mu1(j10, str3, strG, mapD, str), new pu1(System.currentTimeMillis(), numValueOf, map, strB2));
            synchronized (ju1.f79193c) {
                if (ju1Var.f79194a.size() > 100) {
                    ju1Var.f79194a.removeFirst();
                }
                ju1Var.f79194a.add(hu1Var);
            }
        }
    }
}
