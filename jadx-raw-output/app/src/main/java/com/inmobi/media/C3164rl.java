package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.rl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3164rl extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Je f25276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3189sl f25278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25279e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3164rl(C3189sl c3189sl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25278d = c3189sl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25277c = obj;
        this.f25279e |= Integer.MIN_VALUE;
        return this.f25278d.a(null, this);
    }
}
