package yads;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.div.DivDataTag;
import com.yandex.div.R$style;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div2.DivData;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public final class yh0 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivData f84958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oh0 f84959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DivConfiguration f84960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io2 f84961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f84962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LifecycleOwner f84963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wi0 f84964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jh0 f84965h;

    public /* synthetic */ yh0(DivData divData, oh0 oh0Var, DivConfiguration divConfiguration, at1 at1Var, String str, LifecycleOwner lifecycleOwner, int i10) {
        this(divData, oh0Var, divConfiguration, at1Var, (i10 & 16) != 0 ? "" : str, lifecycleOwner, new wi0(), new jh0());
    }

    @Override // yads.zf0
    public final void c() {
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        ExtendedNativeAdView extendedNativeAdView = (ExtendedNativeAdView) viewGroup;
        try {
            Context context = extendedNativeAdView.getContext();
            wi0 wi0Var = this.f84964g;
            DivConfiguration divConfiguration = this.f84960c;
            LifecycleOwner lifecycleOwner = this.f84963f;
            String str = this.f84962e;
            wi0Var.getClass();
            Div2View div2View = new Div2View(new Div2Context(new ContextThemeWrapper(context, R$style.Div), divConfiguration, 0, lifecycleOwner, 4, null), null, 0, 6, null);
            div2View.setTag(str);
            extendedNativeAdView.addView(div2View);
            this.f84965h.getClass();
            div2View.setData(this.f84958a, new DivDataTag(UUID.randomUUID().toString()));
            wg0.a(div2View).a(this.f84959b);
        } catch (Throwable th2) {
            boolean z10 = ad1.f75480a;
            this.f84961d.reportError("Failed to bind DivKit", th2);
        }
    }

    public yh0(DivData divData, oh0 oh0Var, DivConfiguration divConfiguration, at1 at1Var, String str, LifecycleOwner lifecycleOwner, wi0 wi0Var, jh0 jh0Var) {
        this.f84958a = divData;
        this.f84959b = oh0Var;
        this.f84960c = divConfiguration;
        this.f84961d = at1Var;
        this.f84962e = str;
        this.f84963f = lifecycleOwner;
        this.f84964g = wi0Var;
        this.f84965h = jh0Var;
    }
}
