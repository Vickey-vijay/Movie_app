package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class Ah extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f22369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f22370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f22371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bh f22372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22373e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ah(Bh bh2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22372d = bh2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22371c = obj;
        this.f22373e |= Integer.MIN_VALUE;
        return this.f22372d.a((Ne) null, (List) null, this);
    }
}
