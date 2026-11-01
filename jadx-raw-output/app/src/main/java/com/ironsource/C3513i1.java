package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C3513i1 implements InterfaceC3657q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3566l1 f29113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F7 f29114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Kb<Integer, Integer> f29115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3710t4 f29116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<InterfaceC3604n1> f29117e;

    public C3513i1(InterfaceC3566l1 interfaceC3566l1, F7 f10, Kb<Integer, Integer> kb2, InterfaceC3710t4 interfaceC3710t4) {
        ck.p.j(interfaceC3566l1, "eventBaseData");
        ck.p.j(f10, "eventsManager");
        ck.p.j(kb2, "eventsMapper");
        ck.p.j(interfaceC3710t4, "currentTimeProvider");
        this.f29113a = interfaceC3566l1;
        this.f29114b = f10;
        this.f29115c = kb2;
        this.f29116d = interfaceC3710t4;
        this.f29117e = new ArrayList();
    }

    public final void a(List<InterfaceC3604n1> list) {
        ck.p.j(list, "<set-?>");
        this.f29117e = list;
    }

    public final List<InterfaceC3604n1> b() {
        return this.f29117e;
    }

    private final JSONObject b(List<? extends InterfaceC3604n1> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends InterfaceC3604n1> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(linkedHashMap);
        }
        return new JSONObject(linkedHashMap);
    }

    @Override // com.ironsource.InterfaceC3657q1
    public void a(int i10, List<InterfaceC3604n1> list) {
        ck.p.j(list, "arrayList");
        try {
            Iterator<T> it = this.f29113a.a().iterator();
            while (it.hasNext()) {
                list.add((InterfaceC3604n1) it.next());
            }
            Iterator<InterfaceC3604n1> it2 = this.f29117e.iterator();
            while (it2.hasNext()) {
                list.add(it2.next());
            }
            this.f29114b.a(new C5(this.f29115c.a(Integer.valueOf(i10)).intValue(), this.f29116d.a(), b(list)));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            System.out.println((Object) ("LogRemote | Exception: " + e10.getMessage()));
        }
    }

    public /* synthetic */ C3513i1(InterfaceC3566l1 interfaceC3566l1, F7 f10, Kb kb2, InterfaceC3710t4 interfaceC3710t4, int i10, ck.i iVar) {
        this(interfaceC3566l1, f10, kb2, (i10 & 8) != 0 ? new InterfaceC3710t4.a() : interfaceC3710t4);
    }

    @Override // com.ironsource.InterfaceC3657q1
    public void a() {
        this.f29117e.clear();
    }

    @Override // com.ironsource.InterfaceC3657q1
    public void a(InterfaceC3604n1... interfaceC3604n1Arr) {
        ck.p.j(interfaceC3604n1Arr, "analyticsEventEntity");
        for (InterfaceC3604n1 interfaceC3604n1 : interfaceC3604n1Arr) {
            this.f29117e.add(interfaceC3604n1);
        }
    }
}
