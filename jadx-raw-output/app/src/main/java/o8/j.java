package o8;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.luck.picture.lib.thread.PictureThreadUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLConnection;

/* JADX INFO: compiled from: MediaUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class j {

    /* JADX INFO: compiled from: MediaUtils.java */
    public class a extends PictureThreadUtils.d<d8.b> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Context f65144i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f65145j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ f8.d f65146k;

        public a(Context context, String str, f8.d dVar) {
            this.f65144i = context;
            this.f65145j = str;
            this.f65146k = dVar;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public d8.b g() {
            return j.f(this.f65144i, this.f65145j);
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void m(d8.b bVar) {
            PictureThreadUtils.d(this);
            f8.d dVar = this.f65146k;
            if (dVar != null) {
                dVar.a(bVar);
            }
        }
    }

    /* JADX INFO: compiled from: MediaUtils.java */
    public class b extends PictureThreadUtils.d<d8.b> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Context f65147i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f65148j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ f8.d f65149k;

        public b(Context context, String str, f8.d dVar) {
            this.f65147i = context;
            this.f65148j = str;
            this.f65149k = dVar;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public d8.b g() {
            return j.l(this.f65147i, this.f65148j);
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void m(d8.b bVar) {
            PictureThreadUtils.d(this);
            f8.d dVar = this.f65149k;
            if (dVar != null) {
                dVar.a(bVar);
            }
        }
    }

    public static boolean n(int i10, int i11) {
        return i10 > 0 && i11 > 0 && i11 > i10 * 3;
    }

    public static Bundle a(String str, String[] strArr, int i10, int i11, String str2) {
        Bundle bundle = new Bundle();
        if (Build.VERSION.SDK_INT >= 26) {
            bundle.putString("android:query-arg-sql-selection", str);
            bundle.putStringArray("android:query-arg-sql-selection-args", strArr);
            bundle.putString("android:query-arg-sql-sort-order", str2);
            if (l.f()) {
                bundle.putString("android:query-arg-sql-limit", i10 + " offset " + i11);
            }
        }
        return bundle;
    }

    public static String c(String str) {
        File file = new File(str);
        return file.getParentFile() != null ? file.getParentFile().getName() : "Camera";
    }

    public static d8.b d(Context context, String str) {
        d8.b bVar = new d8.b();
        if (a8.d.g(str)) {
            return bVar;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                try {
                    if (a8.d.c(str)) {
                        mediaMetadataRetriever.setDataSource(context, Uri.parse(str));
                    } else {
                        mediaMetadataRetriever.setDataSource(str);
                    }
                    bVar.d(s.e(mediaMetadataRetriever.extractMetadata(9)));
                    mediaMetadataRetriever.release();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                mediaMetadataRetriever.release();
            }
            return bVar;
        } catch (Throwable th2) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    public static int e(Context context, String str) {
        Cursor cursorQuery = null;
        try {
            try {
                String[] strArr = {"%" + str + "%"};
                cursorQuery = l.f() ? context.getApplicationContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, a("_data like ?", strArr, 1, 0, "_id DESC"), null) : context.getApplicationContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, "_data like ?", strArr, "_id DESC limit 1 offset 0");
                if (cursorQuery == null || cursorQuery.getCount() <= 0 || !cursorQuery.moveToFirst()) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return -1;
                }
                int i10 = d.a(cursorQuery.getLong(cursorQuery.getColumnIndex("date_added"))) <= 1 ? cursorQuery.getInt(cursorQuery.getColumnIndex("_id")) : -1;
                cursorQuery.close();
                return i10;
            } catch (Exception e10) {
                e10.printStackTrace();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return -1;
            }
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        throw th2;
    }

    public static d8.b f(Context context, String str) {
        d8.b bVar = new d8.b();
        if (a8.d.g(str)) {
            return bVar;
        }
        InputStream inputStream = null;
        try {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                InputStream inputStreamA = a8.d.c(str) ? z7.e.a(context, Uri.parse(str)) : new FileInputStream(str);
                try {
                    BitmapFactory.decodeStream(inputStreamA, null, options);
                    bVar.g(options.outWidth);
                    bVar.e(options.outHeight);
                    k.a(inputStreamA);
                } catch (Exception e10) {
                    inputStream = inputStreamA;
                    e = e10;
                    e.printStackTrace();
                    k.a(inputStream);
                } catch (Throwable th2) {
                    inputStream = inputStreamA;
                    th = th2;
                    k.a(inputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
        return bVar;
    }

    public static void g(Context context, String str, f8.d<d8.b> dVar) {
        PictureThreadUtils.h(new a(context, str, dVar));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008e A[DONT_GENERATE, PHI: r2
  0x008e: PHI (r2v5 android.database.Cursor) = (r2v3 android.database.Cursor), (r2v6 android.database.Cursor) binds: [B:21:0x008c, B:15:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    public static Long[] j(Context context, String str) {
        Long[] lArr = {0L, 0L};
        Cursor cursorQuery = null;
        try {
            String[] strArr = {"%" + str + "%"};
            cursorQuery = l.f() ? context.getContentResolver().query(MediaStore.Files.getContentUri("external"), null, a("_data like ?", strArr, 1, 0, "_id DESC"), null) : context.getContentResolver().query(MediaStore.Files.getContentUri("external"), null, "_data like ?", strArr, "_id DESC limit 1 offset 0");
            if (cursorQuery != null && cursorQuery.getCount() > 0 && cursorQuery.moveToFirst()) {
                lArr[0] = Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndex("_id")));
                lArr[1] = Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndex("bucket_id")));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return lArr;
    }

    public static d8.b l(Context context, String str) {
        int iC;
        int iC2;
        d8.b bVar = new d8.b();
        if (a8.d.g(str)) {
            return bVar;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                try {
                    if (a8.d.c(str)) {
                        mediaMetadataRetriever.setDataSource(context, Uri.parse(str));
                    } else {
                        mediaMetadataRetriever.setDataSource(str);
                    }
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
                    if (TextUtils.equals("90", strExtractMetadata) || TextUtils.equals("270", strExtractMetadata)) {
                        int iC3 = s.c(mediaMetadataRetriever.extractMetadata(18));
                        iC = iC3;
                        iC2 = s.c(mediaMetadataRetriever.extractMetadata(19));
                    } else {
                        iC2 = s.c(mediaMetadataRetriever.extractMetadata(18));
                        iC = s.c(mediaMetadataRetriever.extractMetadata(19));
                    }
                    bVar.g(iC2);
                    bVar.e(iC);
                    bVar.f(strExtractMetadata);
                    bVar.d(s.e(mediaMetadataRetriever.extractMetadata(9)));
                    mediaMetadataRetriever.release();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    mediaMetadataRetriever.release();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return bVar;
        } catch (Throwable th2) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            throw th2;
        }
    }

    public static void m(Context context, String str, f8.d<d8.b> dVar) {
        PictureThreadUtils.h(new b(context, str, dVar));
    }

    public static void b(Context context, String str) {
        try {
            if (a8.d.c(str)) {
                context.getContentResolver().delete(Uri.parse(str), null, null);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static String h(File file) {
        return URLConnection.getFileNameMap().getContentTypeFor(file.getName());
    }

    public static String i(String str) {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str).toLowerCase());
        if (TextUtils.isEmpty(mimeTypeFromExtension)) {
            mimeTypeFromExtension = h(new File(str));
        }
        if (TextUtils.isEmpty(mimeTypeFromExtension)) {
            return "image/jpeg";
        }
        return mimeTypeFromExtension;
    }

    public static String k(long j10, String str) {
        Uri contentUri;
        if (a8.d.h(str)) {
            contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (a8.d.i(str)) {
            contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else if (a8.d.d(str)) {
            contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        } else {
            contentUri = MediaStore.Files.getContentUri("external");
        }
        return ContentUris.withAppendedId(contentUri, j10).toString();
    }

    public static void o(Context context, int i10) {
        try {
            context.getApplicationContext().getContentResolver().delete(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[]{Long.toString(i10)});
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
