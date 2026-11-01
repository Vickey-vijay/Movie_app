package com.inmobi.media;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.zh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3360zh extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f25849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pk.n f25851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f25852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ne f25853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f25854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Iterator f25855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f25856h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25857i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25858j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25859k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f25860l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f25861m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f25862n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f25863o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Bh f25864p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f25865q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3360zh(Bh bh2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25864p = bh2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25863o = obj;
        this.f25865q |= Integer.MIN_VALUE;
        return this.f25864p.a(null, null, null, null, null, this);
    }
}
