package w7;

/* JADX INFO: compiled from: DownloadServiceNotConnectedHelper.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {
    public static byte a(int i10) {
        b("request get the status for the task[%d] in the download service", Integer.valueOf(i10));
        return (byte) 0;
    }

    public static boolean c(int i10) {
        b("request pause the task[%d] in the download service", Integer.valueOf(i10));
        return false;
    }

    public static boolean d(String str, String str2, boolean z10) {
        b("request start the task([%s], [%s], [%B]) in the download service", str, str2, Boolean.valueOf(z10));
        return false;
    }

    public static void e(boolean z10) {
        b("request cancel the foreground status[%B] for the download service", Boolean.valueOf(z10));
    }

    public static void b(String str, Object... objArr) {
        d.i(a.class, str + ", but the download service isn't connected yet.\nYou can use FileDownloader#isServiceConnected() to check whether the service has been connected, \nbesides you can use following functions easier to control your code invoke after the service has been connected: \n1. FileDownloader#bindService(Runnable)\n2. FileDownloader#insureServiceBind()\n3. FileDownloader#insureServiceBindAsync()", objArr);
    }
}
