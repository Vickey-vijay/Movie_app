package ub;

import androidx.core.app.NotificationCompat;
import ck.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: LogUtils.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0018\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0018\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J \u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u000f"}, d2 = {"Lub/c;", "", "", "tag", NotificationCompat.CATEGORY_MESSAGE, "Lmj/r;", "d", "a", "e", "b", "", "error", "c", "<init>", "()V", "com.opensource.svgaplayer"}, k = 1, mv = {1, 4, 0})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f72796a = new c();

    public final void a(String str, String str2) {
        b bVarA;
        p.k(str, "tag");
        p.k(str2, NotificationCompat.CATEGORY_MESSAGE);
        d dVar = d.f72799c;
        if (dVar.b() && (bVarA = dVar.a()) != null) {
            bVarA.debug(str, str2);
        }
    }

    public final void b(String str, String str2) {
        b bVarA;
        p.k(str, "tag");
        p.k(str2, NotificationCompat.CATEGORY_MESSAGE);
        d dVar = d.f72799c;
        if (dVar.b() && (bVarA = dVar.a()) != null) {
            bVarA.d(str, str2);
        }
    }

    public final void c(String str, String str2, Throwable th2) {
        b bVarA;
        p.k(str, "tag");
        p.k(str2, NotificationCompat.CATEGORY_MESSAGE);
        p.k(th2, "error");
        d dVar = d.f72799c;
        if (dVar.b() && (bVarA = dVar.a()) != null) {
            bVarA.a(str, str2, th2);
        }
    }

    public final void d(String str, String str2) {
        b bVarA;
        p.k(str, "tag");
        p.k(str2, NotificationCompat.CATEGORY_MESSAGE);
        d dVar = d.f72799c;
        if (dVar.b() && (bVarA = dVar.a()) != null) {
            bVarA.c(str, str2);
        }
    }

    public final void e(String str, String str2) {
        b bVarA;
        p.k(str, "tag");
        p.k(str2, NotificationCompat.CATEGORY_MESSAGE);
        d dVar = d.f72799c;
        if (dVar.b() && (bVarA = dVar.a()) != null) {
            bVarA.b(str, str2);
        }
    }
}
