package yads;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class qn2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final un2 f81907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bitmap f81908c;

    @Override // java.lang.Runnable
    public final void run() {
        this.f81907b.setBackground(new BitmapDrawable(this.f81907b.getResources(), this.f81908c));
        this.f81907b.setVisibility(0);
    }

    public qn2(un2 un2Var, Bitmap bitmap) {
        this.f81907b = un2Var;
        this.f81908c = bitmap;
    }
}
