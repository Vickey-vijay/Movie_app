package sg.bigo.ads.ad.interstitial.multi_img;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f68642a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewFlow f68645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f68646e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final sg.bigo.ads.ad.interstitial.d f68649h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f68643b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f68644c = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f68647f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f68648g = Float.MIN_VALUE;

    public a(ViewGroup viewGroup, ViewFlow viewFlow, sg.bigo.ads.ad.interstitial.d dVar, int i10) {
        this.f68642a = viewGroup;
        this.f68645d = viewFlow;
        this.f68649h = dVar;
        this.f68646e = i10;
    }

    public static void a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
        a(viewGroup, "adview_background_main_tag", bitmapDrawable);
        a(viewGroup, "adview_background_second_tag", bitmapDrawable2);
    }

    public static void a(ViewGroup viewGroup, Object obj, BitmapDrawable bitmapDrawable) {
        View viewFindViewWithTag = viewGroup.findViewWithTag(obj);
        ImageView imageView = null;
        if (viewFindViewWithTag instanceof ImageView) {
            imageView = (ImageView) viewFindViewWithTag;
        } else {
            Context context = viewGroup.getContext();
            if (context != null) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setTag(obj);
                imageView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                u.a(imageView2, viewGroup, null, 0);
                imageView = imageView2;
            }
        }
        if (imageView != null) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageDrawable(bitmapDrawable);
        }
    }

    public final void a(final int i10) {
        if (this.f68647f) {
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = a.this;
                    int i11 = i10;
                    if (i11 == aVar.f68643b && i11 == aVar.f68644c) {
                        aVar.b(i11);
                    }
                }
            });
        }
    }

    public final void a(sg.bigo.ads.ad.interstitial.multi_img.view.d dVar, float f10, int i10) {
        if (i10 != this.f68643b) {
            return;
        }
        boolean zD = dVar.d(this.f68646e);
        int i11 = zD ? dVar.f68737n : dVar.f68738o;
        this.f68648g = f10;
        this.f68644c = f10 > 0.0f ? i10 - 1 : i10 + 1;
        Integer numValueOf = null;
        View viewA = this.f68645d.a(this.f68644c);
        if (viewA != null) {
            Object tag = viewA.getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.f68727e);
            if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
                sg.bigo.ads.ad.interstitial.multi_img.view.d dVar2 = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
                numValueOf = Integer.valueOf(zD ? dVar2.f68737n : dVar2.f68738o);
            }
        }
        int iA = this.f68649h.a(sg.bigo.ads.common.w.b.a(Math.abs(f10), i11, numValueOf == null ? i11 : numValueOf.intValue()));
        if (zD) {
            this.f68642a.setBackgroundColor(iA);
        }
    }

    public final void b(int i10) {
        if (this.f68647f) {
            View viewA = this.f68645d.a(i10);
            Object tag = viewA.getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.f68727e);
            if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
                sg.bigo.ads.ad.interstitial.multi_img.view.d dVar = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
                this.f68643b = i10;
                this.f68648g = Float.MIN_VALUE;
                this.f68644c = i10;
                if (dVar.d(this.f68646e)) {
                    this.f68642a.setBackgroundColor(this.f68649h.a(dVar.f68737n));
                    return;
                }
                if (dVar.c(this.f68646e)) {
                    this.f68649h.a(dVar.f68738o);
                    Bitmap bitmap = dVar.f68739p;
                    int i11 = dVar.f68740q;
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(viewA.getResources(), bitmap);
                    bitmapDrawable.setAlpha(i11);
                    ViewGroup viewGroup = this.f68642a;
                    if (bitmap == null) {
                        bitmapDrawable = null;
                    }
                    a(viewGroup, bitmapDrawable, (BitmapDrawable) null);
                }
            }
        }
    }
}
