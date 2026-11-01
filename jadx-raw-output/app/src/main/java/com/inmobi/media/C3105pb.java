package com.inmobi.media;

import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3105pb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wk.a[] f25063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f25064b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ho hoVar, ContinuationImpl continuationImpl) throws Throwable {
        C3055nb c3055nb;
        wk.a aVar;
        bk.l lVar;
        wk.a aVar2;
        Object obj;
        String str2;
        if (continuationImpl instanceof C3055nb) {
            c3055nb = (C3055nb) continuationImpl;
            int i10 = c3055nb.f24887f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3055nb.f24887f = i10 - Integer.MIN_VALUE;
            } else {
                c3055nb = new C3055nb(this, continuationImpl);
            }
        } else {
            c3055nb = new C3055nb(this, continuationImpl);
        }
        Object obj2 = c3055nb.f24885d;
        Object objF = sj.a.f();
        int i11 = c3055nb.f24887f;
        try {
            if (i11 == 0) {
                kotlin.c.b(obj2);
                aVar = this.f25063a[Math.floorMod(str != null ? str.hashCode() : 0, 16)];
                c3055nb.f24882a = str;
                c3055nb.f24883b = hoVar;
                c3055nb.f24884c = aVar;
                c3055nb.f24887f = 1;
                lVar = hoVar;
                if (aVar.a(null, c3055nb) != objF) {
                }
                return objF;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (wk.a) c3055nb.f24883b;
                str2 = c3055nb.f24882a;
                try {
                    kotlin.c.b(obj2);
                    this.f25064b.put(str2, obj2);
                    obj = obj2;
                    aVar = aVar2;
                    aVar.b(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2.b(null);
                    throw th;
                }
            }
            wk.a aVar3 = c3055nb.f24884c;
            bk.l lVar2 = (bk.l) c3055nb.f24883b;
            String str3 = c3055nb.f24882a;
            kotlin.c.b(obj2);
            aVar = aVar3;
            str = str3;
            lVar = lVar2;
            obj = this.f25064b.get(str);
            if (obj == null) {
                c3055nb.f24882a = str;
                c3055nb.f24883b = aVar;
                c3055nb.f24884c = null;
                c3055nb.f24887f = 2;
                Object objInvoke = lVar.invoke(c3055nb);
                if (objInvoke != objF) {
                    str2 = str;
                    aVar2 = aVar;
                    obj2 = objInvoke;
                    this.f25064b.put(str2, obj2);
                    obj = obj2;
                    aVar = aVar2;
                }
                return objF;
            }
            aVar.b(null);
            return obj;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.b(null);
            throw th;
        }
    }

    public final String toString() {
        String str = this.f25064b.toString();
        ck.p.i(str, "toString(...)");
        return str;
    }

    public C3105pb() {
        wk.a[] aVarArr = new wk.a[16];
        for (int i10 = 0; i10 < 16; i10++) {
            aVarArr[i10] = wk.g.b(false, 1, null);
        }
        this.f25063a = aVarArr;
        this.f25064b = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) throws Throwable {
        C3080ob c3080ob;
        String str2;
        wk.a aVar;
        if (continuationImpl instanceof C3080ob) {
            c3080ob = (C3080ob) continuationImpl;
            int i10 = c3080ob.f24980e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3080ob.f24980e = i10 - Integer.MIN_VALUE;
            } else {
                c3080ob = new C3080ob(this, continuationImpl);
            }
        } else {
            c3080ob = new C3080ob(this, continuationImpl);
        }
        Object obj = c3080ob.f24978c;
        Object objF = sj.a.f();
        int i11 = c3080ob.f24980e;
        if (i11 == 0) {
            kotlin.c.b(obj);
            wk.a aVar2 = this.f25063a[Math.floorMod(str != null ? str.hashCode() : 0, 16)];
            c3080ob.f24976a = str;
            c3080ob.f24977b = aVar2;
            c3080ob.f24980e = 1;
            if (aVar2.a(null, c3080ob) == objF) {
                return objF;
            }
            str2 = str;
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = c3080ob.f24977b;
            str2 = c3080ob.f24976a;
            kotlin.c.b(obj);
        }
        try {
            this.f25064b.remove(str2);
            return mj.r.f64562a;
        } finally {
            aVar.b(null);
        }
    }
}
