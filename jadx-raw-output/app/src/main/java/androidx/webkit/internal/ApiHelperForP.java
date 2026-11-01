package androidx.webkit.internal;

import android.os.Looper;
import android.webkit.TracingController;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.TracingConfig;
import java.io.OutputStream;
import java.util.Collection;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(28)
public class ApiHelperForP {
    /* JADX WARN: Type inference failed for: r0v0, types: [android.webkit.TracingConfig$Builder] */
    public static void start(@NonNull TracingController tracingController, @NonNull TracingConfig tracingConfig) {
        tracingController.start(new Object() { // from class: android.webkit.TracingConfig$Builder
            static {
                throw new NoClassDefFoundError();
            }

            public native /* synthetic */ TracingConfig$Builder addCategories(Collection<String> collection);

            public native /* synthetic */ TracingConfig$Builder addCategories(int... iArr);

            public native /* synthetic */ TracingConfig build();

            public native /* synthetic */ TracingConfig$Builder setTracingMode(int i10);
        }.addCategories(tracingConfig.getPredefinedCategories()).addCategories(tracingConfig.getCustomIncludedCategories()).setTracingMode(tracingConfig.getTracingMode()).build());
    }

    private ApiHelperForP() {
    }

    @NonNull
    public static TracingController getTracingControllerInstance() {
        return TracingController.getInstance();
    }

    @NonNull
    public static ClassLoader getWebViewClassLoader() {
        return WebView.getWebViewClassLoader();
    }

    @NonNull
    public static Looper getWebViewLooper(@NonNull WebView webView) {
        return webView.getWebViewLooper();
    }

    public static boolean isTracing(@NonNull TracingController tracingController) {
        return tracingController.isTracing();
    }

    public static void setDataDirectorySuffix(@NonNull String str) {
        WebView.setDataDirectorySuffix(str);
    }

    public static boolean stop(@NonNull TracingController tracingController, @Nullable OutputStream outputStream, @NonNull Executor executor) {
        return tracingController.stop(outputStream, executor);
    }
}
