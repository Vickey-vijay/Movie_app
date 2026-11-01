package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: com.inmobi.media.wl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3289wl extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Ref$BooleanRef f25668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fl f25670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25671d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3289wl(Fl fl2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25670c = fl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25669b = obj;
        this.f25671d |= Integer.MIN_VALUE;
        return Fl.a(this.f25670c, (XmlPullParser) null, this);
    }
}
