package io.bidmachine.iab.mraid;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewGestureDetector extends GestureDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f59315a;

    public static class a extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f59316a = false;

        public boolean a() {
            return this.f59316a;
        }

        public void b() {
            this.f59316a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.f59316a = true;
            return super.onSingleTapUp(motionEvent);
        }
    }

    public WebViewGestureDetector(@NonNull Context context) {
        this(context, new a());
    }

    public boolean isClicked() {
        return this.f59315a.a();
    }

    public void resetClick() {
        this.f59315a.b();
    }

    private WebViewGestureDetector(Context context, @NonNull a aVar) {
        super(context, aVar);
        this.f59315a = aVar;
        setIsLongpressEnabled(false);
    }
}
