package com.inmobi.media;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.media.U;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Result;

/* JADX INFO: loaded from: classes8.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC2785ci f23593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f23594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N f23596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3028m9 f23597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f23598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public L f23599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public E6 f23600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final nk.l0 f23601i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f23602j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public kotlinx.coroutines.g f23603k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public xo f23604l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final O f23605m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f23606n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final T f23607o;

    public static final M a(U u10) {
        Pair pair;
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        RectF rectF4;
        u10.getClass();
        Rect rect = new Rect();
        if (u10.f23593a.getRootView() == null || u10.f23593a.getVisibility() != 0 || !u10.f23606n || !u10.f23593a.getGlobalVisibleRect(rect)) {
            return null;
        }
        Context context = u10.f23598f;
        ck.p.i(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(context, "<this>");
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            pair = new Pair(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
        } catch (Exception unused) {
            pair = new Pair(0, 0);
        }
        int iIntValue = ((Number) pair.component1()).intValue();
        int iIntValue2 = ((Number) pair.component2()).intValue();
        Rect rect2 = new Rect();
        if (!u10.f23593a.getLocalVisibleRect(rect2) || rect2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        View rootView = u10.f23593a.getRootView();
        Set set = u10.f23594b;
        if (rootView instanceof ViewGroup) {
            ArrayList arrayList2 = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.push(rootView);
            boolean z10 = false;
            while (!arrayDeque.isEmpty()) {
                View view = (View) arrayDeque.pop();
                if (view.getVisibility() == 0) {
                    if (ck.p.e(view, u10.f23593a)) {
                        z10 = true;
                    } else if (!set.contains(view)) {
                        Rect rect3 = new Rect();
                        if (view.getLocalVisibleRect(rect3) && !rect3.isEmpty()) {
                            Rect rect4 = new Rect();
                            boolean globalVisibleRect = view.getGlobalVisibleRect(rect4);
                            if (ck.p.e(view, u10.f23593a) || (globalVisibleRect && rect4.intersect(rect))) {
                                C3298x5.f25687a.getClass();
                                boolean z11 = !C3298x5.w() || view.getZ() >= u10.f23593a.getZ();
                                if (z10 && z11) {
                                    arrayList2.add(rect4);
                                }
                                if (view instanceof ViewGroup) {
                                    ViewGroup viewGroup = (ViewGroup) view;
                                    for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                                        arrayDeque.push(viewGroup.getChildAt(childCount));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            L l10 = u10.f23599g;
            if (l10 != null && (rectF4 = l10.f23032b) != null) {
                a(rect, arrayList2, rectF4);
            }
            L l11 = u10.f23599g;
            if (l11 != null && (rectF3 = l11.f23032b) != null) {
                a(rect, arrayList2, rectF3);
            }
            L l12 = u10.f23599g;
            if (l12 != null && (rectF2 = l12.f23033c) != null) {
                a(rect, arrayList2, rectF2);
            }
            L l13 = u10.f23599g;
            if (l13 != null && (rectF = l13.f23034d) != null) {
                a(rect, arrayList2, rectF);
            }
            if (arrayList2.size() == 1) {
                arrayList.add(new RectF((Rect) arrayList2.get(0)));
            } else {
                Region region = new Region();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    region.op((Rect) it.next(), Region.Op.UNION);
                }
                RegionIterator regionIterator = new RegionIterator(region);
                Rect rect5 = new Rect();
                while (regionIterator.next(rect5)) {
                    arrayList.add(new RectF(rect5));
                }
            }
        }
        return new M(new RectF(rect2), arrayList, iIntValue, iIntValue2);
    }

    public static final mj.r b(U u10) {
        u10.getClass();
        C3298x5.f25687a.getClass();
        if (C3298x5.s()) {
            u10.f23604l = new xo(u10.f23593a, u10.f23607o, u10.f23597e);
        } else {
            InterfaceC3028m9 interfaceC3028m9 = u10.f23597e;
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).c("AdExposureTracker", "Cannot calculate curved areas for this Android OS");
            }
        }
        u10.f23603k = F3.a(u10.f23601i, 0L, u10.f23595c, new S(u10, null));
        return mj.r.f64562a;
    }

    public U(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, Set set, long j10, N n10, InterfaceC3028m9 interfaceC3028m9) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "adView");
        ck.p.j(set, "friendlyViews");
        ck.p.j(n10, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f23593a = gestureDetectorOnGestureListenerC2785ci;
        this.f23594b = set;
        this.f23595c = j10;
        this.f23596d = n10;
        this.f23597e = interfaceC3028m9;
        this.f23598f = gestureDetectorOnGestureListenerC2785ci.getContext();
        this.f23601i = A9.f22352d;
        this.f23602j = new AtomicBoolean(false);
        this.f23605m = new O(this);
        this.f23607o = new T(this);
    }

    public static final mj.r c(U u10) {
        kotlinx.coroutines.g gVar = u10.f23603k;
        if (gVar != null) {
            kotlinx.coroutines.g.a.a(gVar, null, 1, null);
        }
        xo xoVar = u10.f23604l;
        if (xoVar != null) {
            xoVar.a();
        }
        u10.f23604l = null;
        u10.f23603k = null;
        E6 e10 = new E6(0.0f, null, null);
        if (!ck.p.e(e10, u10.f23600h)) {
            ((Sh) u10.f23596d).a(e10);
            u10.f23600h = e10;
        }
        return mj.r.f64562a;
    }

    public final void b(View view) {
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        InterfaceC3028m9 interfaceC3028m9 = this.f23597e;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c("AdExposureTracker", "Removing friendly view: " + view);
        }
        this.f23594b.remove(view);
    }

    public final void b() {
        InterfaceC3028m9 interfaceC3028m9;
        if (this.f23602j.compareAndSet(true, false)) {
            Object objA = H3.a(new bk.a() { // from class: b7.k4
                @Override // bk.a
                public final Object invoke() {
                    return U.c(this.f5015b);
                }
            });
            Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objA);
            if (thM3461exceptionOrNullimpl != null && (interfaceC3028m9 = this.f23597e) != null) {
                ((C3053n9) interfaceC3028m9).b("AdExposureTracker", "Error stopping exposure tracking - " + thM3461exceptionOrNullimpl.getMessage());
            }
            Result.m3457boximpl(objA);
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f23597e;
        if (interfaceC3028m10 != null) {
            ((C3053n9) interfaceC3028m10).c("AdExposureTracker", "Exposure tracking is already stopped");
        }
    }

    public final void a() {
        if (this.f23602j.compareAndSet(false, true)) {
            Object objA = H3.a(new bk.a() { // from class: b7.j4
                @Override // bk.a
                public final Object invoke() {
                    return U.b(this.f4999b);
                }
            });
            Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objA);
            if (thM3461exceptionOrNullimpl != null) {
                InterfaceC3028m9 interfaceC3028m9 = this.f23597e;
                if (interfaceC3028m9 != null) {
                    ((C3053n9) interfaceC3028m9).b("AdExposureTracker", "Error starting exposure tracking - " + thM3461exceptionOrNullimpl.getMessage());
                }
                this.f23602j.set(false);
                mj.g gVar = P9.f23321a;
                P9.a(new L2(thM3461exceptionOrNullimpl));
            }
            Result.m3457boximpl(objA);
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f23597e;
        if (interfaceC3028m10 != null) {
            ((C3053n9) interfaceC3028m10).c("AdExposureTracker", "Exposure tracking is already started");
        }
    }

    public final void a(View view) {
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        InterfaceC3028m9 interfaceC3028m9 = this.f23597e;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).c("AdExposureTracker", "Adding friendly view: " + view);
        }
        this.f23594b.add(view);
    }

    public final void a(Throwable th2) {
        InterfaceC3028m9 interfaceC3028m9 = this.f23597e;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).b("AdExposureTracker", "Error calculating exposure metrics - " + th2.getMessage());
        }
    }

    public static final void a(Rect rect, ArrayList arrayList, RectF rectF) {
        if (rectF.intersect(new RectF(rect))) {
            arrayList.add(new Rect(F3.b(rectF.left), F3.b(rectF.top), F3.b(rectF.right), F3.b(rectF.bottom)));
        }
    }
}
