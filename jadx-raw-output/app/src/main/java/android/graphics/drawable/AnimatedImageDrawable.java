package android.graphics.drawable;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class AnimatedImageDrawable extends Drawable implements Animatable2 {
    static {
        throw new NoClassDefFoundError();
    }

    @Override // android.graphics.drawable.Animatable2
    public native /* synthetic */ void clearAnimationCallbacks();

    @Override // android.graphics.drawable.Drawable
    public native /* synthetic */ int getIntrinsicHeight();

    @Override // android.graphics.drawable.Drawable
    public native /* synthetic */ int getIntrinsicWidth();

    public native /* synthetic */ void setRepeatCount(int i10);

    @Override // android.graphics.drawable.Animatable
    public native /* synthetic */ void start();

    @Override // android.graphics.drawable.Animatable
    public native /* synthetic */ void stop();
}
