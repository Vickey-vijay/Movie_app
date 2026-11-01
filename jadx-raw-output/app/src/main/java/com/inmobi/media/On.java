package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class On implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f23302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f23303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f23304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f23305d;

    public On(Sn sn2, AtomicBoolean atomicBoolean) {
        ck.p.j(sn2, "visibilityTracker");
        ck.p.j(atomicBoolean, "isPaused");
        this.f23302a = atomicBoolean;
        this.f23303b = new ArrayList();
        this.f23304c = new ArrayList();
        this.f23305d = new WeakReference(sn2);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0194  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        if (this.f23302a.get()) {
            return;
        }
        Sn sn2 = (Sn) this.f23305d.get();
        if (sn2 != null) {
            sn2.f23542k = false;
            for (Map.Entry entry : sn2.f23532a.entrySet()) {
                View view = (View) entry.getKey();
                Qn qn2 = (Qn) entry.getValue();
                int i10 = qn2.f23416a;
                View view2 = qn2.f23418c;
                byte b10 = sn2.f23534c;
                if (b10 == 1) {
                    C3051n7 c3051n7 = C3126q7.f25145k;
                    if (c3051n7.b(view2, view, i10) && c3051n7.a(view, view, i10)) {
                        this.f23303b.add(view);
                    } else {
                        this.f23304c.add(view);
                    }
                } else if (b10 == 2) {
                    C3051n7 c3051n8 = C3126q7.f25145k;
                    ck.p.h(c3051n8, "null cannot be cast to non-null type com.inmobi.ads.viewability.inmobi.HtmlPollingVisibilityTracker.HtmlVisibilityChecker");
                    boolean zB = c3051n8.b(view2, view, i10);
                    boolean zA = c3051n8.a(view, view, i10);
                    ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                    if (!(view instanceof GestureDetectorOnGestureListenerC2785ci)) {
                        z10 = false;
                        break;
                    }
                    Rect rect = new Rect();
                    if (!view.getGlobalVisibleRect(rect)) {
                        z10 = false;
                        break;
                    }
                    GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = (GestureDetectorOnGestureListenerC2785ci) view;
                    int[] iArr = new int[2];
                    gestureDetectorOnGestureListenerC2785ci.getLocationInWindow(iArr);
                    int[] viewableFrameArray = gestureDetectorOnGestureListenerC2785ci.getViewableFrameArray();
                    int i11 = iArr[0] + (viewableFrameArray != null ? viewableFrameArray[0] : 0);
                    int i12 = iArr[1] + (viewableFrameArray != null ? viewableFrameArray[1] : 0);
                    if (!rect.intersect(new Rect(i11, i12, i11 + (viewableFrameArray != null ? viewableFrameArray[2] : 0), (viewableFrameArray != null ? viewableFrameArray[3] : 0) + i12))) {
                        z10 = false;
                        break;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gestureDetectorOnGestureListenerC2785ci.getWidth(), gestureDetectorOnGestureListenerC2785ci.getHeight(), Bitmap.Config.ARGB_8888);
                    ck.p.i(bitmapCreateBitmap, "createBitmap(...)");
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, new Paint());
                    gestureDetectorOnGestureListenerC2785ci.draw(canvas);
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, F3.b(gestureDetectorOnGestureListenerC2785ci.getWidth() / J5.b()), F3.b(gestureDetectorOnGestureListenerC2785ci.getHeight() / J5.b()), true);
                    ck.p.i(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
                    int[] viewableFrameArray2 = gestureDetectorOnGestureListenerC2785ci.getViewableFrameArray();
                    int iMin = Math.min(bitmapCreateScaledBitmap.getWidth(), viewableFrameArray2 != null ? viewableFrameArray2[0] : 0);
                    int iMin2 = Math.min(bitmapCreateScaledBitmap.getHeight(), viewableFrameArray2 != null ? viewableFrameArray2[1] : 0);
                    int iMin3 = Math.min(viewableFrameArray2 != null ? viewableFrameArray2[2] : 0, bitmapCreateScaledBitmap.getWidth() - iMin);
                    int iMin4 = Math.min(viewableFrameArray2 != null ? viewableFrameArray2[3] : 0, bitmapCreateScaledBitmap.getHeight() - iMin2);
                    Bitmap bitmapCreateBitmap2 = (iMin3 <= 0 || iMin4 <= 0) ? null : Bitmap.createBitmap(bitmapCreateScaledBitmap, iMin, iMin2, iMin3, iMin4);
                    if (bitmapCreateBitmap2 == null) {
                        z10 = false;
                        break;
                    }
                    int height = bitmapCreateBitmap2.getHeight() * bitmapCreateBitmap2.getWidth();
                    int[] iArr2 = new int[height];
                    bitmapCreateBitmap2.getPixels(iArr2, 0, bitmapCreateBitmap2.getWidth(), 0, 0, bitmapCreateBitmap2.getWidth(), bitmapCreateBitmap2.getHeight());
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        if (i13 >= height) {
                            z10 = false;
                            break;
                        }
                        int i15 = iArr2[i13];
                        if (i15 > -16777216 && i15 < 0 && (i14 = i14 + 1) >= gestureDetectorOnGestureListenerC2785ci.getMinimumPixelsPainted()) {
                            z10 = true;
                            break;
                        }
                        i13++;
                    }
                    if (zB && zA && z10) {
                        this.f23303b.add(view);
                    } else {
                        this.f23304c.add(view);
                    }
                } else {
                    C3051n7 c3051n9 = C3126q7.f25145k;
                    if (c3051n9.b(view2, view, i10) && c3051n9.a(view, view, i10)) {
                        this.f23303b.add(view);
                    } else {
                        this.f23304c.add(view);
                    }
                }
            }
        }
        Pn pn2 = sn2 != null ? sn2.f23539h : null;
        if (pn2 != null) {
            pn2.a(this.f23303b, this.f23304c);
        }
        this.f23303b.clear();
        this.f23304c.clear();
        if (sn2 != null) {
            AbstractC3309xg abstractC3309xg = (AbstractC3309xg) sn2;
            if (abstractC3309xg.f23542k || abstractC3309xg.f23538g.get()) {
                return;
            }
            abstractC3309xg.f23542k = true;
            nk.j.d(A9.f22352d, null, null, new Rn(abstractC3309xg, null), 3, null);
        }
    }
}
