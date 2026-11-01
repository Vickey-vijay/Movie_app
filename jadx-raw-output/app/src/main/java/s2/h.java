package s2;

import com.fyber.inneractive.sdk.external.InneractiveAdManager;

/* JADX INFO: compiled from: FyberSdkWrapper.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f67003a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static i f67004b = new a();

    /* JADX INFO: compiled from: FyberSdkWrapper.kt */
    public static final class a implements i {
        @Override // s2.i
        public boolean isInitialized() {
            return InneractiveAdManager.wasInitialized();
        }
    }

    public static final i a() {
        return f67004b;
    }
}
