package sa;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.format.Formatter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.text.DecimalFormat;
import org.eclipse.jetty.util.security.Constraint;

/* JADX INFO: compiled from: SystemInfoUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f67168a = new j0();

    public static final String a(long j10) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (j10 == 0) {
            return "0B";
        }
        if (j10 < 1024) {
            return decimalFormat.format(j10) + 'B';
        }
        if (j10 < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            return decimalFormat.format(j10 / ((double) 1024)) + "KB";
        }
        if (j10 < 1073741824) {
            return decimalFormat.format(j10 / ((double) 1048576)) + "MB";
        }
        return decimalFormat.format(j10 / ((double) 1073741824)) + "GB";
    }

    public static final String b(Context context) {
        if (ck.p.e(Environment.getExternalStorageState(), "mounted")) {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            String fileSize = Formatter.formatFileSize(context, ((long) (statFs.getBlockCount() - statFs.getAvailableBlocks())) * ((long) statFs.getBlockSize()));
            ck.p.g(fileSize);
            return fileSize;
        }
        return "sdcard unable!";
    }

    public static final String c(Context context) {
        if (ck.p.e(Environment.getExternalStorageState(), "mounted")) {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            String fileSize = Formatter.formatFileSize(context, statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
            ck.p.g(fileSize);
            return fileSize;
        }
        return "sdcard unable!";
    }

    public final boolean d(boolean z10) {
        boolean z11;
        String strS = o0.s();
        if (strS != null && strS.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11 || ck.p.e(o0.s(), "none") || ck.p.e(o0.s(), Constraint.NONE)) {
            return false;
        }
        String strS2 = o0.s();
        ck.p.g(strS2);
        if (lk.a0.N0(strS2, new String[]{StringUtils.COMMA}, false, 0, 6, null).size() < 2) {
            return false;
        }
        if ((o0.O() == 0 && !z10) || o0.O() != 1 || z10) {
            return true;
        }
        return false;
    }
}
