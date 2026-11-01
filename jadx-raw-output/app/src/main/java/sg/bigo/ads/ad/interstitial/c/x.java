package sg.bigo.ads.ad.interstitial.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.api.MediaView;

/* JADX INFO: loaded from: classes5.dex */
public class x extends sg.bigo.ads.ad.d.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f68087k;

    public x(@NonNull sg.bigo.ads.ad.b.b bVar, sg.bigo.ads.api.a.m mVar) {
        super(bVar, mVar);
        this.f68087k = false;
    }

    private void a(final sg.bigo.ads.ad.interstitial.a.b.a aVar, @Nullable final View view, @Nullable final ViewGroup viewGroup, @Nullable final ViewGroup.LayoutParams layoutParams) {
        if (aVar == null || view == null || viewGroup == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        if (layoutParams2 != null && layoutParams2.height == -2) {
            layoutParams2.height = -1;
            sg.bigo.ads.common.utils.u.a(viewGroup, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.c.x.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    aVar.a(viewGroup.getWidth(), viewGroup.getHeight());
                    sg.bigo.ads.common.utils.u.a(view, viewGroup, layoutParams, -1);
                }
            });
        } else {
            if (layoutParams2 != null) {
                aVar.a(layoutParams2.width, layoutParams2.height);
            }
            sg.bigo.ads.common.utils.u.a(view, viewGroup, layoutParams, -1);
        }
    }

    public final int a(@NonNull final MediaView mediaView, @NonNull sg.bigo.ads.ad.interstitial.s sVar, boolean z10) {
        int i10;
        sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.d.f) this).f67669l;
        if ((mVar == null ? 1 : mVar.a("endpage.ad_component_layout")) == 1) {
            int width = mediaView.getWidth();
            int height = mediaView.getHeight();
            ViewGroup.LayoutParams layoutParams = mediaView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(width, height);
            } else {
                layoutParams.width = width;
                layoutParams.height = height;
            }
            mediaView.setLayoutParams(layoutParams);
        }
        this.f68087k = false;
        sg.bigo.ads.ad.interstitial.a.b bVar = sVar.C;
        if (bVar == null || bVar.f67857b || !bVar.f67856a) {
            i10 = 0;
        } else {
            if (bVar.b()) {
                View view = bVar.f67861f.f67801i;
                if (view != null) {
                    mediaView.removeAllViews();
                    a(bVar, view, mediaView, new FrameLayout.LayoutParams(-1, -1, 17));
                    view.setTag(19);
                    mediaView.setTag(19);
                    bVar.a(1);
                    this.f68087k = true;
                    sg.bigo.ads.common.t.a.a(0, 3, "PopupEndPageRender", "show playable");
                    i10 = 5;
                }
            } else {
                sg.bigo.ads.common.t.a.a(0, "PopupEndPageRender", "playableAdCompanion is not ResourceReady");
                bVar.f67861f.f();
            }
            i10 = 0;
        }
        if (i10 == 0) {
            sg.bigo.ads.ad.interstitial.a.a aVar = sVar.D;
            if (aVar == null || !aVar.f67788a) {
                i10 = 0;
            } else {
                if (aVar.b()) {
                    sg.bigo.ads.common.t.a.a(0, 3, "PopupEndPageRender", "[VastCompanion] companion resource is available and ready.");
                    View viewA = aVar.a();
                    if (viewA != null) {
                        sg.bigo.ads.ad.interstitial.c.b((ViewGroup) mediaView);
                        mediaView.removeAllViews();
                        sg.bigo.ads.common.t.a.a(0, 3, "PopupEndPageRender", "[VastCompanion] show companion end page view.");
                        a(aVar, viewA, mediaView, new FrameLayout.LayoutParams(-1, -1, 17));
                        viewA.setTag(20);
                        mediaView.setTag(20);
                        aVar.a(1);
                        sg.bigo.ads.common.t.a.a(0, 3, "PopupEndPageRender", "show companion");
                        this.f68087k = aVar.f67789b instanceof sg.bigo.ads.ad.interstitial.a.a.b;
                        i10 = 7;
                    }
                } else {
                    sg.bigo.ads.common.t.a.a(0, 3, "PopupEndPageRender", "[VastCompanion] companion resource is not available.");
                    aVar.f();
                }
                i10 = 0;
            }
        }
        if (i10 == 0 && z10) {
            sg.bigo.ads.core.a.a aVarF = sVar.f();
            if (aVarF.bh() != null) {
                ((sg.bigo.ads.ad.d.f) this).f67671n = (Bitmap) aVarF.bh().first;
                sg.bigo.ads.ad.interstitial.c.a((ViewGroup) mediaView);
                mediaView.removeAllViews();
                a((ViewGroup) mediaView);
                mediaView.a((Bitmap) aVarF.bh().first);
                sg.bigo.ads.common.t.a.a(0, 3, "PopupEndPageRender", "show backup end image");
            } else {
                sg.bigo.ads.ad.interstitial.a.b bVar2 = sVar.C;
                if (bVar2 != null && bVar2.b()) {
                    sg.bigo.ads.common.t.a.a(0, 3, "PopupEndPageRender", "video is not ready, endpage show HTML for backup.");
                    aVarF.j(3);
                    View view2 = bVar2.f67861f.f67801i;
                    if (view2 != null) {
                        sg.bigo.ads.ad.interstitial.c.b((ViewGroup) mediaView);
                        mediaView.removeAllViews();
                        a(bVar2, view2, mediaView, new FrameLayout.LayoutParams(-1, -1, 17));
                        view2.setTag(19);
                        mediaView.setTag(19);
                        bVar2.a(1);
                        sg.bigo.ads.common.t.a.a(0, 3, "PopupEndPageRender", "show backup end HTML");
                        this.f68087k = true;
                    }
                }
                i10 = 0;
            }
            i10 = 1;
        }
        if (i10 != 0) {
            return i10;
        }
        final ValueCallback<Bitmap> valueCallback = new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.c.x.1
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                final Bitmap bitmap2 = bitmap;
                if (bitmap2 == null || bitmap2.getWidth() <= 0 || bitmap2.getHeight() <= 0) {
                    return;
                }
                sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.x.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.this.f68940g = bitmap2;
                        sg.bigo.ads.ad.interstitial.c.a((ViewGroup) mediaView);
                        mediaView.removeAllViews();
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        x.this.a((ViewGroup) mediaView);
                        mediaView.a(bitmap2);
                    }
                });
            }
        };
        Bitmap bitmap = this.f68941h;
        if (bitmap != null) {
            valueCallback.onReceiveValue(bitmap);
        } else {
            a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.c.x.2
                @Override // android.webkit.ValueCallback
                public final /* bridge */ /* synthetic */ void onReceiveValue(Bitmap bitmap2) {
                    valueCallback.onReceiveValue(bitmap2);
                }
            });
        }
        sg.bigo.ads.common.t.a.a(0, 3, "PopupEndPageRender", "show normal style");
        return 1;
    }

    @Override // sg.bigo.ads.ad.d.f
    public final void a(Context context, final ViewGroup viewGroup) {
        final sg.bigo.ads.ad.d.f.b bVar = new sg.bigo.ads.ad.d.f.b(context, viewGroup);
        viewGroup.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.x.5
            @Override // java.lang.Runnable
            public final void run() {
                bVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
                bVar.setBackgroundColor(Color.parseColor("#66000000"));
                sg.bigo.ads.common.utils.u.a(bVar, viewGroup, null, 1);
            }
        });
    }

    @Override // sg.bigo.ads.ad.d.f
    public void a(final AdCountDownButton adCountDownButton, ViewGroup viewGroup, sg.bigo.ads.ad.d.f.a aVar) {
        super.a(adCountDownButton, viewGroup, aVar);
        if (adCountDownButton == null) {
            return;
        }
        if (adCountDownButton.getVisibility() == 0) {
            adCountDownButton.clearAnimation();
            adCountDownButton.setVisibility(4);
        }
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.x.4
            @Override // java.lang.Runnable
            public final void run() {
                if (adCountDownButton.getVisibility() == 4) {
                    adCountDownButton.setVisibility(0);
                }
            }
        }, ((long) m()) * 1000);
    }

    public final void c(@NonNull ViewGroup viewGroup) {
        sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.d.f) this).f67669l;
        boolean z10 = mVar != null && mVar.c("endpage.media_view_clickable_switch");
        sg.bigo.ads.api.a.m mVar2 = ((sg.bigo.ads.ad.d.f) this).f67669l;
        boolean z11 = mVar2 != null && mVar2.c("endpage.ad_component_clickable_switch");
        sg.bigo.ads.api.a.m mVar3 = ((sg.bigo.ads.ad.d.f) this).f67669l;
        boolean z12 = mVar3 != null && mVar3.c("endpage.other_space_clickable_switch");
        sg.bigo.ads.api.a.m mVar4 = ((sg.bigo.ads.ad.d.f) this).f67669l;
        a(viewGroup, z10, z11, z12, mVar4 != null ? mVar4.a("endpage.click_type") : 1);
    }

    @Override // sg.bigo.ads.ad.d.f
    public void d(ViewGroup viewGroup) {
        if (!this.f68087k || viewGroup == null) {
            super.d(viewGroup);
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_warning);
        if (textView != null) {
            textView.setVisibility(8);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.inter_popup_msg);
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
    }

    @Override // sg.bigo.ads.ad.d.f
    public final boolean j() {
        sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.d.f) this).f67669l;
        if (mVar == null) {
            return false;
        }
        return mVar.c("endpage.is_widget");
    }

    @Override // sg.bigo.ads.ad.d.f
    public final int k() {
        sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.d.f) this).f67669l;
        if (mVar == null) {
            return 1;
        }
        return mVar.a("endpage.close_button_style");
    }

    @Override // sg.bigo.ads.ad.d.f
    public final boolean l() {
        sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.d.f) this).f67669l;
        if (mVar == null) {
            return false;
        }
        return mVar.c("endpage.is_cta_show_animation");
    }

    public final int m() {
        sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.d.f) this).f67669l;
        if (mVar == null) {
            return 0;
        }
        return mVar.a("endpage.force_staying_time", 0);
    }

    public final int n() {
        sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.d.f) this).f67669l;
        if (mVar != null) {
            return mVar.a("endpage.webview_layout");
        }
        return 0;
    }

    public final int o() {
        sg.bigo.ads.api.a.m mVar = ((sg.bigo.ads.ad.d.f) this).f67669l;
        if (mVar != null) {
            return mVar.a("endpage.webview_force_time");
        }
        return 0;
    }
}
