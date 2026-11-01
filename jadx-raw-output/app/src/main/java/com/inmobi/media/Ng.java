package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class Ng extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f23245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wk.a f23246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Og f23248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23249e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ng(Og og2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23248d = og2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23247c = obj;
        this.f23249e |= Integer.MIN_VALUE;
        return this.f23248d.a((JSONObject) null, this);
    }
}
