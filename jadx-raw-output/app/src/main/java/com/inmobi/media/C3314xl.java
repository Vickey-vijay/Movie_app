package com.inmobi.media;

import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: com.inmobi.media.xl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3314xl extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f25739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f25740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Fl f25741d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3314xl(Fl fl2, rj.c cVar, Ref$BooleanRef ref$BooleanRef, XmlPullParser xmlPullParser) {
        super(1, cVar);
        this.f25739b = xmlPullParser;
        this.f25740c = ref$BooleanRef;
        this.f25741d = fl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        XmlPullParser xmlPullParser = this.f25739b;
        return new C3314xl(this.f25741d, cVar, this.f25740c, xmlPullParser);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return ((C3314xl) create((rj.c) obj)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f25738a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            String name = this.f25739b.getName();
            if (ck.p.e(name, VastTagName.IN_LINE)) {
                Ref$BooleanRef ref$BooleanRef = this.f25740c;
                if (!ref$BooleanRef.element) {
                    ref$BooleanRef.element = true;
                    this.f25741d.g(this.f25739b);
                }
            } else if (ck.p.e(name, VastTagName.WRAPPER)) {
                Ref$BooleanRef ref$BooleanRef2 = this.f25740c;
                if (!ref$BooleanRef2.element) {
                    ref$BooleanRef2.element = true;
                    Fl fl2 = this.f25741d;
                    XmlPullParser xmlPullParser = this.f25739b;
                    this.f25738a = 1;
                    if (Fl.c(fl2, xmlPullParser, this) == objF) {
                        return objF;
                    }
                }
            } else {
                Fl fl3 = this.f25741d;
                XmlPullParser xmlPullParser2 = this.f25739b;
                fl3.getClass();
                Fl.w(xmlPullParser2);
            }
        }
        return mj.r.f64562a;
    }
}
