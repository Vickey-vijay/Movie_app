package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public final class ua2 implements ag0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83404a;

    public ua2(int i10) {
        this.f83404a = i10;
    }

    @Override // yads.ag0
    public final boolean a(Context context) {
        if (this.f83404a == context.getResources().getConfiguration().orientation) {
            return true;
        }
        return false;
    }
}
