package yads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class ek0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zj0 f77102a;

    public ek0(Context context) {
        this.f77102a = new zj0(context.getApplicationContext());
    }

    public final Drawable a(byte[] bArr) {
        yj0 hqVar;
        s41 s41VarA = t41.a(bArr);
        zj0 zj0Var = this.f77102a;
        zj0Var.getClass();
        int iOrdinal = s41VarA.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                hqVar = new hq();
            } else {
                hqVar = new oz0();
            }
        } else {
            hqVar = new hq();
        }
        return hqVar.a(bArr, zj0Var.f85442a.getApplicationContext());
    }
}
