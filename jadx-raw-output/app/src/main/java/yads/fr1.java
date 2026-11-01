package yads;

import android.content.Context;
import com.yandex.mobile.ads.R$string;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class fr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f77488a;

    public final String a(dr1 dr1Var) {
        int i10 = dr1Var == null ? -1 : er1.f77186a[dr1Var.ordinal()];
        if (i10 == -1) {
            return null;
        }
        if (i10 == 1) {
            return this.f77488a.getString(R$string.invalid_mediation_adapter_version);
        }
        throw new NoWhenBranchMatchedException();
    }

    public fr1(Context context) {
        this.f77488a = context;
    }
}
