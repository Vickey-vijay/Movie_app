package com.ironsource;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class G2 extends AbstractC3606n3<K2, AdapterAdViewListener> implements InterfaceC3689s0, F2 {
    private C3371a3 K;
    private boolean L;
    private com.ironsource.mediationsdk.q M;
    private View N;
    private AbstractC3659q3<?> O;
    private FrameLayout.LayoutParams P;
    private final AtomicBoolean Q;
    private final AtomicBoolean R;

    public class a implements C3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC3659q3 f26567a;

        public a(AbstractC3659q3 abstractC3659q3) {
            this.f26567a = abstractC3659q3;
        }

        @Override // com.ironsource.C3
        public void a() {
            ((K2) this.f26567a).Q();
        }
    }

    public class b implements C3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC3659q3 f26569a;

        public b(AbstractC3659q3 abstractC3659q3) {
            this.f26569a = abstractC3659q3;
        }

        @Override // com.ironsource.C3
        public void a() {
            ((K2) this.f26569a).Q();
            G2 g10 = G2.this;
            g10.f30253s.f26412i.j(g10.n());
            G2.this.Q.set(false);
            G2.this.W();
            IronLog.INTERNAL.verbose("start binding timer after impression, expected interval = " + G2.this.f30249o.h().b() + ", current timestamp = " + System.currentTimeMillis());
            G2.this.O().h();
        }
    }

    private void M() {
        int i10 = c.f26571a[this.f30251q.b().a().ordinal()];
        if (i10 == 1) {
            P().a();
        } else {
            if (i10 != 2) {
                return;
            }
            P().l();
            P().m();
            O().a();
            O().b();
        }
    }

    private C3371a3 N() {
        return new C3371a3(this.f30249o.h(), this.f30249o.g(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C3371a3 O() {
        return this.K;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        this.O = null;
        this.N = null;
        this.P = null;
    }

    @Override // com.ironsource.AbstractC3606n3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public K2 a(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdViewListener> baseAdAdapter, int i10, String str, C3605n2 c3605n2) {
        return new K2(this, new C3583m0(IronSource.a.BANNER, this.f30249o.o(), i10, this.f30241g, str, this.f30239e, this.f30240f, networkSettings, this.f30249o.n()), baseAdAdapter, this.M, this.f30243i, v(), c3605n2, this);
    }

    @Override // com.ironsource.F2
    public void c() {
        if (!R()) {
            IronLog.INTERNAL.verbose("banner is not visible, binding skipped");
            O().h();
            this.f30253s.f26409f.b(IronSourceError.ERROR_BN_BINDING_SKIP_INVISIBLE);
        } else {
            if (!S()) {
                IronLog.INTERNAL.verbose("Cannot bind banner view after interval, the next ad is not ready yet");
                this.Q.set(true);
                return;
            }
            IronLog.INTERNAL.verbose("done binding timer, binding view now, current timestamp = " + System.currentTimeMillis());
            c(this.O, this.N, this.P);
        }
    }

    @Override // com.ironsource.AbstractC3606n3
    public void g(AbstractC3659q3<?> abstractC3659q3) {
    }

    @Override // com.ironsource.AbstractC3606n3
    public void h(AbstractC3659q3<?> abstractC3659q3) {
    }

    @Override // com.ironsource.AbstractC3606n3
    public String l() {
        return "BN";
    }

    @Override // com.ironsource.AbstractC3606n3
    public String o() {
        return IronSourceConstants.OPW_BN_MANAGER_NAME;
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26571a;

        static {
            int[] iArr = new int[O0.a.values().length];
            f26571a = iArr;
            try {
                iArr[O0.a.MANUAL_WITH_AUTOMATIC_RELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26571a[O0.a.MANUAL_WITH_LOAD_ON_SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public G2(List<NetworkSettings> list, U2 u10, String str, C3649pa c3649pa, C3450ea c3450ea) {
        super(new H2(str, list, u10), c3649pa, c3450ea);
        this.L = false;
        this.Q = new AtomicBoolean(true);
        this.R = new AtomicBoolean(false);
        this.K = N();
    }

    private C3479g3 P() {
        return (C3479g3) this.f30251q;
    }

    private ISBannerSize Q() {
        com.ironsource.mediationsdk.q qVar = this.M;
        if (qVar == null || qVar.getSize() == null) {
            return null;
        }
        if (this.M.getSize().isSmart()) {
            return AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? com.ironsource.mediationsdk.l.a() : ISBannerSize.BANNER;
        }
        return this.M.getSize();
    }

    private boolean S() {
        IronLog.INTERNAL.verbose(b(this.N + ", " + this.P + ", " + this.O));
        return (this.N == null || this.P == null || this.O == null) ? false : true;
    }

    private void U() {
        int i10 = c.f26571a[this.f30251q.b().a().ordinal()];
        if (i10 == 1) {
            P().k();
        } else {
            if (i10 != 2) {
                return;
            }
            P().r();
        }
    }

    private void V() {
        int i10 = c.f26571a[this.f30251q.b().a().ordinal()];
        if (i10 == 1) {
            P().k();
        } else {
            if (i10 != 2) {
                return;
            }
            P().q();
        }
    }

    public boolean R() {
        if (!this.M.isShown()) {
            IronLog.INTERNAL.verbose("banner or one of its parents are INVISIBLE or GONE");
            return false;
        }
        if (!this.M.hasWindowFocus()) {
            IronLog.INTERNAL.verbose("banner has no window focus");
            return false;
        }
        boolean globalVisibleRect = this.M.getGlobalVisibleRect(new Rect());
        IronLog.INTERNAL.verbose("visible = " + globalVisibleRect);
        return globalVisibleRect;
    }

    public void T() {
        com.ironsource.mediationsdk.q qVar = this.M;
        if (qVar != null) {
            a(qVar);
        }
    }

    @Override // com.ironsource.AbstractC3606n3
    public void a(Context context, com.ironsource.mediationsdk.i iVar, S1 s10) {
        if (this.f30237c == null) {
            IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        } else {
            iVar.a(Q());
            this.f30237c.a(context, iVar, s10);
        }
    }

    @Override // com.ironsource.U0
    public void f(AbstractC3659q3<?> abstractC3659q3) {
        IronLog.INTERNAL.verbose(b(abstractC3659q3.k()));
        this.f30254t.f(abstractC3659q3.f());
    }

    @Override // com.ironsource.AbstractC3606n3
    public L0 g() {
        return new C3389b3();
    }

    @Override // com.ironsource.AbstractC3606n3
    public Q0 h() {
        return new C3479g3(this.f30249o.h(), this);
    }

    @Override // com.ironsource.AbstractC3606n3
    public boolean v() {
        return this.L;
    }

    @Override // com.ironsource.F2
    public void d() {
        if (!R()) {
            IronLog.INTERNAL.verbose("banner is not visible, starting the impression timeout timer again");
            O().e();
        } else if (this.R.compareAndSet(false, true)) {
            IronLog.INTERNAL.verbose("banner impression timeout reached, reloading banner manually");
            U();
            this.f30253s.f26413j.b("banner impression timeout reached, reloading banner manually");
        }
    }

    @Override // com.ironsource.AbstractC3606n3
    public LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @Override // com.ironsource.AbstractC3606n3, com.ironsource.Gb
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        try {
            if (this.M == null) {
                ironLog.error("mIronSourceBanner is null");
                this.f30253s.f26409f.b(IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL);
                return;
            }
            boolean z10 = false;
            if (R()) {
                synchronized (this.f30258x) {
                    if (a(AbstractC3606n3.f.SHOWING, AbstractC3606n3.f.READY_TO_LOAD)) {
                        ironLog.verbose("start reload");
                        this.L = true;
                        z10 = true;
                    } else {
                        ironLog.error("wrong state = " + this.f30250p);
                    }
                }
                if (z10) {
                    a(this.M, this.f30243i);
                    return;
                }
                return;
            }
            if (this.f30249o.h().a() == O0.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
                ironLog.verbose("banner is not visible, reload skipped");
                this.f30253s.f26409f.b(613);
            }
            U();
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            this.f30253s.f26413j.c(th2.getMessage());
        }
    }

    @Override // com.ironsource.AbstractC3606n3
    public void a(int i10, String str, boolean z10) {
        if (v()) {
            if (!z10) {
                this.f30253s.f26409f.a(C3570l5.a(this.f30248n), i10, str);
                com.ironsource.mediationsdk.n.a().b(this.f30249o.b(), new IronSourceError(i10, str));
            }
            if (v()) {
                a(AbstractC3606n3.f.SHOWING);
                V();
                return;
            }
            return;
        }
        super.a(i10, str, z10);
    }

    private void c(AbstractC3659q3<?> abstractC3659q3, View view, FrameLayout.LayoutParams layoutParams) {
        if (a(AbstractC3606n3.f.READY_TO_SHOW, AbstractC3606n3.f.SHOWING)) {
            this.R.set(false);
            O().e();
            ((K2) abstractC3659q3).R();
            com.ironsource.mediationsdk.l.a(this.M, view, layoutParams, new b(abstractC3659q3));
            return;
        }
        IronLog.INTERNAL.verbose("wrong state = " + this.f30250p);
    }

    public void a(com.ironsource.mediationsdk.q qVar, C3489gd c3489gd) {
        String str;
        IronLog.INTERNAL.verbose("placement = " + c3489gd);
        int iB = 510;
        if (!b(qVar)) {
            str = String.format("can't load banner - %s", qVar == null ? "banner is null" : "banner is destroyed");
        } else if (c3489gd != null && !TextUtils.isEmpty(c3489gd.c())) {
            if (this.E.c(ContextProvider.getInstance().getApplicationContext(), c3489gd, this.f30249o.b())) {
                str = String.format("placement %s is capped", c3489gd.c());
                iB = A0.f(this.f30249o.b());
            } else {
                str = null;
            }
        } else {
            str = String.format("can't load banner - %s", c3489gd == null ? "placement is null" : "placement name is empty");
            iB = A0.b(this.f30249o.b());
        }
        if (!TextUtils.isEmpty(str)) {
            IronLog.API.error(b(str));
            a(iB, str, false);
        } else {
            com.ironsource.mediationsdk.l.b(qVar);
            this.M = qVar;
            this.f30243i = c3489gd;
            A();
        }
    }

    @Override // com.ironsource.U0
    public void c(AbstractC3659q3<?> abstractC3659q3) {
        IronLog.INTERNAL.verbose(b(abstractC3659q3.k()));
        this.f30254t.b(abstractC3659q3.f());
    }

    public boolean b(com.ironsource.mediationsdk.q qVar) {
        return (qVar == null || qVar.b()) ? false : true;
    }

    private void b(AbstractC3659q3<?> abstractC3659q3, View view, FrameLayout.LayoutParams layoutParams) {
        ((K2) abstractC3659q3).R();
        com.ironsource.mediationsdk.l.a(this.M, view, layoutParams, new a(abstractC3659q3));
    }

    @Override // com.ironsource.U0
    public void b(AbstractC3659q3<?> abstractC3659q3) {
        IronLog.INTERNAL.verbose(b(abstractC3659q3.k()));
        this.f30254t.e(abstractC3659q3.f());
    }

    @Override // com.ironsource.AbstractC3606n3
    public JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getBannerSettings();
    }

    public void a(com.ironsource.mediationsdk.q qVar) {
        int iA;
        try {
            if (!b(qVar)) {
                String str = String.format("can't destroy banner - %s", qVar == null ? "banner is null" : "banner is destroyed");
                IronLog.API.error("destroy banner failed - errorMessage = " + str);
                return;
            }
            IronLog.INTERNAL.verbose("destroying banner");
            M();
            K2 k10 = (K2) this.f30235a.d();
            if (k10 != null) {
                if (k10.r() != null) {
                    iA = k10.r().intValue();
                } else {
                    iA = this.C.a(this.f30249o.b());
                }
                this.f30253s.f26409f.a(iA);
                k10.P();
                this.f30235a.a(null);
                this.f30235a.b(null);
            }
            com.ironsource.mediationsdk.l.a(qVar);
            this.M = null;
            this.f30243i = null;
            this.L = false;
            if (P().o()) {
                this.Q.set(true);
                this.R.set(false);
                W();
            }
            a(AbstractC3606n3.f.READY_TO_LOAD);
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            String str2 = "destroyBanner - exception = " + th2.getLocalizedMessage() + " state = " + this.f30250p;
            IronLog.INTERNAL.error(b(str2));
            E0 e10 = this.f30253s;
            if (e10 != null) {
                e10.f26413j.g(str2);
            }
        }
    }

    @Override // com.ironsource.AbstractC3606n3, com.ironsource.D0
    public Map<String, Object> a(B0 b10) {
        Map<String, Object> mapA = super.a(b10);
        if (b(this.M)) {
            com.ironsource.mediationsdk.l.a(mapA, this.M.getSize());
        }
        if (this.f30243i != null) {
            mapA.put("placement", n());
        }
        return mapA;
    }

    @Override // com.ironsource.InterfaceC3689s0
    public void a(AbstractC3659q3<?> abstractC3659q3, View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("mState = " + this.f30250p);
        super.d(abstractC3659q3);
        if (this.f30249o.h().a() == O0.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            if (a(AbstractC3606n3.f.READY_TO_SHOW, AbstractC3606n3.f.SHOWING)) {
                this.f30235a.a(abstractC3659q3);
                this.f30235a.b(abstractC3659q3);
                b(abstractC3659q3, view, layoutParams);
                P().k();
                this.f30254t.c(abstractC3659q3.f());
                return;
            }
            return;
        }
        if (P().o()) {
            this.f30235a.b(abstractC3659q3);
            if (this.Q.get()) {
                c(abstractC3659q3, view, layoutParams);
            } else {
                this.O = abstractC3659q3;
                this.N = view;
                this.P = layoutParams;
            }
            this.f30254t.c(abstractC3659q3.f());
        }
    }

    @Override // com.ironsource.AbstractC3606n3, com.ironsource.R0
    public void a(AbstractC3659q3<?> abstractC3659q3) {
        super.a(abstractC3659q3);
        if (P().o()) {
            if (this.R.compareAndSet(false, true)) {
                O().b();
                U();
            } else {
                IronLog.INTERNAL.verbose("Impression already recorded as receive, it can occur from network onAdOpened or from impression timeout timer - loading next ad already in progress");
            }
        }
    }

    @Override // com.ironsource.AbstractC3606n3
    public AdData a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(b(networkSettings), this.f30249o.b(), str, this.M);
    }
}
