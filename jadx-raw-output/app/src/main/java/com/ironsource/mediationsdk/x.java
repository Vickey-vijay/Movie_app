package com.ironsource.mediationsdk;

import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.J9;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements AdapterNetworkData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f30116b;

    private final void b(Collection<? extends AdapterBaseWrapper> collection) {
        List listC0 = nj.b0.c0(collection);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC0) {
            if (c.a(this.f30115a, (AdapterBaseWrapper) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(nj.t.v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AdapterBaseWrapper) it.next()).getAdapterBaseInterface());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof AdapterNetworkDataInterface) {
                arrayList3.add(obj2);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            ((AdapterNetworkDataInterface) it2.next()).setNetworkData(this);
        }
    }

    public final String a() {
        return this.f30115a;
    }

    public x(String str, JSONObject jSONObject) {
        ck.p.j(str, "networkName");
        ck.p.j(jSONObject, "data");
        this.f30115a = str;
        this.f30116b = IronSourceVideoBridge.jsonObjectInit(jSONObject.toString());
    }

    public final void a(Collection<? extends AbstractAdapter> collection, Collection<? extends AdapterBaseWrapper> collection2) {
        ck.p.j(collection, "adapters");
        ck.p.j(collection2, "networkAdapters");
        try {
            a(collection);
            b(collection2);
        } catch (Exception e10) {
            IronLog.INTERNAL.error("error while setting network data: " + e10.getMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    public JSONObject allData() {
        return this.f30116b;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    public <T> T dataByKeyIgnoreCase(String str, Class<T> cls) {
        T next;
        ck.p.j(str, "desiredKey");
        ck.p.j(cls, "valueType");
        Iterator<String> itKeys = allData().keys();
        ck.p.i(itKeys, "allData()\n          .keys()");
        Iterator<T> it = kk.r.g(itKeys).iterator();
        do {
            if (!it.hasNext()) {
                next = (T) null;
                break;
            }
            next = it.next();
        } while (!lk.x.E((String) next, str, true));
        String str2 = next;
        if (str2 == null) {
            return null;
        }
        Object objOpt = allData().opt(str2);
        if (!cls.isInstance(objOpt)) {
            objOpt = null;
        }
        if (objOpt != null) {
            return cls.cast(objOpt);
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    public JSONObject networkDataByAdUnit(IronSource.a aVar) {
        ck.p.j(aVar, "adUnit");
        JSONObject jSONObjectOptJSONObject = this.f30116b.optJSONObject(aVar.toString());
        return jSONObjectOptJSONObject == null ? IronSourceVideoBridge.jsonObjectInit() : jSONObjectOptJSONObject;
    }

    public String toString() {
        return "NetworkData(networkName=" + this.f30115a + ", networkData=" + this.f30116b + ")";
    }

    private final void a(Collection<? extends AbstractAdapter> collection) {
        List listC0 = nj.b0.c0(collection);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC0) {
            if (c.a(this.f30115a, (AbstractAdapter) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractAdapter) it.next()).setNetworkData(this);
        }
    }

    public final void b() throws JSONException {
        Iterator<String> itKeys = this.f30116b.keys();
        ck.p.i(itKeys, "networkData.keys()");
        String strP0 = nj.b0.p0(SequencesKt___SequencesKt.T(kk.r.g(itKeys)), StringUtils.COMMA, null, null, 0, null, null, 62, null);
        J9.i().a(new C5(D5.SET_NETWORK_DATA, IronSourceUtils.b(false).put(IronSourceConstants.EVENTS_EXT1, this.f30115a + " - " + strP0)));
    }
}
