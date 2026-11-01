package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: com.inmobi.media.yl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3339yl extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Ref$BooleanRef f25810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fl f25812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25813d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3339yl(Fl fl2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25812c = fl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25811b = obj;
        this.f25813d |= Integer.MIN_VALUE;
        return this.f25812c.a((XmlPullParser) null, this);
    }
}
