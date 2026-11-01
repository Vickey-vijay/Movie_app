package sg.bigo.ads.api.core;

import androidx.annotation.NonNull;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;

/* JADX INFO: loaded from: classes6.dex */
public final class e<T extends Ad> implements AdLoadListener<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AdLoadListener<T> f69371a;

    public e() {
    }

    public e(AdLoadListener<T> adLoadListener) {
        this.f69371a = adLoadListener;
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onAdLoaded(@NonNull final T t10) {
        if (this.f69371a != null) {
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.api.core.e.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    e.this.f69371a.onAdLoaded(t10);
                }
            });
        }
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onError(@NonNull final AdError adError) {
        if (this.f69371a != null) {
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.api.core.e.1
                @Override // java.lang.Runnable
                public final void run() {
                    e.this.f69371a.onError(adError);
                }
            });
        }
    }
}
