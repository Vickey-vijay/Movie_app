package io.bidmachine.rendering.internal.deeplinkprocessor;

import android.content.Context;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import ck.i;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.mraid.MraidNativeFeatureUrlParser;
import io.bidmachine.iab.utils.CommonLog;
import io.bidmachine.rendering.internal.r;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.util.Executable;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f60353c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MraidNativeFeatureUrlParser f60354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f60355b;

    public d(MraidNativeFeatureUrlParser mraidNativeFeatureUrlParser, r rVar) {
        p.j(mraidNativeFeatureUrlParser, "mraidNativeFeatureUrlParser");
        p.j(rVar, "pictureDownloader");
        this.f60354a = mraidNativeFeatureUrlParser;
        this.f60355b = rVar;
    }

    @Override // io.bidmachine.rendering.internal.deeplinkprocessor.b
    public boolean a(Uri uri) {
        p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return p.e("storePicture", uri.getScheme());
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    @Override // io.bidmachine.rendering.internal.deeplinkprocessor.b
    public void a(Context context, Uri uri, Executable executable) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        Uri storePictureUri = this.f60354a.parseStorePictureUri(uri);
        if (storePictureUri == null) {
            CommonLog.e("MraidStorePictureDeeplinkProcessor", "processUrl (storePictureUri is null)", new Object[0]);
            UiUtils.onUiThreadWithArgSafely(Boolean.FALSE, executable);
        } else {
            r rVar = this.f60355b;
            Context applicationContext = context.getApplicationContext();
            p.i(applicationContext, "context.applicationContext");
            rVar.a(applicationContext, storePictureUri, executable);
        }
    }

    @Override // io.bidmachine.rendering.internal.deeplinkprocessor.b
    public void a(Context context, String str, Executable executable) {
        b.a.a(this, context, str, executable);
    }
}
