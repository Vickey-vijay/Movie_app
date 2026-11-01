package com.fyber.inneractive.sdk.model.vast;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements com.fyber.inneractive.sdk.response.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15873b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PriorityQueue f15875d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f15877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PriorityQueue f15878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Comparator f15879h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.endcard.k f15886o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v f15887p;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f15876e = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15880i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15881j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f15882k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f15883l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f15884m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f15885n = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f15874c = new HashMap();

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        HashMap map;
        if (xVar == null || (map = this.f15874c) == null) {
            return null;
        }
        return (List) map.get(xVar);
    }

    public b(com.fyber.inneractive.sdk.flow.vast.g gVar, com.fyber.inneractive.sdk.flow.vast.d dVar) {
        this.f15875d = new PriorityQueue(1, gVar);
        this.f15879h = dVar;
        this.f15878g = new PriorityQueue(1, dVar);
    }

    public final void a(x xVar, String str) {
        List arrayList = (List) this.f15874c.get(xVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f15874c.put(xVar, arrayList);
        }
        arrayList.add(str);
    }
}
