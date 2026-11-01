package yads;

import android.content.Context;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class sq0 implements tq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f82732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg2 f82733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tg2 f82734c;

    @Override // yads.tq0
    public final Parcelable getValue() {
        tg2 tg2Var = this.f82734c;
        Context context = this.f82732a;
        sg2 sg2Var = this.f82733b;
        tg2Var.getClass();
        return tg2.a(context, sg2Var);
    }

    public sq0(Context context, sg2 sg2Var, tg2 tg2Var) {
        this.f82732a = context;
        this.f82733b = sg2Var;
        this.f82734c = tg2Var;
    }
}
