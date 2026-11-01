package com.inmobi.media;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2809dg extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f24241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2834eg f24243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24244d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2809dg(C2834eg c2834eg, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24243c = c2834eg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24242b = obj;
        this.f24244d |= Integer.MIN_VALUE;
        return this.f24243c.a((String) null, this);
    }
}
