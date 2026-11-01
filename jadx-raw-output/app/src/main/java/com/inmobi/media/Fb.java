package com.inmobi.media;

import android.content.Context;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class Fb extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f22633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f22634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f22635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Jb f22636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22637e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fb(Jb jb2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22636d = jb2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22635c = obj;
        this.f22637e |= Integer.MIN_VALUE;
        return this.f22636d.a((Context) null, this);
    }
}
