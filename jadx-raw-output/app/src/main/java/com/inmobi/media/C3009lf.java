package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3009lf extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdConfig.OmidConfig f24770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f24771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3109pf f24773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24774e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3009lf(C3109pf c3109pf, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f24773d = c3109pf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24772c = obj;
        this.f24774e |= Integer.MIN_VALUE;
        return this.f24773d.a(this);
    }
}
