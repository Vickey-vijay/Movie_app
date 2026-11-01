package com.vungle.ads.internal.util;

import android.util.Log;
import ck.i;
import ck.p;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.text.Regex;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/vungle/ads/internal/util/Logger;", "", "()V", VastTagName.COMPANION, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Logger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean enabled;

    /* JADX INFO: compiled from: Logger.kt */
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007J \u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u001e\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0007J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007J\n\u0010\u0011\u001a\u00020\u0006*\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/vungle/ads/internal/util/Logger$Companion;", "", "", "enabled", "Lmj/r;", com.ironsource.mediationsdk.metadata.a.f29888j, "", "tag", "message", "", "d", "e", "", "throwable", "w", "Lkotlin/Function0;", "i", "eraseSensitiveData", "Z", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final int e(String tag, String message) {
            p.j(tag, "tag");
            p.j(message, "message");
            if (Logger.enabled) {
                return Log.e(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        public final int w(String tag, String message) {
            p.j(tag, "tag");
            p.j(message, "message");
            if (Logger.enabled) {
                return Log.w(tag, eraseSensitiveData(message));
            }
            return -1;
        }

        public final String eraseSensitiveData(String str) {
            p.j(str, "<this>");
            Pattern patternCompile = Pattern.compile("[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}");
            p.i(patternCompile, "compile(\"[\\\\d]{1,3}\\\\.[\\…[\\\\d]{1,3}\\\\.[\\\\d]{1,3}\")");
            return new Regex(patternCompile).replace(str, "xxx.xxx.xxx.xxx");
        }

        public final int d(String tag, String message) {
            p.j(tag, "tag");
            p.j(message, "message");
            if (!Logger.enabled) {
                return -1;
            }
            return Log.d(tag, eraseSensitiveData(message));
        }

        public final int e(String tag, String message, Throwable throwable) {
            p.j(tag, "tag");
            p.j(message, "message");
            p.j(throwable, "throwable");
            if (!Logger.enabled) {
                return -1;
            }
            return Log.e(tag, eraseSensitiveData(message) + "; error: " + throwable.getLocalizedMessage());
        }

        public final void enable(boolean z10) {
            Logger.enabled = z10;
        }

        public final int i(String tag, String message) {
            p.j(tag, "tag");
            p.j(message, "message");
            if (!Logger.enabled) {
                return -1;
            }
            return Log.i(tag, eraseSensitiveData(message));
        }

        public final int w(String str, bk.a<String> aVar) {
            p.j(str, "tag");
            p.j(aVar, "message");
            if (Logger.enabled) {
                return Log.w(str, eraseSensitiveData(aVar.invoke()));
            }
            return -1;
        }
    }

    public static final int d(String str, String str2) {
        return INSTANCE.d(str, str2);
    }

    public static final int e(String str, String str2) {
        return INSTANCE.e(str, str2);
    }

    public static final int e(String str, String str2, Throwable th2) {
        return INSTANCE.e(str, str2, th2);
    }

    public static final int i(String str, String str2) {
        return INSTANCE.i(str, str2);
    }

    public static final int w(String str, bk.a<String> aVar) {
        return INSTANCE.w(str, aVar);
    }

    public static final int w(String str, String str2) {
        return INSTANCE.w(str, str2);
    }
}
