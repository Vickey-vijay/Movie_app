package yads;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class bd2 extends po {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f75781w = (int) TimeUnit.SECONDS.toMillis(10);

    @Override // yads.po2
    public final vp2 a(e82 e82Var) {
        return new vp2(e82Var, v11.a(e82Var));
    }

    public bd2(Context context, String str, oo ooVar) {
        super(context, str, ooVar);
        a(context);
        l();
        m();
    }

    public final void a(Context context) {
        int iIntValue;
        Integer num;
        Integer num2;
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA != null && (num2 = nt2VarA.f80796u0) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = f75781w;
        }
        nt2 nt2VarA2 = cw2.a().a(context);
        this.f81501o = new qe0(1.0f, iIntValue, (nt2VarA2 == null || (num = nt2VarA2.K) == null) ? 0 : num.intValue());
    }
}
