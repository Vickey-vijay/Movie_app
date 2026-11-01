package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.vd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3256vd extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3281wd f25567c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3256vd(C3281wd c3281wd, rj.c cVar) {
        super(cVar);
        this.f25567c = c3281wd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25565a = obj;
        this.f25566b |= Integer.MIN_VALUE;
        return this.f25567c.emit(null, this);
    }
}
