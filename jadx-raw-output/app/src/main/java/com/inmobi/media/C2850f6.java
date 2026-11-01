package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2850f6 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Ak f24342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C2773c6 f24343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f24348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f24349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C3000l6 f24350i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f24351j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2850f6(C3000l6 c3000l6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24350i = c3000l6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24349h = obj;
        this.f24351j |= Integer.MIN_VALUE;
        return C3000l6.a(this.f24350i, false, (ContinuationImpl) this);
    }
}
