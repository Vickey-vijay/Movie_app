package yads;

import android.view.ViewTreeObserver;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: loaded from: classes2.dex */
public final class zn1 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ao1 f85544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CustomizableMediaView f85545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rn1 f85546c;

    public zn1(ao1 ao1Var, CustomizableMediaView customizableMediaView, rn1 rn1Var) {
        this.f85544a = ao1Var;
        this.f85545b = customizableMediaView;
        this.f85546c = rn1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f85544a.f75582b.a(this.f85545b, this.f85546c.f82347b);
        return false;
    }
}
