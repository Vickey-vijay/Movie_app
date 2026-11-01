package io.bidmachine.iab.mraid;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import io.bidmachine.iab.utils.Utils;

/* JADX INFO: loaded from: classes5.dex */
public class ViewOnScreenObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewOnScreenObserverRequest f59305a;

    public static class ViewOnScreenObserverRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View[] f59306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f59307b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Runnable f59308c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f59309d;

        public class a implements Runnable {

            /* JADX INFO: renamed from: io.bidmachine.iab.mraid.ViewOnScreenObserver$ViewOnScreenObserverRequest$a$a, reason: collision with other inner class name */
            public class ViewTreeObserverOnPreDrawListenerC0500a implements ViewTreeObserver.OnPreDrawListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ View f59311a;

                public ViewTreeObserverOnPreDrawListenerC0500a(View view) {
                    this.f59311a = view;
                }

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    this.f59311a.getViewTreeObserver().removeOnPreDrawListener(this);
                    ViewOnScreenObserverRequest.this.b();
                    return true;
                }
            }

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                for (View view : ViewOnScreenObserverRequest.this.f59306a) {
                    if (view.getHeight() > 0 || view.getWidth() > 0) {
                        ViewOnScreenObserverRequest.this.b();
                    } else {
                        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0500a(view));
                    }
                }
            }
        }

        public ViewOnScreenObserverRequest(@NonNull View[] viewArr) {
            this.f59306a = viewArr;
        }

        public void b() {
            Runnable runnable;
            int i10 = this.f59309d - 1;
            this.f59309d = i10;
            if (i10 != 0 || (runnable = this.f59308c) == null) {
                return;
            }
            runnable.run();
            this.f59308c = null;
        }

        public void start(@NonNull Runnable runnable) {
            this.f59308c = runnable;
            this.f59309d = this.f59306a.length;
            Utils.postOnUiThread(this.f59307b);
        }

        public void a() {
            Utils.cancelOnUiThread(this.f59307b);
            this.f59308c = null;
        }
    }

    public void cancelLastRequest() {
        ViewOnScreenObserverRequest viewOnScreenObserverRequest = this.f59305a;
        if (viewOnScreenObserverRequest != null) {
            viewOnScreenObserverRequest.a();
            this.f59305a = null;
        }
    }

    @NonNull
    public ViewOnScreenObserverRequest wait(@NonNull View... viewArr) {
        cancelLastRequest();
        ViewOnScreenObserverRequest viewOnScreenObserverRequest = new ViewOnScreenObserverRequest(viewArr);
        this.f59305a = viewOnScreenObserverRequest;
        return viewOnScreenObserverRequest;
    }
}
