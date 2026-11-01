package yads;

import android.content.Context;
import androidx.core.content.FileProvider;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public final class b71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v61 f75751b;

    public final a71 a(String str) {
        try {
            File fileA = this.f75751b.a();
            File parentFile = fileA.getParentFile();
            long freeSpace = parentFile != null ? parentFile.getFreeSpace() : 0L;
            byte[] bytes = str.getBytes(lk.c.f63591b);
            ck.p.i(bytes, "getBytes(...)");
            if (bytes.length >= freeSpace) {
                return new x61("Not enough space error");
            }
            yj.g.l(fileA, bytes);
            return new z61(FileProvider.getUriForFile(this.f75750a, this.f75750a.getPackageName() + ".monetization.ads.inspector.fileprovider", fileA));
        } catch (Exception unused) {
            boolean z10 = ad1.f75480a;
            return new x61("Failed to save report");
        }
    }

    public b71(Context context, v61 v61Var) {
        this.f75750a = context;
        this.f75751b = v61Var;
    }
}
