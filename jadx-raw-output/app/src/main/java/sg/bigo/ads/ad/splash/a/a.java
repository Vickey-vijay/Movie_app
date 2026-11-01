package sg.bigo.ads.ad.splash.a;

import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.ad.splash.b f69105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ViewGroup f69106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f69107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final m f69108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final ViewGroup f69109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f69110f;

    public a(@NonNull ViewGroup viewGroup, @NonNull sg.bigo.ads.ad.splash.b bVar, @Nullable m mVar) {
        sg.bigo.ads.ad.b.b bVar2;
        AdOptionsView adOptionsView;
        ImageView imageView;
        int i10;
        int iA;
        char c10;
        this.f69107c = c.a.f69155a;
        this.f69108d = mVar;
        this.f69109e = viewGroup;
        this.f69105a = bVar;
        ViewGroup viewGroup2 = (ViewGroup) sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), (mVar == null || mVar.a("endpage.guide_click") != 4) ? R.layout.bigo_ad_splash_endpage1 : R.layout.bigo_ad_splash_endpage1_slide, null, false);
        this.f69106b = viewGroup2;
        this.f69107c = c.a.f69157c;
        ArrayList arrayList = new ArrayList();
        final ImageView imageView2 = (ImageView) viewGroup2.findViewById(R.id.inter_icon);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.inter_title);
        TextView textView2 = (TextView) viewGroup2.findViewById(R.id.inter_description);
        Button button = (Button) viewGroup2.findViewById(R.id.bigo_ad_splash_btn_cta);
        AdOptionsView adOptionsView2 = (AdOptionsView) viewGroup2.findViewById(R.id.inter_options);
        sg.bigo.ads.ad.b.b bVar3 = bVar.f69249z;
        sg.bigo.ads.api.core.b.d popPage = bVar3.getPopPage();
        if (textView != null) {
            textView.setTag(2);
            sg.bigo.ads.ad.splash.a.a(textView, bVar3.getTitle(), popPage == null ? "" : popPage.b());
            arrayList.add(textView);
        }
        if (textView2 != null) {
            textView2.setTag(6);
            sg.bigo.ads.ad.splash.a.a(textView2, bVar3.getDescription(), popPage == null ? "" : popPage.c());
            arrayList.add(textView2);
        }
        if (button != null) {
            button.setTag(7);
            sg.bigo.ads.ad.splash.a.a(button, bVar3.getCallToAction(), "");
            arrayList.add(button);
            if (mVar != null) {
                int iA2 = r.a(bVar3, mVar.a("endpage.cta_color"), null);
                if (button.getBackground() instanceof GradientDrawable) {
                    ((GradientDrawable) button.getBackground()).setColor(iA2);
                }
            }
        }
        if (adOptionsView2 != null) {
            adOptionsView2.setTag(4);
            adOptionsView2.a(bVar3.f(), ((sg.bigo.ads.core.a.a) bVar3.f()).l());
        }
        if (imageView2 != null) {
            String strC = ((sg.bigo.ads.core.a.a) bVar3.f()).av() != null ? ((sg.bigo.ads.core.a.a) bVar3.f()).av().c() : null;
            imageView2.setTag(1);
            if (q.a((CharSequence) strC) || !URLUtil.isNetworkUrl(strC)) {
                a(imageView2);
            } else {
                sg.bigo.ads.common.p.e.b(bVar.f67537b.f69380e, null, strC, ((sg.bigo.ads.core.a.a) bVar3.f()).al(), new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.splash.a.a.1
                    @Override // sg.bigo.ads.common.p.g
                    public final void a(int i11, @NonNull String str, String str2) {
                        a.this.a(imageView2);
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
                        imageView2.setImageBitmap(bitmap);
                    }
                });
            }
        }
        View viewFindViewById = viewGroup2.findViewById(R.id.layout_contain_view);
        if (viewFindViewById == null || mVar == null) {
            bVar2 = bVar3;
            adOptionsView = adOptionsView2;
            imageView = imageView2;
            i10 = 4;
            iA = 1;
        } else {
            iA = mVar.a("endpage.click_type", 1);
            adOptionsView = adOptionsView2;
            imageView = imageView2;
            sg.bigo.ads.ad.splash.a.a(viewGroup2, viewFindViewById, mVar.a("endpage.below_area_dp"), mVar.a("endpage.below_area_clickable") == 1, mVar.a("endpage.up_area_dp"), mVar.a("endpage.up_area_clickable") == 1, 9, iA, bVar3);
            bVar2 = bVar3;
            i10 = 4;
            if (imageView != null) {
                sg.bigo.ads.ad.b.a.a(viewGroup, imageView, 4, bVar2, iA);
            }
        }
        if (mVar == null || 1 != mVar.a("endpage.other_space_clickable_switch", 1)) {
            c10 = 0;
            sg.bigo.ads.ad.b.a.a(viewGroup, viewGroup2, i10, new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.splash.a.a.2
                @Override // sg.bigo.ads.core.adview.h
                public final void a(int i11, int i12, int i13, int i14, int i15, int i16) {
                }
            }, 0);
        } else {
            sg.bigo.ads.ad.b.a.a(viewGroup, viewGroup2, i10, bVar2, iA);
            c10 = 0;
        }
        bVar2.H = 9;
        View[] viewArr = new View[1];
        viewArr[c10] = viewGroup2;
        bVar2.a(viewGroup, (MediaView) null, imageView, adOptionsView, (List<View>) arrayList, 9, viewArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final ImageView imageView) {
        sg.bigo.ads.ad.splash.a.a(this.f69105a.f69249z, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.splash.a.a.3
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                final Bitmap bitmap2 = bitmap;
                imageView.post(new Runnable() { // from class: sg.bigo.ads.ad.splash.a.a.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        imageView.setImageBitmap(bitmap2);
                    }
                });
            }
        });
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a() {
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z10) {
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Type inference failed for: r9v8, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z10, @NonNull ViewGroup viewGroup, int i10) {
        boolean z11;
        if (!this.f69110f) {
            this.f69110f = true;
            this.f69109e.removeViewAt(1);
            this.f69109e.addView(this.f69106b, 1, new ViewGroup.LayoutParams(-1, -1));
            this.f69106b.setVisibility(8);
        }
        this.f69107c = z10 ? c.a.f69156b : c.a.f69157c;
        int i11 = 0;
        this.f69106b.setVisibility(z10 ? 0 : 8);
        if (z10) {
            sg.bigo.ads.ad.splash.a.f69077b = true;
            m mVar = this.f69108d;
            int iA = mVar != null ? mVar.a("endpage.guide_click") : 0;
            ViewGroup viewGroup2 = (ViewGroup) this.f69106b.findViewById(R.id.bigo_ad_splash_btn_cta_container);
            Button button = (Button) this.f69106b.findViewById(R.id.bigo_ad_splash_btn_cta);
            if (viewGroup2 != null) {
                if (iA == 4 && button != null) {
                    button.setTextSize(2, 15.0f);
                    button.setBackground(null);
                    View viewFindViewById = this.f69106b.findViewById(R.id.splash_footer_bg);
                    if (viewFindViewById != null) {
                        viewFindViewById.setVisibility(0);
                        viewFindViewById.setTag(14);
                        sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewById, 8, this.f69105a.f69249z, 0);
                    }
                }
                sg.bigo.ads.ad.splash.a.b(viewGroup2, iA);
            }
            View viewFindViewById2 = this.f69106b.findViewById(R.id.layout_playable_loading);
            if (viewFindViewById2 != null) {
                g gVar = this.f69105a.f69248y;
                if (gVar == null) {
                    z11 = false;
                } else {
                    if (gVar.f69197g != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    m mVar2 = this.f69108d;
                    int i12 = (sg.bigo.ads.api.a.i.f69318a.p().a() && 2 == (mVar2 != null ? mVar2.a("endpage.ad_component_layout") : 1)) ? 1 : 0;
                    viewFindViewById2.setVisibility(i12 == 0 ? 4 : 0);
                    i11 = i12;
                }
            }
            sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) this.f69105a.f69249z.f(), i11 != 0 ? 4 : 1, i10);
        }
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void b() {
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void c() {
        this.f69107c = c.a.f69158d;
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    @NonNull
    public final int d() {
        return this.f69107c;
    }
}
