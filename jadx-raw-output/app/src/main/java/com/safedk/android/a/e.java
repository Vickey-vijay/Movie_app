package com.safedk.android.a;

import com.safedk.android.SafeDK;
import com.safedk.android.utils.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f43421a = e.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HttpURLConnection f43422b;

    public e(URLConnection uRLConnection) {
        this.f43422b = (HttpURLConnection) uRLConnection;
    }

    public void a(boolean z10) {
        this.f43422b.setUseCaches(z10);
    }

    public void a(String str) throws ProtocolException {
        this.f43422b.setRequestMethod(str);
    }

    public void a(String str, String str2) {
        this.f43422b.setRequestProperty(str, str2);
    }

    public void b(boolean z10) {
        this.f43422b.setDoOutput(z10);
    }

    public OutputStream a() throws IOException {
        return this.f43422b.getOutputStream();
    }

    public void c(boolean z10) {
        this.f43422b.setInstanceFollowRedirects(z10);
    }

    public int b() throws IOException {
        return this.f43422b.getResponseCode();
    }

    public URL c() {
        return this.f43422b.getURL();
    }

    public void a(int i10) {
        this.f43422b.setConnectTimeout(i10);
    }

    public void d() {
        this.f43422b.disconnect();
    }

    public InputStream e() throws IOException {
        return this.f43422b.getInputStream();
    }

    public void f() throws IOException {
        if (SafeDK.getInstance().s()) {
            Logger.e(f43421a, "SafeDK network activity in offline mode ");
            Logger.printStackTrace();
        }
        this.f43422b.connect();
    }

    public String b(String str) {
        return this.f43422b.getHeaderField(str);
    }

    public InputStream g() {
        return this.f43422b.getErrorStream();
    }

    public void d(boolean z10) {
        this.f43422b.setDoInput(z10);
    }

    public void b(int i10) {
        this.f43422b.setReadTimeout(i10);
    }
}
