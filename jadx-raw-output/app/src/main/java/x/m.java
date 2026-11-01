package x;

import androidx.core.app.NotificationCompat;

/* JADX INFO: compiled from: CastInterface.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f74237a = new m();

    @Override // x.b
    public void a(String str, p<mj.r> pVar) {
        ck.p.j(str, "speed");
    }

    @Override // x.b
    public void b(String str, String str2, p<mj.r> pVar) {
        ck.p.j(str, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        ck.p.j(str2, "title");
    }

    @Override // x.b
    public void c(p<mj.r> pVar) {
    }
}
