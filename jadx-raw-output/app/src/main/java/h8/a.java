package h8;

import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import f8.s;
import f8.t;
import f8.u;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: IBridgeMediaLoader.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f53796c = "a";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Uri f53797d = MediaStore.Files.getContentUri("external");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f53798e = {"_id", "_data", "mime_type", "width", "height", "duration", "_size", "bucket_display_name", "_display_name", "bucket_id", "date_added", "orientation"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f53799f = {"_id", "_data", "mime_type", "width", "height", "duration", "_size", "bucket_display_name", "_display_name", "bucket_id", "date_added", "orientation", "COUNT(*) AS count"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f53800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PictureSelectionConfig f53801b;

    public abstract void f(t<LocalMediaFolder> tVar);

    public abstract void g(s<LocalMediaFolder> sVar);

    public abstract void h(long j10, int i10, int i11, u<LocalMedia> uVar);

    public PictureSelectionConfig a() {
        return this.f53801b;
    }

    public void e(Context context, PictureSelectionConfig pictureSelectionConfig) {
        this.f53800a = context;
        this.f53801b = pictureSelectionConfig;
    }

    public Context getContext() {
        return this.f53800a;
    }

    public String b() {
        long j10;
        if (a().f32232r == 0) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = a().f32232r;
        }
        return String.format(Locale.CHINA, "%d <%s duration and duration <= %d", Long.valueOf(Math.max(0L, a().f32234s)), "=", Long.valueOf(j10));
    }

    public String c() {
        long j10;
        if (a().f32246y == 0) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = a().f32246y;
        }
        return String.format(Locale.CHINA, "%d <%s _size and _size <= %d", Long.valueOf(Math.max(0L, a().f32248z)), "=", Long.valueOf(j10));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    public String d() {
        String str;
        HashSet<String> hashSet = new HashSet(a().R);
        StringBuilder sb2 = new StringBuilder();
        int i10 = -1;
        for (String str2 : hashSet) {
            if (!TextUtils.isEmpty(str2)) {
                if (a().f32200b == a8.e.d()) {
                    if (!str2.startsWith("image") && !str2.startsWith("audio")) {
                        i10++;
                        if (i10 == 0) {
                            str = " AND ";
                        } else {
                            str = " OR ";
                        }
                        sb2.append(str);
                        sb2.append("mime_type");
                        sb2.append("='");
                        sb2.append(str2);
                        sb2.append("'");
                    }
                } else if (a().f32200b == a8.e.c()) {
                    if (!str2.startsWith("audio") && !str2.startsWith("video")) {
                        i10++;
                        if (i10 == 0) {
                            str = " AND ";
                        } else {
                            str = " OR ";
                        }
                        sb2.append(str);
                        sb2.append("mime_type");
                        sb2.append("='");
                        sb2.append(str2);
                        sb2.append("'");
                    }
                } else if (a().f32200b != a8.e.b() || (!str2.startsWith("video") && !str2.startsWith("image"))) {
                    i10++;
                    if (i10 == 0) {
                        str = " AND ";
                    } else {
                        str = " OR ";
                    }
                    sb2.append(str);
                    sb2.append("mime_type");
                    sb2.append("='");
                    sb2.append(str2);
                    sb2.append("'");
                }
            }
        }
        if (a().f32200b != a8.e.d() && !a().F && !hashSet.contains(a8.d.q())) {
            sb2.append(" AND (mime_type!='image/gif')");
        }
        return sb2.toString();
    }
}
