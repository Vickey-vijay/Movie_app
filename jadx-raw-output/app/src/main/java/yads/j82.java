package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j82 {
    public static final int a(Context context) {
        Integer num;
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA != null && (num = nt2VarA.f80790r0) != null) {
            if (num.intValue() == 0) {
                num = null;
            }
            if (num != null) {
                return num.intValue();
            }
        }
        return 1;
    }
}
