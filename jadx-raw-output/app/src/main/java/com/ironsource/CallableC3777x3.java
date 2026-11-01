package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.ironsource.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class CallableC3777x3 implements Callable<B3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdData f31572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3811z3 f31573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3794y3 f31574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final NetworkSettings f31575f;

    /* JADX INFO: renamed from: com.ironsource.x3$a */
    public class a implements BiddingDataCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3570l5 f31576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BlockingQueue f31577b;

        public a(C3570l5 c3570l5, BlockingQueue blockingQueue) {
            this.f31576a = c3570l5;
            this.f31577b = blockingQueue;
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onFailure(String str) {
            this.f31577b.add(new B3(CallableC3777x3.this.d(), CallableC3777x3.this.c(), null, C3570l5.a(this.f31576a), str));
        }

        @Override // com.ironsource.mediationsdk.bidding.BiddingDataCallback
        public void onSuccess(Map<String, Object> map) {
            this.f31577b.add(new B3(CallableC3777x3.this.d(), CallableC3777x3.this.c(), map, C3570l5.a(this.f31576a), null));
        }
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public B3 call() throws Exception {
        C3570l5 c3570l5 = new C3570l5();
        IronLog.INTERNAL.verbose(c() + " fetching bidding data");
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
        try {
            b().collectBiddingData(this.f31572c, ContextProvider.getInstance().getActiveContext(), new a(c3570l5, arrayBlockingQueue));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            String str = "Exception while calling collectBiddingData - " + e10.getMessage();
            IronLog.INTERNAL.error(str);
            InterfaceC3794y3 interfaceC3794y3 = this.f31574e;
            if (interfaceC3794y3 != null) {
                interfaceC3794y3.a(str);
            }
        } catch (NoClassDefFoundError e11) {
            C3676r4.d().a(e11);
            String str2 = "Error while calling collectBiddingData - " + e11.getMessage();
            IronLog.INTERNAL.error(str2);
            InterfaceC3794y3 interfaceC3794y4 = this.f31574e;
            if (interfaceC3794y4 != null) {
                interfaceC3794y4.a(str2);
            }
        }
        InterfaceC3794y3 interfaceC3794y5 = this.f31574e;
        if (interfaceC3794y5 != null) {
            interfaceC3794y5.a(this.f31575f);
        }
        return (B3) arrayBlockingQueue.take();
    }

    public InterfaceC3811z3 b() {
        return this.f31573d;
    }

    public String c() {
        return this.f31571b;
    }

    public int d() {
        return this.f31570a;
    }

    public CallableC3777x3(int i10, String str, AdData adData, InterfaceC3811z3 interfaceC3811z3, InterfaceC3794y3 interfaceC3794y3, NetworkSettings networkSettings) {
        this.f31570a = i10;
        this.f31571b = str;
        this.f31572c = adData;
        this.f31573d = interfaceC3811z3;
        this.f31574e = interfaceC3794y3;
        this.f31575f = networkSettings;
    }
}
