package com.inmobi.media;

import android.widget.ImageView;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: renamed from: com.inmobi.media.sj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3187sj extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f25343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f25344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Ref$BooleanRef f25345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f25346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3287wj f25347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25348f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3187sj(C3287wj c3287wj, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25347e = c3287wj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25346d = obj;
        this.f25348f |= Integer.MIN_VALUE;
        return this.f25347e.a((List) null, (ImageView) null, this);
    }
}
