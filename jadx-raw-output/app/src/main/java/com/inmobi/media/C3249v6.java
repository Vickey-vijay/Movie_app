package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.OmSdkInfo;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.v6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3249v6 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f25531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OmSdkInfo f25532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC3274w6 f25534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25535e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3249v6(AbstractC3274w6 abstractC3274w6, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25534d = abstractC3274w6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25533c = obj;
        this.f25535e |= Integer.MIN_VALUE;
        return this.f25534d.a(null, this);
    }
}
