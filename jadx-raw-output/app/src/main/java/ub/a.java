package ub;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import ck.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: DefaultLogCat.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J \u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"Lub/a;", "Lub/b;", "", "tag", NotificationCompat.CATEGORY_MESSAGE, "Lmj/r;", "c", "debug", "b", "d", "", "error", "a", "<init>", "()V", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
public final class a implements b {
    @Override // ub.b
    public void a(String str, String str2, Throwable th2) {
        p.k(str, "tag");
        p.k(str2, NotificationCompat.CATEGORY_MESSAGE);
        p.k(th2, "error");
        Log.e(str, str2, th2);
    }

    @Override // ub.b
    public void b(String str, String str2) {
        p.k(str, "tag");
        p.k(str2, NotificationCompat.CATEGORY_MESSAGE);
        Log.w(str, str2);
    }

    @Override // ub.b
    public void c(String str, String str2) {
        p.k(str, "tag");
        p.k(str2, NotificationCompat.CATEGORY_MESSAGE);
        Log.i(str, str2);
    }

    @Override // ub.b
    public void d(String str, String str2) {
        p.k(str, "tag");
        p.k(str2, NotificationCompat.CATEGORY_MESSAGE);
        Log.e(str, str2);
    }

    @Override // ub.b
    public void debug(String str, String str2) {
        p.k(str, "tag");
        p.k(str2, NotificationCompat.CATEGORY_MESSAGE);
        Log.d(str, str2);
    }
}
