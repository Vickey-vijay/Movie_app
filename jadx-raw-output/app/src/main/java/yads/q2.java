package yads;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes10.dex */
public final class q2 implements f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f81684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z9 f81685b;

    public final void a(int i10, Bundle bundle) {
        z9 z9Var = this.f81685b;
        if (z9Var != null) {
            z9Var.a(i10, bundle);
        }
    }

    public q2(Activity activity, z9 z9Var) {
        this.f81684a = activity;
        this.f81685b = z9Var;
    }

    public final void a(int i10) {
        try {
            if (Build.VERSION.SDK_INT != 26) {
                this.f81684a.setRequestedOrientation(i10);
            }
        } catch (Exception unused) {
            boolean z10 = ad1.f75480a;
        }
    }
}
