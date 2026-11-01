package yads;

import android.content.Context;
import android.util.Log;
import java.io.File;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dp2 {
    /* JADX WARN: Code duplicated, block: B:7:0x006c  */
    public static final cp2 a(Context context, int i10) {
        long j10;
        bv1 bv1Var = fl2.f77435a;
        boolean z10 = lm3.f79855a;
        boolean z11 = ad1.f75480a;
        lm3.f79855a = Log.isLoggable("Yandex Mobile Ads", 2);
        lm3.f79855a = false;
        ds2 ds2VarA = cs2.a();
        context.getApplicationContext();
        Context applicationContext = context.getApplicationContext();
        SSLSocketFactory sSLSocketFactoryA = ds2VarA.a(applicationContext);
        j82.a(applicationContext);
        xo xoVar = new xo(new a21(new qt1(sSLSocketFactoryA, new cm2(), new f82(), new z11(), new e21()), ne.a()), new gr());
        File fileA = ug0.a(context, "mobileads-volley-cache");
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA != null) {
            j10 = nt2VarA.f80761d;
            if (j10 == 0) {
                j10 = 52428800;
            }
        } else {
            j10 = 52428800;
        }
        cp2 cp2Var = new cp2(new tg0(fileA, (int) is1.a(context, 10485760L, j10)), xoVar, i10);
        ro2 ro2Var = new ro2();
        synchronized (cp2Var.f76392k) {
            cp2Var.f76392k.add(ro2Var);
        }
        return cp2Var;
    }
}
