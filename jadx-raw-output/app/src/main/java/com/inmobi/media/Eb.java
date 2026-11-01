package com.inmobi.media;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class Eb extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f22578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f22580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Jb f22581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22582e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eb(Jb jb2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22581d = jb2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22580c = obj;
        this.f22582e |= Integer.MIN_VALUE;
        return this.f22581d.a((C3130qb) null, this);
    }
}
