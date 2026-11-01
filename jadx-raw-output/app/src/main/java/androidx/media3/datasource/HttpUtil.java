package androidx.media3.datasource;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import com.ironsource.C3426d4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
@UnstableApi
public final class HttpUtil {
    private static final String TAG = "HttpUtil";
    private static final Pattern CONTENT_RANGE_WITH_START_AND_END = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern CONTENT_RANGE_WITH_SIZE = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    private HttpUtil() {
    }

    @Nullable
    public static String buildRangeRequestHeader(long j10, long j11) {
        if (j10 == 0 && j11 == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("bytes=");
        sb2.append(j10);
        sb2.append("-");
        if (j11 != -1) {
            sb2.append((j10 + j11) - 1);
        }
        return sb2.toString();
    }

    public static long getContentLength(@Nullable String str, @Nullable String str2) {
        long j10;
        if (!TextUtils.isEmpty(str)) {
            try {
                j10 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                Log.e(TAG, "Unexpected Content-Length [" + str + C3426d4.j.f28588e);
                j10 = -1;
            }
        } else {
            j10 = -1;
        }
        if (!TextUtils.isEmpty(str2)) {
            Matcher matcher = CONTENT_RANGE_WITH_START_AND_END.matcher(str2);
            if (matcher.matches()) {
                try {
                    long j11 = (Long.parseLong((String) Assertions.checkNotNull(matcher.group(2))) - Long.parseLong((String) Assertions.checkNotNull(matcher.group(1)))) + 1;
                    if (j10 < 0) {
                        return j11;
                    }
                    if (j10 != j11) {
                        Log.w(TAG, "Inconsistent headers [" + str + "] [" + str2 + C3426d4.j.f28588e);
                        return Math.max(j10, j11);
                    }
                    return j10;
                } catch (NumberFormatException unused2) {
                    Log.e(TAG, "Unexpected Content-Range [" + str2 + C3426d4.j.f28588e);
                    return j10;
                }
            }
            return j10;
        }
        return j10;
    }

    public static long getDocumentSize(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = CONTENT_RANGE_WITH_SIZE.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        return Long.parseLong((String) Assertions.checkNotNull(matcher.group(1)));
    }
}
