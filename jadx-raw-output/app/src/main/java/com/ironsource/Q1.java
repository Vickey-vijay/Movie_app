package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class Q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W0 f27395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC3757w0 f27396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, H> f27397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3460f2 f27398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<CallableC3777x3> f27399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f27400f;

    public static final class a extends AbstractRunnableC3526ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ A3 f27401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Q1 f27402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ A3.b f27403d;

        public a(A3 a10, Q1 q10, A3.b bVar) {
            this.f27401b = a10;
            this.f27402c = q10;
            this.f27403d = bVar;
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            this.f27401b.a(this.f27402c.e(), this.f27403d, this.f27402c.f27396b.f(), TimeUnit.MILLISECONDS);
        }
    }

    public static final class b implements InterfaceC3794y3 {
        @Override // com.ironsource.InterfaceC3794y3
        public void a(NetworkSettings networkSettings) {
            AdapterBaseInterface adapterBaseInterfaceA = null;
            if (Q1.this.h()) {
                BaseAdAdapter baseAdAdapterB = Q1.this.b(networkSettings != null ? networkSettings.getProviderName() : null);
                if (baseAdAdapterB != null) {
                    adapterBaseInterfaceA = baseAdAdapterB.getNetworkAdapter();
                }
            } else {
                adapterBaseInterfaceA = Q1.this.a(networkSettings);
            }
            if (adapterBaseInterfaceA != null) {
                Q1.this.f27395a.e().g().a(Q1.this.a(networkSettings, adapterBaseInterfaceA));
            }
        }

        public b() {
        }

        @Override // com.ironsource.InterfaceC3794y3
        public void a(String str) {
            Q1.this.f27395a.e().h().g(str);
        }
    }

    public static final class c implements A3.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f27406b;

        @Override // com.ironsource.A3.b
        public void a(final List<? extends B3> list, final long j10, final List<String> list2) {
            ck.p.j(list, "biddingDataList");
            ck.p.j(list2, "reachedTimeout");
            W0 w10 = Q1.this.f27395a;
            final Q1 q10 = Q1.this;
            final d dVar = this.f27406b;
            w10.a(new Runnable() { // from class: com.ironsource.zi
                @Override // java.lang.Runnable
                public final void run() {
                    Q1.c.a(q10, j10, list, list2, dVar);
                }
            });
        }

        public c(d dVar) {
            this.f27406b = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Q1 q10, long j10, List list, List list2, d dVar) {
            ck.p.j(q10, "this$0");
            ck.p.j(list, "$biddingDataList");
            ck.p.j(list2, "$reachedTimeout");
            ck.p.j(dVar, "$biddingDataListener");
            q10.a(j10, list, list2, dVar);
        }

        @Override // com.ironsource.A3.b
        public void onFailure(final String str) {
            ck.p.j(str, "error");
            W0 w10 = Q1.this.f27395a;
            final Q1 q10 = Q1.this;
            final d dVar = this.f27406b;
            w10.a(new Runnable() { // from class: com.ironsource.yi
                @Override // java.lang.Runnable
                public final void run() {
                    Q1.c.a(q10, str, dVar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Q1 q10, String str, d dVar) {
            ck.p.j(q10, "this$0");
            ck.p.j(str, "$error");
            ck.p.j(dVar, "$biddingDataListener");
            q10.f27395a.e().g().a(str);
            dVar.a(q10, str);
        }
    }

    public interface d {
        void a(Q1 q10);

        void a(Q1 q10, String str);
    }

    public Q1(W0 w10, AbstractC3757w0 abstractC3757w0) {
        ck.p.j(w10, "adTools");
        ck.p.j(abstractC3757w0, "adUnitData");
        this.f27395a = w10;
        this.f27396b = abstractC3757w0;
        this.f27397c = a();
        this.f27398d = new C3460f2(abstractC3757w0);
        this.f27399e = new ArrayList();
        this.f27400f = abstractC3757w0.e().q();
        b bVarB = b();
        Hf hfG = abstractC3757w0.b().g();
        for (NetworkSettings networkSettings : abstractC3757w0.m()) {
            if (hfG == null || hfG.a(networkSettings, this.f27396b.b().a())) {
                AdData adDataA = this.f27396b.a(networkSettings);
                if (networkSettings.isBidder(this.f27396b.b().a())) {
                    Object objB = this.f27400f ? b(networkSettings.getProviderName()) : a(networkSettings);
                    if (objB instanceof InterfaceC3811z3) {
                        this.f27399e.add(new CallableC3777x3(networkSettings.getInstanceType(this.f27396b.b().a()), networkSettings.getProviderInstanceName(), adDataA, (InterfaceC3811z3) objB, bVarB, networkSettings));
                    } else {
                        this.f27395a.e().h().g(objB == null ? "prepareAuctionCandidates - could not load network adapter " + networkSettings.getProviderName() : "network adapter " + networkSettings.getProviderName() + " does not implementing BiddingDataInterface");
                    }
                } else {
                    this.f27398d.a(networkSettings);
                }
            }
        }
    }

    private final b b() {
        return new b();
    }

    public final Map<String, H> c() {
        return this.f27397c;
    }

    public final C3460f2 d() {
        return this.f27398d;
    }

    public final List<CallableC3777x3> e() {
        return this.f27399e;
    }

    public final boolean f() {
        return !this.f27399e.isEmpty();
    }

    public final boolean g() {
        return this.f27398d.d();
    }

    public final boolean h() {
        return this.f27400f;
    }

    private final A3.b b(d dVar) {
        return new c(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseAdAdapter<?, ?> b(String str) {
        H h10 = this.f27397c.get(str);
        if (h10 != null) {
            return h10.b();
        }
        return null;
    }

    private final Map<String, H> a() {
        List<NetworkSettings> listM = this.f27396b.m();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ik.k.d(nj.l0.f(nj.t.v(listM, 10)), 16));
        Iterator<T> it = listM.iterator();
        while (it.hasNext()) {
            H h10 = new H(this.f27395a, this.f27396b, (NetworkSettings) it.next());
            Pair pairA = mj.h.a(h10.c(), h10);
            linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
        }
        return linkedHashMap;
    }

    public final void a(d dVar) {
        ck.p.j(dVar, "biddingDataListener");
        A3 a10 = new A3();
        A3.b bVarB = b(dVar);
        this.f27395a.e().g().a();
        this.f27395a.c((AbstractRunnableC3526ie) new a(a10, this, bVarB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(long j10, List<? extends B3> list, List<String> list2, d dVar) {
        this.f27395a.e().g().a(j10);
        for (B3 b10 : list) {
            String strC = b10.c();
            ck.p.i(strC, "biddingResponse.instanceName");
            Map<String, Object> mapA = a(strC);
            if (b10.a() != null) {
                this.f27398d.a(b10);
                this.f27395a.e().g().a(mapA, b10.e());
            } else {
                this.f27395a.e().g().a(mapA, b10.e(), b10.b());
            }
        }
        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            this.f27395a.e().g().b(a(it.next()), j10);
        }
        dVar.a(this);
    }

    private final Map<String, Object> a(String str) {
        AdapterBaseInterface adapterBaseInterfaceA;
        NetworkSettings networkSettingsA = this.f27396b.a(str);
        if (this.f27400f) {
            BaseAdAdapter<?, ?> baseAdAdapterB = b(str);
            adapterBaseInterfaceA = baseAdAdapterB != null ? baseAdAdapterB.getNetworkAdapter() : null;
        } else {
            adapterBaseInterfaceA = a(networkSettingsA);
        }
        return a(networkSettingsA, adapterBaseInterfaceA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        String providerDefaultInstance;
        HashMap map = new HashMap();
        if (networkSettings != null) {
            try {
                providerDefaultInstance = networkSettings.getProviderDefaultInstance();
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getProviderEventData " + (networkSettings != null ? networkSettings.getProviderDefaultInstance() : null), e10);
            }
        } else {
            providerDefaultInstance = null;
        }
        map.put(IronSourceConstants.EVENTS_PROVIDER, providerDefaultInstance);
        map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getAdapterVersion() : null);
        map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, adapterBaseInterface != null ? adapterBaseInterface.getNetworkSDKVersion() : null);
        map.put("spId", networkSettings != null ? networkSettings.getSubProviderId() : null);
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        map.put("instanceType", networkSettings != null ? Integer.valueOf(networkSettings.getInstanceType(this.f27396b.b().a())) : null);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdapterBaseInterface a(NetworkSettings networkSettings) {
        return com.ironsource.mediationsdk.c.b().b(networkSettings, this.f27396b.b().a(), this.f27396b.b().b());
    }
}
