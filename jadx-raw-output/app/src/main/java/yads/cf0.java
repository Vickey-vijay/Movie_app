package yads;

import android.media.Spatializer;

/* JADX INFO: loaded from: classes11.dex */
public final class cf0 implements Spatializer.OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ if0 f76267a;

    public cf0(if0 if0Var) {
        this.f76267a = if0Var;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        this.f76267a.b();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        this.f76267a.b();
    }
}
