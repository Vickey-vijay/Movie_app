package z7;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: PictureMediaScannerConnection.java */
/* JADX INFO: loaded from: classes2.dex */
public class g implements MediaScannerConnection.MediaScannerConnectionClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaScannerConnection f86323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f86324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f86325c;

    /* JADX INFO: compiled from: PictureMediaScannerConnection.java */
    public interface a {
        void a();
    }

    @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
    public void onMediaScannerConnected() {
        if (TextUtils.isEmpty(this.f86324b)) {
            return;
        }
        this.f86323a.scanFile(this.f86324b, null);
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public void onScanCompleted(String str, Uri uri) {
        this.f86323a.disconnect();
        a aVar = this.f86325c;
        if (aVar != null) {
            aVar.a();
        }
    }

    public g(Context context, String str) {
        this.f86324b = str;
        MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(context.getApplicationContext(), this);
        this.f86323a = mediaScannerConnection;
        mediaScannerConnection.connect();
    }
}
