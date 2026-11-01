package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.features.u;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.w;
import com.fyber.inneractive.sdk.util.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15108a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f15109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONArray f15110c;

    public static r a() {
        int i10 = com.fyber.inneractive.sdk.config.k.f15121a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.featuresConfig");
        boolean z10 = false;
        if (!TextUtils.isEmpty(property)) {
            try {
                IAConfigManager.O.f15031z.f15075a = l.a(new JSONObject(property));
                z10 = true;
            } catch (Exception unused) {
                IAlog.a("failed parsing local features json", new Object[0]);
            }
        }
        r rVar = new r();
        if (z10) {
            IAConfigManager iAConfigManager = IAConfigManager.O;
            iAConfigManager.M.a(true, "");
            iAConfigManager.E.a(iAConfigManager.M);
        }
        return rVar;
    }

    public final JSONArray b() {
        JSONArray jSONArray = this.f15110c;
        if (jSONArray == null || jSONArray.length() == 0) {
            JSONArray jSONArrayA = g.a(this.f15109b, false);
            this.f15110c = jSONArrayA;
            IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", jSONArrayA);
        }
        return this.f15110c;
    }

    public r() {
        HashMap map = new HashMap();
        map.put(u.class, new u());
        map.put(com.fyber.inneractive.sdk.config.global.features.d.class, new com.fyber.inneractive.sdk.config.global.features.d());
        map.put(com.fyber.inneractive.sdk.config.global.features.l.class, new com.fyber.inneractive.sdk.config.global.features.l());
        map.put(com.fyber.inneractive.sdk.config.global.features.f.class, new com.fyber.inneractive.sdk.config.global.features.f());
        map.put(com.fyber.inneractive.sdk.config.global.features.k.class, new com.fyber.inneractive.sdk.config.global.features.k());
        map.put(com.fyber.inneractive.sdk.config.global.features.e.class, new com.fyber.inneractive.sdk.config.global.features.e());
        map.put(com.fyber.inneractive.sdk.config.global.features.r.class, new com.fyber.inneractive.sdk.config.global.features.r());
        map.put(com.fyber.inneractive.sdk.config.global.features.i.class, new com.fyber.inneractive.sdk.config.global.features.i());
        map.put(com.fyber.inneractive.sdk.config.global.features.q.class, new com.fyber.inneractive.sdk.config.global.features.q());
        map.put(com.fyber.inneractive.sdk.config.global.features.n.class, new com.fyber.inneractive.sdk.config.global.features.n());
        map.put(com.fyber.inneractive.sdk.config.global.features.c.class, new com.fyber.inneractive.sdk.config.global.features.c());
        map.put(com.fyber.inneractive.sdk.config.global.features.m.class, new com.fyber.inneractive.sdk.config.global.features.m());
        map.put(com.fyber.inneractive.sdk.config.global.features.b.class, new com.fyber.inneractive.sdk.config.global.features.b());
        map.put(com.fyber.inneractive.sdk.config.global.features.g.class, new com.fyber.inneractive.sdk.config.global.features.g());
        map.put(com.fyber.inneractive.sdk.config.global.features.j.class, new com.fyber.inneractive.sdk.config.global.features.j());
        this.f15109b = map;
        this.f15110c = null;
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((Class) entry.getKey(), ((com.fyber.inneractive.sdk.config.global.features.h) entry.getValue()).b());
        }
        this.f15109b = map2;
        IAlog.a("%s: created. Supported features: %s", "SupportedFeaturesProvider", map2);
    }

    public final void a(e eVar) {
        for (com.fyber.inneractive.sdk.config.global.features.h hVar : this.f15109b.values()) {
            hVar.getClass();
            ArrayList arrayList = new ArrayList(hVar.f15091c.values());
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                b bVar = (b) arrayList.get(size);
                ArrayList<d> arrayList2 = bVar.f15080d;
                if (arrayList2 != null) {
                    for (d dVar : arrayList2) {
                        if (dVar.a(eVar)) {
                            hVar.f15091c.remove(bVar.f15077a);
                            hVar.f15092d.remove(bVar.f15077a);
                            this.f15110c = null;
                            IAlog.a("%s: Experiment %s filtered! after response %s", "SupportedFeaturesProvider", bVar.f15077a, dVar);
                            break;
                        }
                    }
                }
            }
        }
    }

    public final com.fyber.inneractive.sdk.config.global.features.h a(Class cls) {
        if (this.f15109b.containsKey(cls)) {
            com.fyber.inneractive.sdk.config.global.features.h hVar = (com.fyber.inneractive.sdk.config.global.features.h) this.f15109b.get(cls);
            if (cls.isInstance(hVar)) {
                return hVar;
            }
        }
        try {
            return (com.fyber.inneractive.sdk.config.global.features.h) cls.getConstructor(null).newInstance(null);
        } catch (Exception e10) {
            IAlog.a("Couldn't create a feature for %s", e10, cls.getName());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:44:0x010a  */
    public final void a(boolean z10, String str) {
        int i10;
        int i11;
        Iterator it;
        n nVar;
        int i12;
        char c10;
        k kVar;
        this.f15108a = str;
        a aVar = IAConfigManager.O.f15031z;
        aVar.f15076b = this;
        for (com.fyber.inneractive.sdk.config.global.features.h hVar : this.f15109b.values()) {
            boolean z11 = hVar instanceof com.fyber.inneractive.sdk.config.global.features.o;
            if ((z11 && z10) || (!z11 && !z10)) {
                l lVar = aVar.f15075a;
                if (hVar != null && lVar != null) {
                    q qVar = (q) lVar.f15103a.get(hVar.f15090b);
                    int i13 = 2;
                    int i14 = 1;
                    if (qVar != null) {
                        hVar.f15105a = qVar.f15105a;
                        IAlog.a("%s: Feature before variant merge: %s", "a", hVar);
                        HashMap map = qVar.f15107c;
                        Iterator it2 = map.keySet().iterator();
                        while (it2.hasNext()) {
                            b bVar = (b) map.get((String) it2.next());
                            if (bVar != null) {
                                int iNextInt = new Random().nextInt(100) + i14;
                                if (bVar.f15078b < iNextInt) {
                                    String str2 = bVar.f15077a;
                                    Integer numValueOf = Integer.valueOf(iNextInt);
                                    Integer numValueOf2 = Integer.valueOf(bVar.f15078b);
                                    Object[] objArr = new Object[4];
                                    objArr[0] = "a";
                                    objArr[i14] = str2;
                                    objArr[i13] = numValueOf;
                                    objArr[3] = numValueOf2;
                                    IAlog.a("%s: Experiment '%s' filtered! rand: %d, with perc: %d", objArr);
                                    i10 = i14;
                                    i11 = i10;
                                } else {
                                    ArrayList arrayList = bVar.f15080d;
                                    if (arrayList != null) {
                                        Iterator it3 = arrayList.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                d dVar = (d) it3.next();
                                                try {
                                                    Long lValueOf = Long.valueOf(IAConfigManager.O.f15009d);
                                                    e eVar = new e();
                                                    eVar.f15084b = lValueOf;
                                                    eVar.f15085c = com.fyber.inneractive.sdk.serverapi.b.a(aVar.f15076b.f15108a);
                                                    if (dVar.a(eVar)) {
                                                        try {
                                                            IAlog.a("%s: Experiment '%s' filtered! with %s", "a", bVar.f15077a, dVar);
                                                        } catch (NumberFormatException unused) {
                                                            i12 = 1;
                                                            Object[] objArr2 = new Object[i12];
                                                            objArr2[0] = "a";
                                                            IAlog.a("%s: invalid publisherId", objArr2);
                                                            i14 = 1;
                                                        }
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                    i12 = i14;
                                                }
                                                Object[] objArr3 = new Object[i12];
                                                objArr3[0] = "a";
                                                IAlog.a("%s: invalid publisherId", objArr3);
                                                i14 = 1;
                                            } else {
                                                if (hVar instanceof u) {
                                                    it = bVar.f15079c.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            k kVar2 = (k) it.next();
                                                            nVar = kVar2.f15105a;
                                                            if (nVar == null && nVar.a() != null && kVar2.f15105a.a().containsKey("use_fmp_cache_mechanism")) {
                                                                w wVar = (w) IAConfigManager.O.J.get(x.Video);
                                                                if (!(wVar != null ? wVar.a() : false)) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                i10 = 1;
                                                IAlog.a("%s: Experiment '%s' NOT filtered! rand: %d, with perc: %d", "a", bVar.f15077a, Integer.valueOf(iNextInt), Integer.valueOf(bVar.f15078b));
                                                i11 = 0;
                                            }
                                            i10 = 1;
                                            i11 = 1;
                                        }
                                    } else {
                                        if (hVar instanceof u) {
                                            it = bVar.f15079c.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    k kVar3 = (k) it.next();
                                                    nVar = kVar3.f15105a;
                                                    if (nVar == null) {
                                                    }
                                                }
                                            }
                                        }
                                        i10 = 1;
                                        IAlog.a("%s: Experiment '%s' NOT filtered! rand: %d, with perc: %d", "a", bVar.f15077a, Integer.valueOf(iNextInt), Integer.valueOf(bVar.f15078b));
                                        i11 = 0;
                                    }
                                }
                                if (i11 == 0) {
                                    ArrayList arrayList2 = bVar.f15079c;
                                    int iNextInt2 = new Random().nextInt(100) + i10;
                                    String str3 = bVar.f15077a;
                                    Integer numValueOf3 = Integer.valueOf(iNextInt2);
                                    Object[] objArr4 = new Object[3];
                                    objArr4[0] = "a";
                                    objArr4[i10] = str3;
                                    int i15 = 2;
                                    objArr4[2] = numValueOf3;
                                    IAlog.a("%s: selectVariant for experiment '%s' generated random number: %d", objArr4);
                                    Iterator it4 = arrayList2.iterator();
                                    int i16 = 0;
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            c10 = 1;
                                            kVar = null;
                                            break;
                                        }
                                        kVar = (k) it4.next();
                                        i16 += kVar.f15102c;
                                        Object[] objArr5 = new Object[i15];
                                        objArr5[0] = "a";
                                        c10 = 1;
                                        objArr5[1] = kVar;
                                        IAlog.a("%s: selectVariant variant found: %s", objArr5);
                                        if (i16 >= iNextInt2) {
                                            break;
                                        }
                                        String str4 = kVar.f15101b;
                                        Object[] objArr6 = new Object[i15];
                                        objArr6[0] = "a";
                                        objArr6[1] = str4;
                                        IAlog.a("%s: selectVariant variant '%s' percentage outside selected range", objArr6);
                                        i15 = 2;
                                    }
                                    if (kVar != null) {
                                        String str5 = bVar.f15077a;
                                        Object[] objArr7 = new Object[3];
                                        objArr7[0] = "a";
                                        objArr7[c10] = str5;
                                        objArr7[2] = kVar;
                                        IAlog.a("%s: experiment '%s' variant selected! %s", objArr7);
                                    } else {
                                        String str6 = bVar.f15077a;
                                        Object[] objArr8 = new Object[2];
                                        objArr8[0] = "a";
                                        objArr8[c10] = str6;
                                        IAlog.a("%s: experiment '%s' no variant was selected! using control group", objArr8);
                                    }
                                    hVar.f15091c.put(bVar.f15077a, bVar);
                                    if (kVar != null) {
                                        hVar.f15092d.put(bVar.f15077a, kVar);
                                    }
                                    i13 = 2;
                                    i14 = 1;
                                } else {
                                    i14 = i10;
                                    i13 = 2;
                                }
                            }
                        }
                    }
                    Object[] objArr9 = new Object[i13];
                    objArr9[0] = "a";
                    objArr9[1] = hVar;
                    IAlog.a("%s: Feature after variant merge: %s", objArr9);
                }
            }
        }
    }
}
