package n7;

import java.io.IOException;
import java.io.InputStream;
import java.net.ProtocolException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: FileDownloadConnection.java */
/* JADX INFO: loaded from: classes8.dex */
public interface b {
    void a();

    InputStream b() throws IOException;

    void c(String str, String str2);

    Map<String, List<String>> d();

    Map<String, List<String>> e();

    void execute() throws IOException;

    boolean f(String str, long j10);

    String g(String str);

    int getResponseCode() throws IOException;

    boolean h(String str) throws ProtocolException;
}
