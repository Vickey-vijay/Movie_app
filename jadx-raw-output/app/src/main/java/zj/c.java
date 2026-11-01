package zj;

import ck.p;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import nj.b0;

/* JADX INFO: compiled from: PathUtils.kt */
/* JADX INFO: loaded from: classes10.dex */
public class c extends b {
    public static final List<Path> a(Path path, String str) throws IOException {
        p.j(path, "<this>");
        p.j(str, "glob");
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            p.g(directoryStreamNewDirectoryStream);
            List<Path> listO0 = b0.O0(directoryStreamNewDirectoryStream);
            yj.b.a(directoryStreamNewDirectoryStream, null);
            return listO0;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                yj.b.a(directoryStreamNewDirectoryStream, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ List b(Path path, String str, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            str = "*";
        }
        return a(path, str);
    }
}
