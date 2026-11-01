package m7;

import android.content.Context;
import com.liulishuo.filedownloader.model.FileDownloadHeader;

/* JADX INFO: compiled from: FileDownloadServiceProxy.java */
/* JADX INFO: loaded from: classes8.dex */
public class n implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f64234b;

    /* JADX INFO: compiled from: FileDownloadServiceProxy.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f64235a = new n();
    }

    @Override // m7.v
    public boolean d(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11, FileDownloadHeader fileDownloadHeader, boolean z12) {
        return this.f64234b.d(str, str2, z10, i10, i11, i12, z11, fileDownloadHeader, z12);
    }

    public n() {
        this.f64234b = w7.e.a().f73539d ? new o() : new p();
    }

    @Override // m7.v
    public boolean a(int i10) {
        return this.f64234b.a(i10);
    }

    @Override // m7.v
    public void b(boolean z10) {
        this.f64234b.b(z10);
    }

    @Override // m7.v
    public byte c(int i10) {
        return this.f64234b.c(i10);
    }

    @Override // m7.v
    public boolean isConnected() {
        return this.f64234b.isConnected();
    }

    @Override // m7.v
    public boolean m() {
        return this.f64234b.m();
    }

    @Override // m7.v
    public void n(Context context, Runnable runnable) {
        this.f64234b.n(context, runnable);
    }

    @Override // m7.v
    public void o(Context context) {
        this.f64234b.o(context);
    }

    public static u7.e.a e() {
        if (f().f64234b instanceof o) {
            return (u7.e.a) f().f64234b;
        }
        return null;
    }

    public static n f() {
        return b.f64235a;
    }
}
