package f5;

import androidx.annotation.Nullable;
import g5.k0;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: SimpleCacheSpan.java */
/* JADX INFO: loaded from: classes.dex */
public final class m extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f52878h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f52879i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f52880j = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    @Nullable
    public static m e(File file, long j10, long j11, h hVar) {
        File file2;
        String strK;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            File fileK = k(file, hVar);
            if (fileK == null) {
                return null;
            }
            file2 = fileK;
            name = fileK.getName();
        }
        Matcher matcher = f52880j.matcher(name);
        if (!matcher.matches() || (strK = hVar.k(Integer.parseInt(matcher.group(1)))) == null) {
            return null;
        }
        long length = j10 == -1 ? file2.length() : j10;
        if (length == 0) {
            return null;
        }
        return new m(strK, Long.parseLong(matcher.group(2)), length, j11 == -9223372036854775807L ? Long.parseLong(matcher.group(3)) : j11, file2);
    }

    public static m g(String str, long j10, long j11) {
        return new m(str, j10, j11, -9223372036854775807L, null);
    }

    public static m h(String str, long j10) {
        return new m(str, j10, -1L, -9223372036854775807L, null);
    }

    public static m i(String str, long j10) {
        return new m(str, j10, -1L, -9223372036854775807L, null);
    }

    public static File j(File file, int i10, long j10, long j11) {
        return new File(file, i10 + "." + j10 + "." + j11 + ".v3.exo");
    }

    public m d(File file, long j10) {
        g5.a.f(this.f52847e);
        return new m(this.f52844b, this.f52845c, this.f52846d, j10, file);
    }

    public m(String str, long j10, long j11, long j12, @Nullable File file) {
        super(str, j10, j11, j12, file);
    }

    @Nullable
    public static File k(File file, h hVar) {
        String strGroup;
        String name = file.getName();
        Matcher matcher = f52879i.matcher(name);
        if (matcher.matches()) {
            strGroup = k0.N0(matcher.group(1));
            if (strGroup == null) {
                return null;
            }
        } else {
            matcher = f52878h.matcher(name);
            if (!matcher.matches()) {
                return null;
            }
            strGroup = matcher.group(1);
        }
        File fileJ = j((File) g5.a.h(file.getParentFile()), hVar.f(strGroup), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)));
        if (!file.renameTo(fileJ)) {
            return null;
        }
        return fileJ;
    }

    @Nullable
    public static m f(File file, long j10, h hVar) {
        return e(file, j10, -9223372036854775807L, hVar);
    }
}
