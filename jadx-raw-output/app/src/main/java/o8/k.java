package o8;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.core.content.FileProvider;
import com.ironsource.C3426d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: PictureFileUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class k {
    public static boolean q(InputStream inputStream, OutputStream outputStream) throws Throwable {
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
                            a(bufferedInputStream2);
                            a(bufferedOutputStream);
                            return true;
                        }
                        outputStream.write(bArr, 0, i10);
                    }
                } catch (Exception e10) {
                    e = e10;
                    bufferedInputStream = bufferedInputStream2;
                    try {
                        e.printStackTrace();
                        a(bufferedInputStream);
                        a(bufferedOutputStream);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        a(bufferedInputStream);
                        a(bufferedOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream = bufferedInputStream2;
                    a(bufferedInputStream);
                    a(bufferedOutputStream);
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

    public static void a(@Nullable Closeable closeable) {
        if (closeable instanceof Closeable) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    @SuppressLint({"DefaultLocale"})
    public static String e(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("byteSize shouldn't be less than zero!");
        }
        if (j10 < 1000) {
            Object objValueOf = String.format("%.2f", Double.valueOf(j10));
            double dA = s.a(objValueOf);
            long jRound = Math.round(dA);
            StringBuilder sb2 = new StringBuilder();
            if (jRound - dA == 0.0d) {
                objValueOf = Long.valueOf(jRound);
            }
            sb2.append(objValueOf);
            sb2.append("B");
            return sb2.toString();
        }
        if (j10 < 1000000) {
            Object objValueOf2 = String.format("%.2f", Double.valueOf(j10 / 1000.0d));
            double dA2 = s.a(objValueOf2);
            long jRound2 = Math.round(dA2);
            StringBuilder sb3 = new StringBuilder();
            if (jRound2 - dA2 == 0.0d) {
                objValueOf2 = Long.valueOf(jRound2);
            }
            sb3.append(objValueOf2);
            sb3.append("KB");
            return sb3.toString();
        }
        if (j10 < 1000000000) {
            Object objValueOf3 = String.format("%.2f", Double.valueOf(j10 / 1000000.0d));
            double dA3 = s.a(objValueOf3);
            long jRound3 = Math.round(dA3);
            StringBuilder sb4 = new StringBuilder();
            if (jRound3 - dA3 == 0.0d) {
                objValueOf3 = Long.valueOf(jRound3);
            }
            sb4.append(objValueOf3);
            sb4.append("MB");
            return sb4.toString();
        }
        Object objValueOf4 = String.format("%.2f", Double.valueOf(j10 / 1.0E9d));
        double dA4 = s.a(objValueOf4);
        long jRound4 = Math.round(dA4);
        StringBuilder sb5 = new StringBuilder();
        if (jRound4 - dA4 == 0.0d) {
            objValueOf4 = Long.valueOf(jRound4);
        }
        sb5.append(objValueOf4);
        sb5.append("GB");
        return sb5.toString();
    }

    @SuppressLint({"DefaultLocale"})
    public static String f(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("byteSize shouldn't be less than zero!");
        }
        if (j10 < 1024) {
            Object objValueOf = String.format("%.2f", Double.valueOf(j10));
            double dA = s.a(objValueOf);
            long jRound = Math.round(dA);
            StringBuilder sb2 = new StringBuilder();
            if (jRound - dA == 0.0d) {
                objValueOf = Long.valueOf(jRound);
            }
            sb2.append(objValueOf);
            sb2.append("B");
            return sb2.toString();
        }
        if (j10 < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            Object objValueOf2 = String.format("%.2f", Double.valueOf(j10 / 1024.0d));
            double dA2 = s.a(objValueOf2);
            long jRound2 = Math.round(dA2);
            StringBuilder sb3 = new StringBuilder();
            if (jRound2 - dA2 == 0.0d) {
                objValueOf2 = Long.valueOf(jRound2);
            }
            sb3.append(objValueOf2);
            sb3.append("KB");
            return sb3.toString();
        }
        if (j10 < 1073741824) {
            Object objValueOf3 = String.format("%.2f", Double.valueOf(j10 / 1048576.0d));
            double dA3 = s.a(objValueOf3);
            long jRound3 = Math.round(dA3);
            StringBuilder sb4 = new StringBuilder();
            if (jRound3 - dA3 == 0.0d) {
                objValueOf3 = Long.valueOf(jRound3);
            }
            sb4.append(objValueOf3);
            sb4.append("MB");
            return sb4.toString();
        }
        Object objValueOf4 = String.format("%.2f", Double.valueOf(j10 / 1.073741824E9d));
        double dA4 = s.a(objValueOf4);
        long jRound4 = Math.round(dA4);
        StringBuilder sb5 = new StringBuilder();
        if (jRound4 - dA4 == 0.0d) {
            objValueOf4 = Long.valueOf(jRound4);
        }
        sb5.append(objValueOf4);
        sb5.append("GB");
        return sb5.toString();
    }

    public static String g(Context context, Uri uri, String str, String[] strArr) {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                    cursorQuery.close();
                    return string;
                }
                if (cursorQuery == null) {
                    return "";
                }
            } catch (IllegalArgumentException e10) {
                Log.i("PictureFileUtils", String.format(Locale.getDefault(), "getDataColumn: _data - [%s]", e10.getMessage()));
                if (cursorQuery == null) {
                    return "";
                }
            }
            cursorQuery.close();
            return "";
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    public static boolean n(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inSampleSize = 2;
        BitmapFactory.decodeFile(str, options);
        return options.outWidth > 0 && options.outHeight > 0;
    }

    public static Uri p(Context context, File file) {
        return FileProvider.getUriForFile(context, context.getPackageName() + ".luckProvider", file);
    }

    public static File b(Context context, int i10, String str, String str2, String str3) {
        return c(context, i10, str, str2, str3);
    }

    public static File c(Context context, int i10, String str, String str2, String str3) {
        return d(context, i10, str, str2, str3);
    }

    public static File d(Context context, int i10, String str, String str2, String str3) {
        File file;
        File fileI;
        Context applicationContext = context.getApplicationContext();
        if (TextUtils.isEmpty(str3)) {
            if (TextUtils.equals("mounted", Environment.getExternalStorageState())) {
                fileI = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(fileI.getAbsolutePath());
                String str4 = File.separator;
                sb2.append(str4);
                sb2.append("Camera");
                sb2.append(str4);
                file = new File(sb2.toString());
            } else {
                fileI = i(applicationContext, i10);
                file = new File(fileI.getAbsolutePath() + File.separator);
            }
            if (!fileI.exists()) {
                fileI.mkdirs();
            }
        } else {
            File file2 = new File(str3);
            File parentFile = file2.getParentFile();
            Objects.requireNonNull(parentFile);
            if (!parentFile.exists()) {
                file2.getParentFile().mkdirs();
            }
            file = file2;
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (i10 != 2) {
            if (i10 != 3) {
                if (TextUtils.isEmpty(str2)) {
                    str2 = ".jpg";
                }
                if (zIsEmpty) {
                    str = d.c("IMG_") + str2;
                }
                return new File(file, str);
            }
            if (zIsEmpty) {
                str = d.c("AUD_") + ".amr";
            }
            return new File(file, str);
        }
        if (zIsEmpty) {
            str = d.c("VID_") + ".mp4";
        }
        return new File(file, str);
    }

    @SuppressLint({"NewApi"})
    public static String h(Context context, Uri uri) {
        Context applicationContext = context.getApplicationContext();
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(applicationContext, uri)) {
            if (k(uri)) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                if ("primary".equalsIgnoreCase(strArrSplit[0])) {
                    if (l.e()) {
                        return applicationContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES) + "/" + strArrSplit[1];
                    }
                    return Environment.getExternalStorageDirectory() + "/" + strArrSplit[1];
                }
                return "";
            }
            if (j(uri)) {
                return g(applicationContext, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), s.e(DocumentsContract.getDocumentId(uri))), null, null);
            }
            if (o(uri)) {
                String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                String str = strArrSplit2[0];
                if ("image".equals(str)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return g(applicationContext, uri2, "_id=?", new String[]{strArrSplit2[1]});
            }
            return "";
        }
        if ("content".equalsIgnoreCase(uri.getScheme())) {
            if (m(uri)) {
                return uri.getLastPathSegment();
            }
            return g(applicationContext, uri, null, null);
        }
        if (C3426d4.i.f28530b.equalsIgnoreCase(uri.getScheme())) {
            return uri.getPath();
        }
        return "";
    }

    public static File i(Context context, int i10) {
        return new File(h.b(context, i10));
    }

    public static boolean j(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean k(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean l(String str) {
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            return true;
        }
        return false;
    }

    public static boolean m(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean o(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }
}
