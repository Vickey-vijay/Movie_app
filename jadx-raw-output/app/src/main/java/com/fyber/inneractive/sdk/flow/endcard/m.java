package com.fyber.inneractive.sdk.flow.endcard;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f15411a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f15412b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15413c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f15414d = new g();

    public final b a() {
        int i10 = this.f15413c;
        if (i10 >= 0) {
            return (b) this.f15411a.get(i10);
        }
        return null;
    }

    public final b a(com.fyber.inneractive.sdk.model.vast.i iVar) {
        for (b bVar : this.f15412b) {
            if (bVar.i() == iVar) {
                return bVar;
            }
        }
        return null;
    }

    public final void a(b bVar) {
        if (((bVar instanceof o) || (bVar instanceof d)) && this.f15411a.contains(bVar)) {
            return;
        }
        this.f15411a.add(bVar);
        this.f15411a.sort(this.f15414d);
    }
}
