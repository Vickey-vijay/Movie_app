package com.inmobi.media;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.eg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2834eg implements InterfaceC2860fg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2757bg f24313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3037mi f24314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f24316d;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) throws Throwable {
        C2809dg c2809dg;
        Iterator it;
        if (continuationImpl instanceof C2809dg) {
            c2809dg = (C2809dg) continuationImpl;
            int i10 = c2809dg.f24244d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2809dg.f24244d = i10 - Integer.MIN_VALUE;
            } else {
                c2809dg = new C2809dg(this, continuationImpl);
            }
        } else {
            c2809dg = new C2809dg(this, continuationImpl);
        }
        Object obj = c2809dg.f24242b;
        Object objF = sj.a.f();
        int i11 = c2809dg.f24244d;
        try {
            if (i11 == 0) {
                kotlin.c.b(obj);
                it = a(str).iterator();
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = c2809dg.f24241a;
                kotlin.c.b(obj);
            }
            while (it.hasNext()) {
                Rf rf2 = (Rf) it.next();
                b(rf2.f23456e);
                c2809dg.f24241a = it;
                c2809dg.f24244d = 1;
                if (a(rf2, c2809dg) == objF) {
                    return objF;
                }
            }
        } catch (JSONException e10) {
            a(this, (short) 2243);
            InterfaceC2757bg interfaceC2757bg = this.f24313a;
            if (interfaceC2757bg != null) {
                Z5[] z5Arr = Z5.f23890a;
                ((Yh) interfaceC2757bg).a("", -104, "Ping JSON is invalid", System.currentTimeMillis(), 0);
            }
            e10.getMessage();
        } catch (Exception e11) {
            a(this, (short) 2244);
            e11.getMessage();
            mj.g gVar = P9.f23321a;
            AbstractC2929i9.a(e11);
        } catch (NoClassDefFoundError e12) {
            a(this, (short) 2245);
            e12.getMessage();
            mj.g gVar2 = P9.f23321a;
            P9.a(new L2(e12));
        }
        return mj.r.f64562a;
    }

    public final void b(String str) {
        C3037mi c3037mi = this.f24314b;
        if (c3037mi != null) {
            ck.p.j(str, HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            Map mapA = c3037mi.a();
            mapA.put("trigger", str);
            AbstractC2960jg.a("PingStarted", mapA);
        }
    }

    public C2834eg(InterfaceC2757bg interfaceC2757bg, C3037mi c3037mi) {
        this.f24313a = interfaceC2757bg;
        this.f24314b = c3037mi;
        String string = UUID.randomUUID().toString();
        ck.p.i(string, "toString(...)");
        this.f24315c = string;
        this.f24316d = new AtomicBoolean(false);
        F8 f10 = Uf.f23647b;
        if (f10 != null) {
            ck.p.j(string, "id");
            ck.p.j(this, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            f10.f24559b.put(string, new WeakReference(this));
            Iterator it = f10.f24559b.entrySet().iterator();
            while (it.hasNext()) {
                Object next = it.next();
                ck.p.i(next, "next(...)");
                if (((WeakReference) ((Map.Entry) next).getValue()).get() == null) {
                    it.remove();
                }
            }
        }
        C3099p5 c3099p5 = Uf.f23648c;
        if (c3099p5 != null) {
            ck.p.j(string, "id");
            ck.p.j(this, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            c3099p5.f24559b.put(string, new WeakReference(this));
            Iterator it2 = c3099p5.f24559b.entrySet().iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                ck.p.i(next2, "next(...)");
                if (((WeakReference) ((Map.Entry) next2).getValue()).get() == null) {
                    it2.remove();
                }
            }
        }
    }

    public static Object a(Rf rf2, C2809dg c2809dg) throws Throwable {
        Objects.toString(rf2);
        if (ck.p.e(rf2.f23456e, "high")) {
            F8 f10 = Uf.f23647b;
            if (f10 != null) {
                Object objB = f10.b(rf2, c2809dg);
                if (objB != sj.a.f()) {
                    objB = mj.r.f64562a;
                }
                return objB == sj.a.f() ? objB : mj.r.f64562a;
            }
        } else {
            C3099p5 c3099p5 = Uf.f23648c;
            if (c3099p5 != null) {
                Object objA = c3099p5.a(rf2, c2809dg);
                if (objA != sj.a.f()) {
                    objA = mj.r.f64562a;
                }
                return objA == sj.a.f() ? objA : mj.r.f64562a;
            }
        }
        return mj.r.f64562a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List a(String str) {
        JSONArray jSONArray = new JSONArray(str);
        if (jSONArray.length() == 0) {
            a(this, (short) 2253);
            InterfaceC2757bg interfaceC2757bg = this.f24313a;
            if (interfaceC2757bg != null) {
                Z5[] z5Arr = Z5.f23890a;
                ((Yh) interfaceC2757bg).a("", -105, "Ping array is empty", System.currentTimeMillis(), 0);
            }
            return nj.s.k();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            Object rf2 = null;
            if (jSONObjectOptJSONObject == null) {
                a(this, (short) 2254);
            } else {
                String strOptString = jSONObjectOptJSONObject.optString("id");
                if (strOptString != null && !lk.a0.n0(strOptString)) {
                    String strOptString2 = jSONObjectOptJSONObject.optString("url");
                    if (a(strOptString, strOptString2)) {
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("headers");
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (jSONObjectOptJSONObject2 != null) {
                            Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                linkedHashMap.put(next, jSONObjectOptJSONObject2.optString(next, ""));
                            }
                        }
                        boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("allowRedirects", true);
                        String strOptString3 = jSONObjectOptJSONObject.optString(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "normal");
                        boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("ackRequired", false);
                        ck.p.g(strOptString2);
                        String str2 = strOptString3 != null ? strOptString3 : "normal";
                        String str3 = this.f24315c;
                        C3037mi c3037mi = this.f24314b;
                        rf2 = new Rf(strOptString2, strOptString, linkedHashMap, zOptBoolean, str2, zOptBoolean2, 0, str3, System.currentTimeMillis(), null, c3037mi != null ? c3037mi.f24835a : null);
                    }
                } else {
                    ck.p.g(strOptString);
                    a(this, (short) 2255);
                    InterfaceC2757bg interfaceC2757bg2 = this.f24313a;
                    if (interfaceC2757bg2 != null) {
                        Z5[] z5Arr2 = Z5.f23890a;
                        ((Yh) interfaceC2757bg2).a(strOptString, -101, "Ping ID is missing", System.currentTimeMillis(), 0);
                    }
                }
            }
            if (rf2 != null) {
                arrayList.add(rf2);
            }
        }
        return arrayList;
    }

    public final boolean a(String str, String str2) {
        String host;
        if (str2 != null && !lk.a0.n0(str2)) {
            try {
                URI uri = new URI(str2);
                if ((ck.p.e(uri.getScheme(), "http") || ck.p.e(uri.getScheme(), "https")) && (host = uri.getHost()) != null && !lk.a0.n0(host)) {
                    return true;
                }
            } catch (Exception unused) {
            }
            a(this, (short) 2256);
            InterfaceC2757bg interfaceC2757bg = this.f24313a;
            if (interfaceC2757bg != null) {
                Z5[] z5Arr = Z5.f23890a;
                ((Yh) interfaceC2757bg).a(str, -102, "Ping url is invalid", System.currentTimeMillis(), 0);
            }
            return false;
        }
        a(this, (short) 2252);
        InterfaceC2757bg interfaceC2757bg2 = this.f24313a;
        if (interfaceC2757bg2 != null) {
            Z5[] z5Arr2 = Z5.f23890a;
            ((Yh) interfaceC2757bg2).a(str, -103, "Ping URL is missing", System.currentTimeMillis(), 0);
        }
        return false;
    }

    public final void a(Rf rf2, int i10, long j10) {
        InterfaceC2757bg interfaceC2757bg;
        ck.p.j(rf2, "ping");
        if (this.f24316d.get()) {
            return;
        }
        String str = rf2.f23452a;
        if (ck.p.e("high", rf2.f23456e) && rf2.f23457f && (interfaceC2757bg = this.f24313a) != null) {
            ((Yh) interfaceC2757bg).a(rf2.f23453b, i10, null, j10, rf2.f23458g);
        }
        String str2 = rf2.f23456e;
        long jCurrentTimeMillis = System.currentTimeMillis() - rf2.f23460i;
        C3037mi c3037mi = this.f24314b;
        if (c3037mi != null) {
            ck.p.j(str2, HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            Map mapA = c3037mi.a();
            mapA.put("trigger", str2);
            mapA.put("latency", Long.valueOf(jCurrentTimeMillis));
            AbstractC2960jg.a("PingSuccess", mapA);
        }
    }

    public final void a(Rf rf2, int i10, String str, int i11, long j10) {
        InterfaceC2757bg interfaceC2757bg;
        ck.p.j(rf2, "ping");
        if (this.f24316d.get()) {
            return;
        }
        String str2 = rf2.f23452a;
        if (ck.p.e("high", rf2.f23456e) && rf2.f23457f && rf2.f23458g < 1 && (interfaceC2757bg = this.f24313a) != null) {
            ((Yh) interfaceC2757bg).a(rf2.f23453b, i10, str, j10, rf2.f23458g);
        }
        String str3 = rf2.f23456e;
        C3037mi c3037mi = this.f24314b;
        if (c3037mi != null) {
            if (str3 == null) {
                str3 = "unknown";
            }
            ck.p.j(str3, HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            Map mapA = c3037mi.a();
            mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2247);
            mapA.put("trigger", str3);
            mapA.put("retryCount", String.valueOf(i11));
            AbstractC2960jg.a("PingFailed", mapA);
        }
    }

    public static void a(C2834eg c2834eg, short s10) {
        C3037mi c3037mi = c2834eg.f24314b;
        if (c3037mi != null) {
            ck.p.j("unknown", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            Map mapA = c3037mi.a();
            mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10));
            mapA.put("trigger", "unknown");
            mapA.put("retryCount", String.valueOf(0));
            AbstractC2960jg.a("PingFailed", mapA);
        }
    }
}
