package com.ironsource;

import android.app.Activity;
import com.ironsource.J0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Locale;

/* JADX INFO: renamed from: com.ironsource.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3586m3<Listener extends J0> extends AbstractC3659q3<Listener> implements AdapterAdInteractionListener {

    /* JADX INFO: renamed from: com.ironsource.m3$a */
    public class a extends AbstractRunnableC3526ie {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            AbstractC3586m3.this.P();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m3$b */
    public class b extends AbstractRunnableC3526ie {
        public b() {
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            AbstractC3586m3.this.S();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m3$c */
    public class c extends AbstractRunnableC3526ie {
        public c() {
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            AbstractC3586m3.this.Q();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m3$d */
    public class d extends AbstractRunnableC3526ie {
        public d() {
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            AbstractC3586m3.this.T();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m3$e */
    public class e extends AbstractRunnableC3526ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f29488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f29489c;

        public e(int i10, String str) {
            this.f29488b = i10;
            this.f29489c = str;
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            AbstractC3586m3.this.b(this.f29488b, this.f29489c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        String str;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        synchronized (this.f30517q) {
            if (this.f30505e != AbstractC3659q3.h.SHOWING) {
                ironLog.error("unexpected ad closed for " + k() + " - state = " + this.f30505e);
                E0 e10 = this.f30504d;
                if (e10 != null) {
                    e10.f26413j.l("unexpected ad closed - state = " + this.f30505e);
                }
                return;
            }
            a(AbstractC3659q3.h.NONE);
            if (this.f30504d != null) {
                String string = "";
                if (this.f30501a.a() == IronSource.a.REWARDED_VIDEO) {
                    String strF = ((J0) this.f30502b).f();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("otherInstanceAvailable = ");
                    if (strF.length() > 0) {
                        str = "true|" + strF;
                    } else {
                        str = com.ironsource.mediationsdk.metadata.a.f29886h;
                    }
                    sb2.append(str);
                    string = sb2.toString();
                }
                this.f30504d.f26412i.a(j(), string);
            }
            ((J0) this.f30502b).a((AbstractC3586m3<?>) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        IronLog.INTERNAL.verbose(d());
        E0 e10 = this.f30504d;
        if (e10 != null) {
            e10.f26412i.d(j());
        }
        ((J0) this.f30502b).c(this);
    }

    private void R() {
        IronLog.INTERNAL.verbose(d());
        ((J0) this.f30502b).b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        IronLog.INTERNAL.verbose(d());
        E0 e10 = this.f30504d;
        if (e10 != null) {
            e10.f26412i.i(j());
        }
        ((J0) this.f30502b).d((AbstractC3586m3<?>) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        IronLog.INTERNAL.verbose(d());
        E0 e10 = this.f30504d;
        if (e10 != null) {
            e10.f26412i.k(j());
        }
    }

    public void a(Activity activity, C3489gd c3489gd) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("placementName = " + c3489gd.c()));
        try {
            this.f30507g = c3489gd;
            a(AbstractC3659q3.h.SHOWING);
            this.f30504d.f26412i.a(activity, j());
            Object obj = this.f30503c;
            if (obj instanceof AdapterAdFullScreenInterface) {
                ((AdapterAdFullScreenInterface) obj).showAd(this.f30511k, activity, this);
            } else {
                ironLog.error(a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
                E0 e10 = this.f30504d;
                if (e10 != null) {
                    e10.f26413j.g("showAd - adapter not instance of AdapterAdFullScreenInterface");
                }
            }
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            a(AbstractC3659q3.h.FAILED);
            String str = "showAd - exception = " + th2.getMessage() + " - state = " + this.f30505e;
            IronLog.INTERNAL.error(a(str));
            E0 e11 = this.f30504d;
            if (e11 != null) {
                e11.f26413j.g(str);
            }
            onAdShowFailed(A0.h(this.f30501a.a()), str);
        }
    }

    public void b(boolean z10) {
        E0 e10 = this.f30504d;
        if (e10 != null) {
            e10.f26412i.a(z10);
        }
    }

    @Override // com.ironsource.AbstractC3659q3
    public boolean B() {
        if (this.f30511k == null || !y()) {
            return false;
        }
        try {
            Object obj = this.f30503c;
            if (obj instanceof AdapterAdFullScreenInterface) {
                return ((AdapterAdFullScreenInterface) obj).isAdAvailable(this.f30511k);
            }
            IronLog.INTERNAL.error(a("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface"));
            E0 e10 = this.f30504d;
            if (e10 != null) {
                e10.f26413j.g("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface");
            }
            return false;
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            String str = "isReadyToShow - exception = " + th2.getMessage() + " - state = " + this.f30505e;
            IronLog.INTERNAL.error(a(str));
            E0 e11 = this.f30504d;
            if (e11 != null) {
                e11.f26413j.g(str);
            }
        }
    }

    public AbstractC3586m3(InterfaceC3652pd interfaceC3652pd, C3583m0 c3583m0, BaseAdAdapter<?, ?> baseAdAdapter, C3405c1 c3405c1, C3605n2 c3605n2, Listener listener) {
        super(interfaceC3652pd, c3583m0, baseAdAdapter, c3405c1, c3605n2, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i10, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i10 + ", " + str));
        AbstractC3659q3.h hVar = this.f30505e;
        if (hVar == AbstractC3659q3.h.SHOWING) {
            a(AbstractC3659q3.h.FAILED);
            E0 e10 = this.f30504d;
            if (e10 != null) {
                e10.f26412i.a(j(), i10, str, null);
            }
            ((J0) this.f30502b).a(new IronSourceError(i10, str), (AbstractC3586m3<?>) this);
            return;
        }
        String strA = a(hVar, i10, str);
        ironLog.error(a(strA));
        E0 e11 = this.f30504d;
        if (e11 != null) {
            e11.f26413j.t(strA);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        if (!u().e()) {
            P();
        } else {
            u().a(new a());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        if (!u().e()) {
            Q();
        } else {
            u().a(new c());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i10, String str) {
        if (!u().e()) {
            b(i10, str);
        } else {
            u().a(new e(i10, str));
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        if (!u().e()) {
            S();
        } else {
            u().a(new b());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        if (!u().e()) {
            T();
        } else {
            u().a(new d());
        }
    }

    public static String a(AbstractC3659q3.h hVar, int i10, String str) {
        return String.format(Locale.ENGLISH, "unexpected show failed, state - %s, error - %d %s", hVar, Integer.valueOf(i10), str);
    }
}
