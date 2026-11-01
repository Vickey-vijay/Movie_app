package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class Mk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final wk.a f23176c = wk.g.b(false, 1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ne f23177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f23178b;

    /* JADX WARN: Code duplicated, block: B:41:0x00ac A[Catch: all -> 0x00ce, TryCatch #0 {all -> 0x00ce, blocks: (B:13:0x002d, B:38:0x008d, B:39:0x00a6, B:41:0x00ac, B:43:0x00b4, B:44:0x00bf, B:45:0x00c3, B:22:0x0055, B:28:0x0067, B:31:0x006d, B:34:0x0087), top: B:51:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(JSONObject jSONObject, ContinuationImpl continuationImpl) throws Throwable {
        Lk lk2;
        JSONObject jSONObject2;
        wk.a aVar;
        JSONObject jSONObject3;
        JSONObject jSONObjectA;
        if (continuationImpl instanceof Lk) {
            lk2 = (Lk) continuationImpl;
            int i10 = lk2.f23098e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lk2.f23098e = i10 - Integer.MIN_VALUE;
            } else {
                lk2 = new Lk(this, continuationImpl);
            }
        } else {
            lk2 = new Lk(this, continuationImpl);
        }
        Object obj = lk2.f23096c;
        Object objF = sj.a.f();
        int i11 = lk2.f23098e;
        boolean z10 = true;
        try {
            if (i11 == 0) {
                kotlin.c.b(obj);
                wk.a aVar2 = f23176c;
                lk2.f23094a = jSONObject;
                lk2.f23095b = aVar2;
                lk2.f23098e = 1;
                if (aVar2.a(null, lk2) != objF) {
                    jSONObject2 = jSONObject;
                    aVar = aVar2;
                }
                return objF;
            }
            if (i11 == 1) {
                aVar = lk2.f23095b;
                JSONObject jSONObject4 = lk2.f23094a;
                kotlin.c.b(obj);
                jSONObject2 = jSONObject4;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = lk2.f23095b;
                JSONObject jSONObject5 = lk2.f23094a;
                kotlin.c.b(obj);
                jSONObject3 = jSONObject5;
            }
            F9.b(Ok.a(jSONObject3, F9.b()));
            jSONObjectA = Ok.a(F9.b());
            for (InMobiUnifiedIdInterface inMobiUnifiedIdInterface : this.f23178b) {
                if (jSONObjectA == null) {
                    Ok.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT));
                } else {
                    Ok.a(inMobiUnifiedIdInterface, jSONObjectA, null);
                }
            }
            this.f23178b.clear();
            mj.r rVar = mj.r.f64562a;
            aVar.b(null);
            return rVar;
            int iC = this.f23177a.c();
            Y5 y10 = EnumC2721a6.f23946b;
            if (iC != 192 && iC != 0) {
                z10 = false;
            }
            if (z10) {
                mj.r rVar2 = mj.r.f64562a;
                aVar.b(null);
                return rVar2;
            }
            Jk jk2 = Jk.f22960a;
            lk2.f23094a = jSONObject2;
            lk2.f23095b = aVar;
            lk2.f23098e = 2;
            Object objA = F3.a(Jk.f22961b, new Ek(null), lk2);
            if (objA != sj.a.f()) {
                objA = mj.r.f64562a;
            }
            if (objA != objF) {
                jSONObject3 = jSONObject2;
                F9.b(Ok.a(jSONObject3, F9.b()));
                jSONObjectA = Ok.a(F9.b());
                while (r0.hasNext()) {
                    if (jSONObjectA == null) {
                        Ok.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT));
                    } else {
                        Ok.a(inMobiUnifiedIdInterface, jSONObjectA, null);
                    }
                }
                this.f23178b.clear();
                mj.r rVar3 = mj.r.f64562a;
                aVar.b(null);
                return rVar3;
            }
            return objF;
        } catch (Throwable th2) {
            jSONObject.b(null);
            throw th2;
        }
    }

    public Mk(Ne ne2, LinkedHashSet linkedHashSet) {
        ck.p.j(ne2, "networkResponse");
        ck.p.j(linkedHashSet, "inMobiUnifiedIdInterfaceSet");
        this.f23177a = ne2;
        this.f23178b = linkedHashSet;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i10, String str, ContinuationImpl continuationImpl) throws Throwable {
        Kk kk2;
        wk.a aVar;
        Throwable th2;
        wk.a aVar2;
        if (continuationImpl instanceof Kk) {
            kk2 = (Kk) continuationImpl;
            int i11 = kk2.f23026f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kk2.f23026f = i11 - Integer.MIN_VALUE;
            } else {
                kk2 = new Kk(this, continuationImpl);
            }
        } else {
            kk2 = new Kk(this, continuationImpl);
        }
        Object obj = kk2.f23024d;
        Object objF = sj.a.f();
        int i12 = kk2.f23026f;
        boolean z10 = true;
        try {
            if (i12 == 0) {
                kotlin.c.b(obj);
                aVar = f23176c;
                kk2.f23022b = str;
                kk2.f23023c = aVar;
                kk2.f23021a = i10;
                kk2.f23026f = 1;
                if (aVar.a(null, kk2) != objF) {
                }
                return objF;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = kk2.f23023c;
                str = kk2.f23022b;
                try {
                    kotlin.c.b(obj);
                    a(str);
                    mj.r rVar = mj.r.f64562a;
                    aVar2.b(null);
                    return rVar;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar = aVar2;
                    aVar.b(null);
                    throw th2;
                }
            }
            i10 = kk2.f23021a;
            wk.a aVar3 = kk2.f23023c;
            String str2 = kk2.f23022b;
            kotlin.c.b(obj);
            aVar = aVar3;
            str = str2;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
            Wj wj2 = Wj.f23753a;
            Wj.b("UnifiedIdNetworkResponseFailure", linkedHashMap, EnumC2735ak.SDK);
            int iC = this.f23177a.c();
            Y5 y10 = EnumC2721a6.f23946b;
            if (iC != 192 && iC != 0) {
                z10 = false;
            }
            if (z10) {
                mj.r rVar2 = mj.r.f64562a;
                aVar.b(null);
                return rVar2;
            }
            Jk jk2 = Jk.f22960a;
            kk2.f23022b = str;
            kk2.f23023c = aVar;
            kk2.f23026f = 2;
            Object objA = F3.a(Jk.f22961b, new Ek(null), kk2);
            if (objA != sj.a.f()) {
                objA = mj.r.f64562a;
            }
            if (objA != objF) {
                aVar2 = aVar;
                a(str);
                mj.r rVar3 = mj.r.f64562a;
                aVar2.b(null);
                return rVar3;
            }
            return objF;
        } catch (Throwable th4) {
            th2 = th4;
            aVar.b(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033 A[Catch: all -> 0x0056, JSONException -> 0x0058, Merged into TryCatch #0 {all -> 0x0056, JSONException -> 0x0058, blocks: (B:4:0x000d, B:6:0x0013, B:8:0x001d, B:9:0x0023, B:11:0x0029, B:12:0x0033, B:13:0x0039, B:15:0x003f, B:22:0x0059), top: B:27:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:15:0x003f A[Catch: all -> 0x0056, JSONException -> 0x0058, LOOP:0: B:13:0x0039->B:15:0x003f, LOOP_END, Merged into TryCatch #0 {all -> 0x0056, JSONException -> 0x0058, blocks: (B:4:0x000d, B:6:0x0013, B:8:0x001d, B:9:0x0023, B:11:0x0029, B:12:0x0033, B:13:0x0039, B:15:0x003f, B:22:0x0059), top: B:27:0x000b }, TRY_LEAVE] */
    public final void a(String str) {
        Iterator it;
        JSONObject jSONObjectA = Ok.a(F9.b());
        try {
            if (jSONObjectA != null) {
                if (jSONObjectA.has("ufids") && jSONObjectA.getJSONArray("ufids").length() > 0) {
                    Iterator it2 = this.f23178b.iterator();
                    while (it2.hasNext()) {
                        Ok.a((InMobiUnifiedIdInterface) it2.next(), jSONObjectA, null);
                    }
                } else {
                    it = this.f23178b.iterator();
                    while (it.hasNext()) {
                        Ok.a((InMobiUnifiedIdInterface) it.next(), null, new Error(InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT));
                    }
                }
            } else {
                it = this.f23178b.iterator();
                while (it.hasNext()) {
                    Ok.a((InMobiUnifiedIdInterface) it.next(), null, new Error(InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT));
                }
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        } finally {
            this.f23178b.clear();
        }
    }
}
