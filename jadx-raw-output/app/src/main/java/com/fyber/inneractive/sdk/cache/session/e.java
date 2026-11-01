package com.fyber.inneractive.sdk.cache.session;

import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f14948a = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14950c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f14951d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f14949b = new a();

    public static JSONObject a(e eVar) {
        eVar.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("currentSession", eVar.f14948a.a());
            for (Map.Entry entry : eVar.f14949b.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                com.fyber.inneractive.sdk.cache.session.enums.c cVar = (com.fyber.inneractive.sdk.cache.session.enums.c) entry.getKey();
                Iterator it = ((PriorityQueue) entry.getValue()).iterator();
                while (it.hasNext()) {
                    jSONArray.put(((g) it.next()).a(true, true));
                }
                jSONObject.put(cVar.name(), jSONArray);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public final void a(com.fyber.inneractive.sdk.cache.session.enums.c cVar, g gVar) {
        synchronized (this.f14951d) {
            k kVar = (k) this.f14949b.get(cVar);
            if (kVar != null) {
                kVar.add(gVar);
            }
        }
    }
}
