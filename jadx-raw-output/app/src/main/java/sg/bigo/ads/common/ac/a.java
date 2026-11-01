package sg.bigo.ads.common.ac;

import android.content.Context;
import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.i;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends GestureDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public C0700a f69485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f69486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f69487c;

    /* JADX INFO: renamed from: sg.bigo.ads.common.ac.a$a, reason: collision with other inner class name */
    public static class C0700a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f69488a = false;

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            this.f69488a = true;
            return super.onSingleTapUp(motionEvent);
        }
    }

    public a(@NonNull Context context) {
        this(context, new C0700a());
    }

    private a(Context context, @NonNull C0700a c0700a) {
        super(context, c0700a);
        this.f69487c = -1L;
        this.f69486b = new i();
        this.f69485a = c0700a;
        setIsLongpressEnabled(false);
    }

    public final boolean a() {
        return System.currentTimeMillis() - this.f69487c <= 3000;
    }

    @Override // android.view.GestureDetector
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f69485a.f69488a = false;
            this.f69487c = System.currentTimeMillis();
            this.f69486b.f69739a = new Point(Math.round(motionEvent.getX()), Math.round(motionEvent.getY()));
        } else if (motionEvent.getActionMasked() == 1) {
            this.f69486b.f69740b = new Point(Math.round(motionEvent.getX()), Math.round(motionEvent.getY()));
        }
        return super.onTouchEvent(motionEvent);
    }
}
