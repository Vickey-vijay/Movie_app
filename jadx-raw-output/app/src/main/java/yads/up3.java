package yads;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public abstract class up3 {
    public static final cp2 a(Context context, int i10) {
        ds2 ds2VarA = cs2.a();
        context.getApplicationContext();
        Context applicationContext = context.getApplicationContext();
        SSLSocketFactory sSLSocketFactoryA = ds2VarA.a(applicationContext);
        j82.a(applicationContext);
        cp2 cp2Var = new cp2(new a92(), new xo(new a21(new qt1(sSLSocketFactoryA, new cm2(), new f82(), new z11(), new e21()), ne.a()), new gr()), i10);
        cp2Var.a();
        return cp2Var;
    }
}
