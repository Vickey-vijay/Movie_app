package com.inmobi.media;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2748b7 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f24042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3026m7 f24044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24045e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2748b7(C3026m7 c3026m7, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24044d = c3026m7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24043c = obj;
        this.f24045e |= Integer.MIN_VALUE;
        return this.f24044d.b(this);
    }
}
