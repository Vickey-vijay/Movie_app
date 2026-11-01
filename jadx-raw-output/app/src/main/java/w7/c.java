package w7;

import android.annotation.SuppressLint;
import android.content.Context;
import com.liulishuo.filedownloader.exception.PathConflictException;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.io.File;
import java.io.IOException;
import m7.z;

/* JADX INFO: compiled from: FileDownloadHelper.java */
/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static Context f73534a;

    /* JADX INFO: compiled from: FileDownloadHelper.java */
    public interface a {
        int a(int i10, String str, String str2, long j10);
    }

    /* JADX INFO: compiled from: FileDownloadHelper.java */
    public interface b {
        n7.b create(String str) throws IOException;
    }

    /* JADX INFO: renamed from: w7.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FileDownloadHelper.java */
    public interface InterfaceC0776c {
        o7.a a();
    }

    /* JADX INFO: compiled from: FileDownloadHelper.java */
    public interface d {
        int a(String str, String str2, boolean z10);

        int b(int i10, String str, String str2, boolean z10);
    }

    /* JADX INFO: compiled from: FileDownloadHelper.java */
    public interface e {
        boolean a();

        v7.a b(File file) throws IOException;
    }

    public static boolean d(int i10, String str, boolean z10, boolean z11) {
        if (!z10 && str != null) {
            File file = new File(str);
            if (file.exists()) {
                s7.c.a().b(com.liulishuo.filedownloader.message.a.a(i10, file, z11));
                return true;
            }
        }
        return false;
    }

    public static Context a() {
        return f73534a;
    }

    public static void b(Context context) {
        f73534a = context;
    }

    public static boolean c(int i10, long j10, String str, String str2, z zVar) {
        int iB;
        if (str2 == null || str == null || (iB = zVar.b(str, i10)) == 0) {
            return false;
        }
        s7.c.a().b(com.liulishuo.filedownloader.message.a.b(i10, j10, new PathConflictException(iB, str, str2)));
        return true;
    }

    public static boolean e(int i10, FileDownloadModel fileDownloadModel, z zVar, boolean z10) {
        if (zVar.a(fileDownloadModel)) {
            s7.c.a().b(com.liulishuo.filedownloader.message.a.c(i10, fileDownloadModel.i(), fileDownloadModel.m(), z10));
            return true;
        }
        return false;
    }
}
