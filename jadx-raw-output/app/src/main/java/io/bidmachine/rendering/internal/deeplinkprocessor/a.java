package io.bidmachine.rendering.internal.deeplinkprocessor;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import ck.i;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.utils.CommonLog;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.rendering.utils.UrlHandler;
import io.bidmachine.util.Executable;
import io.bidmachine.util.Utils;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements io.bidmachine.rendering.internal.deeplinkprocessor.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0527a f60344a = new C0527a(null);

    public static final class b implements Executable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f60345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executable f60346b;

        public b(Uri uri, Executable executable) {
            p.j(uri, "baseUri");
            this.f60345a = uri;
            this.f60346b = executable;
        }

        public void a(boolean z10) {
            if (z10) {
                UrlHandler.track$bidmachine_android_rendering_d_2_5_2(this.f60345a.getQueryParameter("fallbackTrackingUrl"));
            }
            UiUtils.onUiThreadWithArgSafely(Boolean.valueOf(z10), this.f60346b);
        }

        @Override // io.bidmachine.util.Executable
        public /* bridge */ /* synthetic */ void execute(Object obj) {
            a(((Boolean) obj).booleanValue());
        }

        @Override // io.bidmachine.util.Executable
        public /* bridge */ /* synthetic */ boolean executeSafely(Object obj) {
            return super.executeSafely(obj);
        }
    }

    public static final class c implements Executable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f60347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executable f60348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f60349c;

        public c(Context context, Uri uri, Executable executable) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            p.j(uri, "baseUri");
            this.f60347a = uri;
            this.f60348b = executable;
            Context applicationContext = context.getApplicationContext();
            p.i(applicationContext, "context.applicationContext");
            this.f60349c = applicationContext;
        }

        public void a(boolean z10) {
            if (z10) {
                UrlHandler.track$bidmachine_android_rendering_d_2_5_2(this.f60347a.getQueryParameter("primaryTrackingUrl"));
                UiUtils.onUiThreadWithArgSafely(Boolean.TRUE, this.f60348b);
                return;
            }
            String queryParameter = this.f60347a.getQueryParameter("fallbackUrl");
            if (queryParameter == null || queryParameter.length() == 0) {
                UiUtils.onUiThreadWithArgSafely(Boolean.FALSE, this.f60348b);
                return;
            }
            Uri validUri = Utils.getValidUri(queryParameter);
            if (validUri == null) {
                UiUtils.onUiThreadWithArgSafely(Boolean.FALSE, this.f60348b);
            } else {
                UrlHandler.openBrowser(this.f60349c, validUri, new b(this.f60347a, this.f60348b));
            }
        }

        @Override // io.bidmachine.util.Executable
        public /* bridge */ /* synthetic */ void execute(Object obj) {
            a(((Boolean) obj).booleanValue());
        }

        @Override // io.bidmachine.util.Executable
        public /* bridge */ /* synthetic */ boolean executeSafely(Object obj) {
            return super.executeSafely(obj);
        }
    }

    @Override // io.bidmachine.rendering.internal.deeplinkprocessor.b
    public boolean a(Uri uri) {
        p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return p.e("bmlink", uri.getScheme());
    }

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.deeplinkprocessor.a$a, reason: collision with other inner class name */
    public static final class C0527a {
        private C0527a() {
        }

        public /* synthetic */ C0527a(i iVar) {
            this();
        }
    }

    @Override // io.bidmachine.rendering.internal.deeplinkprocessor.b
    public void a(Context context, Uri uri, Executable executable) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        String queryParameter = uri.getQueryParameter("primaryUrl");
        if (TextUtils.isEmpty(queryParameter)) {
            CommonLog.e("BMDeeplinkProcessor", "processUrl (primaryUrl is null or empty)", new Object[0]);
            UiUtils.onUiThreadWithArgSafely(Boolean.FALSE, executable);
            return;
        }
        Uri validUri = Utils.getValidUri(queryParameter);
        if (validUri != null) {
            UrlHandler.openBrowser(context, validUri, new c(context, uri, executable));
        } else {
            CommonLog.e("BMDeeplinkProcessor", "processUrl (primaryUri is null)", new Object[0]);
            UiUtils.onUiThreadWithArgSafely(Boolean.FALSE, executable);
        }
    }

    @Override // io.bidmachine.rendering.internal.deeplinkprocessor.b
    public void a(Context context, String str, Executable executable) {
        io.bidmachine.rendering.internal.deeplinkprocessor.b.a.a(this, context, str, executable);
    }
}
