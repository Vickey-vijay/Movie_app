package io.bidmachine.rendering.utils;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.mraid.MraidNativeFeatureUrlParser;
import io.bidmachine.rendering.Rendering;
import io.bidmachine.rendering.internal.deeplinkprocessor.a;
import io.bidmachine.rendering.internal.deeplinkprocessor.b;
import io.bidmachine.rendering.internal.deeplinkprocessor.c;
import io.bidmachine.rendering.internal.deeplinkprocessor.d;
import io.bidmachine.rendering.internal.l;
import io.bidmachine.rendering.internal.r;
import io.bidmachine.util.Executable;
import java.util.List;
import kotlin.Metadata;
import lk.x;
import nj.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010$J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007J(\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007J(\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007J(\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0019\u0010\u0013\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR&\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lio/bidmachine/rendering/utils/UrlHandler;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "", "url", "Lio/bidmachine/util/Executable;", "", "postMethod", "Lmj/r;", "openUrl", "Landroid/net/Uri;", NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, "openBrowser", "openCalendar", "storePicture", "parseUrl", "track$bidmachine_android_rendering_d_2_5_2", "(Ljava/lang/String;)V", "track", "Lio/bidmachine/rendering/internal/l;", "a", "Lio/bidmachine/rendering/internal/l;", "INTENT_LAUNCHER", "Lio/bidmachine/rendering/internal/deeplinkprocessor/b;", "b", "Lio/bidmachine/rendering/internal/deeplinkprocessor/b;", "MRAID_CALENDAR_DEEPLINK_PROCESSOR", "c", "MRAID_STORE_PICTURE_DEEPLINK_PROCESSOR", "", "d", "Ljava/util/List;", "getSUPPORTED_DEEPLINK_PROCESSORS", "()Ljava/util/List;", "getSUPPORTED_DEEPLINK_PROCESSORS$annotations", "()V", "SUPPORTED_DEEPLINK_PROCESSORS", "<init>", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final class UrlHandler {
    public static final UrlHandler INSTANCE = new UrlHandler();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final l INTENT_LAUNCHER;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final b MRAID_CALENDAR_DEEPLINK_PROCESSOR;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final b MRAID_STORE_PICTURE_DEEPLINK_PROCESSOR;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final List SUPPORTED_DEEPLINK_PROCESSORS;

    static {
        l lVar = new l();
        INTENT_LAUNCHER = lVar;
        MraidNativeFeatureUrlParser mraidNativeFeatureUrlParser = new MraidNativeFeatureUrlParser();
        r rVar = new r();
        c cVar = new c(mraidNativeFeatureUrlParser, lVar);
        MRAID_CALENDAR_DEEPLINK_PROCESSOR = cVar;
        d dVar = new d(mraidNativeFeatureUrlParser, rVar);
        MRAID_STORE_PICTURE_DEEPLINK_PROCESSOR = dVar;
        SUPPORTED_DEEPLINK_PROCESSORS = s.n(cVar, dVar, new a());
    }

    private UrlHandler() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getSUPPORTED_DEEPLINK_PROCESSORS$annotations() {
    }

    public static final void openBrowser(Context context, Uri uri, Executable<Boolean> executable) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        INTENT_LAUNCHER.a(context, uri, executable);
    }

    public static final void openCalendar(Context context, String str, Executable<Boolean> executable) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(str, "url");
        MRAID_CALENDAR_DEEPLINK_PROCESSOR.a(context, str, executable);
    }

    public static final void openUrl(Context context, String str, Executable<Boolean> executable) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(str, "url");
        Uri url = parseUrl(str);
        for (b bVar : SUPPORTED_DEEPLINK_PROCESSORS) {
            if (bVar.a(url)) {
                bVar.a(context, url, executable);
                return;
            }
        }
        openBrowser(context, url, executable);
    }

    public static final Uri parseUrl(String url) {
        Uri validUri;
        p.j(url, "url");
        Uri uri = Uri.parse(url);
        p.i(uri, "parse(url)");
        String scheme = uri.getScheme();
        if ((scheme == null || scheme.length() == 0) && !x.R(url, "/", false, 2, null) && (validUri = io.bidmachine.util.Utils.getValidUri(url)) != null) {
            String scheme2 = validUri.getScheme();
            if (scheme2 == null || scheme2.length() <= 0) {
                String string = validUri.toString();
                p.i(string, "newUri.toString()");
                if (x.R(string, "/", false, 2, null)) {
                }
            }
            return validUri;
        }
        return uri;
    }

    public static final void storePicture(Context context, String str, Executable<Boolean> executable) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(str, "url");
        MRAID_STORE_PICTURE_DEEPLINK_PROCESSOR.a(context, str, executable);
    }

    public static final void track$bidmachine_android_rendering_d_2_5_2(String url) {
        String validUrl = io.bidmachine.util.Utils.getValidUrl(url);
        if (validUrl == null || validUrl.length() <= 0) {
            return;
        }
        new NetworkRequest.Builder(validUrl, NetworkRequest.Method.Get).setUserAgent(Rendering.getUserAgent()).send();
    }

    public final List<b> getSUPPORTED_DEEPLINK_PROCESSORS() {
        return SUPPORTED_DEEPLINK_PROCESSORS;
    }
}
