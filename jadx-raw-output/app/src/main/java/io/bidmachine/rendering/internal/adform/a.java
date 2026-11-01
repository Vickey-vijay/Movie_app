package io.bidmachine.rendering.internal.adform;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ck.i;
import ck.p;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.internal.a0;
import io.bidmachine.rendering.internal.e;
import io.bidmachine.rendering.internal.o;
import io.bidmachine.rendering.internal.y;
import io.bidmachine.rendering.internal.z;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.AdElementType;
import io.bidmachine.rendering.model.AppearanceParams;
import io.bidmachine.rendering.model.Background;
import io.bidmachine.rendering.model.Border;
import io.bidmachine.rendering.model.Padding;
import io.bidmachine.rendering.model.PaddingKt;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.rendering.utils.VisibilityChanger;
import io.bidmachine.util.ViewUtilsKt;
import java.util.concurrent.atomic.AtomicBoolean;
import nj.n;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a extends y implements io.bidmachine.rendering.internal.c, View.OnClickListener, VisibilityChanger {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0512a f60000p = new C0512a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final AdElementType[] f60001q = {AdElementType.Image, AdElementType.Label};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.repository.a f60002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AdElementParams f60003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f60004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.detector.brokencreative.a f60005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f60006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppearanceParams f60007h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final z f60008i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f60009j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ViewGroup f60010k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile boolean f60011l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile boolean f60012m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f60013n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f60014o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, io.bidmachine.rendering.internal.repository.a aVar, AdElementParams adElementParams, c cVar, io.bidmachine.rendering.internal.event.b bVar, io.bidmachine.rendering.internal.detector.brokencreative.a aVar2) {
        super(bVar);
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(aVar, "repository");
        p.j(adElementParams, "adElementParams");
        p.j(cVar, "adFormListener");
        p.j(bVar, "eventCallback");
        this.f60002c = aVar;
        this.f60003d = adElementParams;
        this.f60004e = cVar;
        this.f60005f = aVar2;
        Context applicationContext = context.getApplicationContext();
        p.i(applicationContext, "context.applicationContext");
        this.f60006g = applicationContext;
        AppearanceParams appearanceParams = adElementParams.getAppearanceParams();
        this.f60007h = appearanceParams;
        Background background = appearanceParams.getIo.appmetrica.analytics.impl.A2.g java.lang.String();
        this.f60008i = background != null ? a0.a(background, applicationContext, aVar) : null;
        this.f60009j = new AtomicBoolean(false);
        this.f60012m = true;
        this.f60014o = this.f60012m;
    }

    public final void A() {
        this.f60011l = false;
        s();
    }

    public void B() {
        this.f60011l = true;
        s();
    }

    public final void C() {
        io.bidmachine.rendering.internal.detector.brokencreative.a aVar = this.f60005f;
        if (aVar != null) {
            aVar.i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean D() {
        View viewX = x();
        if (viewX == 0) {
            return false;
        }
        Padding padding = this.f60007h.getIo.bidmachine.iab.vast.tags.VastAttributes.PADDING java.lang.String();
        if (padding != null && !padding.isZero()) {
            FrameLayout frameLayout = new FrameLayout(this.f60006g);
            frameLayout.setId(UiUtils.generateViewId());
            PaddingKt.setPadding(frameLayout, padding);
            frameLayout.addView(viewX, new FrameLayout.LayoutParams(-1, -1));
            this.f60010k = frameLayout;
        }
        View viewK = k();
        if (viewK == null) {
            return false;
        }
        viewK.setId(UiUtils.generateViewId());
        viewK.setTag(this.f60003d.getName());
        Boolean clickable = this.f60007h.getClickable();
        if (clickable != null && clickable.booleanValue()) {
            viewK.setOnClickListener(this);
        }
        Boolean bool = this.f60007h.getIo.bidmachine.iab.vast.tags.VastAttributes.VISIBLE java.lang.String();
        if (bool != null) {
            setVisibility(bool.booleanValue());
        }
        if (viewX instanceof e) {
            ((e) viewX).a(this.f60007h);
            return true;
        }
        a(viewX, this.f60008i);
        return true;
    }

    @Override // io.bidmachine.rendering.internal.y, io.bidmachine.rendering.internal.c
    public void a() {
        super.a();
        io.bidmachine.rendering.internal.detector.brokencreative.a aVar = this.f60005f;
        if (aVar != null) {
            aVar.c();
        }
        z();
    }

    public final void b(String str) {
        p.j(str, "message");
        o.a(r(), str, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.c
    public abstract /* synthetic */ void c();

    @Override // io.bidmachine.rendering.internal.c
    public void d() {
        B();
    }

    @Override // io.bidmachine.rendering.internal.c
    public void f() {
        A();
    }

    @Override // io.bidmachine.rendering.internal.c
    public final AdElementParams h() {
        return this.f60003d;
    }

    @Override // io.bidmachine.rendering.internal.c
    public boolean j() {
        return this.f60014o;
    }

    @Override // io.bidmachine.rendering.internal.c
    public View k() {
        ViewGroup viewGroup = this.f60010k;
        return viewGroup != null ? viewGroup : x();
    }

    @Override // io.bidmachine.rendering.utils.VisibilityChanger
    public void lockVisibility(boolean z10) {
        setVisibility(z10);
        this.f60013n = true;
    }

    @Override // io.bidmachine.rendering.internal.c
    public void o() {
        y();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        y();
    }

    @Override // io.bidmachine.rendering.internal.y
    public String r() {
        return this.f60003d.getName();
    }

    public final void s() {
        View viewX = x();
        if (viewX == null) {
            return;
        }
        if (this.f60014o && this.f60011l) {
            if (this.f60009j.compareAndSet(false, true)) {
                a(viewX);
            }
        } else if (this.f60009j.compareAndSet(true, false)) {
            C();
        }
    }

    @Override // io.bidmachine.rendering.utils.VisibilityChanger
    public void setVisibility(boolean z10) {
        this.f60012m = z10;
        if (this.f60013n) {
            return;
        }
        View viewK = k();
        if (z10) {
            ViewUtilsKt.showViewSafely(viewK);
        } else {
            ViewUtilsKt.hideViewSafely(viewK);
        }
        this.f60014o = z10;
        s();
    }

    public final c t() {
        return this.f60004e;
    }

    public String toString() {
        return "type - " + this.f60003d.getAdElementType() + ", name - " + this.f60003d.getName();
    }

    public final AppearanceParams u() {
        return this.f60007h;
    }

    @Override // io.bidmachine.rendering.utils.VisibilityChanger
    public void unlockVisibility() {
        this.f60013n = false;
        setVisibility(this.f60012m);
    }

    public final Context v() {
        return this.f60006g;
    }

    public final io.bidmachine.rendering.internal.repository.a w() {
        return this.f60002c;
    }

    public abstract View x();

    public void y() {
        io.bidmachine.rendering.internal.event.b bVarQ = q();
        View viewX = x();
        bVarQ.a(viewX != null ? viewX.getId() : -1);
    }

    public void z() {
    }

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.adform.a$a, reason: collision with other inner class name */
    public static final class C0512a {
        private C0512a() {
        }

        public /* synthetic */ C0512a(i iVar) {
            this();
        }
    }

    @Override // io.bidmachine.rendering.internal.c
    public void a(ViewGroup viewGroup) {
        io.bidmachine.rendering.internal.c.a.a(this, viewGroup);
    }

    public final void a(View view) {
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        io.bidmachine.rendering.internal.detector.brokencreative.a aVar = this.f60005f;
        if (aVar != null) {
            aVar.a(view);
        }
        this.f60004e.a(this);
    }

    public void a(View view, z zVar) {
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        if (zVar != null) {
            z.a(zVar, view, (Integer) null, (Border) null, 6, (Object) null);
            return;
        }
        Integer backgroundColor = this.f60007h.getBackgroundColor();
        if (backgroundColor == null || n.D(f60001q, this.f60003d.getAdElementType())) {
            return;
        }
        ViewUtilsKt.setBackgroundColorSafely(view, backgroundColor);
    }
}
