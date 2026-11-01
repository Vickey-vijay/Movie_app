package yads;

import android.content.Context;
import android.content.SharedPreferences;
import com.ironsource.C3702sd;
import com.ironsource.Q6;
import io.appmetrica.analytics.AppMetrica;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class zu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f85594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f85595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nk.l0 f85596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w5 f85597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lm0 f85598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final rd f85599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dw2 f85600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f85601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b31 f85602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ae f85603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final vt2 f85604k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wh f85605l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i4 f85606m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final nw2 f85607n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final bv2 f85608o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final df f85609p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cj0 f85610q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ue f85611r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.monetization.ads.mediation.base.initialize.a f85612s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gx0 f85613t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a31 f85614u;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ zu2(Context context, lu2 lu2Var, nk.l0 l0Var, w5 w5Var, lm0 lm0Var, rd rdVar, int i10) {
        lm0 lm0VarA;
        if ((i10 & 16) != 0) {
            lm0 lm0Var2 = lm0.f79847c;
            lm0VarA = km0.a(context);
        } else {
            lm0VarA = lm0Var;
        }
        rd rdVar2 = (i10 & 32) != 0 ? new rd() : rdVar;
        Object obj = dw2.f76819j;
        dw2 dw2VarA = cw2.a();
        Context applicationContext = context.getApplicationContext();
        iu3 iu3Var = (iu3) lu2Var;
        this(context, lu2Var, l0Var, w5Var, lm0VarA, rdVar2, dw2VarA, applicationContext, new b31(lm0VarA), new ae(), new vt2(applicationContext, iu3Var.a(), lm0VarA, rdVar2, w5Var), new wh(applicationContext, lu2Var), new i4(), new nw2(applicationContext), new bv2(iu3Var.a(), sh1.c(context), w5Var), new df(), new cj0(context, w5Var), new ue(context), new com.monetization.ads.mediation.base.initialize.a(lu2Var), new gx0(applicationContext));
    }

    /* JADX WARN: Code duplicated, block: B:110:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:116:0x041b  */
    /* JADX WARN: Code duplicated, block: B:119:0x042a  */
    /* JADX WARN: Code duplicated, block: B:120:0x042c A[Catch: all -> 0x04ac, TryCatch #3 {all -> 0x04ac, blocks: (B:117:0x0426, B:120:0x042c, B:123:0x0442, B:124:0x0453, B:127:0x0458, B:130:0x0471, B:132:0x048c, B:139:0x04a5, B:135:0x049e), top: B:171:0x0426 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0440  */
    /* JADX WARN: Code duplicated, block: B:123:0x0442 A[Catch: all -> 0x04ac, TRY_LEAVE, TryCatch #3 {all -> 0x04ac, blocks: (B:117:0x0426, B:120:0x042c, B:123:0x0442, B:124:0x0453, B:127:0x0458, B:130:0x0471, B:132:0x048c, B:139:0x04a5, B:135:0x049e), top: B:171:0x0426 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0457  */
    /* JADX WARN: Code duplicated, block: B:127:0x0458 A[Catch: JSONException -> 0x046f, all -> 0x04ac, TRY_LEAVE, TryCatch #3 {all -> 0x04ac, blocks: (B:117:0x0426, B:120:0x042c, B:123:0x0442, B:124:0x0453, B:127:0x0458, B:130:0x0471, B:132:0x048c, B:139:0x04a5, B:135:0x049e), top: B:171:0x0426 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x048c A[Catch: all -> 0x04ac, TryCatch #3 {all -> 0x04ac, blocks: (B:117:0x0426, B:120:0x042c, B:123:0x0442, B:124:0x0453, B:127:0x0458, B:130:0x0471, B:132:0x048c, B:139:0x04a5, B:135:0x049e), top: B:171:0x0426 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x049e A[Catch: all -> 0x04ac, LOOP:4: B:131:0x048a->B:135:0x049e, LOOP_END, TryCatch #3 {all -> 0x04ac, blocks: (B:117:0x0426, B:120:0x042c, B:123:0x0442, B:124:0x0453, B:127:0x0458, B:130:0x0471, B:132:0x048c, B:139:0x04a5, B:135:0x049e), top: B:171:0x0426 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:139:0x04a5 A[Catch: all -> 0x04ac, TRY_LEAVE, TryCatch #3 {all -> 0x04ac, blocks: (B:117:0x0426, B:120:0x042c, B:123:0x0442, B:124:0x0453, B:127:0x0458, B:130:0x0471, B:132:0x048c, B:139:0x04a5, B:135:0x049e), top: B:171:0x0426 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x04af  */
    /* JADX WARN: Code duplicated, block: B:148:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:150:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:152:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:156:0x052e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0408 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x03f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x04b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x04a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x049c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x04ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x04ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x01dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:63:0x023e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0241  */
    /* JADX WARN: Code duplicated, block: B:68:0x025e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0272  */
    /* JADX WARN: Code duplicated, block: B:75:0x029b A[LOOP:1: B:73:0x0295->B:75:0x029b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x0315  */
    /* JADX WARN: Code duplicated, block: B:85:0x0319  */
    /* JADX WARN: Code duplicated, block: B:88:0x032b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0346  */
    /* JADX WARN: Code duplicated, block: B:92:0x034a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0357  */
    /* JADX WARN: Code duplicated, block: B:95:0x0361  */
    /* JADX WARN: Code duplicated, block: B:98:0x038a  */
    /* JADX WARN: Code duplicated, block: B:99:0x038d  */
    /* JADX WARN: Type inference failed for: r15v1, types: [T, yads.tg] */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    public final Object a(q61 q61Var, rj.c cVar) {
        vu2 vu2Var;
        w5 w5Var;
        v5 v5Var;
        kotlinx.coroutines.g gVarD;
        ?? r15;
        q61 q61Var2;
        zu2 zu2Var;
        String uuid;
        String deviceId;
        vw0 vw0Var;
        dx0 dx0Var;
        v5 v5Var2;
        w5 w5Var2;
        q61 q61Var3;
        zu2 zu2Var2;
        v5 v5Var3;
        w5 w5Var3;
        q61 q61Var4;
        zu2 zu2Var3;
        iu2 iu2Var;
        im3 im3Var;
        l4 l4VarA;
        xy xyVar;
        String str;
        Object pu2Var;
        wh whVar;
        nt2 nt2VarA;
        hr0 hr0Var;
        ArrayList<String> arrayList;
        Iterator<T> it;
        ArrayList arrayList2;
        dr0 dr0Var;
        za zaVar;
        long j10;
        fr0 fr0Var;
        er0 er0Var;
        JSONObject jSONObject;
        e00 e00VarA;
        long j11;
        String strOptString;
        dr0 dr0Var2;
        HashMap mapA;
        c cVarA;
        h1[] h1VarArrValues;
        int length;
        int i10;
        h1 h1Var;
        h1 h1Var2;
        String strC;
        xy xyVar2;
        lq1 lq1Var;
        boolean z10;
        String str2;
        ArrayList arrayList3;
        Iterator it2;
        ArrayList arrayList4;
        Iterator it3;
        String str3;
        Context context;
        nt2 nt2Var;
        com.monetization.ads.mediation.base.initialize.a aVar;
        nk.l0 l0Var;
        hp hpVar;
        Object next;
        if (cVar instanceof vu2) {
            vu2Var = (vu2) cVar;
            int i11 = vu2Var.f84017i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                vu2Var.f84017i = i11 - Integer.MIN_VALUE;
            } else {
                vu2Var = new vu2(this, cVar);
            }
        } else {
            vu2Var = new vu2(this, cVar);
        }
        Object objB = vu2Var.f84015g;
        Object objF = sj.a.f();
        int i12 = vu2Var.f84017i;
        if (i12 != 0) {
            if (i12 == 1) {
                gVarD = vu2Var.f84014f;
                v5Var = vu2Var.f84013e;
                w5Var = vu2Var.f84012d;
                q61Var2 = vu2Var.f84011c;
                zu2Var = vu2Var.f84010b;
                kotlin.c.b(objB);
            } else if (i12 == 2) {
                v5Var2 = vu2Var.f84013e;
                w5Var2 = vu2Var.f84012d;
                q61Var3 = vu2Var.f84011c;
                zu2Var2 = vu2Var.f84010b;
                kotlin.c.b(objB);
                vu2Var.f84010b = zu2Var2;
                vu2Var.f84011c = q61Var3;
                vu2Var.f84012d = w5Var2;
                vu2Var.f84013e = v5Var2;
                vu2Var.f84017i = 3;
                objB = zu2Var2.b(q61Var3, vu2Var);
                if (objB == objF) {
                    return objF;
                }
                v5Var3 = v5Var2;
                w5Var3 = w5Var2;
                q61Var4 = q61Var3;
                zu2Var3 = zu2Var2;
            } else {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v5Var3 = vu2Var.f84013e;
                w5Var3 = vu2Var.f84012d;
                q61Var4 = vu2Var.f84011c;
                zu2Var3 = vu2Var.f84010b;
                kotlin.c.b(objB);
            }
            iu2Var = (iu2) objB;
            w5Var3.a(v5Var3);
            if (iu2Var instanceof hu2) {
                bv2 bv2Var = zu2Var3.f85608o;
                hu2 hu2Var = (hu2) iu2Var;
                nt2 nt2Var2 = hu2Var.f78383a;
                xyVar2 = hu2Var.f78384b;
                io2 io2Var = bv2Var.f75976a;
                co2 co2Var = co2.f76352c;
                Pair[] pairArr = new Pair[8];
                bv2Var.f75978c.getClass();
                pairArr[0] = mj.h.a("creation_date", Long.valueOf(System.currentTimeMillis()));
                pairArr[1] = mj.h.a("startup_version", nt2Var2.f80758b0);
                pairArr[2] = mj.h.a("user_consent", nt2Var2.L);
                pairArr[3] = mj.h.a("ad_host", nt2Var2.U);
                lq1Var = bv2Var.f75979d;
                z10 = bv2Var.f75977b;
                lq1Var.getClass();
                if (z10) {
                    str2 = "ads-mediation";
                } else {
                    str2 = C3702sd.f30729d;
                }
                String str4 = pq1.f81538d;
                ArrayList arrayListA = lq1Var.f79881b.a(mq1.a());
                arrayList3 = new ArrayList();
                it2 = arrayListA.iterator();
                while (it2.hasNext()) {
                    next = it2.next();
                    Iterator it4 = it2;
                    lq1Var.f79880a.getClass();
                    if (cr1.a((br1) next)) {
                        arrayList3.add(next);
                    }
                    it2 = it4;
                }
                Pair[] pairArr2 = new Pair[2];
                pairArr2[0] = mj.h.a("integration_type", str2);
                arrayList4 = new ArrayList(nj.t.v(arrayList3, 10));
                it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(nj.l0.g(mj.h.a("name", ((br1) it3.next()).f75934a)));
                }
                pairArr2[1] = mj.h.a(Q6.E1, arrayList4);
                pairArr[4] = mj.h.a("integrated_mediation", kotlin.collections.a.m(pairArr2));
                pairArr[5] = mj.h.a("call_source", q61Var4.f81726b);
                if (xyVar2 != null) {
                    str3 = xyVar2.f84744b;
                } else {
                    str3 = null;
                }
                pairArr[6] = mj.h.a("configuration_source", str3);
                pairArr[7] = mj.h.a("durations", bv2Var.f75980e.a());
                io2Var.a(new eo2("sdk_configuration_success", kotlin.collections.a.B(kotlin.collections.a.m(pairArr)), null));
                zu2Var3.f85607n.a();
                wu1.a();
                context = zu2Var3.f85594a;
                nt2Var = hu2Var.f78383a;
                aVar = zu2Var3.f85612s;
                l0Var = zu2Var3.f85596c;
                aVar.getClass();
                hpVar = nt2Var.f80756a0;
                if (hpVar != null) {
                    if (nt2Var.Y) {
                        nk.j.d(l0Var, null, null, new tp1(aVar, context, hpVar, null), 3, null);
                    }
                    if (nt2Var.Z) {
                        nk.j.d(l0Var, null, null, new up1(aVar, context, hpVar, null), 3, null);
                    }
                }
                pu2Var = new qu2(zu2Var3.f85599f, zu2Var3.f85598e.f79849a);
            } else {
                if (iu2Var instanceof gu2) {
                    throw new NoWhenBranchMatchedException();
                }
                i4 i4Var = zu2Var3.f85606m;
                gu2 gu2Var = (gu2) iu2Var;
                im3Var = gu2Var.f77940a;
                i4Var.getClass();
                if (im3Var instanceof h4) {
                    l4VarA = n4.a(null, ((h4) im3Var).f78054c);
                } else {
                    l4VarA = h9.f78102b;
                }
                bv2 bv2Var2 = zu2Var3.f85608o;
                xyVar = gu2Var.f77941b;
                io2 io2Var2 = bv2Var2.f75976a;
                co2 co2Var2 = co2.f76352c;
                Pair[] pairArr3 = new Pair[4];
                pairArr3[0] = mj.h.a("failure_reason", l4VarA.f79698b);
                pairArr3[1] = mj.h.a("call_source", q61Var4.f81726b);
                if (xyVar != null) {
                    str = xyVar.f84744b;
                } else {
                    str = null;
                }
                pairArr3[2] = mj.h.a("configuration_source", str);
                pairArr3[3] = mj.h.a("durations", bv2Var2.f75980e.a());
                io2Var2.a(new eo2("sdk_configuration_failure", kotlin.collections.a.B(kotlin.collections.a.m(pairArr3)), null));
                pu2Var = new pu2(l4VarA);
            }
            whVar = zu2Var3.f85605l;
            nt2VarA = whVar.f84208c.a(whVar.f84206a);
            if (nt2VarA != null && nt2VarA.H && !wh.f84205f.getAndSet(true)) {
                hr0Var = whVar.f84210e;
                Set<String> setKeySet = ((SharedPreferences) ((tg1) hr0Var.f78306a).f83029d.getValue()).getAll().keySet();
                arrayList = new ArrayList();
                it = setKeySet.iterator();
                while (it.hasNext()) {
                    strC = ((tg1) hr0Var.f78306a).c((String) it.next());
                    if (strC != null) {
                        arrayList.add(strC);
                    }
                }
                arrayList2 = new ArrayList();
                for (String str5 : arrayList) {
                    fr0Var = hr0Var.f78307b;
                    fr0Var.getClass();
                    try {
                        if (str5 == null) {
                            jSONObject = new JSONObject(str5);
                            d00 d00Var = e00.f76858c;
                            String string = jSONObject.getString("ad_type");
                            d00Var.getClass();
                            e00VarA = d00.a(string);
                            if (e00VarA == null) {
                                j11 = jSONObject.getLong("start_time");
                                ir0 ir0Var = fr0Var.f77486a;
                                strOptString = jSONObject.optString("false_click");
                                ir0Var.getClass();
                                try {
                                    if (strOptString == null) {
                                        dr0Var2 = null;
                                    } else {
                                        JSONObject jSONObject2 = new JSONObject(strOptString);
                                        dr0Var2 = new dr0(jSONObject2.getString("url"), jSONObject2.getLong("interval"));
                                    }
                                    while (true) {
                                        if (i10 < length) {
                                            h1Var = null;
                                            break;
                                        }
                                        h1Var2 = h1VarArrValues[i10];
                                        if (ck.p.e(h1Var2.f78011b, jSONObject.getString("type"))) {
                                            h1Var = h1Var2;
                                            break;
                                        }
                                        i10++;
                                    }
                                } catch (JSONException unused) {
                                }
                                mapA = fr0.a(jSONObject);
                                d dVar = fr0Var.f77487b;
                                String strOptString2 = jSONObject.optString("ab_experiments");
                                dVar.getClass();
                                cVarA = d.a(strOptString2);
                                h1VarArrValues = h1.values();
                                length = h1VarArrValues.length;
                                i10 = 0;
                                if (h1Var == null) {
                                    er0Var = new er0(e00VarA, j11, h1Var, dr0Var2, mapA, cVarA);
                                }
                                if (er0Var != null) {
                                    arrayList2.add(er0Var);
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                    er0Var = null;
                    if (er0Var != null) {
                        arrayList2.add(er0Var);
                    }
                }
                for (er0 er0Var2 : nj.b0.O0(arrayList2)) {
                    dr0Var = er0Var2.f77183d;
                    if (dr0Var != null) {
                        zaVar = new za(whVar.f84206a, whVar.f84207b, new d4(er0Var2.f77180a));
                        j10 = dr0Var.f76779c;
                        if (j10 <= j10) {
                            za.a(zaVar, dr0Var.f76778b, k83.f79333e);
                        }
                    }
                    ((tg1) whVar.f84210e.f78306a).d(String.valueOf(er0Var2.f77181b));
                    long jCurrentTimeMillis = System.currentTimeMillis() - er0Var2.f77181b;
                    Map mapB = kotlin.collections.a.B(er0Var2.f77184e);
                    mapB.put("interval", rd1.a(jCurrentTimeMillis));
                    co2 co2Var3 = co2.f76352c;
                    whVar.f84209d.a(new eo2("returned_to_app", kotlin.collections.a.B(mapB), er0Var2.f77185f));
                }
                ((tg1) whVar.f84210e.f78306a).a();
            }
            return pu2Var;
        }
        kotlin.c.b(objB);
        df dfVar = this.f85609p;
        dfVar.f76659a.getClass();
        int iA = ef.a();
        dfVar.f76659a.getClass();
        if (iA < 21) {
            h4 h4Var = new h4(m4.f80066i, null);
            this.f85606m.getClass();
            return new pu2(n4.a(null, h4Var.f78054c));
        }
        nt2 nt2VarA2 = this.f85600g.a(this.f85601h);
        boolean z11 = nt2VarA2 != null ? nt2VarA2.f80804y0 : false;
        w5Var = this.f85597d;
        v5Var = v5.f83749i;
        w5Var.a(v5Var, null);
        this.f85611r.a(this.f85601h);
        boolean z12 = ha3.f78156a;
        ha3.a(this.f85601h, ((iu3) this.f85595b).a());
        xf.a(this.f85601h, ((iu3) this.f85595b).a());
        AtomicBoolean atomicBoolean = ji.f79048a;
        ji.a(this.f85594a, ((iu3) this.f85595b).a());
        nt2 nt2VarA3 = this.f85600g.a(this.f85601h);
        if (nt2VarA3 != null && (vw0Var = nt2VarA3.G0) != null && (dx0Var = vw0Var.f84023a) != null) {
            gx0 gx0Var = this.f85613t;
            gx0Var.getClass();
            nk.j.d(gx0Var.f77966b, null, null, new fx0(gx0Var, nj.s.n(new dn2(sw0.f82780b, dx0Var.f76836b), new dn2(sw0.f82781c, dx0Var.f76837c), new dn2(sw0.f82782d, dx0Var.f76838d), new dn2(sw0.f82783e, dx0Var.f76835a)), null), 3, null);
        }
        gVarD = nk.j.d(this.f85596c, null, null, new wu2(z11, this, null), 3, null);
        w5 w5Var4 = this.f85597d;
        v5 v5Var4 = v5.f83748h;
        w5Var4.a(v5Var4, null);
        c31 c31Var = (c31) this.f85602i.f75711a.f79850b;
        c31Var.getClass();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (c31.f76138h) {
            tg tgVar = c31Var.f76143e;
            r15 = tgVar;
            if (tgVar == null) {
                fh fhVar = c31Var.f76139a;
                Context context2 = c31Var.f76142d;
                fhVar.getClass();
                try {
                    uuid = AppMetrica.getUuid(context2);
                } catch (Throwable unused3) {
                    boolean z13 = ad1.f75480a;
                    uuid = null;
                }
                fh fhVar2 = c31Var.f76139a;
                Context context3 = c31Var.f76142d;
                fhVar2.getClass();
                try {
                    deviceId = AppMetrica.getDeviceId(context3);
                } catch (Throwable unused4) {
                    boolean z14 = ad1.f75480a;
                    deviceId = null;
                }
                tg tgVar2 = new tg(null, deviceId, uuid);
                c31Var.a();
                r15 = tgVar2;
            }
            ref$ObjectRef.element = r15;
            mj.r rVar = mj.r.f64562a;
        }
        this.f85614u.a(this.f85601h, new z21(r15, c31Var.f76145g, c31Var.f76144f));
        w5Var4.a(v5Var4);
        vu2Var.f84010b = this;
        vu2Var.f84011c = q61Var;
        vu2Var.f84012d = w5Var;
        vu2Var.f84013e = v5Var;
        vu2Var.f84014f = gVarD;
        vu2Var.f84017i = 1;
        if (a(vu2Var) == objF) {
            return objF;
        }
        q61Var2 = q61Var;
        zu2Var = this;
        vu2Var.f84010b = zu2Var;
        vu2Var.f84011c = q61Var2;
        vu2Var.f84012d = w5Var;
        vu2Var.f84013e = v5Var;
        vu2Var.f84014f = null;
        vu2Var.f84017i = 2;
        if (gVarD.o(vu2Var) == objF) {
            return objF;
        }
        v5Var2 = v5Var;
        w5Var2 = w5Var;
        q61Var3 = q61Var2;
        zu2Var2 = zu2Var;
        vu2Var.f84010b = zu2Var2;
        vu2Var.f84011c = q61Var3;
        vu2Var.f84012d = w5Var2;
        vu2Var.f84013e = v5Var2;
        vu2Var.f84017i = 3;
        objB = zu2Var2.b(q61Var3, vu2Var);
        if (objB == objF) {
            return objF;
        }
        v5Var3 = v5Var2;
        w5Var3 = w5Var2;
        q61Var4 = q61Var3;
        zu2Var3 = zu2Var2;
        iu2Var = (iu2) objB;
        w5Var3.a(v5Var3);
        if (iu2Var instanceof hu2) {
            bv2 bv2Var3 = zu2Var3.f85608o;
            hu2 hu2Var2 = (hu2) iu2Var;
            nt2 nt2Var3 = hu2Var2.f78383a;
            xyVar2 = hu2Var2.f78384b;
            io2 io2Var3 = bv2Var3.f75976a;
            co2 co2Var4 = co2.f76352c;
            Pair[] pairArr4 = new Pair[8];
            bv2Var3.f75978c.getClass();
            pairArr4[0] = mj.h.a("creation_date", Long.valueOf(System.currentTimeMillis()));
            pairArr4[1] = mj.h.a("startup_version", nt2Var3.f80758b0);
            pairArr4[2] = mj.h.a("user_consent", nt2Var3.L);
            pairArr4[3] = mj.h.a("ad_host", nt2Var3.U);
            lq1Var = bv2Var3.f75979d;
            z10 = bv2Var3.f75977b;
            lq1Var.getClass();
            if (z10) {
                str2 = "ads-mediation";
            } else {
                str2 = C3702sd.f30729d;
            }
            String str6 = pq1.f81538d;
            ArrayList arrayListA2 = lq1Var.f79881b.a(mq1.a());
            arrayList3 = new ArrayList();
            it2 = arrayListA2.iterator();
            while (it2.hasNext()) {
                next = it2.next();
                Iterator it5 = it2;
                lq1Var.f79880a.getClass();
                if (cr1.a((br1) next)) {
                    arrayList3.add(next);
                }
                it2 = it5;
            }
            Pair[] pairArr5 = new Pair[2];
            pairArr5[0] = mj.h.a("integration_type", str2);
            arrayList4 = new ArrayList(nj.t.v(arrayList3, 10));
            it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(nj.l0.g(mj.h.a("name", ((br1) it3.next()).f75934a)));
            }
            pairArr5[1] = mj.h.a(Q6.E1, arrayList4);
            pairArr4[4] = mj.h.a("integrated_mediation", kotlin.collections.a.m(pairArr5));
            pairArr4[5] = mj.h.a("call_source", q61Var4.f81726b);
            if (xyVar2 != null) {
                str3 = xyVar2.f84744b;
            } else {
                str3 = null;
            }
            pairArr4[6] = mj.h.a("configuration_source", str3);
            pairArr4[7] = mj.h.a("durations", bv2Var3.f75980e.a());
            io2Var3.a(new eo2("sdk_configuration_success", kotlin.collections.a.B(kotlin.collections.a.m(pairArr4)), null));
            zu2Var3.f85607n.a();
            wu1.a();
            context = zu2Var3.f85594a;
            nt2Var = hu2Var2.f78383a;
            aVar = zu2Var3.f85612s;
            l0Var = zu2Var3.f85596c;
            aVar.getClass();
            hpVar = nt2Var.f80756a0;
            if (hpVar != null) {
                if (nt2Var.Y) {
                    nk.j.d(l0Var, null, null, new tp1(aVar, context, hpVar, null), 3, null);
                }
                if (nt2Var.Z) {
                    nk.j.d(l0Var, null, null, new up1(aVar, context, hpVar, null), 3, null);
                }
            }
            pu2Var = new qu2(zu2Var3.f85599f, zu2Var3.f85598e.f79849a);
        } else {
            if (iu2Var instanceof gu2) {
                throw new NoWhenBranchMatchedException();
            }
            i4 i4Var2 = zu2Var3.f85606m;
            gu2 gu2Var2 = (gu2) iu2Var;
            im3Var = gu2Var2.f77940a;
            i4Var2.getClass();
            if (im3Var instanceof h4) {
                l4VarA = n4.a(null, ((h4) im3Var).f78054c);
            } else {
                l4VarA = h9.f78102b;
            }
            bv2 bv2Var4 = zu2Var3.f85608o;
            xyVar = gu2Var2.f77941b;
            io2 io2Var4 = bv2Var4.f75976a;
            co2 co2Var5 = co2.f76352c;
            Pair[] pairArr6 = new Pair[4];
            pairArr6[0] = mj.h.a("failure_reason", l4VarA.f79698b);
            pairArr6[1] = mj.h.a("call_source", q61Var4.f81726b);
            if (xyVar != null) {
                str = xyVar.f84744b;
            } else {
                str = null;
            }
            pairArr6[2] = mj.h.a("configuration_source", str);
            pairArr6[3] = mj.h.a("durations", bv2Var4.f75980e.a());
            io2Var4.a(new eo2("sdk_configuration_failure", kotlin.collections.a.B(kotlin.collections.a.m(pairArr6)), null));
            pu2Var = new pu2(l4VarA);
        }
        whVar = zu2Var3.f85605l;
        nt2VarA = whVar.f84208c.a(whVar.f84206a);
        if (nt2VarA != null) {
            hr0Var = whVar.f84210e;
            Set<String> setKeySet2 = ((SharedPreferences) ((tg1) hr0Var.f78306a).f83029d.getValue()).getAll().keySet();
            arrayList = new ArrayList();
            it = setKeySet2.iterator();
            while (it.hasNext()) {
                strC = ((tg1) hr0Var.f78306a).c((String) it.next());
                if (strC != null) {
                    arrayList.add(strC);
                }
            }
            arrayList2 = new ArrayList();
            while (r5.hasNext()) {
                fr0Var = hr0Var.f78307b;
                fr0Var.getClass();
                if (str5 == null) {
                    jSONObject = new JSONObject(str5);
                    d00 d00Var2 = e00.f76858c;
                    String string2 = jSONObject.getString("ad_type");
                    d00Var2.getClass();
                    e00VarA = d00.a(string2);
                    if (e00VarA == null) {
                        j11 = jSONObject.getLong("start_time");
                        ir0 ir0Var2 = fr0Var.f77486a;
                        strOptString = jSONObject.optString("false_click");
                        ir0Var2.getClass();
                        if (strOptString == null) {
                            dr0Var2 = null;
                        } else {
                            JSONObject jSONObject3 = new JSONObject(strOptString);
                            dr0Var2 = new dr0(jSONObject3.getString("url"), jSONObject3.getLong("interval"));
                        }
                        mapA = fr0.a(jSONObject);
                        d dVar2 = fr0Var.f77487b;
                        String strOptString3 = jSONObject.optString("ab_experiments");
                        dVar2.getClass();
                        cVarA = d.a(strOptString3);
                        h1VarArrValues = h1.values();
                        length = h1VarArrValues.length;
                        i10 = 0;
                        while (true) {
                            if (i10 < length) {
                                h1Var = null;
                                break;
                            }
                            h1Var2 = h1VarArrValues[i10];
                            if (ck.p.e(h1Var2.f78011b, jSONObject.getString("type"))) {
                                h1Var = h1Var2;
                                break;
                            }
                            i10++;
                        }
                        if (h1Var == null) {
                            er0Var = new er0(e00VarA, j11, h1Var, dr0Var2, mapA, cVarA);
                        }
                        if (er0Var != null) {
                            arrayList2.add(er0Var);
                        }
                    }
                }
                er0Var = null;
                if (er0Var != null) {
                    arrayList2.add(er0Var);
                }
            }
            while (r3.hasNext()) {
                dr0Var = er0Var2.f77183d;
                if (dr0Var != null) {
                    zaVar = new za(whVar.f84206a, whVar.f84207b, new d4(er0Var2.f77180a));
                    j10 = dr0Var.f76779c;
                    if (j10 <= j10) {
                        za.a(zaVar, dr0Var.f76778b, k83.f79333e);
                    }
                }
                ((tg1) whVar.f84210e.f78306a).d(String.valueOf(er0Var2.f77181b));
                long jCurrentTimeMillis2 = System.currentTimeMillis() - er0Var2.f77181b;
                Map mapB2 = kotlin.collections.a.B(er0Var2.f77184e);
                mapB2.put("interval", rd1.a(jCurrentTimeMillis2));
                co2 co2Var6 = co2.f76352c;
                whVar.f84209d.a(new eo2("returned_to_app", kotlin.collections.a.B(mapB2), er0Var2.f77185f));
            }
            ((tg1) whVar.f84210e.f78306a).a();
        }
        return pu2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(q61 q61Var, rj.c cVar) throws Throwable {
        xu2 xu2Var;
        w5 w5Var;
        v5 v5Var;
        if (cVar instanceof xu2) {
            xu2Var = (xu2) cVar;
            int i10 = xu2Var.f84700f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                xu2Var.f84700f = i10 - Integer.MIN_VALUE;
            } else {
                xu2Var = new xu2(this, cVar);
            }
        } else {
            xu2Var = new xu2(this, cVar);
        }
        Object obj = xu2Var.f84698d;
        Object objF = sj.a.f();
        int i11 = xu2Var.f84700f;
        if (i11 == 0) {
            kotlin.c.b(obj);
            w5 w5Var2 = this.f85597d;
            v5 v5Var2 = v5.f83751k;
            w5Var2.a(v5Var2, null);
            vt2 vt2Var = this.f85604k;
            xu2Var.f84696b = w5Var2;
            xu2Var.f84697c = v5Var2;
            xu2Var.f84700f = 1;
            vt2Var.getClass();
            Object objG = nk.h.g(nk.w0.b(), new ut2(vt2Var, q61Var, null), xu2Var);
            if (objG == objF) {
                return objF;
            }
            w5Var = w5Var2;
            obj = objG;
            v5Var = v5Var2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v5Var = xu2Var.f84697c;
            w5Var = xu2Var.f84696b;
            kotlin.c.b(obj);
        }
        iu2 iu2Var = (iu2) obj;
        w5Var.a(v5Var);
        return iu2Var;
    }

    public zu2(Context context, lu2 lu2Var, nk.l0 l0Var, w5 w5Var, lm0 lm0Var, rd rdVar, dw2 dw2Var, Context context2, b31 b31Var, ae aeVar, vt2 vt2Var, wh whVar, i4 i4Var, nw2 nw2Var, bv2 bv2Var, df dfVar, cj0 cj0Var, ue ueVar, com.monetization.ads.mediation.base.initialize.a aVar, gx0 gx0Var) {
        this.f85594a = context;
        this.f85595b = lu2Var;
        this.f85596c = l0Var;
        this.f85597d = w5Var;
        this.f85598e = lm0Var;
        this.f85599f = rdVar;
        this.f85600g = dw2Var;
        this.f85601h = context2;
        this.f85602i = b31Var;
        this.f85603j = aeVar;
        this.f85604k = vt2Var;
        this.f85605l = whVar;
        this.f85606m = i4Var;
        this.f85607n = nw2Var;
        this.f85608o = bv2Var;
        this.f85609p = dfVar;
        this.f85610q = cj0Var;
        this.f85611r = ueVar;
        this.f85612s = aVar;
        this.f85613t = gx0Var;
        this.f85614u = new a31(lm0Var.a(), new a5());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(rj.c cVar) throws Throwable {
        yu2 yu2Var;
        w5 w5Var;
        v5 v5Var;
        zu2 zu2Var;
        if (cVar instanceof yu2) {
            yu2Var = (yu2) cVar;
            int i10 = yu2Var.f85123g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                yu2Var.f85123g = i10 - Integer.MIN_VALUE;
            } else {
                yu2Var = new yu2(this, cVar);
            }
        } else {
            yu2Var = new yu2(this, cVar);
        }
        Object obj = yu2Var.f85121e;
        Object objF = sj.a.f();
        int i11 = yu2Var.f85123g;
        if (i11 == 0) {
            kotlin.c.b(obj);
            w5Var = this.f85597d;
            v5 v5Var2 = v5.f83744d;
            w5Var.a(v5Var2, null);
            ae aeVar = this.f85603j;
            Context context = this.f85601h;
            yu2Var.f85118b = this;
            yu2Var.f85119c = w5Var;
            yu2Var.f85120d = v5Var2;
            yu2Var.f85123g = 1;
            aeVar.getClass();
            Object objG = nk.h.g(nk.w0.b(), new zd(context, null), yu2Var);
            if (objG == objF) {
                return objF;
            }
            v5Var = v5Var2;
            obj = objG;
            zu2Var = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v5Var = yu2Var.f85120d;
            w5Var = yu2Var.f85119c;
            zu2Var = yu2Var.f85118b;
            kotlin.c.b(obj);
        }
        vd vdVar = (vd) obj;
        if (vdVar != null) {
            rd rdVar = zu2Var.f85599f;
            td tdVar = vdVar.f83879a;
            rdVar.f82195a = tdVar;
            rdVar.f82196b = vdVar.f83880b;
            rdVar.f82197c = vdVar.f83881c;
            rdVar.f82198d = vdVar.f83882d;
            if (tdVar != null) {
                zu2Var.f85598e.f79849a.f79101f = true;
            }
        }
        mj.r rVar = mj.r.f64562a;
        w5Var.a(v5Var);
        return rVar;
    }
}
