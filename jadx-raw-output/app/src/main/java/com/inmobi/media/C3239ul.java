package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: com.inmobi.media.ul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3239ul extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public XmlPullParser f25490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f25491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bk.l f25492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f25493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Fl f25494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25495f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3239ul(Fl fl2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25494e = fl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25493d = obj;
        this.f25495f |= Integer.MIN_VALUE;
        return this.f25494e.a((XmlPullParser) null, (String) null, (bk.l) null, this);
    }
}
