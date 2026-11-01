package com.inmobi.media;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.mm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3041mm extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3091om f24847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K3 f24848b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3041mm(C3091om c3091om, K3 k10, rj.c cVar) {
        super(2, cVar);
        this.f24847a = c3091om;
        this.f24848b = k10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new C3041mm(this.f24847a, this.f24848b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new C3041mm(this.f24847a, this.f24848b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ViewParent parent;
        FrameLayout frameLayout;
        String str;
        sj.a.f();
        kotlin.c.b(obj);
        C3053n9 c3053n9 = this.f24847a.f25012e;
        if (c3053n9 != null) {
            c3053n9.a("VideoExperienceManager", "Companion Ad Rendered");
        }
        ViewGroup viewGroup = this.f24847a.f25017j;
        if (viewGroup != null) {
            parent = viewGroup.getParent();
        } else {
            parent = null;
        }
        if (parent instanceof FrameLayout) {
            frameLayout = (FrameLayout) parent;
        } else {
            frameLayout = null;
        }
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        C3091om c3091om = this.f24847a;
        c3091om.f25017j = null;
        InterfaceC2830ec interfaceC2830ec = c3091om.f25015h;
        if (interfaceC2830ec == null) {
            ck.p.B("mediaPlayer");
            interfaceC2830ec = null;
        }
        Sd sd2 = (Sd) interfaceC2830ec;
        C3053n9 c3053n10 = sd2.f23507c;
        if (c3053n10 != null) {
            c3053n10.a("NativeMediaPlayer", "destroy called");
        }
        sd2.f23509e = EnumC3184sg.STATE_DESTROYED;
        P4.a(sd2.f23508d);
        sd2.f23515k.b();
        C2729ae c2729ae = sd2.f23513i;
        c2729ae.f23998g.removeAllViews();
        c2729ae.f23997f.c();
        sd2.f23514j.c();
        sd2.f23511g.removeAllViews();
        sd2.f23512h.release();
        if (frameLayout == null) {
            return null;
        }
        K3 k10 = this.f24848b;
        k10.getClass();
        ck.p.j(frameLayout, "parentView");
        if (!ck.p.e(k10.f22994i, L3.f23048a)) {
            P3 p10 = k10.f22994i;
            if (!ck.p.e(p10, M3.f23133a)) {
                if (!ck.p.e(p10, O3.f23266a)) {
                    if (ck.p.e(p10, N3.f23187a)) {
                        str = "Companion ad failed to load";
                    } else {
                        str = "Companion ad view is not available";
                    }
                } else {
                    str = "Companion ad is still loading";
                }
            } else {
                str = "Companion ad has not started loading";
            }
            throw new I3(str);
        }
        C3053n9 c3053n11 = k10.f22988c;
        if (c3053n11 != null) {
            c3053n11.a("CompanionAdManager", "renderCompanionView");
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(k10.f22991f, layoutParams);
        k10.b();
        C3040ml c3040ml = k10.f22992g;
        if (c3040ml != null) {
            List listY0 = nj.b0.y0(c3040ml.f24845b, c3040ml.f24846c);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listY0) {
                if (ck.p.e(((C3257ve) obj2).f25569b, "creativeView")) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(nj.t.v(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C3257ve) it.next()).f25568a);
            }
            Map mapA = AbstractC2939ik.a(k10.f22987b.f23673a);
            Wj wj2 = Wj.f23753a;
            Wj.b("CompanionAdRendered", mapA, EnumC2735ak.SDK);
            P4.a(k10.f22989d, k10.f22986a, new W3(arrayList2));
        }
        return mj.r.f64562a;
    }
}
