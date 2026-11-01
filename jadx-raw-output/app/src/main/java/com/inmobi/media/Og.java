package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.Og;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.C3426d4;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class Og {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C3359zg f23293d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ jk.k[] f23291b = {ck.s.i(new PropertyReference1Impl(Og.class, "cachedJson", "getCachedJson()Lorg/json/JSONObject;", 0)), ck.s.i(new PropertyReference1Impl(Og.class, "impressionDepth", "getImpressionDepth()Lorg/json/JSONObject;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Og f23290a = new Og();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f23292c = nj.s.n("ban", ImpressionLog.f43647w, "rew", "nat");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final I1 f23294e = new I1(new JSONObject(), new bk.a() { // from class: b7.r3
        @Override // bk.a
        public final Object invoke() {
            return Og.a();
        }
    }, true, true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final I1 f23295f = new I1(new JSONObject(), new bk.a() { // from class: b7.s3
        @Override // bk.a
        public final Object invoke() {
            return Og.f();
        }
    }, true, true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wk.a f23296g = wk.g.b(false, 1, null);

    public static final JSONObject a(Og og2) throws JSONException {
        og2.getClass();
        JSONObject jSONObject = new JSONObject();
        Iterator<String> itKeys = f23290a.b().keys();
        ck.p.i(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            ck.p.g(next);
            if (lk.x.R(next, "obj_", false, 2, null) || lk.x.R(next, "auto_", false, 2, null) || lk.x.R(next, "dir_", false, 2, null)) {
                jSONObject.put(next, f23290a.b().opt(next));
            }
        }
        return jSONObject;
    }

    public static final Object b(Og og2, Map map, SignalsConfig.PublisherConfig publisherConfig, Mg mg2) throws Throwable {
        og2.getClass();
        if (!publisherConfig.getDirect().getEnabled()) {
            Kb.a((byte) 1, "PubSignals", "Direct signals are disabled by InMobi");
            return mj.r.f64562a;
        }
        int count = publisherConfig.getDirect().getCount();
        Triple tripleC = Pg.c(map, publisherConfig);
        String str = (String) tripleC.component1();
        JSONObject jSONObject = (JSONObject) tripleC.component2();
        String str2 = (String) tripleC.component3();
        if (jSONObject == null) {
            return mj.r.f64562a;
        }
        og2.a(str2, "d_i_dep");
        Object objA = og2.a(Pg.a(og2.b(), str, jSONObject, count), mg2);
        return objA == sj.a.f() ? objA : mj.r.f64562a;
    }

    public static final Object c(Og og2, Map map, SignalsConfig.PublisherConfig publisherConfig, Mg mg2) throws Throwable {
        og2.getClass();
        if (!publisherConfig.getObj().getEnabled()) {
            Kb.a((byte) 1, "PubSignals", "Object signals are disabled by InMobi");
            return mj.r.f64562a;
        }
        int count = publisherConfig.getObj().getCount();
        Triple tripleB = Pg.b(map, publisherConfig);
        String str = (String) tripleB.component1();
        JSONObject jSONObject = (JSONObject) tripleB.component2();
        String str2 = (String) tripleB.component3();
        if (jSONObject == null) {
            return mj.r.f64562a;
        }
        og2.a(str2, "o_i_dep");
        Object objA = og2.a(Pg.a(og2.b(), str, jSONObject, count), mg2);
        return objA == sj.a.f() ? objA : mj.r.f64562a;
    }

    public static final JSONObject f() {
        f23290a.getClass();
        Context context = Ji.f22951a;
        JSONObject jSONObject = null;
        if (context != null) {
            if (f23293d == null) {
                f23293d = new C3359zg(context, "pub_signals_store");
            }
            C3359zg c3359zg = f23293d;
            if (c3359zg == null) {
                ck.p.B("prefDao");
                c3359zg = null;
            }
            String strA = c3359zg.a("imp_depth");
            if (strA != null) {
                jSONObject = new JSONObject(strA);
            }
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public final LinkedHashMap d() {
        JSONObject jSONObjectB = b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeysAnd = c().getObj().getAllowedKeysAnd();
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = c().getAuto().getAllowedKeys();
        List<String> list = f23292c;
        SignalsConfig.PublisherConfig publisherConfigC = c();
        for (String str : list) {
            Pg.a(Pg.a(Pg.a(linkedHashMap, jSONObjectB, "obj_", str, Pg.c(allowedKeysAnd)), jSONObjectB, "auto_", str, Pg.c(allowedKeys)), jSONObjectB, "dir_", str, publisherConfigC.getDirect().getAllowedKeys());
        }
        return linkedHashMap;
    }

    public final JSONObject e() throws JSONException {
        JSONObject jSONObjectB = b();
        JSONObject jSONObject = new JSONObject();
        Iterator<String> itKeys = jSONObjectB.keys();
        ck.p.i(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            ck.p.g(next);
            if (!lk.x.R(next, "obj_", false, 2, null) && !lk.x.R(next, "auto_", false, 2, null) && !lk.x.R(next, "dir_", false, 2, null)) {
                jSONObject.put(next, jSONObjectB.opt(next));
            }
        }
        for (String str : f23292c) {
            f23290a.getClass();
            if (c().getObj().getEnabled()) {
                Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeysAnd = c().getObj().getAllowedKeysAnd();
                ArrayList arrayList = new ArrayList(allowedKeysAnd.size());
                Iterator<Map.Entry<String, SignalsConfig.PublisherConfig.KeyData>> it = allowedKeysAnd.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getValue().getName());
                }
                Pg.a(jSONObject, jSONObjectB, str, "obj_", nj.b0.T0(arrayList));
            }
            f23290a.getClass();
            if (c().getAuto().getEnabled()) {
                Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = c().getAuto().getAllowedKeys();
                ArrayList arrayList2 = new ArrayList(allowedKeys.size());
                Iterator<Map.Entry<String, SignalsConfig.PublisherConfig.KeyData>> it2 = allowedKeys.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().getValue().getName());
                }
                Pg.a(jSONObject, jSONObjectB, str, "auto_", nj.b0.T0(arrayList2));
            }
            f23290a.getClass();
            if (c().getDirect().getEnabled()) {
                Pg.a(jSONObject, jSONObjectB, str, "dir_", c().getDirect().getAllowedKeys().keySet());
            }
        }
        for (Pair pair : nj.s.n(mj.h.a(c().getObj(), "o_i_dep"), mj.h.a(c().getDirect(), "d_i_dep"), mj.h.a(c().getAuto(), "a_i_dep"))) {
            SignalsConfig.PublisherConfig.BaseInputData baseInputData = (SignalsConfig.PublisherConfig.BaseInputData) pair.component1();
            String str2 = (String) pair.component2();
            if (baseInputData.getDepth().getEnabled()) {
                Og og2 = f23290a;
                og2.getClass();
                JSONArray jSONArrayOptJSONArray = ((JSONObject) f23295f.getValue(og2, f23291b[1])).optJSONArray(str2);
                if (jSONArrayOptJSONArray == null) {
                    Map map = Pg.f23339a;
                    jSONArrayOptJSONArray = new JSONArray();
                    jSONArrayOptJSONArray.put(0);
                    jSONArrayOptJSONArray.put(0);
                    jSONArrayOptJSONArray.put(0);
                    jSONArrayOptJSONArray.put(0);
                }
                jSONObject.put(str2, jSONArrayOptJSONArray);
            }
        }
        jSONObject.toString();
        return jSONObject;
    }

    public static final Object a(Og og2, Map map, SignalsConfig.PublisherConfig publisherConfig, Mg mg2) throws Throwable {
        og2.getClass();
        if (!publisherConfig.getAuto().getEnabled()) {
            return mj.r.f64562a;
        }
        int count = publisherConfig.getAuto().getCount();
        Triple tripleA = Pg.a(map, publisherConfig);
        String str = (String) tripleA.component1();
        JSONObject jSONObject = (JSONObject) tripleA.component2();
        String str2 = (String) tripleA.component3();
        if (jSONObject == null) {
            return mj.r.f64562a;
        }
        og2.a(str2, "a_i_dep");
        Object objA = og2.a(Pg.a(og2.b(), str, jSONObject, count), mg2);
        return objA == sj.a.f() ? objA : mj.r.f64562a;
    }

    public static SignalsConfig.PublisherConfig c() {
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(SignalsConfig.class, "clazz");
        return ((SignalsConfig) Y3.f23815a.a(SignalsConfig.class)).getPublisherConfig();
    }

    public final JSONObject b() {
        return (JSONObject) f23294e.getValue(this, f23291b[0]);
    }

    public static final JSONObject a() {
        f23290a.getClass();
        Context context = Ji.f22951a;
        JSONObject jSONObject = null;
        if (context != null) {
            if (f23293d == null) {
                f23293d = new C3359zg(context, "pub_signals_store");
            }
            C3359zg c3359zg = f23293d;
            if (c3359zg == null) {
                ck.p.B("prefDao");
                c3359zg = null;
            }
            String strA = c3359zg.a("saved_signals");
            if (strA != null) {
                jSONObject = new JSONObject(strA);
            }
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static void a(Map map) {
        ck.p.j(map, "signals");
        try {
            SignalsConfig.PublisherConfig publisherConfigC = c();
            Map map2 = Pg.f23339a;
            ck.p.j(publisherConfigC, "<this>");
            if (publisherConfigC.getEnableMCO() || publisherConfigC.getEnableAB()) {
                nk.j.d(A9.f22353e, null, null, new Mg(map, publisherConfigC, null), 3, null);
            } else {
                Kb.a((byte) 1, "PubSignals", "Publisher signals are disabled from InMobi");
            }
        } catch (Exception e10) {
            mj.g gVar = P9.f23321a;
            P9.a(new L2(e10));
            Kb.a((byte) 1, "PubSignals", "Publisher signals could not be saved due to an Internal Error.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(JSONObject jSONObject, ContinuationImpl continuationImpl) throws Throwable {
        Ng ng2;
        JSONObject jSONObject2;
        wk.a aVar;
        if (continuationImpl instanceof Ng) {
            ng2 = (Ng) continuationImpl;
            int i10 = ng2.f23249e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ng2.f23249e = i10 - Integer.MIN_VALUE;
            } else {
                ng2 = new Ng(this, continuationImpl);
            }
        } else {
            ng2 = new Ng(this, continuationImpl);
        }
        Object obj = ng2.f23247c;
        Object objF = sj.a.f();
        int i11 = ng2.f23249e;
        try {
            if (i11 == 0) {
                kotlin.c.b(obj);
                Context context = Ji.f22951a;
                if (context != null) {
                    f23290a.getClass();
                    if (f23293d == null) {
                        f23293d = new C3359zg(context, "pub_signals_store");
                    }
                    wk.a aVar2 = f23296g;
                    ng2.f23245a = jSONObject;
                    ng2.f23246b = aVar2;
                    ng2.f23249e = 1;
                    if (aVar2.a(null, ng2) == objF) {
                        return objF;
                    }
                    jSONObject2 = jSONObject;
                    aVar = aVar2;
                }
                return mj.r.f64562a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = ng2.f23246b;
            jSONObject2 = ng2.f23245a;
            kotlin.c.b(obj);
            C3359zg c3359zg = f23293d;
            if (c3359zg == null) {
                ck.p.B("prefDao");
                c3359zg = null;
            }
            String string = jSONObject2.toString();
            ck.p.i(string, "toString(...)");
            c3359zg.getClass();
            ck.p.j("saved_signals", C3426d4.i.W);
            ck.p.j(string, "value");
            c3359zg.f25848a.a("saved_signals", string, true);
            mj.r rVar = mj.r.f64562a;
            aVar.b(null);
            I1 i12 = f23294e;
            i12.f22836c = i12.f22834a.invoke();
            Kb.a((byte) 2, "PubSignals", "Publisher Signals saved successfully.");
            jSONObject2.toString();
            return mj.r.f64562a;
        } catch (Throwable th2) {
            aVar.b(null);
            throw th2;
        }
    }

    public static void a(JSONObject jSONObject, String str, JSONArray jSONArray) throws JSONException {
        ck.p.j(jSONObject, "<this>");
        ck.p.j(str, C3426d4.i.W);
        ck.p.j(jSONArray, "value");
        jSONObject.put(str, jSONArray);
        Context context = Ji.f22951a;
        if (context != null) {
            f23290a.getClass();
            if (f23293d == null) {
                f23293d = new C3359zg(context, "pub_signals_store");
            }
            jSONObject.toString();
            C3359zg c3359zg = f23293d;
            if (c3359zg == null) {
                ck.p.B("prefDao");
                c3359zg = null;
            }
            String string = jSONObject.toString();
            ck.p.i(string, "toString(...)");
            c3359zg.getClass();
            ck.p.j("imp_depth", C3426d4.i.W);
            ck.p.j(string, "value");
            Ea ea2 = c3359zg.f25848a;
            ConcurrentHashMap concurrentHashMap = Ea.f22576b;
            ea2.a("imp_depth", string, false);
            I1 i10 = f23295f;
            i10.f22836c = i10.f22834a.invoke();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    public final void a(String str, String str2) throws JSONException {
        int i10;
        ck.p.j(str, "adFormat");
        ck.p.j(str2, C3426d4.i.W);
        I1 i11 = f23295f;
        i11.f22836c = i11.f22834a.invoke();
        JSONObject jSONObject = (JSONObject) i11.getValue(this, f23291b[1]);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str2);
        if (jSONArrayOptJSONArray == null) {
            Map map = Pg.f23339a;
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(0);
            jSONArrayOptJSONArray.put(0);
            jSONArrayOptJSONArray.put(0);
            jSONArrayOptJSONArray.put(0);
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 97295) {
            if (iHashCode != 104431) {
                if (iHashCode != 108833) {
                    if (iHashCode == 112804 && str.equals("rew")) {
                        i10 = 2;
                    } else {
                        i10 = -1;
                    }
                } else if (str.equals("nat")) {
                    i10 = 3;
                } else {
                    i10 = -1;
                }
            } else if (str.equals(ImpressionLog.f43647w)) {
                i10 = 1;
            } else {
                i10 = -1;
            }
        } else if (str.equals("ban")) {
            i10 = 0;
        } else {
            i10 = -1;
        }
        if (i10 != -1) {
            jSONArrayOptJSONArray.put(i10, jSONArrayOptJSONArray.optInt(i10, 0) + 1);
            a(jSONObject, str2, jSONArrayOptJSONArray);
        }
    }
}
