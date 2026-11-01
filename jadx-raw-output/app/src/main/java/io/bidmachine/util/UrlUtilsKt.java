package io.bidmachine.util;

import android.net.Uri;
import ck.p;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import lk.x;
import nj.n;

/* JADX INFO: compiled from: UrlUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a#\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\"\u00020\u0002¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"parseUri", "Landroid/net/Uri;", "", "removeQueryParameters", "parameterNames", "", "(Landroid/net/Uri;[Ljava/lang/String;)Landroid/net/Uri;", "bidmachine-android-util_d_0_13_0"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class UrlUtilsKt {
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    public static final Uri parseUri(String str) {
        Uri validUri;
        p.j(str, "<this>");
        try {
            Uri uri = Uri.parse(str);
            p.i(uri, "parse(this)");
            String scheme = uri.getScheme();
            boolean z10 = true;
            if ((scheme == null || scheme.length() == 0) && !x.R(str, "/", false, 2, null) && (validUri = Utils.getValidUri(str)) != null) {
                String scheme2 = validUri.getScheme();
                if (scheme2 != null) {
                    p.i(scheme2, "scheme");
                    if (!(scheme2.length() > 0)) {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (!z10) {
                    String string = validUri.toString();
                    p.i(string, "newUri.toString()");
                    if (x.R(string, "/", false, 2, null)) {
                    }
                }
                return validUri;
            }
            return uri;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Uri removeQueryParameters(Uri uri, String... strArr) {
        p.j(uri, "<this>");
        p.j(strArr, "parameterNames");
        if (strArr.length == 0) {
            return uri;
        }
        Set setT0 = n.t0(strArr);
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            if (!setT0.contains(str)) {
                Iterator<String> it = uri.getQueryParameters(str).iterator();
                while (it.hasNext()) {
                    builderClearQuery.appendQueryParameter(str, it.next());
                }
            }
        }
        Uri uriBuild = builderClearQuery.build();
        p.i(uriBuild, "builder.build()");
        return uriBuild;
    }
}
