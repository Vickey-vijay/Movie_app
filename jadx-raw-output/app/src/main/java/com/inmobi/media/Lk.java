package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class Lk extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f23094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wk.a f23095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Mk f23097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23098e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lk(Mk mk2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23097d = mk2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23096c = obj;
        this.f23098e |= Integer.MIN_VALUE;
        return this.f23097d.a(null, this);
    }
}
