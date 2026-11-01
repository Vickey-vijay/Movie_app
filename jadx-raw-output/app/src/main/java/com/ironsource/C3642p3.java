package com.ironsource;

import com.ironsource.V0;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3642p3<Listener extends V0> extends AbstractC3586m3<Listener> implements AdapterAdRewardListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C3570l5 f30410r;

    /* JADX INFO: renamed from: com.ironsource.p3$a */
    public class a extends AbstractRunnableC3526ie {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            C3642p3.this.U();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        if (this.f30507g == null) {
            IronLog.INTERNAL.verbose(a("placement is null "));
            E0 e10 = this.f30504d;
            if (e10 != null) {
                e10.f26413j.g("mCurrentPlacement is null state = " + this.f30505e);
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose(a("placement name = " + j()));
        if (this.f30504d != null) {
            HashMap map = new HashMap();
            if (com.ironsource.mediationsdk.r.m().r() != null) {
                for (String str : com.ironsource.mediationsdk.r.m().r().keySet()) {
                    map.put("custom_" + str, com.ironsource.mediationsdk.r.m().r().get(str));
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f30504d.f26412i.a(j(), this.f30507g.f(), this.f30507g.e(), jCurrentTimeMillis, IronSourceUtils.a(jCurrentTimeMillis, c()), C3570l5.a(this.f30410r), map, com.ironsource.mediationsdk.r.m().l());
        }
        ((V0) this.f30502b).a((C3642p3<?>) this, this.f30507g);
    }

    @Override // com.ironsource.AbstractC3659q3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        this.f30410r = null;
        super.onAdOpened();
    }

    @Override // com.ironsource.AbstractC3586m3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        this.f30410r = new C3570l5();
        super.onAdClosed();
    }

    public C3642p3(InterfaceC3652pd interfaceC3652pd, C3583m0 c3583m0, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, C3405c1 c3405c1, C3605n2 c3605n2, Listener listener) {
        super(interfaceC3652pd, c3583m0, baseAdAdapter, c3405c1, c3605n2, listener);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        if (!u().e()) {
            U();
        } else {
            u().a(new a());
        }
    }
}
