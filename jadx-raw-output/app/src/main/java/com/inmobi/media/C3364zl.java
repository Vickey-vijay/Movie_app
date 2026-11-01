package com.inmobi.media;

import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: com.inmobi.media.zl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3364zl extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f25869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f25870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Fl f25871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3364zl(Fl fl2, rj.c cVar, Ref$BooleanRef ref$BooleanRef, XmlPullParser xmlPullParser) {
        super(1, cVar);
        this.f25869b = xmlPullParser;
        this.f25870c = ref$BooleanRef;
        this.f25871d = fl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        XmlPullParser xmlPullParser = this.f25869b;
        return new C3364zl(this.f25871d, cVar, this.f25870c, xmlPullParser);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return ((C3364zl) create((rj.c) obj)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25868a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            if (ck.p.e(this.f25869b.getName(), VastTagName.VAST)) {
                this.f25870c.element = true;
                Fl fl2 = this.f25871d;
                XmlPullParser xmlPullParser = this.f25869b;
                this.f25868a = 1;
                if (Fl.b(fl2, xmlPullParser, this) == objF) {
                    return objF;
                }
            }
        }
        return mj.r.f64562a;
    }
}
