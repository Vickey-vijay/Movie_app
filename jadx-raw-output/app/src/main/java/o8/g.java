package o8;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.luck.picture.lib.thread.PictureThreadUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: compiled from: DownloadFileUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: compiled from: DownloadFileUtils.java */
    public class a extends PictureThreadUtils.d<String> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f65139i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Context f65140j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f65141k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f8.d f65142l;

        public a(String str, Context context, String str2, f8.d dVar) {
            this.f65139i = str;
            this.f65140j = context;
            this.f65141k = str2;
            this.f65142l = dVar;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public String g() {
            Uri uriInsert;
            InputStream inputStreamA;
            try {
                ContentValues contentValues = new ContentValues();
                String strG = s.g(Long.valueOf(System.currentTimeMillis()));
                if (a8.d.d(this.f65139i)) {
                    contentValues.put("_display_name", d.c("AUD_"));
                    contentValues.put("mime_type", (TextUtils.isEmpty(this.f65139i) || this.f65139i.startsWith("video") || this.f65139i.startsWith("image")) ? "audio/mpeg" : this.f65139i);
                    if (l.e()) {
                        contentValues.put("datetaken", strG);
                        contentValues.put("relative_path", Environment.DIRECTORY_MUSIC);
                    } else {
                        contentValues.put("_data", (TextUtils.equals(Environment.getExternalStorageState(), "mounted") ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC) : new File(h.b(this.f65140j, 3))).getAbsolutePath() + File.separator + d.c("AUD_") + ".amr");
                    }
                    uriInsert = this.f65140j.getContentResolver().insert(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, contentValues);
                } else if (a8.d.i(this.f65139i)) {
                    contentValues.put("_display_name", d.c("VID_"));
                    contentValues.put("mime_type", (TextUtils.isEmpty(this.f65139i) || this.f65139i.startsWith("audio") || this.f65139i.startsWith("image")) ? "video/mp4" : this.f65139i);
                    if (l.e()) {
                        contentValues.put("datetaken", strG);
                        contentValues.put("relative_path", Environment.DIRECTORY_MOVIES);
                    } else {
                        contentValues.put("_data", (TextUtils.equals(Environment.getExternalStorageState(), "mounted") ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES) : new File(h.b(this.f65140j, 2))).getAbsolutePath() + File.separator + d.c("VID_") + ".mp4");
                    }
                    uriInsert = this.f65140j.getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
                } else {
                    contentValues.put("_display_name", d.c("IMG_"));
                    contentValues.put("mime_type", (TextUtils.isEmpty(this.f65139i) || this.f65139i.startsWith("audio") || this.f65139i.startsWith("video")) ? "image/jpeg" : this.f65139i);
                    if (l.e()) {
                        contentValues.put("datetaken", strG);
                        contentValues.put("relative_path", "DCIM/Camera");
                    } else if (a8.d.f(this.f65139i) || a8.d.m(this.f65141k)) {
                        contentValues.put("_data", (TextUtils.equals(Environment.getExternalStorageState(), "mounted") ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) : new File(h.b(this.f65140j, 1))).getAbsolutePath() + File.separator + d.c("IMG_") + ".gif");
                    }
                    uriInsert = this.f65140j.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                }
                if (uriInsert == null) {
                    return null;
                }
                if (a8.d.g(this.f65141k)) {
                    inputStreamA = new URL(this.f65141k).openStream();
                } else {
                    inputStreamA = a8.d.c(this.f65141k) ? z7.e.a(this.f65140j, Uri.parse(this.f65141k)) : new FileInputStream(this.f65141k);
                }
                if (k.q(inputStreamA, z7.e.b(this.f65140j, uriInsert))) {
                    return k.h(this.f65140j, uriInsert);
                }
                return null;
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void m(String str) {
            PictureThreadUtils.d(this);
            f8.d dVar = this.f65142l;
            if (dVar != null) {
                dVar.a(str);
            }
        }
    }

    public static void a(Context context, String str, String str2, f8.d<String> dVar) {
        PictureThreadUtils.h(new a(str2, context, str, dVar));
    }
}
