package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.xh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3310xh extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f25728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bh f25729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f25730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RootConfig f25731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk.n f25732f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3310xh(List list, Bh bh2, String str, RootConfig rootConfig, pk.n nVar, rj.c cVar) {
        super(2, cVar);
        this.f25728b = list;
        this.f25729c = bh2;
        this.f25730d = str;
        this.f25731e = rootConfig;
        this.f25732f = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        C3310xh c3310xh = new C3310xh(this.f25728b, this.f25729c, this.f25730d, this.f25731e, this.f25732f, cVar);
        c3310xh.f25727a = obj;
        return c3310xh;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((C3310xh) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        nk.l0 l0Var = (nk.l0) this.f25727a;
        List list = this.f25728b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            String str = ((C3023m4) obj2).f24801a;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        Bh bh2 = this.f25729c;
        String str2 = this.f25730d;
        RootConfig rootConfig = this.f25731e;
        pk.n nVar = this.f25732f;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            RootConfig rootConfig2 = rootConfig;
            nk.j.d(l0Var, null, null, new C3285wh(bh2, (String) entry.getKey(), str2, rootConfig2, (List) entry.getValue(), nVar, null), 3, null);
            nVar = nVar;
            rootConfig = rootConfig2;
            str2 = str2;
        }
        return mj.r.f64562a;
    }
}
