package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.gm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2892gm extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2917hm f24459c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2892gm(C2917hm c2917hm, rj.c cVar) {
        super(cVar);
        this.f24459c = c2917hm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24457a = obj;
        this.f24458b |= Integer.MIN_VALUE;
        return this.f24459c.emit(null, this);
    }
}
