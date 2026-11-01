package kd;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.annotation.NonNull;
import com.ironsource.C3426d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: compiled from: UCropFileUtils.java */
/* JADX INFO: loaded from: classes9.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f62779a = new SimpleDateFormat("yyyyMMddHHmmssSSS");

    public static boolean v(InputStream inputStream, OutputStream outputStream) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                bufferedOutputStream = new BufferedOutputStream(outputStream);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i10 = bufferedInputStream2.read(bArr);
                        if (i10 == -1) {
                            outputStream.flush();
                            a.c(bufferedInputStream2);
                            a.c(bufferedOutputStream);
                            return true;
                        }
                        outputStream.write(bArr, 0, i10);
                    }
                } catch (Exception e10) {
                    e = e10;
                    bufferedInputStream = bufferedInputStream2;
                    try {
                        e.printStackTrace();
                        a.c(bufferedInputStream);
                        a.c(bufferedOutputStream);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        a.c(bufferedInputStream);
                        a.c(bufferedOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream = bufferedInputStream2;
                    a.c(bufferedInputStream);
                    a.c(bufferedOutputStream);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                bufferedOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                bufferedOutputStream = null;
            }
        } catch (Exception e12) {
            e = e12;
            bufferedOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedOutputStream = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v2 */
    public static String d(Context context, Uri uri, String str, String[] strArr) throws Throwable {
        Cursor cursorQuery;
        ?? r10 = 0;
        try {
            try {
                cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            cursorQuery.close();
                            return string;
                        }
                    } catch (IllegalArgumentException e10) {
                        e = e10;
                        Log.i("FileUtils", String.format(Locale.getDefault(), "getDataColumn: _data - [%s]", e.getMessage()));
                        if (cursorQuery != null) {
                        }
                        return null;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th2) {
                th = th2;
                r10 = context;
                if (r10 != 0) {
                    r10.close();
                }
                throw th;
            }
        } catch (IllegalArgumentException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (r10 != 0) {
                r10.close();
            }
            throw th;
        }
        return null;
    }

    public static String h(Context context, boolean z10, Uri uri) {
        if (z10) {
            String strF = f(context, uri);
            if (m(strF)) {
                return ".gif";
            }
            if (t(strF)) {
                return ".webp";
            }
        }
        return "";
    }

    public static String i(Context context, boolean z10, Uri uri) {
        if (z10) {
            String strF = f(context, uri);
            if (m(strF)) {
                return ".gif";
            }
            if (t(strF)) {
                return ".webp";
            }
        }
        return ".jpeg";
    }

    public static boolean m(String str) {
        return str != null && (str.equals("image/gif") || str.equals("image/GIF"));
    }

    public static boolean o(String str) {
        return str != null && str.startsWith("audio");
    }

    public static boolean q(String str) {
        return str != null && str.startsWith("video");
    }

    public static boolean t(String str) {
        return str != null && (str.equals("image/webp") || str.equals("image/WEBP"));
    }

    public static void a(@NonNull String str, @NonNull String str2) throws Throwable {
        FileChannel fileChannel;
        if (str.equalsIgnoreCase(str2)) {
            return;
        }
        FileChannel channel = null;
        try {
            FileChannel channel2 = new FileInputStream(new File(str)).getChannel();
            try {
                channel = new FileOutputStream(new File(str2)).getChannel();
                channel2.transferTo(0L, channel2.size(), channel);
                channel2.close();
                if (channel != null) {
                    channel.close();
                }
            } catch (Throwable th2) {
                th = th2;
                FileChannel fileChannel2 = channel;
                channel = channel2;
                fileChannel = fileChannel2;
                if (channel != null) {
                    channel.close();
                }
                if (fileChannel != null) {
                    fileChannel.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileChannel = null;
        }
    }

    public static String b() {
        return f62779a.format(Long.valueOf(System.currentTimeMillis()));
    }

    public static String c(String str) {
        return str + f62779a.format(Long.valueOf(System.currentTimeMillis()));
    }

    public static String e(Uri uri) {
        if (!j(uri.toString()) && !p(uri.toString())) {
            return uri.getPath();
        }
        return uri.toString();
    }

    public static String f(Context context, Uri uri) {
        if (uri.getScheme().equals("content")) {
            return context.getContentResolver().getType(uri);
        }
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()).toLowerCase());
    }

    @SuppressLint({"NewApi"})
    public static String g(Context context, Uri uri) {
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (l(uri)) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                if ("primary".equalsIgnoreCase(strArrSplit[0])) {
                    return Environment.getExternalStorageDirectory() + "/" + strArrSplit[1];
                }
            } else if (k(uri)) {
                String documentId = DocumentsContract.getDocumentId(uri);
                if (!TextUtils.isEmpty(documentId)) {
                    try {
                        return d(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                    } catch (NumberFormatException e10) {
                        Log.i("FileUtils", e10.getMessage());
                        return null;
                    }
                }
            } else if (r(uri)) {
                String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                String str = strArrSplit2[0];
                if ("image".equals(str)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return d(context, uri2, "_id=?", new String[]{strArrSplit2[1]});
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                if (n(uri)) {
                    return uri.getLastPathSegment();
                }
                return d(context, uri, null, null);
            }
            if (C3426d4.i.f28530b.equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    public static boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("content://");
    }

    public static boolean k(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean l(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean n(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean p(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.startsWith("http") && !str.startsWith("https") && !str.startsWith("/http") && !str.startsWith("/https")) {
            return false;
        }
        return true;
    }

    public static boolean r(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static boolean s(String str) {
        if (!TextUtils.isEmpty(str) && str.toLowerCase().endsWith(".mp4")) {
            return true;
        }
        return false;
    }

    public static Uri u(Context context, boolean z10, Uri uri, Uri uri2) {
        String path;
        Uri uriFromFile;
        try {
            String strH = h(context, z10, uri);
            if (TextUtils.isEmpty(strH)) {
                return uri2;
            }
            if (j(uri2.toString())) {
                path = uri2.toString();
            } else {
                path = uri2.getPath();
            }
            String strReplace = path.replace(path.substring(path.lastIndexOf(".")), strH);
            if (j(strReplace)) {
                uriFromFile = Uri.parse(strReplace);
            } else {
                uriFromFile = Uri.fromFile(new File(strReplace));
            }
            return uriFromFile;
        } catch (Exception e10) {
            e10.printStackTrace();
            return uri2;
        }
    }
}
