package sg.bigo.ads.ad.interstitial.multi_img;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ViewFlow.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final d f68690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Indicator f68691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final a f68692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ValueCallback<Integer> f68693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f68694e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f68695f;

    public f(@NonNull d dVar, @Nullable Indicator indicator, @Nullable a aVar) {
        this.f68690a = dVar;
        this.f68691b = indicator;
        this.f68692c = aVar;
    }

    public static void a(ViewFlow viewFlow, ValueCallback<Integer> valueCallback) {
        if (viewFlow == null || valueCallback == null) {
            return;
        }
        ViewFlow.c onItemChangeListener = viewFlow.getOnItemChangeListener();
        if (onItemChangeListener instanceof f) {
            ((f) onItemChangeListener).f68693d = valueCallback;
        }
    }

    public static boolean a(ViewFlow viewFlow) {
        ViewFlow.c onItemChangeListener = viewFlow != null ? viewFlow.getOnItemChangeListener() : null;
        if (onItemChangeListener == null || !(onItemChangeListener instanceof f)) {
            return false;
        }
        return ((f) onItemChangeListener).f68694e;
    }

    @Override // sg.bigo.ads.common.view.ViewFlow.c
    public final void a(int i10) {
        Indicator indicator = this.f68691b;
        if (indicator == null || i10 <= 1) {
            return;
        }
        if (indicator.getType() != 1) {
            this.f68691b.setNum(i10);
        } else {
            Indicator indicator2 = this.f68691b;
            indicator2.setLineLength(Indicator.a(i10, indicator2.getDistance(), this.f68691b.getRadius(), this.f68691b.getLengthSelected()));
        }
        this.f68691b.setVisibility(0);
    }

    @Override // sg.bigo.ads.common.view.ViewFlow.c
    public final void a(int i10, int i11) {
        Indicator indicator = this.f68691b;
        if (indicator == null || indicator.getType() != 1) {
            return;
        }
        float fMin = Math.min(1.0f, Math.max(0.0f, (i10 * 1.0f) / i11));
        Indicator indicator2 = this.f68691b;
        if (indicator2.f70076a != fMin) {
            indicator2.f70076a = Math.max(0.0f, Math.min(1.0f, fMin));
            indicator2.invalidate();
        }
    }

    @Override // sg.bigo.ads.common.view.ViewFlow.c
    public final void a(@NonNull View view, int i10) {
        Indicator indicator = this.f68691b;
        if (indicator != null && indicator.getType() != 1) {
            this.f68691b.a(i10);
        }
        this.f68695f = i10;
        a aVar = this.f68692c;
        if (aVar != null) {
            aVar.b(i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
    @Override // sg.bigo.ads.common.view.ViewFlow.c
    public final void a(@NonNull View view, int i10, float f10) {
        ValueCallback<Integer> valueCallback;
        int i11;
        float f11 = this.f68690a.f68682h;
        float f12 = ((f10 < 0.0f ? 1.0f - f11 : f11 - 1.0f) * f10) + 1.0f;
        float f13 = this.f68690a.f68681g;
        float f14 = ((f10 < 0.0f ? 1.0f - f13 : f13 - 1.0f) * f10) + 1.0f;
        if (f10 < 0.0f) {
            view.setPivotX(view.getWidth());
        } else {
            view.setPivotX(0.0f);
        }
        view.setPivotY(view.getHeight() / 2);
        view.setScaleX(f12);
        view.setScaleY(f12);
        view.setAlpha(Math.abs(f14));
        Indicator indicator = this.f68691b;
        if (indicator != null && indicator.getType() != 1) {
            this.f68691b.a(f10, i10);
        }
        a aVar = this.f68692c;
        if (aVar != null && aVar.f68647f) {
            if (f10 == 0.0f) {
                aVar.b(i10);
            } else {
                Object tag = aVar.f68645d.a(i10).getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.f68727e);
                if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
                    sg.bigo.ads.ad.interstitial.multi_img.view.d dVar = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
                    if (dVar.d(aVar.f68646e)) {
                        aVar.a(dVar, f10, i10);
                    } else if (dVar.c(aVar.f68646e)) {
                        if (i10 == aVar.f68643b) {
                            aVar.f68648g = f10;
                            float fMax = Math.max(Math.min(Math.abs(f10), 1.0f), 0.0f);
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(aVar.f68645d.getResources(), dVar.f68739p);
                            bitmapDrawable.setAlpha((int) (dVar.f68740q * (1.0f - fMax)));
                            aVar.f68644c = f10 > 0.0f ? i10 - 1 : i10 + 1;
                            Bitmap bitmap = null;
                            View viewA = aVar.f68645d.a(aVar.f68644c);
                            if (viewA != null) {
                                Object tag2 = viewA.getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.f68727e);
                                if (tag2 instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
                                    sg.bigo.ads.ad.interstitial.multi_img.view.d dVar2 = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag2;
                                    bitmap = dVar2.f68739p;
                                    i11 = (int) (dVar2.f68740q * fMax);
                                } else {
                                    i11 = 0;
                                }
                            } else {
                                i11 = 0;
                            }
                            BitmapDrawable bitmapDrawable2 = new BitmapDrawable(aVar.f68645d.getResources(), bitmap);
                            bitmapDrawable2.setAlpha(i11);
                            a.a(aVar.f68642a, bitmapDrawable, bitmapDrawable2);
                        }
                        aVar.a(dVar, f10, i10);
                    }
                }
            }
        }
        this.f68694e = this.f68695f == i10 && f10 != 0.0f;
        if (f10 != 0.0f || (valueCallback = this.f68693d) == null) {
            return;
        }
        valueCallback.onReceiveValue(Integer.valueOf(i10));
    }
}
