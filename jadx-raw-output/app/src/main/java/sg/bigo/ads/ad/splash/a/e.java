package sg.bigo.ads.ad.splash.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.q;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.p;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private i f69172l;

    public e(@NonNull sg.bigo.ads.api.core.f fVar, @NonNull m mVar, @Nullable m mVar2, @NonNull sg.bigo.ads.ad.splash.b bVar) {
        super(fVar, mVar, mVar2, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:92:0x034e  */
    @Override // sg.bigo.ads.ad.splash.a.b, sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z10, @NonNull ViewGroup viewGroup, int i10) {
        int i11;
        boolean z11;
        T t10;
        MediaView.a aVarB;
        boolean z12;
        super.a(z10, viewGroup, i10);
        if (!z10) {
            View viewFindViewWithTag = viewGroup.findViewWithTag("adview_background_second_tag");
            if (viewFindViewWithTag instanceof ImageView) {
                viewGroup.removeView(viewFindViewWithTag);
                return;
            }
            return;
        }
        if (this.f69172l == null) {
            w wVar = new w();
            m mVar = this.f69121c;
            if (mVar != null) {
                wVar.f69008f = mVar.c("video_play_page.media_view_clickable_switch");
                wVar.f69010h = this.f69121c.c("video_play_page.ad_component_clickable_switch");
                wVar.f69009g = this.f69121c.c("video_play_page.other_space_clickable_switch");
                wVar.f69011i = this.f69121c.a("video_play_page.click_type");
                wVar.f69014l = this.f69121c.c("layer.other_space_clickable_switch");
                wVar.f69015m = this.f69121c.a("layer.click_type");
                wVar.f69003a = false;
                wVar.f69004b = 0;
                wVar.f69005c = this.f69121c.a("video_play_page.force_staying_time");
                wVar.f69006d = this.f69121c.c("layer.is_show_layer");
                wVar.f69007e = this.f69121c.a("layer.force_staying_time");
                wVar.f69012j = this.f69121c.a("video_play_page.auto_click");
                wVar.f69016n = this.f69121c.a("video_play_page.time_for_auto_click", -1);
                wVar.f69017o = this.f69121c.a("video_play_page.time_for_show_backup", -1);
            } else {
                wVar.f69012j = 1;
                wVar.f69003a = this.f69120b.c("interstitial_video_style.video_play_page.is_global_click");
                wVar.f69004b = this.f69120b.a("interstitial_video_style.video_play_page.impression_close_seconds");
                wVar.f69005c = this.f69120b.a("interstitial_video_style.video_play_page.close_click_seconds");
                wVar.f69006d = this.f69120b.c("interstitial_video_style.video_play_page.is_jump_layer");
                wVar.f69007e = this.f69120b.a("interstitial_video_style.layer.impression_layer_close_seconds");
            }
            sg.bigo.ads.ad.b.b bVar = this.f69126h.f69249z;
            m mVar2 = this.f69121c;
            if (mVar2 == null) {
                mVar2 = this.f69120b;
            }
            this.f69172l = new i(bVar, viewGroup, wVar, sg.bigo.ads.ad.interstitial.multi_img.b.c(bVar, mVar2));
        }
        final i iVar = this.f69172l;
        Context context = iVar.f69214m.getContext();
        List<String> listA = iVar.f69210h.a();
        sg.bigo.ads.ad.interstitial.multi_img.b bVar2 = iVar.f69210h;
        boolean z13 = bVar2.f68656e;
        sg.bigo.ads.ad.interstitial.multi_img.d dVar = bVar2.f68653b;
        sg.bigo.ads.ad.interstitial.multi_img.c cVar = bVar2.f68655d;
        p pVarA = r.a(iVar.f69213l);
        iVar.f69205c = (ViewFlow) iVar.f69214m.findViewById(R.id.inter_media_ad_view_flow);
        iVar.f69206d = (Indicator) iVar.f69214m.findViewById(R.id.vf_indicator);
        m mVar3 = iVar.f69210h.f68652a;
        int iA = mVar3 == null ? 1 : sg.bigo.ads.ad.interstitial.multi_img.e.a(mVar3.a("video_play_page.background_colour"));
        if (iA == 4 || iA == 5) {
            iVar.f69208f = new sg.bigo.ads.ad.interstitial.multi_img.a(iVar.f69214m, iVar.f69205c, iVar.f69215n, iA);
        }
        int i12 = iA;
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar3 = new sg.bigo.ads.ad.interstitial.multi_img.view.b(context, cVar, false, iVar.d(), i12);
        iVar.f69209g = bVar3;
        iVar.f69207e = bVar3.f68733j;
        ((MediaView) bVar3.f68735l).setImageBlurBorder(false);
        iVar.f69209g.a(pVarA.f69806b, pVarA.f69807c);
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar4 = iVar.f69209g;
        bVar4.f68742s = true;
        if (bVar4.c()) {
            if (((sg.bigo.ads.core.a.a) iVar.f69213l.f()).aR()) {
                Set<sg.bigo.ads.ad.interstitial.multi_img.view.d> set = i.f69204j;
                synchronized (set) {
                    set.add(iVar.f69209g);
                }
            }
            if (iVar.f69208f != null) {
                iVar.f69209g.f68741r = new sg.bigo.ads.ad.interstitial.multi_img.view.d.a() { // from class: sg.bigo.ads.ad.splash.a.i.4
                    public AnonymousClass4() {
                    }

                    @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                    public final void a() {
                        i.this.f69208f.a(i.this.f69205c.a(i.this.f69209g.f68733j));
                    }

                    @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                    public final void b() {
                        i.this.f69209g.f68741r = null;
                        a();
                    }
                };
            }
        }
        iVar.f69205c.setDividerWidth(sg.bigo.ads.common.utils.e.a(context, dVar.f68680f));
        iVar.f69205c.setContentMaxWidthSpace(sg.bigo.ads.common.utils.e.a(context, dVar.f68683i));
        iVar.f69205c.setViewStyle(dVar.f68684j);
        iVar.f69205c.setOnItemChangeListener(new sg.bigo.ads.ad.interstitial.multi_img.f(dVar, iVar.f69206d, iVar.f69208f));
        int i13 = 0;
        int i14 = 0;
        while (i13 < listA.size()) {
            String str = listA.get(i13);
            if (!TextUtils.isEmpty(str) && URLUtil.isNetworkUrl(str)) {
                i14++;
                iVar.a(context, cVar, i12, str, ((sg.bigo.ads.core.a.a) iVar.f69213l.f()).al());
            }
            i13++;
            dVar = dVar;
            z13 = z13;
        }
        sg.bigo.ads.ad.interstitial.multi_img.d dVar2 = dVar;
        if (z13) {
            i14++;
            final sg.bigo.ads.ad.interstitial.multi_img.view.a aVarA = iVar.a(context, cVar, i12, null, false);
            sg.bigo.ads.ad.splash.a.a(iVar.f69213l, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.splash.a.i.5

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ sg.bigo.ads.ad.interstitial.multi_img.view.a f69225a;

                public AnonymousClass5() {
                    aVar = aVarA;
                }

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 != null) {
                        aVar.a(bitmap2);
                    }
                }
            });
        }
        sg.bigo.ads.ad.interstitial.multi_img.d dVar3 = sg.bigo.ads.ad.interstitial.multi_img.d.CENTER;
        int i15 = dVar2 == dVar3 ? i14 >> 1 : 0;
        ViewFlow.b bVar5 = new ViewFlow.b();
        bVar5.f70196a = pVarA.f69806b;
        bVar5.f70197b = pVarA.f69807c;
        bVar5.f70198c = true;
        bVar5.f70199d = cVar.f68672d;
        iVar.f69205c.addView(iVar.f69207e, Math.max(0, i15), bVar5);
        int i16 = i.AnonymousClass2.f69222a[dVar2.ordinal()];
        int i17 = 3;
        if (i16 == 1 || i16 == 2 || i16 == 3 || i16 == 4) {
            ViewFlow.d dVar4 = new ViewFlow.d() { // from class: sg.bigo.ads.ad.splash.a.i.9
                public AnonymousClass9() {
                }

                @Override // sg.bigo.ads.common.view.ViewFlow.d
                public final void a() {
                    i.this.f69213l.a((sg.bigo.ads.common.i) null, 8, 29);
                }
            };
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context, true);
            iVar.f69216o = cVar2;
            iVar.f69205c.setStartView(cVar2.f68720a);
            iVar.f69205c.setOnStartViewShowListener(dVar4);
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar3 = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context, false);
            iVar.f69217p = cVar3;
            iVar.f69205c.setEndView(cVar3.f68720a);
            iVar.f69205c.setOnEndViewShowListener(dVar4);
        }
        int iA2 = dVar2 == dVar3 ? iVar.f69205c.a(iVar.f69207e) : 0;
        iVar.f69205c.b(iA2);
        sg.bigo.ads.ad.interstitial.multi_img.a aVar = iVar.f69208f;
        if (aVar != null) {
            aVar.b(iA2);
        }
        MediaView mediaView = (MediaView) iVar.f69209g.f68735l;
        sg.bigo.ads.ad.b.b bVar6 = iVar.f69213l;
        bVar6.H = iVar.f69211i.f69011i;
        bVar6.a(iVar.f69214m, mediaView, (ImageView) null, (AdOptionsView) null, (List<View>) null, 8, null);
        int i18 = iVar.f69211i.f69011i;
        View viewFindViewById = iVar.f69214m.findViewById(R.id.inter_media_container);
        sg.bigo.ads.ad.b.a.a(viewFindViewById, 9);
        sg.bigo.ads.ad.b.a.a(iVar.f69205c, 9);
        if (iVar.f69211i.f69009g) {
            sg.bigo.ads.ad.interstitial.multi_img.view.b bVar7 = iVar.f69209g;
            if (bVar7 != null) {
                ((MediaView) bVar7.f68735l).setOtherClickAreaClick(true);
            }
            sg.bigo.ads.ad.b.a.a(iVar.f69214m, viewFindViewById, 8, iVar.f69213l, i18);
            sg.bigo.ads.ad.b.a.a(iVar.f69214m, iVar.f69205c, 8, iVar.f69213l, i18);
        } else {
            sg.bigo.ads.ad.interstitial.multi_img.view.b bVar8 = iVar.f69209g;
            if (bVar8 != null) {
                i11 = 0;
                ((MediaView) bVar8.f68735l).setOtherClickAreaClick(false);
            } else {
                i11 = 0;
            }
            ViewGroup viewGroup2 = iVar.f69214m;
            sg.bigo.ads.core.adview.h hVar = q.F;
            sg.bigo.ads.ad.b.a.a(viewGroup2, viewFindViewById, 8, hVar, i11);
            sg.bigo.ads.ad.b.a.a(iVar.f69214m, iVar.f69205c, 8, hVar, i11);
        }
        if (iVar.e()) {
            i17 = i18;
            z11 = false;
        } else {
            int iA3 = iVar.f69210h.f68652a.a("video_play_page.multi_click_type");
            if (iA3 == 2) {
                z11 = false;
            } else if (iA3 != 3) {
                i17 = i18;
                z11 = false;
            } else {
                z11 = i18 == 1 || i18 == 2;
            }
        }
        boolean z14 = iVar.f69211i.f69008f;
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar9 = iVar.f69209g;
        if (bVar9 != null && (t10 = bVar9.f68735l) != 0) {
            ViewGroup viewGroup3 = iVar.f69214m;
            sg.bigo.ads.ad.b.b bVar10 = iVar.f69213l;
            if (z11) {
                sg.bigo.ads.ad.b.a.a(viewGroup3, t10, 8, bVar10, iVar.f69212k);
            } else {
                sg.bigo.ads.ad.b.a.a(viewGroup3, t10, 8, bVar10, i17);
            }
            if (z14) {
                ((MediaView) iVar.f69209g.f68735l).setMediaAreaClickable(true);
                aVarB = ((MediaView) iVar.f69209g.f68735l).b();
                z12 = false;
            } else {
                ((MediaView) iVar.f69209g.f68735l).setMediaAreaClickable(false);
                aVarB = ((MediaView) iVar.f69209g.f68735l).b();
                z12 = true;
            }
            aVarB.a(z12);
        }
        Iterator<View> it = iVar.f69205c.getItems().iterator();
        while (it.hasNext()) {
            Object tag = it.next().getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.f68727e);
            if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
                sg.bigo.ads.ad.interstitial.multi_img.view.d dVar5 = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
                sg.bigo.ads.ad.b.a.a(dVar5.f68733j, 5);
                ViewGroup viewGroup4 = iVar.f69214m;
                RoundedFrameLayout roundedFrameLayout = dVar5.f68733j;
                if (z14) {
                    sg.bigo.ads.ad.b.b bVar11 = iVar.f69213l;
                    if (z11) {
                        sg.bigo.ads.ad.b.a.a(viewGroup4, roundedFrameLayout, 8, bVar11, iVar.f69212k);
                    } else {
                        sg.bigo.ads.ad.b.a.a(viewGroup4, roundedFrameLayout, 8, bVar11, i17);
                    }
                } else {
                    sg.bigo.ads.ad.b.a.a(viewGroup4, roundedFrameLayout, 8, q.F, 0);
                }
            }
        }
        iVar.f();
        a(this.f69172l.f69218q);
        m mVar4 = this.f69121c;
        if (mVar4 != null) {
            int iA4 = mVar4.a("video_play_page.background_colour");
            TextView textView = (TextView) viewGroup.findViewById(R.id.bigo_ad_splash_title);
            if (textView != null) {
                this.f69172l.f69215n.b(textView);
            }
            if (1 == iA4) {
                this.f69172l.f69215n.a(-1);
                i iVar2 = this.f69172l;
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar4 = iVar2.f69216o;
                if (cVar4 != null) {
                    cVar4.a(false);
                }
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar5 = iVar2.f69217p;
                if (cVar5 != null) {
                    cVar5.a(false);
                }
                i iVar3 = this.f69172l;
                int iB = sg.bigo.ads.common.utils.q.b("#80202124", -7829368);
                Indicator indicator = iVar3.f69206d;
                if (indicator != null) {
                    indicator.setColorSelected(ViewCompat.MEASURED_STATE_MASK);
                    iVar3.f69206d.setColor(iB);
                }
            }
        }
    }

    @Override // sg.bigo.ads.ad.splash.a.b, sg.bigo.ads.ad.splash.a.c
    public final void c() {
        super.c();
        i iVar = this.f69172l;
        if (iVar != null) {
            iVar.f69218q = null;
            this.f69172l = null;
        }
    }

    @Override // sg.bigo.ads.ad.splash.a.b
    public final int e() {
        return R.layout.bigo_ad_splash_style_3_multi_img;
    }
}
