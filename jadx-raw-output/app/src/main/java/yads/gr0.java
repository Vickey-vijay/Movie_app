package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public abstract class gr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static hr0 f77912a;

    public static final synchronized hr0 a(Context context) {
        hr0 hr0Var;
        hr0Var = f77912a;
        if (hr0Var == null) {
            hr0Var = new hr0(context);
            f77912a = hr0Var;
        }
        return hr0Var;
    }
}
