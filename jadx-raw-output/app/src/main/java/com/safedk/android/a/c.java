package com.safedk.android.a;

import android.os.Build;
import com.safedk.android.utils.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f43413a = "MultipartUtility";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f43414c = "\r\n";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43415b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e f43416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f43417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private OutputStream f43418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PrintWriter f43419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f43420h = 0;

    public c(String str, String str2, String str3, int i10, Map<String, String> map) throws IOException {
        Logger.d(f43413a, "ctor started, requestURL = " + str2);
        this.f43417e = str3;
        this.f43415b = "BOUNDARY-BOUNDARY" + System.currentTimeMillis() + "BOUNDARY";
        this.f43416d = new e(new URL(str2).openConnection());
        this.f43416d.a(str);
        this.f43416d.a(false);
        this.f43416d.b(true);
        this.f43416d.d(true);
        this.f43416d.a("Content-Type", "multipart/form-data; boundary=" + this.f43415b);
        this.f43416d.a("User-Agent", "AppLovinQualityService/5.4.0 (Android " + Build.VERSION.RELEASE + ")");
        this.f43416d.a("Accept-Encoding", "gzip,deflate");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f43416d.a(entry.getKey(), entry.getValue());
        }
        this.f43416d.a(i10);
        this.f43416d.b(i10);
        this.f43418f = this.f43416d.a();
        this.f43419g = new PrintWriter((Writer) new OutputStreamWriter(this.f43418f, str3), true);
    }

    public void a(String str, String str2) {
        this.f43419g.append((CharSequence) ("--" + this.f43415b)).append((CharSequence) f43414c);
        this.f43419g.append((CharSequence) ("Content-Disposition: form-data; name=\"" + str + "\"")).append((CharSequence) f43414c);
        this.f43419g.append((CharSequence) ("Content-Type: text/plain; charset=" + this.f43417e)).append((CharSequence) f43414c);
        this.f43419g.append((CharSequence) f43414c);
        this.f43419g.append((CharSequence) str2).append((CharSequence) f43414c);
        this.f43419g.flush();
    }

    public void a(String str, File file) throws IOException {
        String name = file.getName();
        this.f43419g.append((CharSequence) ("--" + this.f43415b)).append((CharSequence) f43414c);
        this.f43419g.append((CharSequence) ("Content-Disposition: form-data; name=\"" + str + "\"; filename=\"" + name + "\"")).append((CharSequence) f43414c);
        this.f43419g.append((CharSequence) "Content-Type: application/octet-stream").append((CharSequence) f43414c);
        this.f43419g.append((CharSequence) f43414c);
        this.f43419g.flush();
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[4096];
        while (true) {
            int i10 = fileInputStream.read(bArr);
            if (i10 != -1) {
                this.f43418f.write(bArr, 0, i10);
            } else {
                this.f43418f.flush();
                fileInputStream.close();
                this.f43419g.append((CharSequence) f43414c);
                this.f43419g.flush();
                return;
            }
        }
    }

    public void b(String str, String str2) {
        this.f43419g.append((CharSequence) (str + ": " + str2)).append((CharSequence) f43414c);
        this.f43419g.flush();
    }

    public List<String> a() throws IOException {
        Logger.d(f43413a, "finish started");
        ArrayList arrayList = new ArrayList();
        this.f43419g.append((CharSequence) f43414c).flush();
        this.f43419g.append((CharSequence) ("--" + this.f43415b + "--")).append((CharSequence) f43414c);
        this.f43419g.close();
        this.f43420h = this.f43416d.b();
        Logger.d(f43413a, "Response code = " + this.f43420h);
        if (this.f43420h < 200 || this.f43420h >= 300) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f43416d.g()));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                } else {
                    Logger.e(f43413a, "Error message: " + ((Object) sb2));
                    throw new IOException("Server returned non-OK status: " + this.f43420h);
                }
            }
        } else {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(this.f43416d.e()));
            while (true) {
                String line2 = bufferedReader2.readLine();
                if (line2 != null) {
                    arrayList.add(line2);
                } else {
                    bufferedReader2.close();
                    this.f43416d.d();
                    return arrayList;
                }
            }
        }
    }

    public int b() {
        return this.f43420h;
    }
}
