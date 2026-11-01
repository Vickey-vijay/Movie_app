package u7;

import android.R;
import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;

/* JADX INFO: compiled from: ForegroundServiceConfig.java */
/* JADX INFO: loaded from: classes6.dex */
@TargetApi(26)
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f72772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f72773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Notification f72774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f72775e;

    /* JADX INFO: compiled from: ForegroundServiceConfig.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f72776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f72777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f72778c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Notification f72779d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f72780e;

        public i a() {
            i iVar = new i();
            String str = this.f72777b;
            if (str == null) {
                str = "filedownloader_channel";
            }
            iVar.i(str);
            String str2 = this.f72778c;
            if (str2 == null) {
                str2 = "Filedownloader";
            }
            iVar.j(str2);
            int i10 = this.f72776a;
            if (i10 == 0) {
                i10 = R.drawable.arrow_down_float;
            }
            iVar.k(i10);
            iVar.g(this.f72780e);
            iVar.h(this.f72779d);
            return iVar;
        }

        public b b(boolean z10) {
            this.f72780e = z10;
            return this;
        }
    }

    public i() {
    }

    public final Notification a(Context context) {
        String string = context.getString(com.yk.e.R.string.default_filedownloader_notification_title);
        String string2 = context.getString(com.yk.e.R.string.default_filedownloader_notification_content);
        Notification.Builder builder = new Notification.Builder(context, this.f72772b);
        builder.setContentTitle(string).setContentText(string2).setSmallIcon(R.drawable.arrow_down_float);
        return builder.build();
    }

    public Notification b(Context context) {
        if (this.f72774d == null) {
            if (w7.d.f73535a) {
                w7.d.a(this, "build default notification", new Object[0]);
            }
            this.f72774d = a(context);
        }
        return this.f72774d;
    }

    public String c() {
        return this.f72772b;
    }

    public String d() {
        return this.f72773c;
    }

    public int e() {
        return this.f72771a;
    }

    public boolean f() {
        return this.f72775e;
    }

    public void g(boolean z10) {
        this.f72775e = z10;
    }

    public void h(Notification notification) {
        this.f72774d = notification;
    }

    public void i(String str) {
        this.f72772b = str;
    }

    public void j(String str) {
        this.f72773c = str;
    }

    public void k(int i10) {
        this.f72771a = i10;
    }

    public String toString() {
        return "ForegroundServiceConfig{notificationId=" + this.f72771a + ", notificationChannelId='" + this.f72772b + "', notificationChannelName='" + this.f72773c + "', notification=" + this.f72774d + ", needRecreateChannelId=" + this.f72775e + '}';
    }
}
