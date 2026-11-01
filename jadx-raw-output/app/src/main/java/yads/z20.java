package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class z20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f85180a;

    public final boolean a() {
        return (this.f85180a.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public z20(Context context) {
        this.f85180a = uz.a(context);
    }
}
