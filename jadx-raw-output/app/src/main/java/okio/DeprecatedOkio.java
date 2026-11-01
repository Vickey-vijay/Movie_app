package okio;

import ck.p;
import com.ironsource.C3426d4;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.util.Arrays;

/* JADX INFO: renamed from: okio.-DeprecatedOkio, reason: invalid class name */
/* JADX INFO: compiled from: -DeprecatedOkio.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DeprecatedOkio {
    public static final DeprecatedOkio INSTANCE = new DeprecatedOkio();

    private DeprecatedOkio() {
    }

    public final BufferedSink buffer(Sink sink) {
        p.j(sink, "sink");
        return Okio.buffer(sink);
    }

    public final Sink sink(File file) {
        p.j(file, C3426d4.i.f28530b);
        return Okio__JvmOkioKt.sink$default(file, false, 1, null);
    }

    public final Source source(File file) {
        p.j(file, C3426d4.i.f28530b);
        return Okio.source(file);
    }

    public final Sink appendingSink(File file) {
        p.j(file, C3426d4.i.f28530b);
        return Okio.appendingSink(file);
    }

    public final BufferedSource buffer(Source source) {
        p.j(source, "source");
        return Okio.buffer(source);
    }

    public final Sink sink(OutputStream outputStream) {
        p.j(outputStream, "outputStream");
        return Okio.sink(outputStream);
    }

    public final Source source(InputStream inputStream) {
        p.j(inputStream, "inputStream");
        return Okio.source(inputStream);
    }

    public final Sink blackhole() {
        return Okio.blackhole();
    }

    public final Sink sink(java.nio.file.Path path, OpenOption... openOptionArr) {
        p.j(path, "path");
        p.j(openOptionArr, "options");
        return Okio.sink(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    public final Source source(java.nio.file.Path path, OpenOption... openOptionArr) {
        p.j(path, "path");
        p.j(openOptionArr, "options");
        return Okio.source(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    public final Sink sink(Socket socket) {
        p.j(socket, "socket");
        return Okio.sink(socket);
    }

    public final Source source(Socket socket) {
        p.j(socket, "socket");
        return Okio.source(socket);
    }
}
