package sg.bigo.ads.common.g.b;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f69637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f69638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f69639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f69640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f69641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f69642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f69643g;

    public a(Cursor cursor) {
        this.f69637a = -1L;
        this.f69637a = cursor.getLong(cursor.getColumnIndex("_id"));
        this.f69638b = cursor.getString(cursor.getColumnIndex("event_action"));
        this.f69639c = cursor.getString(cursor.getColumnIndex("event_info"));
        this.f69640d = cursor.getInt(cursor.getColumnIndex("states"));
        this.f69641e = cursor.getString(cursor.getColumnIndex("ext"));
        this.f69642f = cursor.getLong(cursor.getColumnIndex("ctime"));
        this.f69643g = cursor.getLong(cursor.getColumnIndex("mtime"));
    }

    public a(String str, String str2) {
        this.f69637a = -1L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f69638b = str;
        this.f69639c = str2;
        this.f69640d = 0;
        this.f69641e = "";
        this.f69642f = jCurrentTimeMillis;
        this.f69643g = jCurrentTimeMillis;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != a.class) {
            return false;
        }
        long j10 = this.f69637a;
        return j10 >= 0 && j10 == ((a) obj).f69637a;
    }

    @NonNull
    public String toString() {
        return "mId = " + this.f69637a + ",eventInfo=" + this.f69639c;
    }
}
