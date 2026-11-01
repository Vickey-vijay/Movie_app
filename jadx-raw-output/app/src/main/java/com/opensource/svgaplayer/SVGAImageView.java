package com.opensource.svgaplayer;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import ck.i;
import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import lk.x;
import pb.e;

/* JADX INFO: compiled from: SVGAImageView.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0003l1mB'\b\u0007\u0012\u0006\u0010h\u001a\u00020g\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010i\u001a\u000209¢\u0006\u0004\bj\u0010kJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\u0012\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\u0012\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002J\u0006\u0010 \u001a\u00020\u0004J\u001a\u0010!\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\"\u001a\u00020\u0004J\u0006\u0010#\u001a\u00020\u0004J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0012J\u0010\u0010&\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u001a\u0010)\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010(\u001a\u0004\u0018\u00010'J\u000e\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*J\u0012\u0010/\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010-H\u0017J\b\u00100\u001a\u00020\u0004H\u0014R\u0014\u00103\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b1\u00102R$\u00107\u001a\u00020\u00122\u0006\u00104\u001a\u00020\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010E\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00106\u001a\u0004\bB\u00108\"\u0004\bC\u0010DR\"\u0010I\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u00106\u001a\u0004\bG\u00108\"\u0004\bH\u0010DR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010X\u001a\u0004\u0018\u00010R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0018\u0010Z\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010[R\u0016\u0010]\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0016\u0010^\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00106R\u0014\u0010a\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010`R\u0014\u0010d\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010cR\u0016\u0010e\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010;R\u0016\u0010f\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010;¨\u0006n"}, d2 = {"Lcom/opensource/svgaplayer/SVGAImageView;", "Landroid/widget/ImageView;", "Landroid/util/AttributeSet;", "attrs", "Lmj/r;", CampaignEx.JSON_KEY_AD_K, "", "source", "n", "Ljava/lang/ref/WeakReference;", "ref", "Lcom/opensource/svgaplayer/SVGAParser$c;", "i", "Lcom/opensource/svgaplayer/SVGAVideoEntity;", "videoItem", "s", "Ltb/b;", "range", "", "reverse", "o", "q", "Lpb/d;", "getSVGADrawable", "", "j", "Landroid/animation/ValueAnimator;", "animator", InneractiveMediationDefs.GENDER_MALE, "Landroid/animation/Animator;", "animation", "l", "r", "t", "h", "u", "clear", "v", "setVideoItem", "Lpb/e;", "dynamicItem", "p", "Lpb/c;", "clickListener", "setOnAnimKeyClickListener", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "onDetachedFromWindow", "b", "Ljava/lang/String;", "TAG", "<set-?>", "c", "Z", "isAnimating", "()Z", "", "d", "I", "getLoops", "()I", "setLoops", "(I)V", "loops", "e", "getClearsAfterStop", "setClearsAfterStop", "(Z)V", "clearsAfterStop", InneractiveMediationDefs.GENDER_FEMALE, "getClearsAfterDetached", "setClearsAfterDetached", "clearsAfterDetached", "Lcom/opensource/svgaplayer/SVGAImageView$FillMode;", "g", "Lcom/opensource/svgaplayer/SVGAImageView$FillMode;", "getFillMode", "()Lcom/opensource/svgaplayer/SVGAImageView$FillMode;", "setFillMode", "(Lcom/opensource/svgaplayer/SVGAImageView$FillMode;)V", "fillMode", "Lpb/b;", "Lpb/b;", "getCallback", "()Lpb/b;", "setCallback", "(Lpb/b;)V", "callback", "Landroid/animation/ValueAnimator;", "mAnimator", "Lpb/c;", "mItemClickAreaListener", "mAntiAlias", "mAutoPlay", "Lcom/opensource/svgaplayer/SVGAImageView$a;", "Lcom/opensource/svgaplayer/SVGAImageView$a;", "mAnimatorListener", "Lcom/opensource/svgaplayer/SVGAImageView$b;", "Lcom/opensource/svgaplayer/SVGAImageView$b;", "mAnimatorUpdateListener", "mStartFrame", "mEndFrame", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "FillMode", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
public class SVGAImageView extends ImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String TAG;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean isAnimating;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int loops;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean clearsAfterStop;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean clearsAfterDetached;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public FillMode fillMode;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public pb.b callback;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public ValueAnimator mAnimator;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public pb.c mItemClickAreaListener;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public boolean mAntiAlias;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean mAutoPlay;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final a mAnimatorListener;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final b mAnimatorUpdateListener;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public int mStartFrame;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public int mEndFrame;

    /* JADX INFO: compiled from: SVGAImageView.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/opensource/svgaplayer/SVGAImageView$FillMode;", "", "(Ljava/lang/String;I)V", "Backward", "Forward", "com.opensource.svgaplayer"}, k = 1, mv = {1, 1, 15})
    public enum FillMode {
        Backward,
        Forward
    }

    /* JADX INFO: compiled from: SVGAImageView.kt */
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/opensource/svgaplayer/SVGAImageView$a;", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "Lmj/r;", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "Ljava/lang/ref/WeakReference;", "Lcom/opensource/svgaplayer/SVGAImageView;", "b", "Ljava/lang/ref/WeakReference;", "weakReference", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "<init>", "(Lcom/opensource/svgaplayer/SVGAImageView;)V", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
    public static final class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final WeakReference<SVGAImageView> weakReference;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            SVGAImageView sVGAImageView = this.weakReference.get();
            if (sVGAImageView != null) {
                sVGAImageView.isAnimating = false;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SVGAImageView sVGAImageView = this.weakReference.get();
            if (sVGAImageView != null) {
                sVGAImageView.l(animator);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            pb.b callback;
            SVGAImageView sVGAImageView = this.weakReference.get();
            if (sVGAImageView == null || (callback = sVGAImageView.getCallback()) == null) {
                return;
            }
            callback.b();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            SVGAImageView sVGAImageView = this.weakReference.get();
            if (sVGAImageView != null) {
                sVGAImageView.isAnimating = true;
            }
        }

        public a(SVGAImageView sVGAImageView) {
            p.k(sVGAImageView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            this.weakReference = new WeakReference<>(sVGAImageView);
        }
    }

    /* JADX INFO: compiled from: SVGAImageView.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/opensource/svgaplayer/SVGAImageView$b;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/animation/ValueAnimator;", "animation", "Lmj/r;", "onAnimationUpdate", "Ljava/lang/ref/WeakReference;", "Lcom/opensource/svgaplayer/SVGAImageView;", "b", "Ljava/lang/ref/WeakReference;", "weakReference", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "<init>", "(Lcom/opensource/svgaplayer/SVGAImageView;)V", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
    public static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final WeakReference<SVGAImageView> weakReference;

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SVGAImageView sVGAImageView = this.weakReference.get();
            if (sVGAImageView != null) {
                sVGAImageView.m(valueAnimator);
            }
        }

        public b(SVGAImageView sVGAImageView) {
            p.k(sVGAImageView, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            this.weakReference = new WeakReference<>(sVGAImageView);
        }
    }

    /* JADX INFO: compiled from: SVGAImageView.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"com/opensource/svgaplayer/SVGAImageView$c", "Lcom/opensource/svgaplayer/SVGAParser$c;", "Lcom/opensource/svgaplayer/SVGAVideoEntity;", "videoItem", "Lmj/r;", "a", "onError", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
    public static final class c implements SVGAParser.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WeakReference f43029a;

        @Override // com.opensource.svgaplayer.SVGAParser.c
        public void onError() {
        }

        public c(WeakReference weakReference) {
            this.f43029a = weakReference;
        }

        @Override // com.opensource.svgaplayer.SVGAParser.c
        public void a(SVGAVideoEntity sVGAVideoEntity) {
            p.k(sVGAVideoEntity, "videoItem");
            SVGAImageView sVGAImageView = (SVGAImageView) this.f43029a.get();
            if (sVGAImageView != null) {
                sVGAImageView.s(sVGAVideoEntity);
            }
        }
    }

    /* JADX INFO: compiled from: SVGAImageView.kt */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lmj/r;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class d implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SVGAVideoEntity f43031c;

        public d(SVGAVideoEntity sVGAVideoEntity) {
            this.f43031c = sVGAVideoEntity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f43031c.w(SVGAImageView.this.mAntiAlias);
            SVGAImageView.this.setVideoItem(this.f43031c);
            pb.d sVGADrawable = SVGAImageView.this.getSVGADrawable();
            if (sVGADrawable != null) {
                ImageView.ScaleType scaleType = SVGAImageView.this.getScaleType();
                p.f(scaleType, "scaleType");
                sVGADrawable.g(scaleType);
            }
            if (SVGAImageView.this.mAutoPlay) {
                SVGAImageView.this.r();
            }
        }
    }

    public SVGAImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SVGAImageView(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void l(Animator animator) {
        this.isAnimating = false;
        u();
        pb.d sVGADrawable = getSVGADrawable();
        if (!this.clearsAfterStop && sVGADrawable != null) {
            FillMode fillMode = this.fillMode;
            if (fillMode == FillMode.Backward) {
                sVGADrawable.f(this.mStartFrame);
            } else if (fillMode == FillMode.Forward) {
                sVGADrawable.f(this.mEndFrame);
            }
        }
        if (this.clearsAfterStop) {
            if (animator == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.animation.ValueAnimator");
            }
            if (((ValueAnimator) animator).getRepeatCount() <= 0) {
                h();
            }
        }
        pb.b bVar = this.callback;
        if (bVar != null) {
            bVar.onFinished();
        }
    }

    public final void r() {
        t(null, false);
    }

    public final void t(tb.b bVar, boolean z10) {
        v(false);
        o(bVar, z10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SVGAImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        p.k(context, GAMConfig.KEY_CONTEXT);
        this.TAG = "SVGAImageView";
        this.clearsAfterStop = true;
        this.clearsAfterDetached = true;
        this.fillMode = FillMode.Forward;
        this.mAntiAlias = true;
        this.mAutoPlay = true;
        this.mAnimatorListener = new a(this);
        this.mAnimatorUpdateListener = new b(this);
        if (attributeSet != null) {
            k(attributeSet);
        }
    }

    public final pb.b getCallback() {
        return this.callback;
    }

    public final boolean getClearsAfterDetached() {
        return this.clearsAfterDetached;
    }

    public final boolean getClearsAfterStop() {
        return this.clearsAfterStop;
    }

    public final FillMode getFillMode() {
        return this.fillMode;
    }

    public final int getLoops() {
        return this.loops;
    }

    public final SVGAParser.c i(WeakReference<SVGAImageView> ref) {
        return new c(ref);
    }

    public final double j() {
        try {
            Class<?> cls = Class.forName("android.animation.ValueAnimator");
            Field declaredField = cls.getDeclaredField("sDurationScale");
            if (declaredField == null) {
                return 1.0d;
            }
            declaredField.setAccessible(true);
            double d10 = declaredField.getFloat(cls);
            if (d10 == 0.0d) {
                try {
                    declaredField.setFloat(cls, 1.0f);
                    ub.c.f72796a.d(this.TAG, "The animation duration scale has been reset to 1.0x, because you closed it on developer options.");
                    return 1.0d;
                } catch (Exception unused) {
                }
            }
            return d10;
        } catch (Exception unused2) {
            return 1.0d;
        }
    }

    public final void n(String str) {
        WeakReference<SVGAImageView> weakReference = new WeakReference<>(this);
        SVGAParser sVGAParser = new SVGAParser(getContext());
        if (x.R(str, "http://", false, 2, null) || x.R(str, "https://", false, 2, null)) {
            sVGAParser.r(new URL(str), i(weakReference));
        } else {
            sVGAParser.n(str, i(weakReference));
        }
    }

    public final void o(tb.b bVar, boolean z10) {
        ub.c.f72796a.d(this.TAG, "================ start animation ================");
        pb.d sVGADrawable = getSVGADrawable();
        if (sVGADrawable != null) {
            q();
            this.mStartFrame = Math.max(0, 0);
            SVGAVideoEntity videoItem = sVGADrawable.getVideoItem();
            int iMin = Math.min(videoItem.getFrames() - 1, (Integer.MAX_VALUE + 0) - 1);
            this.mEndFrame = iMin;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.mStartFrame, iMin);
            p.f(valueAnimatorOfInt, "animator");
            valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
            valueAnimatorOfInt.setDuration((long) (((double) (((this.mEndFrame - this.mStartFrame) + 1) * (1000 / videoItem.getFPS()))) / j()));
            int i10 = this.loops;
            valueAnimatorOfInt.setRepeatCount(i10 <= 0 ? 99999 : i10 - 1);
            valueAnimatorOfInt.addUpdateListener(this.mAnimatorUpdateListener);
            valueAnimatorOfInt.addListener(this.mAnimatorListener);
            if (z10) {
                valueAnimatorOfInt.reverse();
            } else {
                valueAnimatorOfInt.start();
            }
            this.mAnimator = valueAnimatorOfInt;
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        pb.c cVar;
        if (event == null || event.getAction() != 0) {
            return super.onTouchEvent(event);
        }
        pb.d sVGADrawable = getSVGADrawable();
        if (sVGADrawable == null) {
            return false;
        }
        for (Map.Entry<String, int[]> entry : sVGADrawable.getDynamicItem().j().entrySet()) {
            String key = entry.getKey();
            int[] value = entry.getValue();
            if (event.getX() >= value[0] && event.getX() <= value[2] && event.getY() >= value[1] && event.getY() <= value[3] && (cVar = this.mItemClickAreaListener) != null) {
                cVar.onClick(key);
                return true;
            }
        }
        return super.onTouchEvent(event);
    }

    public final void p(SVGAVideoEntity sVGAVideoEntity, e eVar) {
        if (sVGAVideoEntity == null) {
            setImageDrawable(null);
            return;
        }
        if (eVar == null) {
            eVar = new e();
        }
        pb.d dVar = new pb.d(sVGAVideoEntity, eVar);
        dVar.e(this.clearsAfterStop);
        setImageDrawable(dVar);
    }

    public final void s(SVGAVideoEntity sVGAVideoEntity) {
        post(new d(sVGAVideoEntity));
    }

    public final void setCallback(pb.b bVar) {
        this.callback = bVar;
    }

    public final void setClearsAfterDetached(boolean z10) {
        this.clearsAfterDetached = z10;
    }

    public final void setClearsAfterStop(boolean z10) {
        this.clearsAfterStop = z10;
    }

    public final void setFillMode(FillMode fillMode) {
        p.k(fillMode, "<set-?>");
        this.fillMode = fillMode;
    }

    public final void setLoops(int i10) {
        this.loops = i10;
    }

    public final void setOnAnimKeyClickListener(pb.c cVar) {
        p.k(cVar, "clickListener");
        this.mItemClickAreaListener = cVar;
    }

    public final void setVideoItem(SVGAVideoEntity sVGAVideoEntity) {
        p(sVGAVideoEntity, new e());
    }

    public final void u() {
        v(this.clearsAfterStop);
    }

    public final void v(boolean z10) {
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.mAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
        }
        ValueAnimator valueAnimator3 = this.mAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllUpdateListeners();
        }
        pb.d sVGADrawable = getSVGADrawable();
        if (sVGADrawable != null) {
            sVGADrawable.e(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pb.d getSVGADrawable() {
        Drawable drawable = getDrawable();
        if (!(drawable instanceof pb.d)) {
            drawable = null;
        }
        return (pb.d) drawable;
    }

    public final void h() {
        pb.d sVGADrawable = getSVGADrawable();
        if (sVGADrawable != null) {
            sVGADrawable.e(true);
        }
        pb.d sVGADrawable2 = getSVGADrawable();
        if (sVGADrawable2 != null) {
            sVGADrawable2.a();
        }
        setImageDrawable(null);
    }

    public final void k(AttributeSet attributeSet) {
        Context context = getContext();
        p.f(context, GAMConfig.KEY_CONTEXT);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.SVGAImageView, 0, 0);
        this.loops = typedArrayObtainStyledAttributes.getInt(R$styleable.SVGAImageView_loopCount, 0);
        this.clearsAfterStop = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SVGAImageView_clearsAfterStop, true);
        this.mAntiAlias = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SVGAImageView_antiAlias, true);
        this.mAutoPlay = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SVGAImageView_autoPlay, true);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.SVGAImageView_fillMode);
        if (string != null) {
            if (p.e(string, "0")) {
                this.fillMode = FillMode.Backward;
            } else if (p.e(string, "1")) {
                this.fillMode = FillMode.Forward;
            }
        }
        String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.SVGAImageView_source);
        if (string2 != null) {
            n(string2);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void m(ValueAnimator valueAnimator) {
        Object animatedValue;
        pb.d sVGADrawable = getSVGADrawable();
        if (sVGADrawable != null) {
            if (valueAnimator != null) {
                animatedValue = valueAnimator.getAnimatedValue();
            } else {
                animatedValue = null;
            }
            if (animatedValue != null) {
                sVGADrawable.f(((Integer) animatedValue).intValue());
                double currentFrame = ((double) (sVGADrawable.getCurrentFrame() + 1)) / ((double) sVGADrawable.getVideoItem().getFrames());
                pb.b bVar = this.callback;
                if (bVar != null) {
                    bVar.a(sVGADrawable.getCurrentFrame(), currentFrame);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(true);
        if (this.clearsAfterDetached) {
            h();
        }
    }

    public final void q() {
        pb.d sVGADrawable = getSVGADrawable();
        if (sVGADrawable != null) {
            sVGADrawable.e(false);
            ImageView.ScaleType scaleType = getScaleType();
            p.f(scaleType, "scaleType");
            sVGADrawable.g(scaleType);
        }
    }
}
