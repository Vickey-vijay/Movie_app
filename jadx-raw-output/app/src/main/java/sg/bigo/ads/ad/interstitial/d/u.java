package sg.bigo.ads.ad.interstitial.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.AutoNextLineLinearLayout;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX INFO: loaded from: classes7.dex */
public class u extends a {
    private Bitmap A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f68264x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public MediaView f68265y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f68266z;

    public u(@NonNull sg.bigo.ads.ad.b.b bVar) {
        super(bVar);
    }

    private RoundedFrameLayout a(@NonNull final ViewGroup viewGroup, @NonNull Context context, String str, Bitmap bitmap, int i10, final boolean z10, boolean z11) {
        final RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(context);
        roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 4));
        roundedFrameLayout.setStrokeWidth(sg.bigo.ads.common.utils.e.a(context, 1));
        roundedFrameLayout.setStrokeColor(sg.bigo.ads.common.utils.q.b("#08000000", -7829368));
        final AdImageView adImageView = new AdImageView(context);
        final int iA = sg.bigo.ads.common.utils.e.a(context, 200);
        adImageView.setBlurBorder(false);
        if (bitmap == null) {
            adImageView.setBackgroundColor(sg.bigo.ads.common.utils.q.b("#FFE1E1E6", -7829368));
            adImageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_icon_default_only_icon));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, iA);
            layoutParams.width = iA;
            layoutParams.height = iA;
            roundedFrameLayout.setLayoutParams(layoutParams);
            adImageView.setLayoutParams(new FrameLayout.LayoutParams(-2, iA));
            adImageView.a(new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.interstitial.d.u.5
                @Override // sg.bigo.ads.common.p.g
                public final void a(int i11, @NonNull String str2, String str3) {
                }

                @Override // sg.bigo.ads.common.p.g
                public final void a(@NonNull Bitmap bitmap2, @NonNull sg.bigo.ads.common.p.f fVar) {
                    if (((sg.bigo.ads.ad.interstitial.t) u.this).f68936c.f67543h) {
                        return;
                    }
                    adImageView.setBackground(null);
                    sg.bigo.ads.common.p pVarB = u.b(bitmap2, viewGroup, iA, z10);
                    ViewGroup.LayoutParams layoutParams2 = roundedFrameLayout.getLayoutParams();
                    layoutParams2.width = pVarB.getWidth();
                    layoutParams2.height = pVarB.getHeight();
                    roundedFrameLayout.setLayoutParams(layoutParams2);
                    ViewGroup.LayoutParams layoutParams3 = adImageView.getLayoutParams();
                    layoutParams3.width = pVarB.getWidth();
                    layoutParams3.height = pVarB.getHeight();
                    adImageView.setLayoutParams(layoutParams3);
                    if (z10) {
                        u.this.a(viewGroup, bitmap2, pVarB, iA);
                    }
                }
            });
            adImageView.a(str, ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.t) this).f68936c.f()).al());
        } else {
            sg.bigo.ads.common.p pVarB = b(bitmap, viewGroup, iA, z10);
            roundedFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(pVarB.getWidth(), pVarB.getHeight()));
            adImageView.setImageBitmap(bitmap);
            if (z10) {
                a(viewGroup, bitmap, pVarB, iA);
            }
        }
        adImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        roundedFrameLayout.addView(adImageView);
        if (i10 != 1 && i10 != 2) {
            sg.bigo.ads.ad.b.a.a(viewGroup, roundedFrameLayout, 8, ((sg.bigo.ads.ad.interstitial.t) this).f68936c, i10);
        }
        if (z11 && !z10) {
            sg.bigo.ads.common.e.a.a((View) roundedFrameLayout, 10);
            roundedFrameLayout.setBackgroundColor(-1);
        }
        return roundedFrameLayout;
    }

    private void a(@NonNull final View view, final int i10, final int i11) {
        view.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.ad.interstitial.d.u.6
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                sg.bigo.ads.ad.b.b bVar;
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    u.this.f68264x = motionEvent.getX();
                    u.this.f68266z = motionEvent.getY();
                    return !view.isScrollContainer();
                }
                if (actionMasked != 1) {
                    return false;
                }
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                boolean zA = sg.bigo.ads.common.utils.u.a(view, Math.round(u.this.f68264x), Math.round(u.this.f68266z));
                boolean zA2 = sg.bigo.ads.common.utils.u.a(view, Math.round(x10), Math.round(y10));
                Object tag = view.getTag();
                int iIntValue = i10;
                if (tag instanceof Integer) {
                    iIntValue = ((Integer) tag).intValue();
                }
                int i12 = iIntValue;
                int i13 = i11;
                if (2 == i13) {
                    if (zA && zA2) {
                        bVar = ((sg.bigo.ads.ad.interstitial.t) u.this).f68936c;
                    }
                    return false;
                }
                if (3 == i13 || 1 != i13 || !zA) {
                    return false;
                }
                bVar = ((sg.bigo.ads.ad.interstitial.t) u.this).f68936c;
                bVar.a(Math.round(x10), Math.round(y10), Math.round(u.this.f68264x), Math.round(u.this.f68266z), 8, i12);
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull final ViewGroup viewGroup, final Bitmap bitmap, sg.bigo.ads.common.p pVar, final int i10) {
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.fl_multi_container);
        if (frameLayout != null) {
            int i11 = viewGroup.getContext().getResources().getDisplayMetrics().widthPixels;
            int iA = sg.bigo.ads.common.utils.e.a(viewGroup.getContext(), 20);
            final int i12 = i11 - (iA * 2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            marginLayoutParams.leftMargin = iA;
            marginLayoutParams.rightMargin = iA;
            frameLayout.setLayoutParams(marginLayoutParams);
            if (pVar.getWidth() < i12) {
                final ImageView imageView = (ImageView) viewGroup.findViewById(R.id.iv_blur_bg);
                final View viewFindViewById = viewGroup.findViewById(R.id.iv_blur_bg_mask);
                if (imageView == null || bitmap == null) {
                    return;
                }
                sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.u.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        final Bitmap bitmapB = sg.bigo.ads.common.utils.d.b(viewGroup.getContext(), bitmap);
                        if (bitmapB == null || ((sg.bigo.ads.ad.interstitial.t) u.this).f68936c.f67543h) {
                            return;
                        }
                        imageView.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.u.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                imageView.setImageBitmap(bitmapB);
                                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                                AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                layoutParams.width = i12;
                                layoutParams.height = i10;
                                imageView.setLayoutParams(layoutParams);
                                View view = viewFindViewById;
                                if (view != null) {
                                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                                    AnonymousClass4 anonymousClass5 = AnonymousClass4.this;
                                    layoutParams2.width = i12;
                                    layoutParams2.height = i10;
                                    viewFindViewById.setLayoutParams(layoutParams2);
                                }
                            }
                        });
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull ViewGroup viewGroup, @Nullable String[] strArr, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Context context;
        int i15;
        FrameLayout.LayoutParams layoutParams;
        sg.bigo.ads.ad.interstitial.w wVar;
        sg.bigo.ads.ad.interstitial.w wVar2;
        sg.bigo.ads.api.a.m mVar = this.f68121t;
        int iA = mVar == null ? 0 : mVar.a("video_play_page.click_type");
        View view = (ScrollView) viewGroup.findViewById(R.id.native_view);
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) viewGroup.findViewById(R.id.bigo_ad_scroll_images);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(0);
        Context context2 = viewGroup.getContext();
        boolean z11 = strArr == null || strArr.length == 0 || strArr.length == 1;
        int i16 = 8;
        int i17 = -2;
        if (z11) {
            linearLayout.addView(a(viewGroup, context2, (strArr == null || 1 != strArr.length) ? "" : strArr[0], this.f68940g, iA, true, z10));
            i10 = -2;
            i11 = 8;
        } else {
            int iA2 = sg.bigo.ads.common.utils.e.a(context2, 20);
            int iA3 = sg.bigo.ads.common.utils.e.a(context2, 12);
            int i18 = 0;
            while (i18 < strArr.length) {
                String str = strArr[i18];
                if (TextUtils.isEmpty(str) || !URLUtil.isNetworkUrl(str)) {
                    i12 = i18;
                    i13 = iA2;
                    i14 = i17;
                    context = context2;
                    i15 = i16;
                } else {
                    i12 = i18;
                    int i19 = iA2;
                    context = context2;
                    i15 = i16;
                    RoundedFrameLayout roundedFrameLayoutA = a(viewGroup, context2, str, (Bitmap) null, iA, false, z10);
                    i14 = -2;
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.leftMargin = i12 == 0 ? i19 : iA3;
                    if (i12 + 1 == strArr.length) {
                        i13 = i19;
                        layoutParams2.rightMargin = i13;
                    } else {
                        i13 = i19;
                    }
                    linearLayout.addView(roundedFrameLayoutA, layoutParams2);
                    if (iA == 2) {
                        sg.bigo.ads.ad.b.a.a(viewGroup, roundedFrameLayoutA, i15, ((sg.bigo.ads.ad.interstitial.t) this).f68936c, iA);
                    }
                }
                i18 = i12 + 1;
                i17 = i14;
                iA2 = i13;
                i16 = i15;
                context2 = context;
            }
            i10 = i17;
            i11 = i16;
        }
        if (z11) {
            layoutParams = new FrameLayout.LayoutParams(i10, i10);
            layoutParams.gravity = 17;
        } else {
            layoutParams = new FrameLayout.LayoutParams(i10, sg.bigo.ads.common.utils.e.a(viewGroup.getContext(), 202));
        }
        horizontalScrollView.addView(linearLayout, layoutParams);
        if (iA == 3) {
            if (z11 && (wVar = this.f68120s) != null && wVar.f69008f) {
                horizontalScrollView.setTag(9);
                sg.bigo.ads.ad.b.a.a(viewGroup, horizontalScrollView, i11, ((sg.bigo.ads.ad.interstitial.t) this).f68936c, iA);
                return;
            }
            return;
        }
        if (z11 && (wVar2 = this.f68120s) != null && wVar2.f69008f) {
            horizontalScrollView.setTag(9);
            sg.bigo.ads.ad.b.a.a(viewGroup, horizontalScrollView, i11, ((sg.bigo.ads.ad.interstitial.t) this).f68936c, iA);
        } else {
            a(horizontalScrollView, 5, iA);
        }
        if (view != null) {
            a(view, 10, iA);
        }
    }

    public static /* synthetic */ void a(u uVar, final ViewGroup viewGroup) {
        final ImageView imageView = (ImageView) viewGroup.findViewById(R.id.iv_media_blur_bg);
        final View viewFindViewById = viewGroup.findViewById(R.id.iv_media_blur_bg_mask);
        if (uVar.f68265y == null || imageView == null || uVar.A == null) {
            return;
        }
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.u.2
            @Override // java.lang.Runnable
            public final void run() {
                final Bitmap bitmapB = sg.bigo.ads.common.utils.d.b(viewGroup.getContext(), u.this.A);
                if (bitmapB == null || ((sg.bigo.ads.ad.interstitial.t) u.this).f68936c.f67543h) {
                    return;
                }
                imageView.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.u.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        imageView.setImageBitmap(bitmapB);
                        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        int height = u.this.f68265y.getHeight();
                        layoutParams.height = height;
                        layoutParams.width = u.this.A();
                        imageView.setLayoutParams(layoutParams);
                        View view = viewFindViewById;
                        if (view != null) {
                            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                            layoutParams2.height = height;
                            layoutParams2.width = u.this.A();
                            viewFindViewById.setLayoutParams(layoutParams2);
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static sg.bigo.ads.common.p b(@NonNull Bitmap bitmap, @NonNull ViewGroup viewGroup, int i10, boolean z10) {
        int iA = sg.bigo.ads.common.utils.e.a(viewGroup.getContext(), 20);
        sg.bigo.ads.common.p pVarA = sg.bigo.ads.common.p.a(bitmap.getWidth(), bitmap.getHeight(), i10);
        if (!z10) {
            return pVarA;
        }
        if (pVarA.getWidth() >= viewGroup.getContext().getResources().getDisplayMetrics().widthPixels - iA) {
            return pVarA;
        }
        return sg.bigo.ads.common.p.a(bitmap.getWidth(), bitmap.getHeight(), i10 - iA);
    }

    public int A() {
        return -1;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final void a(double d10) {
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final void a(int i10) {
        ViewGroup viewGroup = this.f68118q;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(i10);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.t
    public final void a(@NonNull ViewGroup viewGroup, @NonNull View view, int i10, int i11, int i12, @Nullable View... viewArr) {
        super.a(viewGroup, view, i10, i11, i12, viewArr);
        MediaView mediaView = this.f68265y;
        if (mediaView != null) {
            mediaView.b().a(new sg.bigo.ads.core.player.b.b() { // from class: sg.bigo.ads.ad.interstitial.d.u.1
                @Override // sg.bigo.ads.core.player.b.b
                public final void a(Bitmap bitmap) {
                    if (((sg.bigo.ads.ad.interstitial.t) u.this).f68936c.f67543h || bitmap == null) {
                        return;
                    }
                    u uVar = u.this;
                    if (uVar.f68118q != null) {
                        uVar.A = bitmap;
                        u.this.f68118q.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.u.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                u uVar2 = u.this;
                                u.a(uVar2, uVar2.f68118q);
                            }
                        });
                    }
                }
            });
        }
        sg.bigo.ads.ad.interstitial.w wVar = this.f68120s;
        boolean z10 = false;
        int i13 = wVar != null ? wVar.f69011i : 0;
        View viewFindViewById = viewGroup.findViewById(R.id.inter_media_container);
        sg.bigo.ads.ad.b.a.a(viewFindViewById, 9);
        sg.bigo.ads.ad.interstitial.w wVar2 = this.f68120s;
        if (wVar2 == null || !wVar2.f69009g) {
            MediaView mediaView2 = this.f68265y;
            if (mediaView2 != null) {
                mediaView2.setOtherClickAreaClick(false);
            }
            if (viewFindViewById != null) {
                sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewById, 8, sg.bigo.ads.ad.interstitial.q.F, 0);
            }
        } else {
            MediaView mediaView3 = this.f68265y;
            if (mediaView3 != null) {
                mediaView3.setOtherClickAreaClick(true);
            }
            if (viewFindViewById != null) {
                sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewById, 8, ((sg.bigo.ads.ad.interstitial.t) this).f68936c, i13);
            }
        }
        sg.bigo.ads.ad.interstitial.w wVar3 = this.f68120s;
        if (wVar3 != null && wVar3.f69008f) {
            z10 = true;
        }
        MediaView mediaView4 = this.f68265y;
        if (mediaView4 != null) {
            sg.bigo.ads.ad.b.a.a(viewGroup, mediaView4, 8, ((sg.bigo.ads.ad.interstitial.t) this).f68936c, i13);
            this.f68265y.setMediaAreaClickable(z10);
            this.f68265y.b().a(!z10);
        }
    }

    public void a(@NonNull ViewGroup viewGroup, sg.bigo.ads.common.p pVar) {
        View viewFindViewById = viewGroup.findViewById(R.id.bigo_ad_mask_vertical);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        layoutParams.height = pVar.getHeight();
        viewFindViewById.setLayoutParams(layoutParams);
    }

    public void c(@NonNull ViewGroup viewGroup) {
        sg.bigo.ads.common.p pVarA = sg.bigo.ads.ad.interstitial.r.a(((sg.bigo.ads.ad.interstitial.t) this).f68936c);
        sg.bigo.ads.common.p pVarB = sg.bigo.ads.common.p.b(pVarA.getWidth(), pVarA.getHeight(), viewGroup.getContext().getResources().getDisplayMetrics().widthPixels);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.bigo_ad_material_container);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.topMargin = pVarB.getHeight() - sg.bigo.ads.common.utils.e.a(viewGroup.getContext(), 25);
        linearLayout.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f68265y.getLayoutParams();
        layoutParams2.height = pVarB.getHeight();
        this.f68265y.setLayoutParams(layoutParams2);
        a(viewGroup, pVarB);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final ViewGroup k() {
        return this.f68265y;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final MediaView l() {
        return this.f68265y;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    @Nullable
    public final Button m() {
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final void o() {
        int i10;
        u uVar = this;
        int iX = x();
        if (iX == 1) {
            uVar.a(-1);
        } else {
            uVar.a(ViewCompat.MEASURED_STATE_MASK);
        }
        int i11 = 0;
        final boolean z10 = iX == 1;
        final ViewGroup viewGroup = uVar.f68118q;
        if (viewGroup != null) {
            String[] strArrE = null;
            sg.bigo.ads.api.core.b.d popPage = ((sg.bigo.ads.ad.interstitial.t) uVar).f68936c.getPopPage();
            if (popPage != null && popPage.e() != null && popPage.e().length > 0) {
                strArrE = popPage.e();
            } else if (((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.t) uVar).f68936c.f()).ax() != null) {
                sg.bigo.ads.api.core.n.a[] aVarArrAx = ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.t) uVar).f68936c.f()).ax();
                String[] strArr = new String[aVarArrAx.length];
                for (int i12 = 0; i12 < aVarArrAx.length; i12++) {
                    strArr[i12] = aVarArrAx[i12].c();
                }
                strArrE = strArr;
            }
            boolean zIsEmpty = strArrE == null || strArrE.length == 0;
            if (strArrE != null && 1 == strArrE.length) {
                zIsEmpty = TextUtils.isEmpty(strArrE[0]);
            }
            if (zIsEmpty) {
                uVar.a(new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.d.u.3
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                        u.this.a(viewGroup, (String[]) null, z10);
                    }
                });
            } else {
                uVar.a(viewGroup, strArrE, z10);
            }
            ViewGroup viewGroup2 = uVar.f68118q;
            IconListView iconListView = (IconListView) viewGroup2.findViewById(R.id.download_msg_list);
            if (iconListView != null && uVar.f68122u != null) {
                iconListView.setThemeWhite(!z10);
                iconListView.a(uVar.f68122u);
                sg.bigo.ads.ad.b.a.a(viewGroup2, iconListView, 8, ((sg.bigo.ads.ad.interstitial.t) uVar).f68936c, 0);
            }
            ViewGroup viewGroup3 = uVar.f68118q;
            int i13 = z10 ? -16777216 : -1;
            int iB = z10 ? sg.bigo.ads.common.utils.q.b("#B3000000", ViewCompat.MEASURED_STATE_MASK) : sg.bigo.ads.common.utils.q.b("#B3FFFFFF", -1);
            ((TextView) viewGroup3.findViewById(R.id.inter_title)).setTextColor(i13);
            ((TextView) viewGroup3.findViewById(R.id.tv_gp_info_extra_about)).setTextColor(i13);
            ((TextView) viewGroup3.findViewById(R.id.inter_description)).setTextColor(iB);
            ((TextView) viewGroup3.findViewById(R.id.tv_desc_below)).setTextColor(iB);
            View viewFindViewById = uVar.f68118q.findViewById(R.id.bigo_ad_mask_vertical);
            GradientDrawable gradientDrawable = (GradientDrawable) viewFindViewById.getBackground();
            int[] iArr = {2105636, ViewCompat.MEASURED_STATE_MASK};
            if (z10) {
                // fill-array-data instruction
                iArr[0] = 16777215;
                iArr[1] = -1;
            }
            gradientDrawable.setColors(iArr);
            viewFindViewById.setBackground(gradientDrawable);
            ViewGroup viewGroup4 = uVar.f68118q;
            RoundedImageView roundedImageView = (RoundedImageView) viewGroup4.findViewById(R.id.inter_icon);
            if (roundedImageView != null) {
                roundedImageView.setCornerRadius(sg.bigo.ads.common.utils.e.a(viewGroup4.getContext(), 6));
            }
            if (uVar.f68123v != null) {
                int iF = ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.t) uVar).f68936c.f()).B() == null ? 0 : ((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.interstitial.t) uVar).f68936c.f()).B().f();
                if (iF > 0) {
                    float f10 = iF * 0.01f;
                    if (f10 > 0.15f) {
                        f10 = 0.15f;
                    }
                    int iRound = Math.round(sg.bigo.ads.common.utils.e.c(uVar.f68123v.getContext()) * f10);
                    ViewGroup.LayoutParams layoutParams = uVar.f68123v.getLayoutParams();
                    layoutParams.height = iRound;
                    uVar.f68123v.setLayoutParams(layoutParams);
                } else {
                    uVar.f68123v.setVisibility(8);
                }
                uVar.f68123v.setTextColor(z10 ? sg.bigo.ads.common.utils.q.b("#4D202124", ViewCompat.MEASURED_STATE_MASK) : sg.bigo.ads.common.utils.q.b("#4DFFFFFF", -1));
            }
            Button button = (Button) uVar.f68118q.findViewById(R.id.inter_btn_cta);
            ViewGroup viewGroup5 = (ViewGroup) uVar.f68118q.findViewById(R.id.inter_btn_cta_layout);
            if (button != null && viewGroup5 != null) {
                ViewGroup viewGroup6 = uVar.f68118q;
                a.C0679a c0679aU = u();
                sg.bigo.ads.ad.interstitial.d.b(button, c0679aU.f68146a);
                if (v()) {
                    sg.bigo.ads.ad.interstitial.c.e(viewGroup5);
                }
                TextView textView = (TextView) viewGroup6.findViewById(R.id.inter_company);
                if (textView != null) {
                    textView.setTextColor(c0679aU.f68146a);
                }
            }
            sg.bigo.ads.api.core.b.d popPage2 = ((sg.bigo.ads.ad.interstitial.t) uVar).f68936c.getPopPage();
            if (popPage2 == null || popPage2.d() == null) {
                return;
            }
            ViewGroup viewGroup7 = uVar.f68118q;
            AutoNextLineLinearLayout autoNextLineLinearLayout = (AutoNextLineLinearLayout) viewGroup7.findViewById(R.id.fbl_genre);
            String[] strArrD = popPage2.d();
            try {
                Context context = viewGroup7.getContext();
                int iA = sg.bigo.ads.common.utils.e.a(context, 1);
                int iA2 = sg.bigo.ads.common.utils.e.a(context, 5);
                int iA3 = sg.bigo.ads.common.utils.e.a(context, 12);
                int iA4 = sg.bigo.ads.common.utils.e.a(context, 14);
                int iA5 = sg.bigo.ads.common.utils.e.a(context, 28);
                int iB2 = z10 ? sg.bigo.ads.common.utils.q.b("#B3000000", ViewCompat.MEASURED_STATE_MASK) : sg.bigo.ads.common.utils.q.b("#B3FFFFFF", -1);
                int iB3 = z10 ? sg.bigo.ads.common.utils.q.b("#26202124", ViewCompat.MEASURED_STATE_MASK) : sg.bigo.ads.common.utils.q.b("#26FFFFFF", -1);
                int i14 = 0;
                while (i14 < strArrD.length) {
                    String str = strArrD[i14];
                    if (TextUtils.isEmpty(str)) {
                        i10 = i11;
                    } else {
                        TextView textView2 = new TextView(context);
                        textView2.setText(str);
                        textView2.setTextColor(iB2);
                        textView2.setTextSize(13.0f);
                        textView2.setPadding(iA3, iA2, iA3, iA2);
                        textView2.setGravity(17);
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        gradientDrawable2.setShape(i11);
                        gradientDrawable2.setStroke(iA, iB3);
                        gradientDrawable2.setCornerRadius(iA4);
                        textView2.setBackground(gradientDrawable2);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, iA5);
                        layoutParams2.topMargin = iA3;
                        layoutParams2.rightMargin = iA3;
                        textView2.setTag(27);
                        i10 = 0;
                        sg.bigo.ads.ad.b.a.a(viewGroup7, textView2, 8, ((sg.bigo.ads.ad.interstitial.t) uVar).f68936c, 0);
                        autoNextLineLinearLayout.addView(textView2, layoutParams2);
                    }
                    i14++;
                    uVar = this;
                    i11 = i10;
                    iB3 = iB3;
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.d.a
    public final void t() {
        super.t();
        ViewGroup viewGroup = this.f68118q;
        if (viewGroup != null) {
            MediaView mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media);
            this.f68265y = mediaView;
            mediaView.setImageBlurBorder(false);
            c(this.f68118q);
            TextView textView = (TextView) this.f68118q.findViewById(R.id.tv_desc_below);
            if (textView != null) {
                sg.bigo.ads.api.core.b.d popPage = ((sg.bigo.ads.ad.interstitial.t) this).f68936c.getPopPage();
                String strC = popPage != null ? popPage.c() : "";
                if (TextUtils.isEmpty(strC)) {
                    strC = ((sg.bigo.ads.ad.interstitial.t) this).f68936c.getDescription();
                }
                if (TextUtils.isEmpty(strC)) {
                    strC = sg.bigo.ads.common.utils.a.a(j(), R.string.bigo_ad_description_default, new Object[0]);
                }
                textView.setText(strC);
                textView.setTag(6);
                sg.bigo.ads.ad.b.a.a(this.f68118q, textView, 8, ((sg.bigo.ads.ad.interstitial.t) this).f68936c, 0);
            }
            TextView textView2 = (TextView) this.f68118q.findViewById(R.id.tv_gp_info_extra_about);
            if (textView2 != null) {
                textView2.setTag(27);
                sg.bigo.ads.ad.b.a.a(this.f68118q, textView2, 8, ((sg.bigo.ads.ad.interstitial.t) this).f68936c, 0);
            }
            ImageView imageView = (ImageView) this.f68118q.findViewById(R.id.iv_gp_info_extra_arrow);
            if (imageView != null) {
                imageView.setTag(27);
                sg.bigo.ads.ad.b.a.a(this.f68118q, imageView, 8, ((sg.bigo.ads.ad.interstitial.t) this).f68936c, 0);
            }
        }
    }
}
