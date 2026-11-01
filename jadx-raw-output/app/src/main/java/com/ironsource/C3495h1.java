package com.ironsource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.ironsource.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3495h1 implements Cif<JSONArray> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<C3477g1> f29036a = new ArrayList();

    @Override // com.ironsource.InterfaceC3501h7
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONArray a(EnumC3509hf enumC3509hf) {
        ck.p.j(enumC3509hf, C3426d4.a.f28427t);
        int i10 = a.f29037a[enumC3509hf.ordinal()];
        if (i10 == 1) {
            List<C3477g1> listB = b();
            ArrayList arrayList = new ArrayList(nj.t.v(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(((C3477g1) it.next()).d());
            }
            return new JSONArray((Collection) arrayList);
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        List<C3477g1> listA = a();
        ArrayList arrayList2 = new ArrayList(nj.t.v(listA, 10));
        Iterator<T> it2 = listA.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C3477g1) it2.next()).c());
        }
        return new JSONArray((Collection) arrayList2);
    }

    /* JADX INFO: renamed from: com.ironsource.h1$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29037a;

        static {
            int[] iArr = new int[EnumC3509hf.values().length];
            try {
                iArr[EnumC3509hf.FullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3509hf.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f29037a = iArr;
        }
    }

    public final void a(C3477g1 c3477g1) {
        ck.p.j(c3477g1, "event");
        this.f29036a.add(c3477g1);
    }

    private final List<C3477g1> a() {
        List<C3477g1> list = this.f29036a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C3477g1 c3477g1 = (C3477g1) obj;
            if (c3477g1.e() != EnumC3473ff.LoadSuccess && c3477g1.e() != EnumC3473ff.LoadRequest) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(nj.t.v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C3477g1) it.next()).a());
        }
        Set setT0 = nj.b0.T0(arrayList2);
        List<C3477g1> list2 = this.f29036a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            C3477g1 c3477g2 = (C3477g1) obj2;
            if (c3477g2.e() == EnumC3473ff.LoadSuccess && !setT0.contains(c3477g2.a())) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    private final List<C3477g1> b() {
        List<C3477g1> list = this.f29036a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C3477g1) obj).e() != EnumC3473ff.LoadRequest) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
