package y1;

import android.os.AsyncTask;
import androidx.annotation.VisibleForTesting;
import ck.p;
import com.ironsource.C3426d4;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import kotlin.Metadata;

/* JADX INFO: compiled from: FileDownloadTask.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0007B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0007\u001a\u00020\u00042\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0005\"\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0014R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Ly1/j;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "", "", "args", "a", "([Ljava/lang/String;)Ljava/lang/Boolean;", "isSuccess", "Lmj/r;", "b", "Ljava/lang/String;", "uriStr", "Ljava/io/File;", "Ljava/io/File;", "destFile", "Ly1/j$a;", "c", "Ly1/j$a;", "onSuccess", "<init>", "(Ljava/lang/String;Ljava/io/File;Ly1/j$a;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class j extends AsyncTask<String, Void, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String uriStr;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final File destFile;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final a onSuccess;

    /* JADX INFO: compiled from: FileDownloadTask.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Ly1/j$a;", "", "Ljava/io/File;", C3426d4.i.f28530b, "Lmj/r;", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface a {
        void a(File file);
    }

    public j(String str, File file, a aVar) {
        p.j(str, "uriStr");
        p.j(file, "destFile");
        p.j(aVar, "onSuccess");
        this.uriStr = str;
        this.destFile = file;
        this.onSuccess = aVar;
    }

    @VisibleForTesting(otherwise = 4)
    public Boolean a(String... args) {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            if (i2.a.d(this)) {
                return null;
            }
            try {
                p.j(args, "args");
                try {
                    URL url = new URL(this.uriStr);
                    int contentLength = url.openConnection().getContentLength();
                    DataInputStream dataInputStream = new DataInputStream(url.openStream());
                    byte[] bArr = new byte[contentLength];
                    dataInputStream.readFully(bArr);
                    dataInputStream.close();
                    DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.destFile));
                    dataOutputStream.write(bArr);
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    return Boolean.TRUE;
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            } catch (Throwable th2) {
                i2.a.b(th2, this);
                return null;
            }
        } catch (Throwable th3) {
            i2.a.b(th3, this);
            return null;
        }
    }

    public void b(boolean z10) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            if (!i2.a.d(this) && z10) {
                try {
                    this.onSuccess.a(this.destFile);
                } catch (Throwable th2) {
                    i2.a.b(th2, this);
                }
            }
        } catch (Throwable th3) {
            i2.a.b(th3, this);
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Boolean doInBackground(String[] strArr) {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            if (i2.a.d(this)) {
                return null;
            }
            try {
                return a(strArr);
            } catch (Throwable th2) {
                i2.a.b(th2, this);
                return null;
            }
        } catch (Throwable th3) {
            i2.a.b(th3, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            if (i2.a.d(this)) {
                return;
            }
            try {
                b(bool.booleanValue());
            } catch (Throwable th2) {
                i2.a.b(th2, this);
            }
        } catch (Throwable th3) {
            i2.a.b(th3, this);
        }
    }
}
