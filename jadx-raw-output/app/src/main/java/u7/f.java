package u7;

import android.content.Intent;
import com.liulishuo.filedownloader.model.FileDownloadModel;

/* JADX INFO: compiled from: FileDownloadBroadcastHandler.java */
/* JADX INFO: loaded from: classes6.dex */
public class f {
    public static void a(FileDownloadModel fileDownloadModel) {
        if (fileDownloadModel == null) {
            throw new IllegalArgumentException();
        }
        if (fileDownloadModel.j() != -3) {
            throw new IllegalStateException();
        }
        Intent intent = new Intent("filedownloader.intent.action.completed");
        intent.putExtra("model", fileDownloadModel);
        w7.c.a().sendBroadcast(intent);
    }
}
