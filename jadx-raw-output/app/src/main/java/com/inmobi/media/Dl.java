package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes5.dex */
public final class Dl extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Ref$BooleanRef f22544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fl f22546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22547d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dl(Fl fl2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22546c = fl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22545b = obj;
        this.f22547d |= Integer.MIN_VALUE;
        return Fl.c(this.f22546c, null, this);
    }
}
