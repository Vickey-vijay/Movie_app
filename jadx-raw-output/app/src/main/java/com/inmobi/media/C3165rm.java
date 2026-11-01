package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.rm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3165rm extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdConfig.VastVideoConfig f25280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25282c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25281b = obj;
        this.f25282c |= Integer.MIN_VALUE;
        return AbstractC3290wm.a(null, 0.0d, null, this);
    }

    public C3165rm(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }
}
