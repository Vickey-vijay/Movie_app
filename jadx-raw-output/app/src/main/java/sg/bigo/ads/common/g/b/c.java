package sg.bigo.ads.common.g.b;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.j;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f69651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f69652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f69653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f69654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f69655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f69656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f69657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map<String, String> f69658h;

    public c(Cursor cursor) {
        this.f69651a = -1L;
        this.f69652b = false;
        this.f69653c = 0;
        this.f69654d = 0L;
        this.f69655e = "";
        this.f69651a = cursor.getLong(cursor.getColumnIndex("_id"));
        try {
            this.f69658h = j.a(new JSONObject(cursor.getString(cursor.getColumnIndex("ad_data"))));
        } catch (JSONException unused) {
        }
        a(cursor.getString(cursor.getColumnIndex("tracker_imp")));
        b(cursor.getString(cursor.getColumnIndex("tracker_cli")));
        c(cursor.getString(cursor.getColumnIndex("tracker_nurl")));
        d(cursor.getString(cursor.getColumnIndex("tracker_lurl")));
        this.f69653c = cursor.getInt(cursor.getColumnIndex("tracker_type"));
        this.f69654d = cursor.getLong(cursor.getColumnIndex("last_retry_ts"));
        this.f69655e = cursor.getString(cursor.getColumnIndex("ext"));
        this.f69656f = cursor.getLong(cursor.getColumnIndex("ctime"));
        this.f69657g = cursor.getLong(cursor.getColumnIndex("mtime"));
        this.f69652b = true;
    }

    public c(@NonNull Map<String, String> map) {
        this.f69651a = -1L;
        this.f69652b = false;
        this.f69653c = 0;
        this.f69654d = 0L;
        this.f69655e = "";
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f69658h = map;
        this.f69656f = jCurrentTimeMillis;
        this.f69657g = jCurrentTimeMillis;
    }

    @NonNull
    public final String a() {
        Map<String, String> map = this.f69658h;
        if (map == null) {
            return "";
        }
        if ((map instanceof HashMap) && map != null) {
            map.remove(null);
            map.values().removeAll(Collections.singleton(null));
        }
        return new JSONObject(this.f69658h).toString();
    }

    public abstract void a(String str);

    @NonNull
    public abstract String b();

    public abstract void b(String str);

    @NonNull
    public abstract String c();

    public abstract void c(String str);

    @NonNull
    public abstract String d();

    public abstract void d(String str);

    @NonNull
    public abstract String e();

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != c.class) {
            return false;
        }
        long j10 = this.f69651a;
        return j10 >= 0 && j10 == ((c) obj).f69651a;
    }

    public long f() {
        return 0L;
    }

    @NonNull
    public String toString() {
        return "mId = " + this.f69651a;
    }
}
