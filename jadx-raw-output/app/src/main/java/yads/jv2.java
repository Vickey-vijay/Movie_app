package yads;

import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: loaded from: classes9.dex */
public final class jv2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sn1 f79211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CustomizableMediaView f79212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on1 f79213d;

    public jv2(sn1 sn1Var, CustomizableMediaView customizableMediaView, on1 on1Var) {
        this.f79211b = sn1Var;
        this.f79212c = customizableMediaView;
        this.f79213d = on1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f79211b.b(this.f79212c, this.f79213d);
    }
}
