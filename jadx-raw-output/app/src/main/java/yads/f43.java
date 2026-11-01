package yads;

import android.content.Context;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class f43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jn f77301a;

    public /* synthetic */ f43() {
        this(new jn());
    }

    public final String a(Context context, String str) {
        gm0 gm0Var;
        byte[] bArrA;
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA == null || (gm0Var = nt2VarA.X) == null) {
            gm0Var = gm0.f77854c;
        }
        String str2 = gm0Var.f77855a;
        it1 it1Var = new it1(gm0Var.f77856b, str2);
        byte[] bytes = str.getBytes(lk.c.f63591b);
        ck.p.i(bytes, "getBytes(...)");
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            if (bArrDecode != null) {
                SecureRandom secureRandom = new SecureRandom();
                byte[] bArr = new byte[16];
                byte[] bArr2 = new byte[16];
                secureRandom.nextBytes(bArr2);
                secureRandom.nextBytes(bArr);
                bArrA = it1Var.a(bytes, bArr2, bArr, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode)));
            } else {
                bArrA = null;
            }
        } catch (Throwable unused) {
            boolean z10 = ad1.f75480a;
        }
        if (bArrA == null) {
            return null;
        }
        this.f77301a.getClass();
        return jn.a(bArrA);
    }

    public f43(jn jnVar) {
        this.f77301a = jnVar;
    }
}
