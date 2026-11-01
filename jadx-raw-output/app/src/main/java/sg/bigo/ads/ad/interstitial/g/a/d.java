package sg.bigo.ads.ad.interstitial.g.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.c.ac;
import sg.bigo.ads.ad.interstitial.q;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.i;
import sg.bigo.ads.common.p;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.RoundedImageView;
import sg.bigo.ads.core.adview.h;

/* JADX INFO: loaded from: classes9.dex */
public class d extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoundedFrameLayout f68500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg.bigo.ads.ad.b.b f68501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.g.a f68502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f68503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewGroup f68504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f68505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private t f68506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private sg.bigo.ads.ad.interstitial.c.a f68507h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f68508i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View f68509j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f68510k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f68511l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private h f68512m;

    public d(@NonNull Activity activity, sg.bigo.ads.ad.interstitial.g.a aVar, RoundedFrameLayout roundedFrameLayout, sg.bigo.ads.ad.b.b bVar, int i10, View view, boolean z10) {
        super(activity);
        this.f68512m = new h() { // from class: sg.bigo.ads.ad.interstitial.g.a.d.1
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // sg.bigo.ads.core.adview.h
            public final void a(int i11, int i12, int i13, int i14, int i15, int i16) {
                if (d.this.f68502c != null) {
                    i iVar = new i(new Point(i13, i14), new Point(i11, i12));
                    d dVar = d.this;
                    sg.bigo.ads.ad.interstitial.g.a aVar2 = dVar.f68502c;
                    boolean z11 = dVar.f68508i;
                    int i17 = d.this.f68511l;
                    d dVar2 = d.this;
                    aVar2.a(z11, i17, i15, i16, iVar, dVar2.f68501b, dVar2);
                }
            }
        };
        this.f68505f = new h() { // from class: sg.bigo.ads.ad.interstitial.g.a.d.2
            @Override // sg.bigo.ads.core.adview.h
            public final void a(int i11, int i12, int i13, int i14, int i15, int i16) {
            }
        };
        this.f68502c = aVar;
        this.f68500a = roundedFrameLayout;
        this.f68501b = bVar;
        this.f68506g = sg.bigo.ads.ad.interstitial.d.a.a(bVar, 0);
        this.f68503d = i10;
        this.f68509j = view;
        this.f68510k = z10;
    }

    public static /* synthetic */ ViewGroup e(d dVar) {
        dVar.f68504e = null;
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void F() {
        super.F();
        this.f68512m = null;
        this.f68507h = null;
        this.f68506g = null;
    }

    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final boolean Q() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final int W() {
        int i10 = R.layout.bigo_ad_activity_vertical_twins_sub;
        Activity activity = this.L;
        RoundedFrameLayout roundedFrameLayout = this.f68500a;
        sg.bigo.ads.common.utils.a.a(activity, i10, roundedFrameLayout, roundedFrameLayout != null);
        return i10;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final int Y() {
        return R.layout.bigo_ad_activity_vertical_twins_sub;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean Z() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    public final boolean a() {
        if (this.f68508i) {
            return false;
        }
        m mVarE = ((sg.bigo.ads.core.a.a) this.f68501b.f()).e();
        if (this.f68507h == null) {
            this.f68507h = sg.bigo.ads.ad.interstitial.c.a.a(this.f68501b, mVarE, null, null, false);
        }
        if (this.f68507h instanceof ac) {
            this.f68500a.setCornerRadius(0.0f);
            this.f68500a.removeAllViews();
            int iA = mVarE.a("multi_ads_endpage.ad_component_layout");
            if (4 == iA) {
                if (this.f68503d != 0) {
                    iA = 3;
                } else {
                    iA = 2;
                }
            } else if (5 == iA) {
                if (this.f68503d == 0) {
                    iA = 3;
                } else {
                    iA = 2;
                }
            }
            ((ac) this.f68507h).a(iA);
            this.f68507h.a(this, this.f68500a, 2);
            sg.bigo.ads.ad.interstitial.g.a aVar = this.f68502c;
            if (aVar != null) {
                aVar.a(11);
            }
            this.f68508i = true;
        }
        return true;
    }

    public void b() {
        View view;
        m mVarE = ((sg.bigo.ads.core.a.a) this.f68501b.f()).e();
        if (mVarE == null || this.f68500a == null) {
            return;
        }
        ArrayList<View> arrayList = new ArrayList();
        this.f68511l = mVarE.a("multi_ads.interaction_type", 2);
        int iA = mVarE.a("multi_ads.click_type", 0);
        MediaView mediaView = (MediaView) this.f68500a.findViewById(R.id.inter_media);
        if (mediaView != null) {
            mediaView.setMediaAreaClickable(true);
            mediaView.b().a(false);
        }
        boolean zC = mVarE.c("multi_ads.media_view_clickable_switch");
        View viewFindViewById = this.f68500a.findViewById(R.id.inter_media_layout);
        if (zC) {
            if (viewFindViewById != null) {
                viewFindViewById.setTag(10);
                arrayList.add(viewFindViewById);
            }
            arrayList.add(mediaView);
        } else {
            if (mediaView != null) {
                sg.bigo.ads.ad.b.a.a(this.f68500a, mediaView, 8, this.f68505f, iA);
            }
            if (viewFindViewById != null) {
                sg.bigo.ads.ad.b.a.a(this.f68500a, viewFindViewById, 8, this.f68505f, iA);
            }
        }
        if (mVarE.c("multi_ads.other_space_clickable_switch") && (view = this.f68509j) != null && this.f68503d == 0 && this.f68510k) {
            view.setTag(9);
            sg.bigo.ads.ad.b.a.a(this.f68500a, this.f68509j, 13, this.f68512m, iA);
        }
        boolean zC2 = mVarE.c("multi_ads.ad_component_clickable_switch");
        View viewFindViewById2 = this.f68500a.findViewById(R.id.bigo_ad_sub_bottom_component);
        if (zC2) {
            if (viewFindViewById2 != null) {
                viewFindViewById2.setTag(9);
                arrayList.add(viewFindViewById2);
            }
        } else if (viewFindViewById2 != null) {
            sg.bigo.ads.ad.b.a.a(this.f68500a, viewFindViewById2, 8, this.f68505f, iA);
        }
        View viewFindViewById3 = this.f68500a.findViewById(R.id.inter_title);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setVisibility(0);
            viewFindViewById3.setTag(2);
            arrayList.add(viewFindViewById3);
        }
        View viewFindViewById4 = this.f68500a.findViewById(R.id.inter_icon);
        if (viewFindViewById4 != null) {
            viewFindViewById4.setTag(1);
            arrayList.add(viewFindViewById4);
        }
        View viewFindViewById5 = this.f68500a.findViewById(R.id.bigo_ad_tv_more);
        if (viewFindViewById5 != null) {
            viewFindViewById5.setVisibility(0);
            viewFindViewById5.setTag(35);
            arrayList.add(viewFindViewById5);
        }
        for (View view2 : arrayList) {
            if (view2 != null) {
                sg.bigo.ads.ad.b.a.a(this.f68500a, view2, 8, this.f68512m, iA);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public void g() {
        super.g();
    }

    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public final void g(int i10) {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // sg.bigo.ads.ad.interstitial.i
    public void h(int i10) {
        super.h(i10);
        try {
            p pVarA = r.a(this.f68501b);
            if (pVarA.f69807c > pVarA.f69806b) {
                Context context = this.f68500a.getContext();
                int iA = sg.bigo.ads.common.utils.e.a(context, c.H - 55) - sg.bigo.ads.common.utils.e.a(context, 16);
                int i11 = (int) (iA * ((pVarA.f69806b * 1.0f) / pVarA.f69807c));
                MediaView mediaView = (MediaView) this.f68500a.findViewById(R.id.inter_media);
                if (mediaView != null) {
                    ViewGroup viewGroup = (ViewGroup) mediaView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(mediaView);
                    }
                    mediaView.setMediaAreaClickable(true);
                    mediaView.b().a(false);
                    RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(context);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, iA, 49);
                    layoutParams.topMargin = sg.bigo.ads.common.utils.e.a(context, 8);
                    roundedFrameLayout.setLayoutParams(layoutParams);
                    roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 16));
                    roundedFrameLayout.addView(mediaView);
                    this.f68500a.addView(roundedFrameLayout);
                    ViewGroup.LayoutParams layoutParams2 = mediaView.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.width = i11;
                        layoutParams2.height = iA;
                        mediaView.setLayoutParams(layoutParams2);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        t tVar = this.f68506g;
        RoundedFrameLayout roundedFrameLayout2 = this.f68500a;
        tVar.a(roundedFrameLayout2, roundedFrameLayout2, 1, 8, 0, new View[0]);
        r.a(this.f68501b, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.g.a.d.3
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                ViewGroup.LayoutParams layoutParams3 = d.this.f68500a.getLayoutParams();
                if (bitmap2 == null || bitmap2.isRecycled() || layoutParams3 == null) {
                    return;
                }
                sg.bigo.ads.common.utils.d.a(d.this.f68500a.getContext(), bitmap2, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.g.a.d.3.1
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bitmap bitmap3) {
                        Bitmap bitmap4 = bitmap3;
                        if (bitmap4 == null || bitmap4.isRecycled()) {
                            return;
                        }
                        int iA2 = sg.bigo.ads.common.utils.e.a(d.this.f68500a.getContext(), 16);
                        RoundedImageView roundedImageView = new RoundedImageView(d.this.f68500a.getContext());
                        roundedImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        roundedImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        float f10 = iA2;
                        roundedImageView.a(f10, f10, 0.0f, 0.0f);
                        ((FrameLayout) d.this.f68500a.findViewById(R.id.inter_media_layout)).addView(roundedImageView, 0);
                        roundedImageView.setImageBitmap(bitmap4);
                    }
                });
            }
        });
        b();
        RoundedImageView roundedImageView = (RoundedImageView) this.f68500a.findViewById(R.id.inter_icon);
        if (roundedImageView != null) {
            roundedImageView.setCornerRadius(sg.bigo.ads.common.utils.e.a(this.f68500a.getContext(), 6));
        }
        if (this.f68510k || this.f68500a == null) {
            return;
        }
        try {
            Activity activity = this.L;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f68504e = frameLayout;
            frameLayout.setBackgroundColor(-1);
            ProgressBar progressBar = new ProgressBar(activity);
            progressBar.setBackgroundColor(sg.bigo.ads.common.utils.a.c(activity, android.R.color.transparent));
            int i12 = R.drawable.bigo_ad_default_progressbar;
            int iB = sg.bigo.ads.common.utils.q.b("#FF009DFF", -16776961);
            Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
            if (indeterminateDrawable != null) {
                indeterminateDrawable.setTint(iB);
                progressBar.setIndeterminateDrawable(indeterminateDrawable);
            } else {
                progressBar.setIndeterminateDrawable(sg.bigo.ads.common.utils.a.a(activity, i12));
            }
            this.f68504e.addView(progressBar, new FrameLayout.LayoutParams(-2, -2, 17));
            this.f68500a.addView(this.f68504e, new FrameLayout.LayoutParams(-1, -1, 17));
            sg.bigo.ads.ad.b.a.a(this.f68500a, this.f68504e, 8, this.f68505f, 0);
        } catch (Throwable unused2) {
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.q, sg.bigo.ads.ad.interstitial.i
    public void i() {
        super.i();
    }

    @Override // sg.bigo.ads.ad.interstitial.q
    public final int n() {
        return 0;
    }
}
