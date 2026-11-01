package yads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes10.dex */
public final class ou implements View.OnTouchListener, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.OnClickListener f81147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f81149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f81150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f81151e;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f81147a.onClick(view);
    }

    public ou(Context context, View.OnClickListener onClickListener) {
        this.f81147a = onClickListener;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f81148b = scaledTouchSlop * scaledTouchSlop;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        this.f81149c = false;
                    }
                } else if (this.f81149c) {
                    int i11 = (int) (x10 - this.f81150d);
                    int i12 = (int) (y10 - this.f81151e);
                    if ((i12 * i12) + (i11 * i11) > this.f81148b) {
                        this.f81149c = false;
                    }
                }
            } else {
                if (!this.f81149c) {
                    return true;
                }
                this.f81147a.onClick(view);
                return true;
            }
        } else {
            this.f81150d = x10;
            this.f81151e = y10;
            this.f81149c = true;
        }
        return false;
    }
}
