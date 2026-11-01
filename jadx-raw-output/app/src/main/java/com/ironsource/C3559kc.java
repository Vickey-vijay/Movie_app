package com.ironsource;

import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.kc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3559kc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, JSONObject> f29358a;

    /* JADX WARN: Multi-variable type inference failed */
    public C3559kc() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final ConcurrentHashMap<String, JSONObject> a() {
        return this.f29358a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3559kc) && ck.p.e(this.f29358a, ((C3559kc) obj).f29358a);
    }

    public C3559kc(ConcurrentHashMap<String, JSONObject> concurrentHashMap) {
        ck.p.j(concurrentHashMap, "networkDataMap");
        this.f29358a = concurrentHashMap;
    }

    public final C3559kc a(ConcurrentHashMap<String, JSONObject> concurrentHashMap) {
        ck.p.j(concurrentHashMap, "networkDataMap");
        return new C3559kc(concurrentHashMap);
    }

    public int hashCode() {
        return this.f29358a.hashCode();
    }

    public String toString() {
        return "NetworkDataStore(networkDataMap=" + this.f29358a + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3559kc a(C3559kc c3559kc, ConcurrentHashMap concurrentHashMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            concurrentHashMap = c3559kc.f29358a;
        }
        return c3559kc.a((ConcurrentHashMap<String, JSONObject>) concurrentHashMap);
    }

    public /* synthetic */ C3559kc(ConcurrentHashMap concurrentHashMap, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? new ConcurrentHashMap() : concurrentHashMap);
    }

    public final void a(com.ironsource.mediationsdk.x xVar) {
        ck.p.j(xVar, "networkData");
        if (!this.f29358a.containsKey(xVar.a())) {
            this.f29358a.put(xVar.a(), xVar.allData());
            return;
        }
        try {
            ConcurrentHashMap<String, JSONObject> concurrentHashMap = this.f29358a;
            String strA = xVar.a();
            JSONObject jSONObjectJsonObjectInit = this.f29358a.get(xVar.a());
            if (jSONObjectJsonObjectInit == null) {
                jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            }
            JSONObject jSONObjectA = IronSourceUtils.a(jSONObjectJsonObjectInit, xVar.allData());
            ck.p.i(jSONObjectA, "deepMergeJSONObjects(\n  …), networkData.allData())");
            concurrentHashMap.put(strA, jSONObjectA);
        } catch (Exception e10) {
            IronLog.INTERNAL.error("error while merging network data: " + e10.getMessage());
        }
    }

    public final void a(AbstractAdapter abstractAdapter) {
        ck.p.j(abstractAdapter, Q6.G1);
        Set<Map.Entry<String, JSONObject>> setEntrySet = this.f29358a.entrySet();
        ck.p.i(setEntrySet, "networkDataMap.entries");
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (com.ironsource.mediationsdk.c.a((String) ((Map.Entry) obj).getKey(), abstractAdapter)) {
                arrayList.add(obj);
            }
        }
        for (Map.Entry entry : arrayList) {
            Object key = entry.getKey();
            ck.p.i(key, "it.key");
            Object value = entry.getValue();
            ck.p.i(value, "it.value");
            abstractAdapter.setNetworkData(new com.ironsource.mediationsdk.x((String) key, (JSONObject) value));
        }
    }

    public final void a(AdapterBaseWrapper adapterBaseWrapper) {
        Set<Map.Entry<String, JSONObject>> setEntrySet = this.f29358a.entrySet();
        ck.p.i(setEntrySet, "networkDataMap.entries");
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (com.ironsource.mediationsdk.c.a((String) ((Map.Entry) obj).getKey(), adapterBaseWrapper)) {
                arrayList.add(obj);
            }
        }
        for (Map.Entry entry : arrayList) {
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper != null ? adapterBaseWrapper.getAdapterBaseInterface() : null;
            ck.p.h(adapterBaseInterface, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface");
            Object key = entry.getKey();
            ck.p.i(key, "it.key");
            Object value = entry.getValue();
            ck.p.i(value, "it.value");
            ((AdapterNetworkDataInterface) adapterBaseInterface).setNetworkData(new com.ironsource.mediationsdk.x((String) key, (JSONObject) value));
        }
    }
}
