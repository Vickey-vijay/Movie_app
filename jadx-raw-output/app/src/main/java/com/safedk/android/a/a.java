package com.safedk.android.a;

import com.ironsource.C3426d4;
import com.safedk.android.analytics.brandsafety.k;
import com.safedk.android.utils.Logger;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f43398b = "AwsS3UploadImage";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    k.a f43399a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f43401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f43402e;

    public a(String str, String str2, int i10, k.a aVar) {
        this.f43400c = i10;
        this.f43401d = str;
        this.f43402e = str2;
        this.f43399a = aVar;
        Logger.d(f43398b, "AwsS3UploadImage object created, Image path=" + str + ", hash=" + str2 + ", params =" + aVar.toString());
    }

    public C0433a a() {
        C0433a c0433a;
        if (this.f43401d == null) {
            Logger.d(f43398b, "Image file to upload is null");
            return null;
        }
        try {
            String str = this.f43399a.f() + "/";
            Logger.d(f43398b, "About to upload image to " + str + ", prefix=" + this.f43399a.d() + ",Image path: " + this.f43401d);
            c cVar = new c("POST", str, "UTF-8", this.f43400c, new HashMap());
            File file = new File(this.f43401d);
            if (!file.exists()) {
                Logger.d(f43398b, "Image file to upload not found " + this.f43401d);
                c0433a = null;
            } else {
                cVar.a(C3426d4.i.W, this.f43399a.d() + "/" + this.f43402e + ".jpg");
                cVar.a("AWSAccessKeyId", this.f43399a.a());
                cVar.a("acl", this.f43399a.g());
                cVar.a("Content-Type", "image/jpeg");
                cVar.a("policy", this.f43399a.b());
                cVar.a(InAppPurchaseMetaData.KEY_SIGNATURE, this.f43399a.c());
                cVar.a("x-amz-server-side-encryption", this.f43399a.j());
                cVar.a("X-Amz-Credential", this.f43399a.k());
                cVar.a("X-Amz-Algorithm", this.f43399a.h());
                cVar.a("X-Amz-Date", this.f43399a.i());
                cVar.a(C3426d4.i.f28530b, file);
                cVar.a();
                String str2 = this.f43399a.f() + "/" + this.f43399a.d() + "/" + this.f43402e + ".jpg";
                Logger.d(f43398b, "Image uploaded successfully");
                c0433a = new C0433a(str2, cVar.b(), this.f43402e);
            }
            return c0433a;
        } catch (IOException e10) {
            Logger.d(f43398b, "IOException when uploading image file " + this.f43401d + " : " + e10.getMessage(), e10);
            return null;
        } catch (Throwable th2) {
            Logger.e(f43398b, "Failed to upload image file " + this.f43401d + " : " + th2.getMessage(), th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.safedk.android.a.a$a, reason: collision with other inner class name */
    public class C0433a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f43404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f43405c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f43406d;

        C0433a(String str, int i10, String str2) {
            this.f43404b = str;
            this.f43405c = i10;
            this.f43406d = str2;
        }

        public String a() {
            return this.f43404b;
        }

        public int b() {
            return this.f43405c;
        }

        public String c() {
            return this.f43406d;
        }
    }
}
