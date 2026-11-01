package sg.bigo.ads.ad.interstitial.e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends e {
    public k(@NonNull sg.bigo.ads.ad.interstitial.e.b.a aVar, @NonNull List<NativeAd> list, @NonNull sg.bigo.ads.ad.interstitial.e.a.b bVar) {
        super(aVar, list, bVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.e.e, sg.bigo.ads.ad.interstitial.e.d
    @Nullable
    public final List<View> a(@NonNull a aVar) {
        if (this.f68397b.size() != 1) {
            return super.a(aVar);
        }
        View viewA = sg.bigo.ads.common.utils.a.a(this.f68399d, R.layout.bigo_ad_layout_word_icon, this.f68396a, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        FrameLayout frameLayout = new FrameLayout(this.f68399d);
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        View viewA2 = sg.bigo.ads.common.utils.a.a(this.f68399d, R.layout.bigo_ad_layout_word_icon_first_page, frameLayout, false);
        u.a(viewA2, frameLayout, layoutParams, -1);
        u.a(viewA, frameLayout, layoutParams, -1);
        u.a(frameLayout, this.f68396a, new LinearLayout.LayoutParams(-1, sg.bigo.ads.common.utils.e.a(this.f68399d, 32)), -1);
        Handler handler = new Handler(Looper.getMainLooper());
        sg.bigo.ads.ad.interstitial.c.AnonymousClass7 anonymousClass7 = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.7

            /* JADX INFO: renamed from: a */
            public boolean f67917a = true;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ WeakReference f67918b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ WeakReference f67919c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Handler f67920d;

            /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.c$7$1 */
            public class AnonymousClass1 extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ View f67921a;

                public AnonymousClass1() {
                    view = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    view.setVisibility(8);
                }
            }

            /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.c$7$2 */
            public class AnonymousClass2 extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ View f67923a;

                public AnonymousClass2() {
                    view = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    view.setVisibility(0);
                }
            }

            public AnonymousClass7() {
                weakReference = weakReference;
                weakReference = weakReference;
                handler = handler;
            }

            @Override // java.lang.Runnable
            public final void run() {
                View view = (View) weakReference.get();
                View view2 = (View) weakReference.get();
                boolean z10 = this.f67917a;
                View view3 = z10 ? view : view2;
                if (z10) {
                    view = view2;
                }
                if (view3 == null || view == null) {
                    return;
                }
                int height = view3.getHeight();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view3, "alpha", 1.0f, 0.0f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view3, "translationY", 0.0f, height);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(300L);
                animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.ad.interstitial.c.7.1

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ View f67921a;

                    public AnonymousClass1() {
                        view = view3;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        view.setVisibility(8);
                    }
                });
                animatorSet.start();
                view.setAlpha(0.0f);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, "translationY", -height, 0.0f);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.setDuration(300L);
                animatorSet2.setInterpolator(new AccelerateDecelerateInterpolator());
                animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.ad.interstitial.c.7.2

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ View f67923a;

                    public AnonymousClass2() {
                        view = view;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        view.setVisibility(0);
                    }
                });
                animatorSet2.start();
                boolean z11 = !this.f67917a;
                this.f67917a = z11;
                handler.postDelayed(this, z11 ? 1000L : 2000L);
            }
        };
        viewA2.setTranslationY(0.0f);
        viewA2.setVisibility(0);
        viewA2.setAlpha(1.0f);
        viewA.setAlpha(0.0f);
        viewA.setVisibility(8);
        handler.postDelayed(anonymousClass7, 1000L);
        ArrayList arrayList = new ArrayList();
        arrayList.add(viewA);
        arrayList.add(viewA2);
        this.f68401f = true;
        return arrayList;
    }

    @Override // sg.bigo.ads.ad.interstitial.e.d
    public final void a(TextView textView) {
        if (textView != null) {
            textView.setMaxWidth(this.f68399d.getResources().getDisplayMetrics().widthPixels - sg.bigo.ads.common.utils.e.a(this.f68399d, 60));
        }
    }
}
