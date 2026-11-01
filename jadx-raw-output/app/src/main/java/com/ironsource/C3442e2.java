package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.ironsource.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3442e2 implements Vc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W0 f28721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.ironsource.mediationsdk.e f28722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28723c;

    @Override // com.ironsource.Vc
    public void a(A a10, String str, C3649pa c3649pa) {
        ck.p.j(a10, C3605n2.f30210p);
        ck.p.j(c3649pa, "publisherDataHolder");
        this.f28722b.a(a10.h(), a10.r(), a10.m(), str);
        a(c3649pa, a10);
    }

    public C3442e2(W0 w10, com.ironsource.mediationsdk.e eVar) {
        ck.p.j(w10, "adTools");
        ck.p.j(eVar, "auctionHandler");
        this.f28721a = w10;
        this.f28722b = eVar;
    }

    @Override // com.ironsource.Vc
    public void a(List<? extends A> list, A a10) {
        ck.p.j(list, "waterfallInstances");
        ck.p.j(a10, "winnerInstance");
        if (this.f28723c) {
            return;
        }
        this.f28723c = true;
        C3605n2 c3605n2H = a10.h();
        this.f28722b.a(c3605n2H, a10.r(), a10.m());
        ArrayList<String> arrayList = new ArrayList<>();
        ConcurrentHashMap<String, C3605n2> concurrentHashMap = new ConcurrentHashMap<>();
        for (A a11 : list) {
            arrayList.add(a11.p());
            concurrentHashMap.put(a11.p(), a11.h());
        }
        this.f28722b.a(arrayList, concurrentHashMap, a10.r(), a10.m(), c3605n2H);
    }

    private final void a(C3649pa c3649pa, A a10) {
        final Z8 z10 = new Z8(a10.e());
        for (final ImpressionDataListener impressionDataListener : new HashSet(c3649pa.a())) {
            this.f28721a.e(new Runnable() { // from class: com.ironsource.uk
                @Override // java.lang.Runnable
                public final void run() {
                    C3442e2.a(this.f31433b, impressionDataListener, z10);
                }
            });
            this.f28721a.e().h().a(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3442e2 c3442e2, ImpressionDataListener impressionDataListener, Z8 z10) {
        ck.p.j(c3442e2, "this$0");
        ck.p.j(impressionDataListener, "$listener");
        ck.p.j(z10, "$impressionData");
        IronLog.CALLBACK.verbose(C3621o0.a(c3442e2.f28721a, "onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + z10, (String) null, 2, (Object) null));
        impressionDataListener.onImpressionSuccess(z10);
    }
}
