package com.mbridge.msdk.mbbanner.common.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.out.MBridgeIds;
import com.safedk.android.internal.partials.MintegralFilesBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: compiled from: BannerLoader.java */
/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f35641n = "b";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f35642a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.data.b f35644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.util.a f35645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.b f35646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.d f35647f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35643b = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f35648g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Timer f35649h = new Timer();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile List<String> f35650i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f35651j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile boolean f35652k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile boolean f35653l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f35654m = "";

    /* JADX INFO: compiled from: BannerLoader.java */
    public class a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f35656b;

        public a(String str, CampaignEx campaignEx) {
            this.f35655a = str;
            this.f35656b = campaignEx;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (b.this.f35648g) {
                return;
            }
            b.this.f35648g = true;
            b.this.a(this.f35655a, -1, "", false, this.f35656b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BannerLoader.java */
    public class C0340b extends com.mbridge.msdk.mbbanner.common.response.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.mbbanner.common.data.a f35658c;

        @Override // com.mbridge.msdk.mbbanner.common.response.a
        public void a(CampaignUnit campaignUnit) throws Throwable {
            try {
                q0.c(b.f35641n, "requestCampaign--> Succeed");
                campaignUnit.setLocalRequestId(this.f35658c.b());
                b.this.f35645d.a(b.this.f35646e, campaignUnit, this.unitId);
                b.this.a(this.unitId, this.f35658c.b(), campaignUnit);
            } catch (Exception e10) {
                q0.c(b.f35641n, "requestCampaign--> Fail with exception = " + e10.getMessage());
                com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880000);
                bVar.a(new MBridgeIds(this.placementId, this.unitId));
                bVar.b(this.f35658c.b());
                bVar.a((campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().isEmpty()) ? null : campaignUnit.getAds().get(0));
                bVar.a((Throwable) e10);
                b.this.f35645d.a(b.this.f35646e, bVar);
                b.this.f35647f.a(this.unitId);
            }
        }

        public C0340b(com.mbridge.msdk.mbbanner.common.data.a aVar) {
            this.f35658c = aVar;
        }

        @Override // com.mbridge.msdk.mbbanner.common.response.a
        public void a(int i10, String str) {
            q0.c(b.f35641n, "requestCampaign--> Fail errorCode:" + i10 + " msg:" + str);
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880003);
            bVar.c(i10 + "#" + str);
            bVar.a(new MBridgeIds(this.placementId, this.unitId));
            bVar.b(this.f35658c.b());
            b.this.f35645d.a(b.this.f35646e, bVar);
            b.this.f35647f.a(this.unitId);
        }
    }

    /* JADX INFO: compiled from: BannerLoader.java */
    public class c extends com.mbridge.msdk.foundation.same.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f35661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f35662c;

        public c(String str, CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            this.f35660a = str;
            this.f35661b = campaignEx;
            this.f35662c = context;
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            if (!TextUtils.isEmpty(str)) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35660a);
                cVar.a(str, eVar);
                com.mbridge.msdk.mbbanner.common.report.a.a(str, cVar, this.f35661b, this.f35662c, null);
            }
        }
    }

    /* JADX INFO: compiled from: BannerLoader.java */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignUnit f35664a;

        public d(CampaignUnit campaignUnit) {
            this.f35664a = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.c(b.f35641n, "在单独子线程保存数据库 开始");
            j.a(g.a(b.this.f35642a)).d();
            CampaignUnit campaignUnit = this.f35664a;
            if (campaignUnit != null && campaignUnit.getAds() != null && this.f35664a.getAds().size() > 0) {
                BannerUtils.uisList(b.this.f35642a, this.f35664a.getAds());
            }
            q0.c(b.f35641n, "在单独子线程保存数据库 完成");
        }
    }

    /* JADX INFO: compiled from: BannerLoader.java */
    public static class e implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f35666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f35667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CampaignEx f35668c;

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            if (MBridgeConstans.DEBUG) {
                q0.c(b.f35641n, "DownloadImageListener campaign image fail");
            }
            b bVar = this.f35666a;
            if (bVar != null) {
                bVar.a(this.f35667b, 1, str2, false, this.f35668c);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f35667b, this.f35668c.getCurrentLocalRid());
                cVarA.a(this.f35668c);
                cVarA.e(10);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                cVarA.e(10);
                eVar.a("resource_type", 10);
                eVar.a("result", 3);
                eVar.a("url", str2);
                com.mbridge.msdk.mbbanner.common.report.a.a("m_download_end", cVarA, eVar);
            } catch (Throwable th2) {
                q0.b(b.f35641n, th2.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (MBridgeConstans.DEBUG) {
                q0.c(b.f35641n, "DownloadImageListener campaign image success");
            }
            b bVar = this.f35666a;
            if (bVar != null) {
                bVar.a(this.f35667b, 1, str, true, this.f35668c);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(this.f35667b, this.f35668c.getCurrentLocalRid());
                cVarA.a(this.f35668c);
                cVarA.e(10);
                cVarA.e(10);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("resource_type", 10);
                eVar.a("result", 1);
                eVar.a("url", str);
                com.mbridge.msdk.mbbanner.common.report.a.a("m_download_end", cVarA, eVar);
            } catch (Throwable th2) {
                q0.b(b.f35641n, th2.getMessage());
            }
        }

        public e(b bVar, String str, CampaignEx campaignEx) {
            this.f35666a = bVar;
            this.f35667b = str;
            this.f35668c = campaignEx;
        }
    }

    private void b(String str, List<CampaignEx> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (CampaignEx campaignEx : list) {
            if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
                this.f35650i.add(campaignEx.getImageUrl());
                com.mbridge.msdk.foundation.same.image.b.a(this.f35642a).a(campaignEx.getImageUrl(), new e(this, str, campaignEx));
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(str, campaignEx.getCurrentLocalRid());
                cVarA.a(campaignEx);
                cVarA.e(10);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("resource_type", 10);
                com.mbridge.msdk.mbbanner.common.report.a.a("m_download_start", cVarA, eVar);
            }
        }
    }

    public b(Context context, com.mbridge.msdk.mbbanner.common.data.b bVar, com.mbridge.msdk.mbbanner.common.listener.b bVar2, com.mbridge.msdk.mbbanner.common.util.a aVar) {
        this.f35642a = context.getApplicationContext();
        this.f35644c = bVar;
        this.f35646e = bVar2;
        this.f35645d = aVar;
    }

    private void a(String str, int i10) {
        if (this.f35653l) {
            return;
        }
        if ((this.f35651j || this.f35652k) && this.f35650i.size() == 0) {
            q0.c(f35641n, "在子线程处理业务逻辑 完成");
            this.f35648g = true;
            this.f35653l = true;
            this.f35649h.cancel();
            this.f35645d.a(this.f35646e, str, i10);
            this.f35647f.a(str);
        }
    }

    private void a(String str, CampaignEx campaignEx) {
        String str2 = f35641n;
        q0.c(str2, "在子线程处理业务逻辑 完成");
        q0.c(str2, "downloadResource--> Fail");
        this.f35648g = true;
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880027);
        MBridgeIds mBridgeIds = new MBridgeIds();
        mBridgeIds.setUnitId(str);
        bVar.a(mBridgeIds);
        bVar.b(this.f35644c.a());
        bVar.a(campaignEx);
        this.f35645d.b(this.f35646e, bVar);
        this.f35647f.a(str);
    }

    private void b(String str, String str2, CampaignEx campaignEx) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        a(str, 3, str2, true, campaignEx);
    }

    private String b() {
        return this.f35644c.d();
    }

    private void b(String str) {
        this.f35644c.b(str);
    }

    public void a(String str, int i10, String str2, boolean z10, CampaignEx campaignEx) {
        if (!z10) {
            if (i10 == -1) {
                q0.b(f35641n, " unitId =" + str + " --> time out!");
            }
            this.f35649h.cancel();
            a(str, campaignEx);
            return;
        }
        if (i10 == 1) {
            q0.c(f35641n, "downloadResource--> Success Image");
            synchronized (this) {
                this.f35650i.remove(str2);
                if (this.f35650i.size() == 0) {
                    a(str, i10);
                }
            }
            return;
        }
        if (i10 == 2) {
            q0.c(f35641n, "downloadResource--> Success banner_html");
            this.f35652k = true;
            a(str, i10);
        } else if (i10 == 3) {
            q0.c(f35641n, "downloadResource--> Success banner_url");
            this.f35651j = true;
            a(str, i10);
        }
    }

    private void a(String str, int i10, CampaignEx campaignEx) {
        this.f35649h.schedule(new a(str, campaignEx), i10);
    }

    public void a(String str, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar, com.mbridge.msdk.mbbanner.common.listener.d dVar) {
        boolean z10;
        try {
            q0.c(f35641n, "requestCampaign--> started");
            this.f35647f = dVar;
            C0340b c0340b = new C0340b(aVar);
            c0340b.setUnitId(str2);
            c0340b.setPlacementId(str);
            c0340b.setAdType(296);
            com.mbridge.msdk.mbbanner.common.request.a aVar2 = new com.mbridge.msdk.mbbanner.common.request.a(this.f35642a);
            this.f35643b = a(str2);
            com.mbridge.msdk.foundation.same.net.wrapper.e eVarA = com.mbridge.msdk.mbbanner.common.data.c.a(false, this.f35642a, str2, b(), this.f35643b, aVar);
            String strD = v0.d(str2);
            if (!TextUtils.isEmpty(strD)) {
                eVarA.a("j", strD);
            }
            String strA = aVar.a();
            if (TextUtils.isEmpty(strA)) {
                z10 = false;
            } else {
                c0340b.a(strA);
                z10 = true;
            }
            this.f35645d.a(z10);
            aVar2.choiceV3OrV5BySetting(1, eVarA, c0340b, strA, 30000L);
        } catch (Exception e10) {
            q0.b(f35641n, e10.getMessage());
            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880002);
            bVar.a(new MBridgeIds(str, str2));
            this.f35645d.a(this.f35646e, bVar);
            this.f35647f.a(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, CampaignUnit campaignUnit) throws Throwable {
        com.mbridge.msdk.foundation.error.b bVar;
        CampaignEx campaignEx;
        if (campaignUnit == null) {
            com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880003);
            MBridgeIds mBridgeIds = new MBridgeIds();
            mBridgeIds.setUnitId(str);
            bVar2.a(mBridgeIds);
            bVar2.b(str2);
            this.f35645d.a(this.f35646e, bVar2);
            this.f35647f.a(str);
            return;
        }
        List<CampaignEx> listA = a(str, campaignUnit);
        a(campaignUnit);
        int i10 = 0;
        if (listA != null && listA.size() != 0) {
            q0.c(f35641n, "在子线程处理业务逻辑 开始");
            CampaignEx campaignEx2 = listA.get(0);
            a(str, 60000, campaignEx2);
            b(campaignUnit.getSessionId());
            a(str, listA);
            String strTrim = campaignEx2.getBannerUrl().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                b(str, strTrim, campaignEx2);
                if (listA.size() > 0) {
                    while (i10 < listA.size()) {
                        listA.get(i10).setBannerUrl(campaignEx2.getBannerUrl());
                        listA.get(i10).setHasMBTplMark(true);
                        i10++;
                    }
                }
            } else {
                String strTrim2 = campaignEx2.getBannerHtml().trim();
                if (!TextUtils.isEmpty(strTrim2)) {
                    String strA = a(str, strTrim2, campaignEx2);
                    if (listA.size() > 0) {
                        while (i10 < listA.size()) {
                            listA.get(i10).setBannerHtml(strA);
                            listA.get(i10).setHasMBTplMark(strTrim2.contains("<MBTPLMARK>"));
                            i10++;
                        }
                    }
                } else {
                    this.f35652k = true;
                    this.f35651j = true;
                }
            }
            b(str, listA);
            return;
        }
        q0.c(f35641n, "tryDownloadOnLoadSuccess 返回的campaign 没有符合下载规则的");
        if (this.f35654m.contains("INSTALLED")) {
            bVar = new com.mbridge.msdk.foundation.error.b(880021, "APP ALREADY INSTALLED");
        } else {
            bVar = new com.mbridge.msdk.foundation.error.b(880003);
        }
        MBridgeIds mBridgeIds2 = new MBridgeIds();
        mBridgeIds2.setUnitId(str);
        bVar.a(mBridgeIds2);
        bVar.b(str2);
        if (campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0 && (campaignEx = campaignUnit.getAds().get(0)) != null) {
            bVar.a(campaignEx);
        }
        this.f35645d.a(this.f35646e, bVar);
        this.f35647f.a(str);
    }

    private List<CampaignEx> a(String str, CampaignUnit campaignUnit) {
        ArrayList arrayList = new ArrayList();
        if (campaignUnit != null) {
            try {
                if (campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                    ArrayList<CampaignEx> ads = campaignUnit.getAds();
                    q0.c(f35641n, "getNeedShowList 总共返回的campaign有：" + ads.size());
                    y.a(ads);
                    for (int i10 = 0; i10 < ads.size(); i10++) {
                        CampaignEx campaignEx = ads.get(i10);
                        if (campaignEx != null && campaignEx.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx.getBannerUrl()) || !TextUtils.isEmpty(campaignEx.getBannerHtml()) || !TextUtils.isEmpty(campaignEx.getImageUrl()))) {
                            if (v0.c(campaignEx)) {
                                campaignEx.setRtinsType(v0.c(this.f35642a, campaignEx.getPackageName()) ? 1 : 2);
                            }
                            if (com.mbridge.msdk.foundation.same.c.b(this.f35642a, campaignEx)) {
                                arrayList.add(campaignEx);
                            } else {
                                v0.a(str, campaignEx, com.mbridge.msdk.foundation.same.a.f34914x);
                                this.f35654m = "APP ALREADY INSTALLED";
                            }
                            a(campaignEx, this.f35642a, (com.mbridge.msdk.foundation.same.report.metrics.c) null, str, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
                        }
                    }
                    q0.c(f35641n, "getNeedShowList 返回有以下带有视频素材的campaign：" + arrayList.size());
                }
            } catch (Exception e10) {
                q0.b(f35641n, e10.getMessage());
            }
        }
        return arrayList;
    }

    private void a(CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, context, cVar, new c(str, campaignEx, context, aVar));
        } catch (Exception e10) {
            q0.b(f35641n, e10.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    private String a(String str, String str2, CampaignEx campaignEx) throws Throwable {
        File file;
        Throwable th2;
        FileOutputStream fileOutputStreamFileOutputStreamCtor;
        String absolutePath = "";
        if (!TextUtils.isEmpty(str2)) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    try {
                        String strB = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML);
                        String md5 = SameMD5.getMD5(c1.b(str2));
                        if (TextUtils.isEmpty(md5)) {
                            md5 = String.valueOf(System.currentTimeMillis());
                        }
                        File file2 = new File(strB, md5.concat(".html"));
                        Uri.parse(str2).getPath();
                        fileOutputStreamFileOutputStreamCtor = MintegralFilesBridge.fileOutputStreamCtor(file2);
                        try {
                            fileOutputStreamFileOutputStreamCtor.write(str2.getBytes());
                            fileOutputStreamFileOutputStreamCtor.flush();
                            absolutePath = file2.getAbsolutePath();
                            fileOutputStreamFileOutputStreamCtor.close();
                        } catch (Exception e10) {
                            e = e10;
                            fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                            q0.b(f35641n, e.getMessage());
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            } else {
                                file = new File(absolutePath);
                                if (!file.exists()) {
                                    a(str, 2, str2, false, campaignEx);
                                } else {
                                    a(str, 2, str2, false, campaignEx);
                                }
                            }
                            return absolutePath;
                        } catch (Throwable th3) {
                            th2 = th3;
                            if (fileOutputStreamFileOutputStreamCtor != null) {
                                try {
                                    fileOutputStreamFileOutputStreamCtor.close();
                                    throw th2;
                                } catch (Exception e11) {
                                    q0.b(f35641n, e11.getMessage());
                                    throw th2;
                                }
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        fileOutputStreamFileOutputStreamCtor = null;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (Exception e13) {
                q0.b(f35641n, e13.getMessage());
            }
            file = new File(absolutePath);
            if (!file.exists() && file.isFile() && file.canRead()) {
                a(str, 2, str2, true, campaignEx);
            } else {
                a(str, 2, str2, false, campaignEx);
            }
        }
        return absolutePath;
    }

    private void a(CampaignUnit campaignUnit) {
        new Thread(new d(campaignUnit)).start();
    }

    private int a(String str) {
        try {
            int iC = this.f35644c.c();
            if (iC > this.f35644c.b()) {
                return 0;
            }
            return iC;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    private void a(String str, List<CampaignEx> list) {
        int size = this.f35643b;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    size += list.size();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        if (size > this.f35644c.b()) {
            q0.c(f35641n, "saveNextOffset 重置offset为0");
            size = 0;
        }
        q0.c(f35641n, "saveNextOffset 算出 下次的offset是:" + size);
        if (a1.b(str)) {
            this.f35644c.a(size);
        }
    }
}
