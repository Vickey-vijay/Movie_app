package androidx.core.net;

import android.net.Uri;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes6.dex */
public final class UriCompat {
    private UriCompat() {
    }

    @NonNull
    public static String toSafeString(@NonNull Uri uri) {
        String host;
        String scheme = uri.getScheme();
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        if (scheme != null) {
            if (!scheme.equalsIgnoreCase("tel") && !scheme.equalsIgnoreCase("sip") && !scheme.equalsIgnoreCase("sms") && !scheme.equalsIgnoreCase("smsto") && !scheme.equalsIgnoreCase("mailto") && !scheme.equalsIgnoreCase("nfc")) {
                if (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https") || scheme.equalsIgnoreCase("ftp") || scheme.equalsIgnoreCase("rtsp")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("//");
                    String str = "";
                    if (uri.getHost() == null) {
                        host = "";
                    } else {
                        host = uri.getHost();
                    }
                    sb2.append(host);
                    if (uri.getPort() != -1) {
                        str = StringUtils.PROCESS_POSTFIX_DELIMITER + uri.getPort();
                    }
                    sb2.append(str);
                    sb2.append("/...");
                    schemeSpecificPart = sb2.toString();
                }
            } else {
                StringBuilder sb3 = new StringBuilder(64);
                sb3.append(scheme);
                sb3.append(':');
                if (schemeSpecificPart != null) {
                    for (int i10 = 0; i10 < schemeSpecificPart.length(); i10++) {
                        char cCharAt = schemeSpecificPart.charAt(i10);
                        if (cCharAt != '-' && cCharAt != '@' && cCharAt != '.') {
                            sb3.append('x');
                        } else {
                            sb3.append(cCharAt);
                        }
                    }
                }
                return sb3.toString();
            }
        }
        StringBuilder sb4 = new StringBuilder(64);
        if (scheme != null) {
            sb4.append(scheme);
            sb4.append(':');
        }
        if (schemeSpecificPart != null) {
            sb4.append(schemeSpecificPart);
        }
        return sb4.toString();
    }
}
