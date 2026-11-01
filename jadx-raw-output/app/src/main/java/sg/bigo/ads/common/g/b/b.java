package sg.bigo.ads.common.g.b;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f69644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f69645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f69646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f69647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f69648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f69649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f69650g;

    public b(Cursor cursor) {
        this.f69644a = -1L;
        this.f69644a = cursor.getLong(cursor.getColumnIndex("_id"));
        this.f69645b = cursor.getString(cursor.getColumnIndex("event_id"));
        this.f69646c = cursor.getString(cursor.getColumnIndex("event_info"));
        this.f69647d = cursor.getLong(cursor.getColumnIndex("expired_ts"));
        this.f69648e = cursor.getString(cursor.getColumnIndex("ext"));
        this.f69649f = cursor.getLong(cursor.getColumnIndex("ctime"));
        this.f69650g = cursor.getLong(cursor.getColumnIndex("mtime"));
    }

    public b(String str, String str2, long j10) {
        this.f69644a = -1L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f69645b = str;
        this.f69646c = str2;
        this.f69647d = j10;
        this.f69648e = "";
        this.f69649f = jCurrentTimeMillis;
        this.f69650g = jCurrentTimeMillis;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != b.class) {
            return false;
        }
        long j10 = this.f69644a;
        return j10 >= 0 && j10 == ((b) obj).f69644a;
    }

    @NonNull
    public String toString() {
        return "mId = " + this.f69644a + StringUtils.COMMA + "mEventId = " + this.f69645b + StringUtils.COMMA + "mExpiredTs = " + this.f69647d + StringUtils.COMMA + "eventInfo = " + this.f69646c;
    }
}
