package com.inmobi.media;

import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes6.dex */
public final class Bl extends SuspendLambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XmlPullParser f22430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fl f22431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f22432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f22433e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bl(XmlPullParser xmlPullParser, Fl fl2, Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, rj.c cVar) {
        super(1, cVar);
        this.f22430b = xmlPullParser;
        this.f22431c = fl2;
        this.f22432d = ref$BooleanRef;
        this.f22433e = ref$BooleanRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(rj.c cVar) {
        return new Bl(this.f22430b, this.f22431c, this.f22432d, this.f22433e, cVar);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return ((Bl) create((rj.c) obj)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z10;
        Object objF = sj.a.f();
        int i10 = this.f22429a;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            String name = this.f22430b.getName();
            if (ck.p.e(name, VastTagName.ERROR)) {
                C3257ve c3257veA = this.f22431c.a("error", this.f22430b);
                if (c3257veA != null) {
                    this.f22431c.f22674h.add(c3257veA);
                }
            } else if (ck.p.e(name, VastTagName.AD)) {
                Fl fl2 = this.f22431c;
                XmlPullParser xmlPullParser = this.f22430b;
                fl2.getClass();
                try {
                    z10 = Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "conditionalAd"));
                } catch (Exception unused) {
                    z10 = false;
                }
                if (z10) {
                    this.f22432d.element = true;
                    Fl fl3 = this.f22431c;
                    XmlPullParser xmlPullParser2 = this.f22430b;
                    fl3.getClass();
                    Fl.w(xmlPullParser2);
                    return mj.r.f64562a;
                }
                Ref$BooleanRef ref$BooleanRef = this.f22433e;
                if (ref$BooleanRef.element) {
                    Fl fl4 = this.f22431c;
                    XmlPullParser xmlPullParser3 = this.f22430b;
                    fl4.getClass();
                    Fl.w(xmlPullParser3);
                    return mj.r.f64562a;
                }
                ref$BooleanRef.element = true;
                Fl fl5 = this.f22431c;
                XmlPullParser xmlPullParser4 = this.f22430b;
                this.f22429a = 1;
                if (Fl.a(fl5, xmlPullParser4, this) == objF) {
                    return objF;
                }
            } else {
                Fl fl6 = this.f22431c;
                XmlPullParser xmlPullParser5 = this.f22430b;
                fl6.getClass();
                Fl.w(xmlPullParser5);
            }
        }
        return mj.r.f64562a;
    }
}
