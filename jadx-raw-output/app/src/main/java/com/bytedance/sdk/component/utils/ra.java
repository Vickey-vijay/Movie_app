package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ra {

    public static final class ouw implements Comparator<File> {
        private ouw() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            long jLastModified = file.lastModified();
            long jLastModified2 = file2.lastModified();
            if (jLastModified < jLastModified2) {
                return -1;
            }
            return jLastModified == jLastModified2 ? 0 : 1;
        }

        public /* synthetic */ ouw(byte b10) {
            this();
        }
    }

    public static File ouw(Context context, boolean z10, String str, String str2) {
        String strOuw = ouw(context);
        if (z10) {
            str = ouw() + "-" + str;
        }
        if (strOuw != null) {
            String str3 = File.separator;
            if (!strOuw.endsWith(str3)) {
                strOuw = strOuw + str3;
            }
        }
        String str4 = strOuw + str;
        File file = new File(str4);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(str4, str2);
    }

    public static byte[] yu(File file) {
        FileInputStream fileInputStream;
        if (file != null && file.isFile() && file.exists() && file.canRead() && file.length() > 0) {
            try {
                Long lValueOf = Long.valueOf(file.length());
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[lValueOf.intValue()];
                    if (fileInputStream.read(bArr) == lValueOf.longValue()) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused) {
                        }
                        return bArr;
                    }
                } catch (Throwable unused2) {
                    if (fileInputStream != null) {
                    }
                    return null;
                }
            } catch (Throwable unused3) {
                fileInputStream = null;
            }
            try {
                fileInputStream.close();
            } catch (Throwable unused4) {
            }
        }
        return null;
    }

    public static void lh(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            try {
                file.delete();
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    lh(file2);
                } else {
                    try {
                        file2.delete();
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
        try {
            file.delete();
        } catch (Throwable unused3) {
        }
    }

    private static void fkw(File file) throws IOException {
        long length = file.length();
        if (length == 0) {
            le(file);
            return;
        }
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
            long j10 = length - 1;
            try {
                randomAccessFile2.seek(j10);
                byte b10 = randomAccessFile2.readByte();
                randomAccessFile2.seek(j10);
                randomAccessFile2.write(b10);
                randomAccessFile2.close();
            } catch (Throwable unused) {
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            }
        } catch (Throwable unused2) {
        }
    }

    private static void le(File file) throws IOException {
        if (file.delete() && file.createNewFile()) {
        } else {
            throw new IOException("Error recreate zero-size file ".concat(String.valueOf(file)));
        }
    }

    public static void vt(File file) throws IOException {
        if (file.exists()) {
            ko.fkw("splashLoadAd", "update file modify time");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!file.setLastModified(jCurrentTimeMillis)) {
                fkw(file);
                if (file.lastModified() < jCurrentTimeMillis) {
                    ko.yu("Files", "Last modified date " + new Date(file.lastModified()) + " is not set for file " + file.getAbsolutePath());
                }
            }
        }
    }

    public static File ouw(Context context, boolean z10, String str) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        if (z10) {
            str = ouw() + "-" + str;
        }
        if (absolutePath != null) {
            String str2 = File.separator;
            if (!absolutePath.endsWith(str2)) {
                absolutePath = absolutePath + str2;
            }
        }
        File file = new File(absolutePath + str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static String ouw(Context context) {
        File cacheDir;
        if (context == null || (cacheDir = context.getCacheDir()) == null) {
            return null;
        }
        return cacheDir.getPath();
    }

    public static List<File> ouw(File file) {
        LinkedList linkedList = new LinkedList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return linkedList;
        }
        List<File> listAsList = Arrays.asList(fileArrListFiles);
        Collections.sort(listAsList, new ouw((byte) 0));
        return listAsList;
    }

    private static String ouw() {
        String strOuw = zin.ouw();
        return (TextUtils.isEmpty(strOuw) || !strOuw.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) ? strOuw : strOuw.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "-");
    }
}
