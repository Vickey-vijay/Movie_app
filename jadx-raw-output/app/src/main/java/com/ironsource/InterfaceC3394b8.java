package com.ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.b8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC3394b8<T> {

    /* JADX INFO: renamed from: com.ironsource.b8$a */
    public static final class a implements InterfaceC3394b8<ISDemandOnlyInterstitialListener> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private C3376a8 f28218a = new C3376a8();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<String, C3376a8> f28219b = new HashMap();

        @Override // com.ironsource.InterfaceC3394b8
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyInterstitialListener a(String str) {
            ck.p.j(str, "instanceId");
            C3376a8 c3376a8 = this.f28219b.get(str);
            return c3376a8 != null ? c3376a8 : this.f28218a;
        }

        @Override // com.ironsource.InterfaceC3394b8
        public void a(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            ck.p.j(iSDemandOnlyInterstitialListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f28218a.a(iSDemandOnlyInterstitialListener);
            Iterator<String> it = this.f28219b.keySet().iterator();
            while (it.hasNext()) {
                C3376a8 c3376a8 = this.f28219b.get(it.next());
                if (c3376a8 != null) {
                    c3376a8.a(iSDemandOnlyInterstitialListener);
                }
            }
        }

        @Override // com.ironsource.InterfaceC3394b8
        public void a(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            ck.p.j(str, "instanceId");
            ck.p.j(iSDemandOnlyInterstitialListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            if (this.f28219b.containsKey(str)) {
                C3376a8 c3376a8 = this.f28219b.get(str);
                if (c3376a8 != null) {
                    c3376a8.a(iSDemandOnlyInterstitialListener);
                    return;
                }
                return;
            }
            this.f28219b.put(str, new C3376a8(iSDemandOnlyInterstitialListener));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$b */
    public static final class b implements InterfaceC3394b8<ISDemandOnlyRewardedVideoListener> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private C3430d8 f28220a = new C3430d8();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<String, C3430d8> f28221b = new HashMap();

        @Override // com.ironsource.InterfaceC3394b8
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyRewardedVideoListener a(String str) {
            ck.p.j(str, "instanceId");
            C3430d8 c3430d8 = this.f28221b.get(str);
            return c3430d8 != null ? c3430d8 : this.f28220a;
        }

        @Override // com.ironsource.InterfaceC3394b8
        public void a(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            ck.p.j(iSDemandOnlyRewardedVideoListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f28220a.a(iSDemandOnlyRewardedVideoListener);
            Iterator<String> it = this.f28221b.keySet().iterator();
            while (it.hasNext()) {
                C3430d8 c3430d8 = this.f28221b.get(it.next());
                if (c3430d8 != null) {
                    c3430d8.a(iSDemandOnlyRewardedVideoListener);
                }
            }
        }

        @Override // com.ironsource.InterfaceC3394b8
        public void a(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            ck.p.j(str, "instanceId");
            ck.p.j(iSDemandOnlyRewardedVideoListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            if (this.f28221b.containsKey(str)) {
                C3430d8 c3430d8 = this.f28221b.get(str);
                if (c3430d8 != null) {
                    c3430d8.a(iSDemandOnlyRewardedVideoListener);
                    return;
                }
                return;
            }
            this.f28221b.put(str, new C3430d8(iSDemandOnlyRewardedVideoListener));
        }
    }

    T a(String str);

    void a(T t10);

    void a(String str, T t10);
}
