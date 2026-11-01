package f0;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: GetRequest.java */
/* JADX INFO: loaded from: classes9.dex */
public class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f52769d = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f52770e = Pattern.compile("GET /(.*) HTTP");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f52772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f52773c;

    public static d c(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (TextUtils.isEmpty(line)) {
                return new d(sb2.toString());
            }
            sb2.append(line);
            sb2.append('\n');
        }
    }

    public final long a(String str) {
        Matcher matcher = f52769d.matcher(str);
        if (matcher.find()) {
            return Long.parseLong(matcher.group(1));
        }
        return -1L;
    }

    public final String b(String str) {
        Matcher matcher = f52770e.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        throw new IllegalArgumentException("Invalid request `" + str + "`: url not found!");
    }

    public String toString() {
        return "GetRequest{rangeOffset=" + this.f52772b + ", partial=" + this.f52773c + ", uri='" + this.f52771a + "'}";
    }

    public d(String str) {
        boolean z10;
        k.c(str);
        long jA = a(str);
        this.f52772b = Math.max(0L, jA);
        if (jA >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f52773c = z10;
        this.f52771a = b(str);
    }
}
