package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.sh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3185sh extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC3098p4 f25335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3210th f25337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25338d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3185sh(C3210th c3210th, rj.c cVar) {
        super(cVar);
        this.f25337c = c3210th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25336b = obj;
        this.f25338d |= Integer.MIN_VALUE;
        return this.f25337c.emit(null, this);
    }
}
