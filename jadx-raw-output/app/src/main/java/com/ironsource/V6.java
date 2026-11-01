package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class V6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X9 f27796a;

    public V6(X9 x10) {
        ck.p.j(x10, "globalDataWriter");
        this.f27796a = x10;
    }

    public final void a(JSONObject jSONObject) {
        ck.p.j(jSONObject, "metaDataJson");
        if (jSONObject.has(com.ironsource.mediationsdk.metadata.a.f29887i)) {
            try {
                Object objRemove = jSONObject.remove(com.ironsource.mediationsdk.metadata.a.f29887i);
                ck.p.h(objRemove, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                ArrayList arrayList = (ArrayList) objRemove;
                if (arrayList.isEmpty()) {
                    return;
                }
                Object obj = arrayList.get(0);
                ck.p.h(obj, "null cannot be cast to non-null type kotlin.String");
                this.f27796a.e((String) obj);
            } catch (ClassCastException e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error("got the following error " + e10.getMessage());
            }
        }
    }
}
