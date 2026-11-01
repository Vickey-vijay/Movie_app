package m7;

import android.content.Context;
import com.liulishuo.filedownloader.model.FileDownloadHeader;

/* JADX INFO: compiled from: IFileDownloadServiceProxy.java */
/* JADX INFO: loaded from: classes8.dex */
public interface v {
    boolean a(int i10);

    void b(boolean z10);

    byte c(int i10);

    boolean d(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11, FileDownloadHeader fileDownloadHeader, boolean z12);

    boolean isConnected();

    boolean m();

    void n(Context context, Runnable runnable);

    void o(Context context);
}
