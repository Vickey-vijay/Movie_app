package com.inmobi.media;

import com.inmobi.media.I2;
import com.inmobi.media.La;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class La implements Jf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CrashConfig f23067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3000l6 f23068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final R9 f23069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bk.l f23070d;

    public static final mj.r a(La la2, I2 i10) {
        ck.p.j(i10, "it");
        int i11 = i10.f22839a;
        if (i11 != 1 && i11 != 2) {
            switch (i11) {
                case 150:
                case 151:
                case 152:
                    Map map = i10.f22841c;
                    if (map != null && map.containsKey("data")) {
                        Object obj = i10.f22841c.get("data");
                        ck.p.h(obj, "null cannot be cast to non-null type com.inmobi.commons.core.incident.IncidentEvent");
                        Q9 q10 = (Q9) obj;
                        la2.getClass();
                        ck.p.j(q10, "incident");
                        AbstractC2940il.a(new Ka(la2, q10, null));
                    }
                    break;
            }
        } else {
            C3000l6 c3000l6 = la2.f23068b;
            if (c3000l6 != null) {
                c3000l6.f24744f.set(false);
                c3000l6.f24745g.set(true);
                c3000l6.f24746h.clear();
                c3000l6.f24748j = null;
            }
            la2.f23068b = null;
            ((C3305xc) Ji.f22955e.getValue()).a(la2.f23070d);
        }
        return mj.r.f64562a;
    }

    public La(CrashConfig crashConfig) {
        ck.p.j(crashConfig, "crashConfig");
        this.f23067a = crashConfig;
        this.f23069c = new R9(crashConfig);
        this.f23070d = new bk.l() { // from class: b7.q2
            @Override // bk.l
            public final Object invoke(Object obj) {
                return La.a(this.f5138b, (I2) obj);
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        if (r13.a(r15, (kotlin.coroutines.jvm.internal.ContinuationImpl) r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ff, code lost:
    
        if (r13 == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.media.La r13, com.inmobi.media.Q9 r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.La.a(com.inmobi.media.La, com.inmobi.media.Q9, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(La la2, ContinuationImpl continuationImpl) throws Throwable {
        Ja ja2;
        la2.getClass();
        if (continuationImpl instanceof Ja) {
            ja2 = (Ja) continuationImpl;
            int i10 = ja2.f22916c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ja2.f22916c = i10 - Integer.MIN_VALUE;
            } else {
                ja2 = new Ja(la2, continuationImpl);
            }
        } else {
            ja2 = new Ja(la2, continuationImpl);
        }
        Object objA = ja2.f22914a;
        Object objF = sj.a.f();
        int i11 = ja2.f22916c;
        if (i11 == 0) {
            kotlin.c.b(objA);
            N9 n10 = (N9) P9.f23321a.getValue();
            ja2.f22916c = 1;
            objA = n10.a(ja2);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objA);
        }
        if (((Number) objA).intValue() > 0) {
            la2.a();
        }
        return mj.r.f64562a;
    }

    public final void a() {
        C2773c6 eventConfig = this.f23067a.getEventConfig();
        eventConfig.f24124k = this.f23067a.getUrl();
        C3000l6 c3000l6 = this.f23068b;
        if (c3000l6 != null) {
            ck.p.j(eventConfig, "eventConfig");
            c3000l6.f24748j = eventConfig;
        } else {
            this.f23068b = new C3000l6("crash", (N9) P9.f23321a.getValue(), this, this.f23067a.getEventConfig(), null);
        }
        C3000l6 c3000l7 = this.f23068b;
        if (c3000l7 != null) {
            c3000l7.a(false);
        }
    }

    @Override // com.inmobi.media.Jf
    public final Object a(rj.c cVar) {
        int iA;
        String string;
        C3298x5.f25687a.getClass();
        int iL = C3298x5.l();
        int i10 = 1;
        if (iL == 0 || iL != 1) {
            iA = this.f23067a.getMobileConfig().a();
        } else {
            iA = this.f23067a.getWifiConfig().a();
        }
        List<Q9> list = (List) nk.i.b(null, new Fa(iA, null), 1, null);
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(tj.a.d(((Q9) it.next()).f24531d));
            }
            try {
                HashMap map = new HashMap(C3298x5.f25687a.a(false));
                map.put("im-accid", Ji.f22953c);
                map.put("version", "2.0.0");
                map.put("component", "crash");
                map.put("mk-version", Ki.a());
                map.putAll(A1.f22337e);
                map.put("tp", Ki.f23020b);
                String str = Ki.f23019a;
                if (str == null) {
                    str = "";
                }
                map.put("tpVer", str);
                JSONObject jSONObject = new JSONObject(map);
                JSONArray jSONArray = new JSONArray();
                for (Q9 q10 : list) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("eventId", q10.f23378e);
                    jSONObject2.put("eventType", q10.f24528a);
                    String str2 = q10.f24529b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    int length = str2.length() - i10;
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 <= length) {
                        boolean z11 = ck.p.l(str2.charAt(!z10 ? i11 : length), 32) <= 0;
                        if (z10) {
                            if (!z11) {
                                break;
                            }
                            length--;
                        } else if (z11) {
                            i11++;
                        } else {
                            z10 = true;
                        }
                    }
                    if (str2.subSequence(i11, length + 1).toString().length() > 0) {
                        String str3 = q10.f24529b;
                        if (str3 == null) {
                            str3 = "";
                        }
                        jSONObject2.put("crash_report", str3);
                    }
                    jSONObject2.put("ts", q10.f24530c);
                    jSONArray.put(jSONObject2);
                    i10 = 1;
                }
                jSONObject.put("crash", jSONArray);
                string = jSONObject.toString();
            } catch (JSONException unused) {
                string = null;
            }
            if (string != null) {
                return new C2824e6(string, arrayList);
            }
        }
        return null;
    }
}
