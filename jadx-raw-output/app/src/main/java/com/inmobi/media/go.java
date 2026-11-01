package com.inmobi.media;

import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes9.dex */
public final class go extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f24461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC3028m9 f24462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f24463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f24464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ne f24465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f24466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f24467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ jo f24468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24469i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go(jo joVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24468h = joVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24467g = obj;
        this.f24469i |= Integer.MIN_VALUE;
        return this.f24468h.a(null, null, this);
    }
}
