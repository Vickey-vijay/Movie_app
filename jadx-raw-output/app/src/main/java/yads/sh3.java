package yads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes9.dex */
public final class sh3 implements qh3, DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayManager f82652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ph3 f82653b;

    public static sh3 a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new sh3(displayManager);
        }
        return null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        ph3 ph3Var = this.f82653b;
        if (ph3Var == null || i10 != 0) {
            return;
        }
        ph3Var.a(this.f82652a.getDisplay(0));
    }

    public sh3(DisplayManager displayManager) {
        this.f82652a = displayManager;
    }

    @Override // yads.qh3
    public final void a(ph3 ph3Var) {
        this.f82653b = ph3Var;
        this.f82652a.registerDisplayListener(this, ib3.a((Handler.Callback) null));
        ph3Var.a(this.f82652a.getDisplay(0));
    }

    @Override // yads.qh3
    public final void a() {
        this.f82652a.unregisterDisplayListener(this);
        this.f82653b = null;
    }
}
