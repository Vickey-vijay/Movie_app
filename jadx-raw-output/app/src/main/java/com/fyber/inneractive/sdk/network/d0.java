package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.cache.a f16005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f16006c;

    public com.fyber.inneractive.sdk.cache.m a() throws Throwable {
        try {
            if (!this.f16005b.d()) {
                new c0();
                return new com.fyber.inneractive.sdk.cache.m();
            }
            Object objA = this.f16005b.a(a(this.f16005b.c()));
            if (this.f16006c == null) {
                this.f16006c = this.f16004a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            return new com.fyber.inneractive.sdk.cache.m(objA, this.f16006c.getString(this.f16005b.b(), null));
        } catch (Exception unused) {
            b();
            return new com.fyber.inneractive.sdk.cache.m();
        }
    }

    public final void b(String str) {
        if (this.f16006c == null) {
            this.f16006c = this.f16004a.getSharedPreferences("IAConfigurationPreferences", 0);
        }
        this.f16006c.edit().putString(this.f16005b.b(), str).apply();
    }

    public d0(Context context, com.fyber.inneractive.sdk.cache.a aVar) {
        this.f16004a = context;
        this.f16005b = aVar;
    }

    public final void b() {
        if (this.f16006c == null) {
            this.f16006c = this.f16004a.getSharedPreferences("IAConfigurationPreferences", 0);
        }
        this.f16006c.edit().remove(this.f16005b.b()).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public boolean a(String str, String str2) {
        boolean z10;
        int i10 = 1;
        i10 = 1;
        i10 = 1;
        IAlog.a("caching file %s", str);
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        try {
            try {
                fileOutputStreamOpenFileOutput = this.f16004a.openFileOutput(str, 0);
                fileOutputStreamOpenFileOutput.write(str2.getBytes());
                try {
                    IAlog.a("File cached successfully", new Object[0]);
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e10) {
                        IAlog.f("Failed closing cache file: %s", e10.getMessage());
                    }
                } catch (Exception e11) {
                    e = e11;
                    z10 = true;
                    IAlog.f("Failed caching file: %s", e.getMessage());
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (Exception e12) {
                            IAlog.f("Failed closing cache file: %s", e12.getMessage());
                        }
                    }
                    i10 = z10;
                }
            } catch (Throwable th2) {
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e13) {
                        Object[] objArr = new Object[i10];
                        objArr[0] = e13.getMessage();
                        IAlog.f("Failed closing cache file: %s", objArr);
                    }
                }
                throw th2;
            }
        } catch (Exception e14) {
            e = e14;
            z10 = false;
        }
        return i10;
    }

    public final String a(String str) throws Throwable {
        FileInputStream fileInputStreamOpenFileInput;
        IAlog.a("reading local file: %s", str);
        FileInputStream fileInputStream = null;
        str = null;
        str = null;
        String str2 = null;
        try {
            fileInputStreamOpenFileInput = this.f16004a.openFileInput(str);
            try {
                try {
                    byte[] bArr = new byte[fileInputStreamOpenFileInput.available()];
                    fileInputStreamOpenFileInput.read(bArr);
                    String str3 = new String(bArr, "UTF-8");
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (Exception e10) {
                        IAlog.f("Failed closing local file: %s", e10.getMessage());
                    }
                    str2 = str3;
                } catch (Exception e11) {
                    e = e11;
                    if (e instanceof FileNotFoundException) {
                        throw new FileNotFoundException();
                    }
                    IAlog.a("Failed reading local file: %s", e.getMessage());
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (Exception e12) {
                            IAlog.f("Failed closing local file: %s", e12.getMessage());
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStreamOpenFileInput;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception e13) {
                        IAlog.f("Failed closing local file: %s", e13.getMessage());
                    }
                }
                throw th;
            }
        } catch (Exception e14) {
            e = e14;
            fileInputStreamOpenFileInput = null;
        } catch (Throwable th3) {
            th = th3;
        }
        IAlog.a("local file %s read successfully", str);
        return str2;
    }
}
