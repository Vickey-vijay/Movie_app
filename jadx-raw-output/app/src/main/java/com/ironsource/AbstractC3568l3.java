package com.ironsource;

import android.app.Activity;
import com.ironsource.AbstractC3586m3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3568l3<Smash extends AbstractC3586m3<?>, Listener extends AdapterAdInteractionListener> extends AbstractC3606n3<Smash, Listener> implements J0 {

    /* JADX INFO: renamed from: com.ironsource.l3$a */
    public class a extends AbstractRunnableC3526ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f29392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C3489gd f29393c;

        public a(Activity activity, C3489gd c3489gd) {
            this.f29392b = activity;
            this.f29393c = c3489gd;
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            AbstractC3568l3.this.b(this.f29392b, this.f29393c);
        }
    }

    public AbstractC3568l3(V v10, C3649pa c3649pa, C3450ea c3450ea) {
        super(v10, c3649pa, c3450ea);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void b(Activity activity, C3489gd c3489gd) {
        AbstractC3586m3 abstractC3586m3;
        IronSourceError ironSourceError;
        IronLog.INTERNAL.verbose(b("state = " + this.f30250p));
        synchronized (this.f30258x) {
            this.f30243i = c3489gd;
            this.f30253s.f26412i.a(activity, n());
            AbstractC3606n3.f fVar = this.f30250p;
            AbstractC3606n3.f fVar2 = AbstractC3606n3.f.SHOWING;
            abstractC3586m3 = null;
            if (fVar == fVar2) {
                ironSourceError = new IronSourceError(A0.g(this.f30249o.b()), "can't show ad while an ad is already showing");
            } else if (fVar != AbstractC3606n3.f.READY_TO_SHOW) {
                ironSourceError = new IronSourceError(509, "show called while no ads are available");
            } else if (c3489gd == null) {
                ironSourceError = new IronSourceError(A0.b(this.f30249o.b()), "empty default placement");
            } else if (this.E.c(ContextProvider.getInstance().getApplicationContext(), c3489gd, this.f30249o.b())) {
                ironSourceError = new IronSourceError(A0.f(this.f30249o.b()), "placement " + c3489gd.c() + " is capped");
            } else {
                ironSourceError = null;
            }
            if (ironSourceError != null) {
                IronLog.API.error(b(ironSourceError.getErrorMessage()));
                a(ironSourceError, "");
            } else {
                List listB = this.f30235a.b();
                Fg fg2 = new Fg(this.f30249o);
                abstractC3586m3 = (AbstractC3586m3) fg2.c(listB);
                a(abstractC3586m3, (List<AbstractC3586m3>) fg2.b(listB));
                if (abstractC3586m3 != null) {
                    a(fVar2);
                    i(abstractC3586m3);
                } else {
                    a(ErrorBuilder.buildNoAdsToShowError(this.f30249o.b().toString()), a(listB));
                }
            }
        }
        if (abstractC3586m3 != null) {
            a(activity, (AbstractC3586m3<?>) abstractC3586m3, this.f30243i);
        }
    }

    public void a(Activity activity, C3489gd c3489gd) {
        if (e()) {
            a(new a(activity, c3489gd));
        } else {
            b(activity, c3489gd);
        }
    }

    @Override // com.ironsource.AbstractC3606n3
    public boolean v() {
        return false;
    }

    public AbstractC3568l3(L7 l10, K7 k10, V v10, C3649pa c3649pa, C3450ea c3450ea) {
        super(l10, k10, v10, c3649pa, c3450ea);
    }

    @Override // com.ironsource.J0
    public void c(AbstractC3586m3<?> abstractC3586m3) {
        IronLog.INTERNAL.verbose(b(abstractC3586m3.k()));
        this.f30254t.a();
    }

    @Override // com.ironsource.J0
    public void d(AbstractC3586m3<?> abstractC3586m3) {
        IronLog.INTERNAL.verbose(b(abstractC3586m3.k()));
        this.f30254t.b();
    }

    @Override // com.ironsource.J0
    public String f() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f30250p == AbstractC3606n3.f.READY_TO_SHOW) {
            for (AbstractC3586m3 abstractC3586m3 : this.f30235a.b()) {
                if (abstractC3586m3.y()) {
                    sb2.append(abstractC3586m3.c());
                    sb2.append(";");
                }
            }
        }
        return sb2.toString();
    }

    @Override // com.ironsource.AbstractC3606n3
    public boolean u() {
        if (!x()) {
            return false;
        }
        if (this.f30244j && !IronSourceUtils.g(ContextProvider.getInstance().getApplicationContext())) {
            return false;
        }
        Iterator it = this.f30235a.b().iterator();
        while (it.hasNext()) {
            if (((AbstractC3586m3) it.next()).B()) {
                return true;
            }
        }
        return false;
    }

    private void a(Smash smash, List<Smash> list) {
        for (Smash smash2 : list) {
            if (smash != null && smash2 == smash) {
                smash.b(true);
                return;
            }
            smash2.b(false);
            IronLog.INTERNAL.verbose(b(smash2.k() + " - not ready to show"));
        }
    }

    private String a(List<Smash> list) {
        StringBuilder sb2 = new StringBuilder();
        for (Smash smash : list) {
            if (smash.e() != null) {
                sb2.append(smash.c());
                sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                sb2.append(smash.e());
                sb2.append(StringUtils.COMMA);
            }
        }
        return sb2.toString();
    }

    private void a(Activity activity, AbstractC3586m3<?> abstractC3586m3, C3489gd c3489gd) {
        if (this.f30249o.h().e()) {
            this.f30252r.a();
        }
        abstractC3586m3.a(activity, c3489gd);
    }

    private void a(IronSourceError ironSourceError, String str) {
        a(ironSourceError, (AbstractC3586m3<?>) null, str);
    }

    private void a(IronSourceError ironSourceError, AbstractC3586m3<?> abstractC3586m3, String str) {
        this.f30253s.f26412i.a(n(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), null);
        this.f30251q.g();
        this.f30254t.a(ironSourceError, abstractC3586m3 != null ? abstractC3586m3.f() : null);
        if (this.f30249o.h().e()) {
            b(false);
        }
    }

    @Override // com.ironsource.J0
    public void a(IronSourceError ironSourceError, AbstractC3586m3<?> abstractC3586m3) {
        IronLog.INTERNAL.verbose(b(abstractC3586m3.k() + " - error = " + ironSourceError));
        this.f30236b.put(abstractC3586m3.c(), com.ironsource.mediationsdk.h.a.ISAuctionPerformanceFailedToShow);
        a(AbstractC3606n3.f.READY_TO_LOAD);
        a(ironSourceError, abstractC3586m3, "");
    }

    @Override // com.ironsource.J0
    public void b(AbstractC3586m3<?> abstractC3586m3) {
        IronLog.INTERNAL.verbose(b(abstractC3586m3.k()));
        this.f30254t.g(abstractC3586m3.f());
    }

    @Override // com.ironsource.J0
    public void a(AbstractC3586m3<?> abstractC3586m3) {
        IronLog.INTERNAL.verbose(b(abstractC3586m3.k()));
        if (this.f30250p == AbstractC3606n3.f.SHOWING) {
            a(AbstractC3606n3.f.READY_TO_LOAD);
        }
        this.f30251q.f();
        this.f30254t.a(abstractC3586m3.f());
    }
}
