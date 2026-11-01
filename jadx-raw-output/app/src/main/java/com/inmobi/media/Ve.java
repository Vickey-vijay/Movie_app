package com.inmobi.media;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class Ve extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f23701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2782cf f23703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23704e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ve(C2782cf c2782cf, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23703d = c2782cf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23702c = obj;
        this.f23704e |= Integer.MIN_VALUE;
        return this.f23703d.b(this);
    }
}
