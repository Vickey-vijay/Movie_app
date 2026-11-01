package com.safedk.android.analytics.brandsafety;

import android.os.Bundle;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class k {
    private static final String A = "policy";
    private static final String B = "s3_key_prefix";
    private static final String C = "image_id";
    private static final String D = "Content-Type";
    private static final String E = ".jpg";
    private static k F = null;
    private static final Object G = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f44466a = "original_url";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f44467b = "resolved_url";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f44468c = "fingerprint";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f44469d = "sdk_uuid";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f44470e = "impression_id";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f44471f = "package";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f44472g = "ImageUploadManager";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f44473h = "type";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f44474i = "hash";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f44475j = "sdk";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f44476k = "keys";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f44477l = "images_to_upload";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f44478m = "images_to_discard";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f44479n = "s3_access_tokens";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f44480o = "resolve_urls";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f44481p = "url";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f44482q = "base_url";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f44483r = "attributes";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f44484s = "bucket";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f44485t = "x-amz-date";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f44486u = "signature";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f44487v = "AWSAccessKeyId";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f44488w = "acl";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f44489x = "x-amz-server-side-encryption";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f44490y = "x-amz-algorithm";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f44491z = "x-amz-credential";

    private k() {
        b();
    }

    private void b() {
        AppLovinBridge.registerListener(AppLovinBridge.f43424b, new com.safedk.android.analytics.b() { // from class: com.safedk.android.analytics.brandsafety.k.1
            @Override // com.safedk.android.analytics.b
            public void a(String str, Bundle bundle) {
                Logger.d(k.f44472g, "Response received");
                k.this.a(bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bundle bundle) {
        try {
            Logger.d(f44472g, "Response from server: " + bundle.toString());
            String string = null;
            String string2 = null;
            String string3 = null;
            String string4 = null;
            String string5 = null;
            String string6 = null;
            String string7 = null;
            String string8 = null;
            String string9 = null;
            String string10 = null;
            String string11 = null;
            if (bundle.containsKey(f44479n)) {
                Bundle bundle2 = bundle.getBundle(f44479n);
                Logger.d(f44472g, "s3AccessTokens=" + bundle2.toString());
                string = bundle2.getString(f44482q);
                Bundle bundle3 = bundle2.getBundle(f44483r);
                string2 = bundle3.getString(f44484s);
                string3 = bundle3.getString(f44485t);
                string4 = bundle3.getString("signature");
                string5 = bundle3.getString(f44487v);
                string6 = bundle3.getString(f44488w);
                string7 = bundle3.getString(f44489x);
                string8 = bundle3.getString(f44490y);
                string9 = bundle3.getString(f44491z);
                string10 = bundle3.getString(A);
                string11 = bundle3.getString("Content-Type");
                Logger.d(f44472g, "s3 credentials collected");
            }
            ArrayList arrayList = new ArrayList();
            if (bundle.containsKey(f44477l)) {
                ArrayList<String> stringArrayList = bundle.getStringArrayList(f44477l);
                Logger.d(f44472g, "imagesToUploadArrayList=" + stringArrayList.toString());
                for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                    Bundle bundle4 = (Bundle) stringArrayList.get(i10);
                    String string12 = bundle4.getString(f44468c);
                    String string13 = bundle4.getString("image_id");
                    String string14 = bundle4.getString(B);
                    Logger.d(f44472g, "imagesToUploadBundle item : fingerprint=" + string12 + ", imageId=" + string13 + ", s3KeyPrefix=" + string14);
                    a aVar = new a(string5, string10, string4, string14, string2, string, string5, string6, string8, string3, string7, string9, string11);
                    c cVarH = com.safedk.android.analytics.brandsafety.b.h(string13);
                    if (cVarH != null) {
                        Logger.d(f44472g, "Image for upload added : " + string14);
                        arrayList.add(new b(cVarH.f43777p, string13, aVar, string12));
                    }
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    b bVar = (b) arrayList.get(i11);
                    if (bVar.f44507a != null) {
                        com.safedk.android.analytics.brandsafety.a aVarA = SafeDK.getInstance().a(bVar.f44507a);
                        if (aVarA != null) {
                            Logger.d(f44472g, "Executing image upload request for ad type " + bVar.f44507a.name());
                            aVarA.a(bVar.f44509c, bVar.f44508b, bVar.f44510d);
                        } else {
                            Logger.d(f44472g, "Upload: finder not found for ad type " + bVar.f44507a.name());
                        }
                    } else {
                        Logger.d(f44472g, "Upload: finder not found for ad type null");
                    }
                }
            }
            if (bundle.containsKey(f44480o)) {
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList(f44480o);
                Logger.d(f44472g, "clickUrlsToResolveArrayList=" + stringArrayList2.toString());
                for (int i12 = 0; i12 < stringArrayList2.size(); i12++) {
                    Bundle bundle5 = (Bundle) stringArrayList2.get(i12);
                    String string15 = bundle5.getString(f44468c);
                    String string16 = bundle5.getString("sdk_uuid");
                    String string17 = bundle5.getString("impression_id");
                    String string18 = bundle5.getString("url");
                    Logger.d(f44472g, "clickUrlsToResolveBundle item : fingerprint=" + string15 + ", url=" + string18);
                    if (string15 != null && string18 != null) {
                        i.a().a(string18, string15, string16, string17);
                    } else {
                        Logger.d(f44472g, "fingerprint and url are null, skipping");
                    }
                }
            }
            if (bundle.containsKey(f44478m)) {
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList(f44478m);
                Logger.d(f44472g, "Images to discard : " + stringArrayList3.toString());
                for (String str : stringArrayList3) {
                    c cVarH2 = com.safedk.android.analytics.brandsafety.b.h(str);
                    if (cVarH2 != null) {
                        com.safedk.android.analytics.brandsafety.a aVarA2 = SafeDK.getInstance().a(cVarH2.f43777p);
                        if (aVarA2 != null) {
                            Logger.d(f44472g, "Executing image discard request for hash " + str);
                            aVarA2.d(str);
                        } else {
                            Logger.d(f44472g, "Discard : finder not found for image id " + str);
                        }
                    }
                }
            }
            if (bundle.isEmpty() || !bundle.containsKey(f44477l)) {
                c();
            }
        } catch (Throwable th2) {
            Logger.e(f44472g, "Failed to handle response from server", th2);
            new CrashReporter().caughtException(th2);
        }
    }

    private void c() {
        Iterator<com.safedk.android.analytics.brandsafety.b> it = SafeDK.getInstance().x().values().iterator();
        while (it.hasNext()) {
            it.next().b((l) null);
        }
    }

    public static synchronized k a() {
        if (F == null) {
            F = new k();
        }
        return F;
    }

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f44493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f44494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f44495c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f44496d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f44497e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f44498f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f44499g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        String f44500h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        String f44501i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        String f44502j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        String f44503k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        String f44504l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        String f44505m;

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
            this.f44493a = str;
            this.f44494b = str2;
            this.f44495c = str3;
            this.f44496d = str4;
            this.f44497e = str5;
            this.f44498f = str6;
            this.f44499g = str7;
            this.f44500h = str8;
            this.f44501i = str9;
            this.f44502j = str10;
            this.f44503k = str11;
            this.f44504l = str12;
            this.f44505m = str13;
            Logger.d(k.f44472g, "AwsUploadParams ctor, awsAccessKey=" + str + ", keyPrefix=" + str4 + ", bucket=" + str5);
        }

        public String a() {
            return this.f44493a;
        }

        public String b() {
            return this.f44494b;
        }

        public String c() {
            return this.f44495c;
        }

        public String d() {
            return this.f44496d;
        }

        public String e() {
            return this.f44497e;
        }

        public String f() {
            return this.f44498f;
        }

        public String g() {
            return this.f44500h;
        }

        public String h() {
            return this.f44501i;
        }

        public String i() {
            return this.f44502j;
        }

        public String j() {
            return this.f44503k;
        }

        public String k() {
            return this.f44504l;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BaseUrl=" + this.f44498f + ", keyPrefix = " + this.f44496d);
            return sb2.toString();
        }
    }

    class b implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        BrandSafetyUtils.AdType f44507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f44508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        a f44509c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f44510d;

        b(BrandSafetyUtils.AdType adType, String str, a aVar, String str2) {
            this.f44507a = adType;
            this.f44508b = str;
            this.f44509c = aVar;
            this.f44510d = str2;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object compareTo) {
            return this.f44507a.ordinal() - ((b) compareTo).f44507a.ordinal();
        }
    }
}
