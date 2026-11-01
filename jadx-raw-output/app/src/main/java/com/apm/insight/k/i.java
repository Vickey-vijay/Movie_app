package com.apm.insight.k;

import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: MultipartUtility.java */
/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HttpURLConnection f6559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f6560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f6562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private k f6563f;

    public final void a(String str, String str2) {
        b(str, str2);
    }

    public final void a(String str, File... fileArr) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--");
        sb2.append(this.f6558a);
        sb2.append("\r\nContent-Disposition: form-data; name=\"");
        sb2.append(str);
        sb2.append("\"; filename=\"");
        sb2.append(str);
        sb2.append("\"\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f6561d) {
            this.f6563f.write(sb2.toString().getBytes());
        } else {
            this.f6562e.write(sb2.toString().getBytes());
        }
        if (this.f6561d) {
            com.apm.insight.l.f.a(this.f6563f, fileArr);
        } else {
            com.apm.insight.l.f.a(this.f6562e, fileArr);
        }
        if (this.f6561d) {
            this.f6563f.write("\r\n".getBytes());
        } else {
            this.f6562e.write("\r\n".getBytes());
            this.f6562e.flush();
        }
    }

    public final void b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--");
        sb2.append(this.f6558a);
        sb2.append("\r\nContent-Disposition: form-data; name=\"");
        sb2.append(str);
        sb2.append("\"\r\nContent-Type: text/plain; charset=");
        sb2.append(this.f6560c);
        sb2.append("\r\n\r\n");
        try {
            if (this.f6561d) {
                this.f6563f.write(sb2.toString().getBytes());
            } else {
                this.f6562e.write(sb2.toString().getBytes());
            }
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        try {
            if (this.f6561d) {
                this.f6563f.write(bytes);
                this.f6563f.write("\r\n".getBytes());
            } else {
                this.f6562e.write(bytes);
                this.f6562e.write("\r\n".getBytes());
            }
        } catch (IOException unused2) {
        }
    }

    public i(String str, String str2, boolean z10) throws IOException {
        this.f6560c = str2;
        this.f6561d = z10;
        String str3 = "AAA" + System.currentTimeMillis() + "AAA";
        this.f6558a = str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f6559b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.f6559b.setDoOutput(true);
        this.f6559b.setDoInput(true);
        this.f6559b.setRequestMethod("POST");
        CustomRequestHeader customRequestHeader = MonitorCrash.mCustomRequestHeader;
        if (customRequestHeader != null) {
            customRequestHeader.addRequestHeader(this.f6559b);
        }
        this.f6559b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
        if (z10) {
            this.f6559b.setRequestProperty("Content-Encoding", "gzip");
            this.f6563f = new k(this.f6559b.getOutputStream());
        } else {
            this.f6562e = new f(this.f6559b.getOutputStream());
        }
    }

    public final void a(String str, File file, Map<String, String> map) throws IOException {
        String name = file.getName();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--");
        sb2.append(this.f6558a);
        sb2.append("\r\nContent-Disposition: form-data; name=\"");
        sb2.append(str);
        sb2.append("\"; filename=\"");
        sb2.append(name);
        sb2.append("\"");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb2.append("; ");
            sb2.append(entry.getKey());
            sb2.append("=\"");
            sb2.append(entry.getValue());
            sb2.append("\"");
        }
        sb2.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.f6561d) {
            this.f6563f.write(sb2.toString().getBytes());
        } else {
            this.f6562e.write(sb2.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = fileInputStream.read(bArr);
            if (i10 == -1) {
                break;
            } else if (this.f6561d) {
                this.f6563f.write(bArr, 0, i10);
            } else {
                this.f6562e.write(bArr, 0, i10);
            }
        }
        fileInputStream.close();
        if (this.f6561d) {
            this.f6563f.write("\r\n".getBytes());
        } else {
            this.f6562e.write("\r\n".getBytes());
            this.f6562e.flush();
        }
    }

    public final String a() throws IOException {
        ArrayList arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.f6558a + "--\r\n").getBytes();
        if (this.f6561d) {
            this.f6563f.write(bytes);
            this.f6563f.b();
            this.f6563f.a();
        } else {
            this.f6562e.write(bytes);
            this.f6562e.flush();
            this.f6562e.a();
        }
        int responseCode = this.f6559b.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f6559b.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                arrayList.add(line);
            }
            bufferedReader.close();
            this.f6559b.disconnect();
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
            }
            return sb2.toString();
        }
        throw new IOException("Server returned non-OK status: ".concat(String.valueOf(responseCode)));
    }
}
