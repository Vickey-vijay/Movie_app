package com.inmobi.media;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class U9 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V9 f23626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f23627c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U9(V9 v10, ArrayList arrayList, rj.c cVar) {
        super(2, cVar);
        this.f23626b = v10;
        this.f23627c = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new U9(this.f23626b, this.f23627c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new U9(this.f23626b, this.f23627c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        W9 w10;
        Object objF = sj.a.f();
        int i10 = this.f23625a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            C3304xb c3304xb = (C3304xb) AbstractC3329yb.f25781a.getValue();
            this.f23625a = 1;
            obj = c3304xb.b(this);
            if (obj == objF) {
                return objF;
            }
        }
        ArrayList arrayList = this.f23627c;
        for (C3130qb c3130qb : (Iterable) obj) {
            CopyOnWriteArrayList copyOnWriteArrayList = Mb.f23154a;
            if (!Lb.a(c3130qb.f25161a)) {
                String strB = Tb.b(c3130qb.f25161a);
                if (strB != null) {
                    JSONObject jSONObject = new JSONObject(strB);
                    JSONObject jSONObject2 = jSONObject.getJSONObject("vitals");
                    JSONArray jSONArray = jSONObject.getJSONArray(CreativeInfo.f44317an);
                    ck.p.g(jSONObject2);
                    ck.p.g(jSONArray);
                    w10 = new W9(jSONObject2, jSONArray, c3130qb);
                } else {
                    w10 = null;
                }
                if (w10 != null) {
                    arrayList.add(w10);
                }
            }
        }
        return mj.r.f64562a;
    }
}
