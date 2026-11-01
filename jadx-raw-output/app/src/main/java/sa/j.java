package sa;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: compiled from: FlyAnimUtil.java */
/* JADX INFO: loaded from: classes11.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RelativeLayout f67156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PathMeasure f67157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f67158c = new float[2];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f67159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f67160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f67161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f67162g;

    /* JADX INFO: compiled from: FlyAnimUtil.java */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImageView f67163b;

        public a(ImageView imageView) {
            this.f67163b = imageView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            j.this.f67157b.getPosTan(((Float) valueAnimator.getAnimatedValue()).floatValue(), j.this.f67158c, null);
            this.f67163b.setTranslationX(j.this.f67158c[0]);
            this.f67163b.setTranslationY(j.this.f67158c[1]);
        }
    }

    /* JADX INFO: compiled from: FlyAnimUtil.java */
    public class b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImageView f67165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f67166c;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public b(ImageView imageView, c cVar) {
            this.f67165b = imageView;
            this.f67166c = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j.this.f67156a.removeView(this.f67165b);
            c cVar = this.f67166c;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    /* JADX INFO: compiled from: FlyAnimUtil.java */
    public interface c {
        void a();
    }

    public void d(c cVar) {
        if (this.f67159d == null || this.f67160e == null || this.f67162g == null) {
            throw new NullPointerException("=====FlyAnim空指针异常============");
        }
        ImageView imageView = new ImageView(this.f67162g);
        imageView.setImageResource(this.f67161f);
        this.f67156a.addView(imageView, new RelativeLayout.LayoutParams(30, 30));
        int[] iArr = new int[2];
        this.f67156a.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        this.f67159d.getLocationInWindow(iArr2);
        int[] iArr3 = new int[2];
        this.f67160e.getLocationInWindow(iArr3);
        float width = (iArr2[0] - iArr[0]) + (this.f67159d.getWidth() / 2);
        float height = (iArr2[1] - iArr[1]) + (this.f67159d.getHeight() / 2);
        float width2 = (iArr3[0] - iArr[0]) + (this.f67160e.getWidth() / 5);
        float f10 = iArr3[1] - iArr[1];
        Path path = new Path();
        path.moveTo(width, height);
        path.quadTo((width + width2) / 2.0f, height, width2, f10);
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f67157b = pathMeasure;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, pathMeasure.getLength());
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new a(imageView));
        valueAnimatorOfFloat.start();
        valueAnimatorOfFloat.addListener(new b(imageView, cVar));
    }

    public j e(int i10) {
        this.f67161f = i10;
        return this;
    }

    public j f(View view) {
        this.f67159d = view;
        return this;
    }

    public j g(View view) {
        this.f67160e = view;
        return this;
    }

    public j(Context context, RelativeLayout relativeLayout) {
        this.f67162g = context;
        this.f67156a = relativeLayout;
    }
}
