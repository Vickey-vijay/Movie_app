package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes6.dex */
public final class Q0 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f23351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AdResponse f23352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f23353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f23356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ R0 f23357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23358h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(R0 r10, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23357g = r10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23356f = obj;
        this.f23358h |= Integer.MIN_VALUE;
        return this.f23357g.a(null, null, this);
    }
}
