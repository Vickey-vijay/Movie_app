package io.bidmachine.util.file;

import android.content.Context;
import android.net.Uri;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ck.p;
import com.ironsource.C3426d4;
import com.ironsource.Y5;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.util.Utils;
import io.bidmachine.util.UtilsKt;
import java.io.File;
import java.math.BigInteger;
import kotlin.Metadata;
import lk.c;

/* JADX INFO: compiled from: FileUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u0006H\u0007J\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u0006H\u0007J\u0012\u0010\u0013\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0007J\u001c\u0010\u0013\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0006H\u0007J\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0007J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0007J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0007J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0006H\u0007J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u0002H\u0007J\u0012\u0010\u001f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010 \u001a\u00020\u0004H\u0007J\u0012\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010\"\u001a\u00020!H\u0007J\u0012\u0010$\u001a\u0004\u0018\u00010\u00022\u0006\u0010\"\u001a\u00020!H\u0007R\u0014\u0010%\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lio/bidmachine/util/file/FileUtils;", "", "Ljava/io/File;", C3426d4.i.f28530b, "", "hasContent", "", "prefix", "startWith", "readSafely", "text", "writeSafely", "Landroid/net/Uri;", "toUri", "toUriSafely", "dir", "childPathname", "createFile", "createSubDir", "createTempFile", "tempFilePrefix", "url", "createFileByUrl", "generateFileName", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "renameToSafely", "filePrefix", "Lmj/r;", "deleteFiles", "deleteTempFiles", Y5.b.f27922b, "canUseExternalFilesDir", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "getExternalDir", "getExternalDirDirty", "TEMP_PREFIX", "Ljava/lang/String;", "<init>", "()V", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
public final class FileUtils {
    public static final FileUtils INSTANCE = new FileUtils();
    public static final String TEMP_PREFIX = "temp";

    private FileUtils() {
    }

    public static final File createTempFile(File dir) {
        return createTempFile(dir, "temp");
    }

    public static final File createFile(File dir, String childPathname) {
        p.j(childPathname, "childPathname");
        return FileUtilsKt.createFile(dir, childPathname);
    }

    public static final File createFileByUrl(File dir, String url) {
        p.j(url, "url");
        return FileUtilsKt.createFileByUrl(dir, url);
    }

    public static final File createSubDir(File dir, String childPathname) {
        p.j(childPathname, "childPathname");
        return FileUtilsKt.createSubDir(dir, childPathname);
    }

    public static final File createTempFile(File dir, String tempFilePrefix) {
        p.j(tempFilePrefix, "tempFilePrefix");
        return FileUtilsKt.createTempFile(dir, tempFilePrefix);
    }

    public static /* synthetic */ File createTempFile$default(File file, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "temp";
        }
        return createTempFile(file, str);
    }

    public static final void deleteFiles(File file, String str) {
        p.j(file, "dir");
        p.j(str, "filePrefix");
        FileUtilsKt.deleteFiles(file, str);
    }

    public static final void deleteTempFiles(File file) {
        p.j(file, "dir");
        FileUtilsKt.deleteTempFiles(file);
    }

    public static final String generateFileName(String url) {
        p.j(url, "url");
        byte[] bytes = url.getBytes(c.f63591b);
        p.i(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrApplyMD5 = UtilsKt.applyMD5(bytes);
        if (bArrApplyMD5 == null) {
            return null;
        }
        return new BigInteger(bArrApplyMD5).abs().toString(36);
    }

    public static final File getExternalDir(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return FileUtilsKt.getExternalDir(context);
    }

    public static final File getExternalDirDirty(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return FileUtilsKt.getExternalDirDirty(context);
    }

    public static final String readSafely(File file) {
        p.j(file, C3426d4.i.f28530b);
        return FileUtilsKt.readSafely(file);
    }

    public static final boolean renameToSafely(File from, File to2) {
        p.j(from, TypedValues.TransitionType.S_FROM);
        p.j(to2, TypedValues.TransitionType.S_TO);
        return FileUtilsKt.renameToSafely(from, to2);
    }

    public static final boolean startWith(File file, String prefix) {
        p.j(file, C3426d4.i.f28530b);
        p.j(prefix, "prefix");
        return FileUtilsKt.startWith(file, prefix);
    }

    public static final Uri toUri(File file) {
        p.j(file, C3426d4.i.f28530b);
        return FileUtilsKt.toUri(file);
    }

    public static final boolean writeSafely(File file, String text) {
        p.j(file, C3426d4.i.f28530b);
        p.j(text, "text");
        return FileUtilsKt.writeSafely(file, text);
    }

    public static final boolean canUseExternalFilesDir() {
        return Utils.isExternalMemoryAvailable();
    }

    public static final boolean deleteFile(File file) {
        return FileUtilsKt.deleteFile(file);
    }

    public static final boolean hasContent(File file) {
        return FileUtilsKt.hasContent(file);
    }

    public static final Uri toUriSafely(File file) {
        return FileUtilsKt.toUriSafely(file);
    }
}
