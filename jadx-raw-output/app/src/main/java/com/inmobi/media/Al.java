package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes6.dex */
public final class Al extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Ref$BooleanRef f22377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Ref$BooleanRef f22378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f22379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Fl f22380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22381e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Al(Fl fl2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22380d = fl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22379c = obj;
        this.f22381e |= Integer.MIN_VALUE;
        return Fl.b(this.f22380d, (XmlPullParser) null, this);
    }
}
