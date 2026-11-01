package com.ironsource;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class Zb extends AbstractC3606n3<C3434dc, AdapterAdListener> {
    @Override // com.ironsource.AbstractC3606n3
    public void G() {
    }

    @Override // com.ironsource.AbstractC3606n3
    public boolean H() {
        return false;
    }

    @Override // com.ironsource.AbstractC3606n3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3434dc a(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdListener> baseAdAdapter, int i10, String str, C3605n2 c3605n2) {
        ck.p.j(networkSettings, "providerSettings");
        ck.p.j(baseAdAdapter, Q6.G1);
        ck.p.j(str, "currentAuctionId");
        ck.p.j(c3605n2, "item");
        return new C3434dc(this, new C3583m0(IronSource.a.NATIVE_AD, this.f30249o.o(), i10, this.f30241g, str, this.f30239e, this.f30240f, networkSettings, this.f30249o.n()), baseAdAdapter, this.f30243i, c3605n2, this);
    }

    @Override // com.ironsource.AbstractC3606n3
    public String l() {
        return "NA";
    }

    @Override // com.ironsource.AbstractC3606n3
    public String o() {
        return IronSourceConstants.OPW_NT_MANAGER_NAME;
    }

    @Override // com.ironsource.AbstractC3606n3
    public boolean v() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zb(List<? extends NetworkSettings> list, Qb qb2, String str, C3649pa c3649pa, C3450ea c3450ea) {
        super(new C3380ac(str, list, qb2), c3649pa, c3450ea);
        ck.p.j(qb2, C3537j8.f29262p);
        ck.p.j(c3649pa, "publisherDataHolder");
    }

    public final void M() {
        C3402bg c3402bg;
        int iIntValue;
        Ab ab2;
        IronLog.INTERNAL.verbose();
        try {
            C3434dc c3434dc = (C3434dc) this.f30235a.d();
            if (c3434dc != null) {
                Integer numR = c3434dc.r();
                if (numR == null) {
                    iIntValue = this.C.a(this.f30249o.b());
                } else {
                    ck.p.i(numR, "it.sessionDepth ?: sessi…epth(mManagerData.adUnit)");
                    iIntValue = numR.intValue();
                }
                E0 e10 = this.f30253s;
                if (e10 != null && (ab2 = e10.f26409f) != null) {
                    ab2.a(iIntValue);
                }
                c3434dc.P();
                this.f30235a.a(null);
                this.f30235a.b(null);
            }
            this.f30243i = null;
            a(AbstractC3606n3.f.NONE);
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            String str = "destroyNativeAd - exception = " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(b(str));
            E0 e11 = this.f30253s;
            if (e11 == null || (c3402bg = e11.f26413j) == null) {
                return;
            }
            c3402bg.g(str);
        }
    }

    public final void a(C3489gd c3489gd) {
        String str;
        int iB;
        IronLog.INTERNAL.verbose("placement = " + c3489gd);
        if (c3489gd == null || TextUtils.isEmpty(c3489gd.c())) {
            ck.w wVar = ck.w.f6066a;
            str = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{c3489gd == null ? "placement is null" : "placement name is empty"}, 1));
            ck.p.i(str, "format(format, *args)");
            iB = A0.b(this.f30249o.b());
        } else if (this.E.c(ContextProvider.getInstance().getApplicationContext(), c3489gd, this.f30249o.b())) {
            ck.w wVar2 = ck.w.f6066a;
            str = String.format("placement %s is capped", Arrays.copyOf(new Object[]{c3489gd.c()}, 1));
            ck.p.i(str, "format(format, *args)");
            iB = A0.f(this.f30249o.b());
        } else {
            str = null;
            iB = 510;
        }
        if (TextUtils.isEmpty(str)) {
            this.f30243i = c3489gd;
            A();
        } else {
            IronLog.API.error(b(str));
            a(iB, str, false);
        }
    }

    @Override // com.ironsource.AbstractC3606n3
    public L0 g() {
        return new C3588m5();
    }

    @Override // com.ironsource.AbstractC3606n3
    public JSONObject b(NetworkSettings networkSettings) {
        ck.p.j(networkSettings, "providerSettings");
        JSONObject nativeAdSettings = networkSettings.getNativeAdSettings();
        ck.p.i(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }

    public final void a(InternalNativeAdListener internalNativeAdListener) {
        ck.p.j(internalNativeAdListener, "nativeAdListener");
        a(new Yb(internalNativeAdListener));
    }

    @Override // com.ironsource.AbstractC3606n3
    public void a(AbstractC3659q3<?> abstractC3659q3, AdInfo adInfo) {
        if (abstractC3659q3 instanceof C3434dc) {
            C3434dc c3434dc = (C3434dc) abstractC3659q3;
            this.f30254t.a(c3434dc.Q(), c3434dc.R(), adInfo);
        }
    }

    @Override // com.ironsource.AbstractC3606n3
    public void a(IronSourceError ironSourceError) {
        this.f30254t.a(ironSourceError);
    }

    @Override // com.ironsource.AbstractC3606n3, com.ironsource.D0
    public Map<String, Object> a(B0 b10) {
        ck.p.j(b10, "event");
        Map<String, Object> mapA = super.a(b10);
        C3489gd c3489gd = this.f30243i;
        if (c3489gd != null) {
            ck.p.i(mapA, "data");
            mapA.put("placement", c3489gd.c());
        }
        UUID uuid = this.f30257w;
        if (uuid != null) {
            ck.p.i(mapA, "data");
            mapA.put("objectId", uuid);
        }
        ck.p.i(mapA, "data");
        return mapA;
    }
}
