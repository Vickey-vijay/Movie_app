package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.FeaturesManager;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class Xe implements Q8, Q8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, C3756w> f27878a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3633oc f27879b = new C3633oc();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ReadWriteLock f27880c = new ReentrantReadWriteLock();

    @Override // com.ironsource.Q8.a
    public void a(Ye ye2) {
        ck.p.j(ye2, "historyRecord");
        this.f27880c.writeLock().lock();
        try {
            O oA = ye2.a();
            String strValueOf = String.valueOf(oA != null ? oA.b() : null);
            Map<String, C3756w> map = this.f27878a;
            C3756w c3756w = map.get(strValueOf);
            if (c3756w == null) {
                c3756w = new C3756w();
                map.put(strValueOf, c3756w);
            }
            c3756w.a(ye2.a(new C3455ef()));
            this.f27880c.writeLock().unlock();
            b();
        } catch (Throwable th2) {
            this.f27880c.writeLock().unlock();
            throw th2;
        }
    }

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27881a;

        static {
            int[] iArr = new int[We.values().length];
            try {
                iArr[We.CurrentlyLoadedAdsAndFullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[We.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[We.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27881a = iArr;
        }
    }

    private final void b() {
        Ve sessionHistoryConfig = FeaturesManager.getInstance().getSessionHistoryConfig();
        C3633oc c3633oc = this.f27879b;
        ck.p.i(sessionHistoryConfig, com.safedk.android.utils.i.f44984c);
        c3633oc.a(a(sessionHistoryConfig));
        this.f27879b.a(a());
    }

    @Override // com.ironsource.Q8
    public JSONObject a(EnumC3509hf enumC3509hf) {
        ck.p.j(enumC3509hf, C3426d4.a.f28427t);
        this.f27880c.readLock().lock();
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            for (Map.Entry<String, C3756w> entry : this.f27878a.entrySet()) {
                String key = entry.getKey();
                JSONObject jSONObjectA = entry.getValue().a(enumC3509hf);
                if (jSONObjectA.length() > 0) {
                    jSONObjectJsonObjectInit.put(key, jSONObjectA);
                }
            }
            this.f27880c.readLock().unlock();
            return jSONObjectJsonObjectInit;
        } catch (Throwable th2) {
            this.f27880c.readLock().unlock();
            throw th2;
        }
    }

    @Override // com.ironsource.Q8
    public int a(IronSource.a aVar) {
        ck.p.j(aVar, "adFormat");
        this.f27880c.readLock().lock();
        try {
            C3756w c3756w = this.f27878a.get(aVar.toString());
            return c3756w != null ? c3756w.a() : 0;
        } finally {
            this.f27880c.readLock().unlock();
        }
    }

    @Override // com.ironsource.Q8
    public List<String> a() {
        this.f27880c.readLock().lock();
        try {
            Map<String, C3756w> map = this.f27878a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, C3756w> entry : map.entrySet()) {
                if (entry.getValue().b()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return nj.b0.O0(linkedHashMap.keySet());
        } finally {
            this.f27880c.readLock().unlock();
        }
    }

    @Override // com.ironsource.Q8
    public Map<String, JSONObject> a(Ve ve2) {
        Map<String, JSONObject> mapO;
        ck.p.j(ve2, com.safedk.android.utils.i.f44984c);
        this.f27880c.readLock().lock();
        try {
            int i10 = a.f27881a[ve2.a().ordinal()];
            if (i10 == 1) {
                mapO = kotlin.collections.a.o(mj.h.a(Q6.f27489z1, a(EnumC3509hf.FullHistory)), mj.h.a(Q6.A1, a(EnumC3509hf.CurrentlyLoadedAds)));
            } else if (i10 == 2) {
                mapO = kotlin.collections.a.o(mj.h.a(Q6.A1, a(EnumC3509hf.CurrentlyLoadedAds)));
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                mapO = kotlin.collections.a.j();
            }
            this.f27880c.readLock().unlock();
            return mapO;
        } catch (Throwable th2) {
            this.f27880c.readLock().unlock();
            throw th2;
        }
    }
}
