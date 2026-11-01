package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.vl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3264vl extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f25588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fl f25590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25591d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3264vl(Fl fl2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25590c = fl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25589b = obj;
        this.f25591d |= Integer.MIN_VALUE;
        return this.f25590c.a((String) null, (ArrayList) null, this);
    }
}
