package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.ironsource.ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3736ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W0 f31406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<C3803yc> f31407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC3757w0 f31408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IronSource.a f31409d;

    /* JADX INFO: renamed from: com.ironsource.ud$b */
    public static final class b extends AbstractRunnableC3526ie {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ NetworkSettings f31412c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AdapterBaseInterface f31413d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AdData f31414e;

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            C3736ud c3736ud = C3736ud.this;
            NetworkSettings networkSettings = this.f31412c;
            AdapterBaseInterface adapterBaseInterface = this.f31413d;
            ck.p.i(adapterBaseInterface, "networkAdapter");
            c3736ud.a(networkSettings, adapterBaseInterface, this.f31414e);
        }

        public b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
            this.f31412c = networkSettings;
            this.f31413d = adapterBaseInterface;
            this.f31414e = adData;
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a(Throwable th2) {
            ck.p.j(th2, "t");
            C3736ud.this.f31406a.e().h().g("initProvider - exception while calling networkAdapter.init with " + this.f31412c.getProviderName() + " - " + th2);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ud$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31410a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f31410a = iArr;
        }
    }

    public C3736ud(W0 w10, LevelPlay.AdFormat adFormat, List<C3803yc> list, AbstractC3757w0 abstractC3757w0) {
        ck.p.j(w10, "adUnitTools");
        ck.p.j(adFormat, "adFormat");
        ck.p.j(list, Ne.f27190y0);
        ck.p.j(abstractC3757w0, "adUnitData");
        this.f31406a = w10;
        this.f31407b = list;
        this.f31408c = abstractC3757w0;
        this.f31409d = a(adFormat);
    }

    public final void a() {
        IronLog.INTERNAL.verbose(C3621o0.a(this.f31406a, (String) null, (String) null, 3, (Object) null));
        UUID uuidRandomUUID = UUID.randomUUID();
        Iterator<C3803yc> it = this.f31407b.iterator();
        while (it.hasNext()) {
            NetworkSettings networkSettingsF = it.next().f();
            AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettingsF, this.f31409d, uuidRandomUUID);
            if (a(networkSettingsF, adapterBaseInterfaceB)) {
                C3789xf.a(C3789xf.f31600a, new b(networkSettingsF, adapterBaseInterfaceB, this.f31408c.a(networkSettingsF)), 0L, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
        a("Start initializing provider %s on thread %s", networkSettings);
        adapterBaseInterface.init(adData, ContextProvider.getInstance().getApplicationContext(), null);
        a("Done initializing provider %s on thread %s", networkSettings);
    }

    private final void a(String str, NetworkSettings networkSettings) {
        IronLog ironLog = IronLog.INTERNAL;
        W0 w10 = this.f31406a;
        ck.w wVar = ck.w.f6066a;
        String str2 = String.format(str, Arrays.copyOf(new Object[]{networkSettings.getProviderInstanceName(), Thread.currentThread().getName()}, 2));
        ck.p.i(str2, "format(format, *args)");
        ironLog.verbose(C3621o0.a(w10, str2, (String) null, 2, (Object) null));
    }

    private final boolean a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (adapterBaseInterface == null) {
            return false;
        }
        W0 w10 = this.f31406a;
        IronSource.a aVar = this.f31409d;
        String providerInstanceName = networkSettings.getProviderInstanceName();
        ck.p.i(providerInstanceName, "providerSettings.providerInstanceName");
        if (w10.a(adapterBaseInterface, aVar, providerInstanceName)) {
            return false;
        }
        return networkSettings.shouldEarlyInit() || networkSettings.isIronSource() || networkSettings.isBidder(this.f31409d);
    }

    private final IronSource.a a(LevelPlay.AdFormat adFormat) {
        int i10 = a.f31410a[adFormat.ordinal()];
        if (i10 == 1) {
            return IronSource.a.REWARDED_VIDEO;
        }
        if (i10 == 2) {
            return IronSource.a.INTERSTITIAL;
        }
        if (i10 == 3) {
            return IronSource.a.BANNER;
        }
        if (i10 == 4) {
            return IronSource.a.NATIVE_AD;
        }
        throw new NoWhenBranchMatchedException();
    }
}
