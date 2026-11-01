package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import com.ironsource.C3644p5;
import com.ironsource.C3676r4;
import com.ironsource.D5;
import com.ironsource.H9;
import com.ironsource.InterfaceC3394b8;
import com.ironsource.N9;
import com.ironsource.U4;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class f implements i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U4 f29698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, g> f29699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3394b8<ISDemandOnlyInterstitialListener> f29700c;

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public void a(h.d dVar) {
        String strE = dVar.e();
        String strB = dVar.b();
        try {
            g gVar = this.f29699b.get(strE);
            if (gVar == null) {
                this.f29698a.a(D5.IS_DO_INSTANCE_NOT_FOUND_IN_LOAD, strE);
                IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Interstitial");
                IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
                this.f29700c.a(strE).onInterstitialAdLoadFailed(strE, ironSourceErrorBuildNonExistentInstanceError);
                return;
            }
            if (TextUtils.isEmpty(strB)) {
                gVar.b();
            } else {
                gVar.a(new o.a(N9.b(C3644p5.b().c(), strB)));
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial exception " + e10.getMessage());
            IronLog.API.error(ironSourceErrorBuildLoadFailedError.getErrorMessage());
            this.f29700c.a(strE).onInterstitialAdLoadFailed(strE, ironSourceErrorBuildLoadFailedError);
        }
    }

    public f(List<NetworkSettings> list, H9 h10, com.ironsource.mediationsdk.c cVar, InterfaceC3394b8<ISDemandOnlyInterstitialListener> interfaceC3394b8, String str, String str2, U4 u10) {
        String strD = IronSourceUtils.d();
        boolean zJ = h10.j();
        com.ironsource.mediationsdk.f fVar = new com.ironsource.mediationsdk.f(h10.g(), strD);
        this.f29699b = new ConcurrentHashMap<>();
        this.f29698a = u10;
        this.f29700c = interfaceC3394b8;
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                AbstractAdapter abstractAdapterA = cVar.a(networkSettings, networkSettings.getInterstitialSettings(), true);
                if (abstractAdapterA != null) {
                    g gVar = new g(str, str2, networkSettings, this.f29700c.a(networkSettings.getSubProviderId()), h10.e(), abstractAdapterA, new com.ironsource.mediationsdk.e(fVar));
                    gVar.a(zJ);
                    this.f29699b.put(networkSettings.getSubProviderId(), gVar);
                }
            } else {
                IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public boolean b(String str) {
        g gVar = this.f29699b.get(str);
        if (gVar != null) {
            return gVar.a();
        }
        this.f29698a.a(D5.IS_DO_INSTANCE_NOT_FOUND_IN_AVAILABILITY_CHECK, str);
        return false;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public void a(String str) {
        try {
            g gVar = this.f29699b.get(str);
            if (gVar == null) {
                this.f29698a.a(D5.IS_DO_INSTANCE_NOT_FOUND_IN_SHOW, str);
                IronSourceError ironSourceErrorBuildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError("Interstitial");
                IronLog.API.error(ironSourceErrorBuildNonExistentInstanceError.getErrorMessage());
                this.f29700c.a(str).onInterstitialAdShowFailed(str, ironSourceErrorBuildNonExistentInstanceError);
                return;
            }
            gVar.e();
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronSourceError ironSourceErrorBuildShowFailedError = ErrorBuilder.buildShowFailedError("Interstitial", "showInterstitial exception " + e10.getMessage());
            IronLog.API.error(ironSourceErrorBuildShowFailedError.getErrorMessage());
            this.f29700c.a(str).onInterstitialAdShowFailed(str, ironSourceErrorBuildShowFailedError);
        }
    }

    public ConcurrentHashMap<String, g> a() {
        return this.f29699b;
    }
}
