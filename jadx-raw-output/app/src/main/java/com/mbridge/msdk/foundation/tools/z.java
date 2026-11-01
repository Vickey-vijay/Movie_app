package com.mbridge.msdk.foundation.tools;

import android.net.Uri;
import android.text.TextUtils;
import androidx.multidex.MultiDexExtractor;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: DynamicViewResourceManager.java */
/* JADX INFO: loaded from: classes9.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f35396a;

    /* JADX INFO: compiled from: DynamicViewResourceManager.java */
    public class a implements OnDownloadStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f35398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f35399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f35400d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f35401e;

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage downloadMessage) {
        }

        public a(String str, String str2, c cVar, String str3, String str4) {
            this.f35397a = str;
            this.f35398b = str2;
            this.f35399c = cVar;
            this.f35400d = str3;
            this.f35401e = str4;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage downloadMessage) {
            String str;
            try {
                String str2 = this.f35397a + File.separator + this.f35398b;
                String str3 = this.f35397a;
                MBResourceManager.getInstance().unZip(str2, str3);
                if (this.f35399c != null) {
                    if (downloadMessage != null) {
                        try {
                            str = (String) downloadMessage.getExtra("responseHeaders");
                        } catch (Throwable th2) {
                            q0.b("DynamicViewResourceManager", th2.getMessage());
                            str = "";
                        }
                    } else {
                        str = "";
                    }
                    try {
                        this.f35399c.a(this.f35400d, str3, this.f35401e, str, false);
                    } catch (Exception e10) {
                        q0.b("DynamicViewResourceManager", e10.getMessage());
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
            c cVar = this.f35399c;
            if (cVar != null) {
                try {
                    cVar.a(this.f35400d, downloadError);
                } catch (Exception e10) {
                    q0.b("DynamicViewResourceManager", e10.getMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: DynamicViewResourceManager.java */
    public class b implements OnDownloadStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f35403b;

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage downloadMessage) {
        }

        public b(String str, String str2) {
            this.f35402a = str;
            this.f35403b = str2;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage downloadMessage) {
            try {
                MBResourceManager.getInstance().unZip(this.f35402a + File.separator + this.f35403b, this.f35402a);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: compiled from: DynamicViewResourceManager.java */
    public interface c {
        void a(String str, DownloadError downloadError);

        void a(String str, String str2, String str3, String str4, boolean z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        if (r14 != 5) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(int r14, java.lang.String r15, java.lang.String r16, com.mbridge.msdk.foundation.tools.z.c r17, com.mbridge.msdk.foundation.entity.CampaignEx r18) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.z.a(int, java.lang.String, java.lang.String, com.mbridge.msdk.foundation.tools.z$c, com.mbridge.msdk.foundation.entity.CampaignEx):void");
    }

    private static String b(int i10, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            String path = new URL(str2).getPath();
            String strSubstring = path.substring(path.lastIndexOf(47) + 1);
            return !TextUtils.isEmpty(strSubstring) ? strSubstring.replace(MultiDexExtractor.EXTRACTED_SUFFIX, "") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    static {
        ArrayList arrayList = new ArrayList(4);
        f35396a = arrayList;
        arrayList.add("mbridge_splash_native_template_v_v1.xml");
        arrayList.add("mbridge_splash_native_template_h_v1.xml");
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String path = new URL(str).getPath();
            String strSubstring = path.substring(path.lastIndexOf(47) + 1);
            if (TextUtils.isEmpty(strSubstring)) {
                return "";
            }
            String strReplace = strSubstring.replace(MultiDexExtractor.EXTRACTED_SUFFIX, "");
            List<String> list = f35396a;
            return (list == null || list.contains(strReplace)) ? "" : strReplace;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(int i10, String str, String str2) {
        String strB;
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            strB = b(i10, str, str2);
        } catch (Exception unused) {
            strB = "";
        }
        File file = null;
        String str3 = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_XML) + File.separator;
        try {
            if (!TextUtils.isEmpty(strB)) {
                file = new File(str3, strB);
            }
        } catch (Exception unused2) {
        }
        if (file == null || !file.exists()) {
            file = new File(str3 + File.separator + strB.replace(".xml", ""), strB);
        }
        return file.getPath();
    }

    public static String a(String str) {
        String strB;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_KEY_NATMP);
            if (!TextUtils.isEmpty(queryParameter) && !queryParameter.equals("1")) {
                return "";
            }
        } catch (Throwable unused) {
        }
        try {
            strB = b(str);
        } catch (Exception unused2) {
            strB = "";
        }
        if (TextUtils.isEmpty(strB)) {
            return "";
        }
        try {
            String str2 = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_XML) + File.separator;
            File file = new File(str2, strB);
            if (file.isFile() && file.exists()) {
                return file.getPath();
            }
            String path = new URL(str).getPath();
            a(str, path.substring(path.lastIndexOf(47) + 1), str2, strB);
            return "";
        } catch (Exception unused3) {
        }
    }

    private static final void a(String str, String str2, String str3, String str4, c cVar, CampaignEx campaignEx, int i10) throws Exception {
        q0.a("test_zip_download ", "start download path： " + str3 + str2);
        DownloadMessage<?> downloadMessage = new DownloadMessage<>(campaignEx, str, str2, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_OTHER);
        downloadMessage.addExtra("resource_type", Integer.valueOf(i10));
        MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout((long) com.mbridge.msdk.foundation.same.a.f34911u).withConnectTimeout((long) com.mbridge.msdk.foundation.same.a.f34910t).withTimeout(60000L).withWriteTimeout((long) com.mbridge.msdk.foundation.same.a.f34909s).with("download_scene", "download_dynamic_view").withDownloadPriority(DownloadPriority.MEDIUM).withHttpRetryCounter(1).withDirectoryPathInternal(str3).withDownloadStateListener(new a(str3, str2, cVar, str, str4)).build().start();
    }

    private static final void a(String str, String str2, String str3, String str4) throws Exception {
        MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str, str2, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_OTHER)).withReadTimeout(com.mbridge.msdk.foundation.same.a.f34911u).withConnectTimeout(com.mbridge.msdk.foundation.same.a.f34905o).with("download_scene", "download_dynamic_view").withWriteTimeout(com.mbridge.msdk.foundation.same.a.f34909s).withTimeout(60000L).withDownloadPriority(DownloadPriority.MEDIUM).withHttpRetryCounter(1).withDirectoryPathInternal(str3).withDownloadStateListener(new b(str3, str2)).build().start();
    }
}
