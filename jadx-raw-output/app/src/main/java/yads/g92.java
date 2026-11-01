package yads;

import android.content.Context;
import android.os.Looper;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class g92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d92 f77708a;

    public /* synthetic */ g92() {
        this(new d92());
    }

    public final tw1 a(Context context, d4 d4Var, lu2 lu2Var, c61 c61Var, n32 n32Var, String str, va vaVar) {
        c92 kz2Var;
        d92 d92Var = this.f77708a;
        d92Var.getClass();
        int iOrdinal = vaVar.ordinal();
        if (iOrdinal == 0) {
            f61 f61Var = d92Var.f76601a;
            va vaVar2 = va.f83857d;
            f61Var.getClass();
            e61 e61VarA = f61.a(vaVar2);
            f61 f61Var2 = d92Var.f76601a;
            va vaVar3 = va.f83856c;
            f61Var2.getClass();
            kz2Var = new kz2(new e83(c61Var, e61VarA), new e83(c61Var, f61.a(vaVar3)));
        } else {
            if (iOrdinal != 1 && iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            d92Var.f76601a.getClass();
            kz2Var = new e83(c61Var, f61.a(vaVar));
        }
        za zaVar = new za(context, lu2Var, d4Var);
        Object obj = dw2.f76819j;
        return new tw1(context, kz2Var, n32Var, str, vaVar, zaVar, cw2.a(), new k73(kz2Var, Looper.getMainLooper()), new d83());
    }

    public g92(d92 d92Var) {
        this.f77708a = d92Var;
    }
}
