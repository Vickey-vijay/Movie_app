package sg.bigo.ads.common.a;

import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;

/* JADX INFO: loaded from: classes6.dex */
public class a extends TranslateAnimation implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f69458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f69459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f69460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f69461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f69462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f69463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Animation.AnimationListener f69464g;

    public a(float f10) {
        super(0.0f, 0.0f, 0.0f, f10);
    }

    public a(float f10, float f11) {
        super(1, 0.0f, 1, 0.0f, 1, f10, 1, f11);
    }

    public void a(float f10, float f11, int i10, int i11) {
    }

    @Override // android.view.animation.TranslateAnimation, android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        Transformation transformation2 = new Transformation();
        super.applyTransformation(f10, transformation2);
        Matrix matrix = transformation2.getMatrix();
        Matrix matrix2 = transformation != null ? transformation.getMatrix() : null;
        if (matrix == null || matrix2 == null) {
            return;
        }
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        fArr[2] = fArr[2] - this.f69463f;
        fArr[5] = fArr[5] - this.f69461d;
        matrix2.setValues(fArr);
        a(fArr[2], fArr[5], this.f69458a, this.f69459b);
    }

    @Override // android.view.animation.TranslateAnimation, android.view.animation.Animation
    public void initialize(int i10, int i11, int i12, int i13) {
        super.initialize(i10, i11, i12, i13);
        super.setAnimationListener(this);
        this.f69458a = i10;
        this.f69459b = i11;
    }

    public void onAnimationEnd(Animation animation) {
        Animation.AnimationListener animationListener = this.f69464g;
        if (animationListener != null) {
            animationListener.onAnimationEnd(animation);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        this.f69463f = this.f69462e;
        this.f69461d = this.f69460c;
        Animation.AnimationListener animationListener = this.f69464g;
        if (animationListener != null) {
            animationListener.onAnimationRepeat(animation);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        Animation.AnimationListener animationListener = this.f69464g;
        if (animationListener != null) {
            animationListener.onAnimationStart(animation);
        }
    }

    @Override // android.view.animation.Animation
    public void setAnimationListener(Animation.AnimationListener animationListener) {
        this.f69464g = animationListener;
    }
}
