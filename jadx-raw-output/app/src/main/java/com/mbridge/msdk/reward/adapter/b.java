package com.mbridge.msdk.reward.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.multidex.MultiDexExtractor;
import com.ironsource.C3426d4;
import com.ironsource.Z7;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResDownloadCheckManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.video.bt.module.MBridgeBTLayout;
import com.mbridge.msdk.video.bt.module.MBridgeBTRootLayout;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, f> f36380g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f36381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f36383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f36384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f36385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile List<WindVaneWebView> f36386f;

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CopyOnWriteArrayList f36387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f36388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f36389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f36390d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f36391e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f36392f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f36393g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ n f36394h;

        public a(CopyOnWriteArrayList copyOnWriteArrayList, Context context, String str, int i10, String str2, String str3, String str4, n nVar) {
            this.f36387a = copyOnWriteArrayList;
            this.f36388b = context;
            this.f36389c = str;
            this.f36390d = i10;
            this.f36391e = str2;
            this.f36392f = str3;
            this.f36393g = str4;
            this.f36394h = nVar;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x02d4  */
        /* JADX WARN: Code duplicated, block: B:129:0x0374  */
        /* JADX WARN: Code duplicated, block: B:137:0x038c  */
        /* JADX WARN: Code duplicated, block: B:159:0x021b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:169:0x0274 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:183:0x02a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:51:0x0178  */
        /* JADX WARN: Code duplicated, block: B:68:0x01eb  */
        @Override // java.lang.Runnable
        public void run() {
            String str;
            Iterator it;
            String str2;
            String str3;
            CharSequence charSequence;
            String str4;
            boolean zIsDynamicView;
            String iconUrl;
            String imageUrl;
            String strH;
            CampaignEx campaignEx;
            List<CampaignEx.c.a> listD;
            List<String> list;
            int i10;
            String str5;
            String str6 = "_";
            CopyOnWriteArrayList copyOnWriteArrayList = this.f36387a;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return;
            }
            try {
                ResDownloadCheckManager.getInstance().setCampaignList(this.f36387a);
                com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f36388b, this.f36389c, this.f36387a, this.f36390d, new k(b.this.f36381a, this.f36391e, this.f36389c, this.f36392f, this.f36393g));
                com.mbridge.msdk.videocommon.download.b.getInstance().load(this.f36389c);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                }
            }
            Iterator it2 = this.f36387a.iterator();
            while (it2.hasNext()) {
                CampaignEx campaignEx2 = (CampaignEx) it2.next();
                if (campaignEx2 != null) {
                    try {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 106;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36389c);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f36391e);
                        bundle.putString(CommonUrlParts.REQUEST_ID, this.f36392f);
                        bundle.putString(C3426d4.i.W, this.f36389c + str6 + this.f36392f + str6 + campaignEx2.getSecondRequestIndex());
                        messageObtain.setData(bundle);
                        b.this.f36381a.sendMessage(messageObtain);
                    } catch (Exception unused) {
                    }
                    CampaignEx.c rewardTemplateMode = campaignEx2.getRewardTemplateMode();
                    if (rewardTemplateMode != null) {
                        String strJ = rewardTemplateMode.j();
                        int iK = rewardTemplateMode.k();
                        if (campaignEx2.isDynamicView() && v0.b(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, strJ)) {
                            b.this.a(1, campaignEx2, iK + "", strJ);
                        } else if (!TextUtils.isEmpty(strJ) && !strJ.contains(CampaignEx.KEY_IS_CMPT_ENTRY)) {
                            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = b.this.a(campaignEx2, 2);
                            if (strJ.contains(MultiDexExtractor.EXTRACTED_SUFFIX)) {
                                try {
                                    H5DownLoadManager h5DownLoadManager = H5DownLoadManager.getInstance();
                                    Context context = this.f36388b;
                                    String str7 = this.f36391e;
                                    String str8 = this.f36389c;
                                    String str9 = this.f36392f;
                                    str = str6;
                                    try {
                                        m mVar = b.this.f36381a;
                                        try {
                                            n nVar = this.f36394h;
                                            CopyOnWriteArrayList copyOnWriteArrayList2 = this.f36387a;
                                            it = it2;
                                            str5 = "";
                                            str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                            charSequence = MultiDexExtractor.EXTRACTED_SUFFIX;
                                            try {
                                                h5DownLoadManager.downloadH5Res(cVarA, strJ, new l(context, str7, str8, str9, campaignEx2, 859, mVar, nVar, copyOnWriteArrayList2));
                                            } catch (Exception e11) {
                                                e = e11;
                                                if (MBridgeConstans.DEBUG) {
                                                    q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                                }
                                            }
                                        } catch (Exception e12) {
                                            e = e12;
                                            it = it2;
                                            str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                            charSequence = MultiDexExtractor.EXTRACTED_SUFFIX;
                                            str5 = "";
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        it = it2;
                                        str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                        str5 = "";
                                        charSequence = MultiDexExtractor.EXTRACTED_SUFFIX;
                                        if (MBridgeConstans.DEBUG) {
                                            q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                        }
                                        str3 = str5;
                                        str4 = campaignEx2.getendcard_url();
                                        zIsDynamicView = campaignEx2.isDynamicView();
                                        boolean zL = v0.l(str4);
                                        if (!TextUtils.isEmpty(str4)) {
                                            if (zIsDynamicView) {
                                                b.this.a(this.f36388b, this.f36391e, this.f36389c, this.f36392f, campaignEx2, str4, this.f36394h, (CopyOnWriteArrayList<CampaignEx>) this.f36387a);
                                            } else if (v0.b(str2, str4)) {
                                                try {
                                                    i10 = Integer.parseInt(c1.a(str4, "ecid"));
                                                } catch (Throwable th2) {
                                                    q0.b("RewardCampaignsResourceManager", th2.getMessage());
                                                    i10 = 404;
                                                }
                                                b.this.a(2, campaignEx2, i10 + str3, str4);
                                            }
                                        }
                                        if (!TextUtils.isEmpty(campaignEx2.getEndScreenUrl())) {
                                            H5DownLoadManager.getInstance().download(b.this.a(campaignEx2, 6), campaignEx2.getEndScreenUrl());
                                        }
                                        iconUrl = campaignEx2.getIconUrl();
                                        if (!TextUtils.isEmpty(iconUrl)) {
                                            try {
                                                com.mbridge.msdk.foundation.same.image.b.a(this.f36388b).a(iconUrl, new j(b.this.f36381a, 0, this.f36391e, this.f36389c, this.f36392f, campaignEx2));
                                            } catch (Exception e14) {
                                                if (MBridgeConstans.DEBUG) {
                                                    q0.b("RewardCampaignsResourceManager", e14.getLocalizedMessage());
                                                }
                                            }
                                        }
                                        imageUrl = campaignEx2.getImageUrl();
                                        if (!TextUtils.isEmpty(imageUrl)) {
                                            try {
                                                com.mbridge.msdk.foundation.same.image.b.a(this.f36388b).a(imageUrl, new j(b.this.f36381a, 0, this.f36391e, this.f36389c, this.f36392f, campaignEx2));
                                            } catch (Exception e15) {
                                                if (MBridgeConstans.DEBUG) {
                                                    q0.b("RewardCampaignsResourceManager", e15.getLocalizedMessage());
                                                }
                                            }
                                        }
                                        if (rewardTemplateMode != null) {
                                            strH = rewardTemplateMode.h();
                                            if (TextUtils.isEmpty(strH)) {
                                                campaignEx = campaignEx2;
                                            } else {
                                                campaignEx = campaignEx2;
                                            }
                                            listD = rewardTemplateMode.d();
                                            if (listD != null) {
                                                while (r2.hasNext()) {
                                                    if (aVar == null) {
                                                    }
                                                }
                                            }
                                        }
                                        str6 = str;
                                        it2 = it;
                                    }
                                } catch (Exception e16) {
                                    e = e16;
                                    str = str6;
                                }
                                str3 = str5;
                            } else {
                                str = str6;
                                it = it2;
                                str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                charSequence = MultiDexExtractor.EXTRACTED_SUFFIX;
                                q0.a("RewardCampaignsResourceManager", "开始下载 html 类型的 template");
                                try {
                                    str3 = "";
                                    try {
                                        H5DownLoadManager.getInstance().downloadH5Res(cVarA, strJ, new i(859, this.f36391e, this.f36389c, this.f36392f, campaignEx2, this.f36394h, b.this.f36381a, this.f36387a));
                                    } catch (Exception e17) {
                                        e = e17;
                                        if (MBridgeConstans.DEBUG) {
                                            q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                        }
                                    }
                                } catch (Exception e18) {
                                    e = e18;
                                    str3 = "";
                                }
                            }
                        }
                        str = str6;
                        it = it2;
                        str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                        str3 = "";
                        charSequence = MultiDexExtractor.EXTRACTED_SUFFIX;
                    } else {
                        str = str6;
                        it = it2;
                        str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                        str3 = "";
                        charSequence = MultiDexExtractor.EXTRACTED_SUFFIX;
                    }
                    str4 = campaignEx2.getendcard_url();
                    zIsDynamicView = campaignEx2.isDynamicView();
                    boolean zL2 = v0.l(str4);
                    if (!TextUtils.isEmpty(str4)) {
                        if (zIsDynamicView || zL2) {
                            b.this.a(this.f36388b, this.f36391e, this.f36389c, this.f36392f, campaignEx2, str4, this.f36394h, (CopyOnWriteArrayList<CampaignEx>) this.f36387a);
                        } else if (v0.b(str2, str4)) {
                            i10 = Integer.parseInt(c1.a(str4, "ecid"));
                            b.this.a(2, campaignEx2, i10 + str3, str4);
                        }
                    }
                    if (!TextUtils.isEmpty(campaignEx2.getEndScreenUrl()) && !campaignEx2.isDynamicView()) {
                        H5DownLoadManager.getInstance().download(b.this.a(campaignEx2, 6), campaignEx2.getEndScreenUrl());
                    }
                    iconUrl = campaignEx2.getIconUrl();
                    if (!TextUtils.isEmpty(iconUrl)) {
                        com.mbridge.msdk.foundation.same.image.b.a(this.f36388b).a(iconUrl, new j(b.this.f36381a, 0, this.f36391e, this.f36389c, this.f36392f, campaignEx2));
                    }
                    imageUrl = campaignEx2.getImageUrl();
                    if (!TextUtils.isEmpty(imageUrl)) {
                        com.mbridge.msdk.foundation.same.image.b.a(this.f36388b).a(imageUrl, new j(b.this.f36381a, 0, this.f36391e, this.f36389c, this.f36392f, campaignEx2));
                    }
                    if (rewardTemplateMode != null) {
                        strH = rewardTemplateMode.h();
                        if (TextUtils.isEmpty(strH) || campaignEx2.isDynamicView()) {
                            campaignEx = campaignEx2;
                        } else {
                            int i11 = campaignEx2.getAabEntity() != null ? campaignEx2.getAabEntity().h3c : 0;
                            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c(true);
                            cVar.f(i11);
                            if (strH.contains(charSequence)) {
                                q0.a("RewardCampaignsResourceManager", "开始下载 zip 类型的 pause");
                                try {
                                    campaignEx = campaignEx2;
                                    try {
                                        H5DownLoadManager.getInstance().downloadH5Res(cVar, strH, new l(this.f36388b, this.f36391e, this.f36389c, this.f36392f, campaignEx2, 313, b.this.f36381a, this.f36394h, this.f36387a));
                                    } catch (Exception e19) {
                                        e = e19;
                                        if (MBridgeConstans.DEBUG) {
                                            q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                        }
                                    }
                                } catch (Exception e20) {
                                    e = e20;
                                    campaignEx = campaignEx2;
                                }
                            } else {
                                campaignEx = campaignEx2;
                                try {
                                    H5DownLoadManager.getInstance().downloadH5Res(cVar, strH, new i(313, this.f36391e, this.f36389c, this.f36392f, campaignEx, this.f36394h, b.this.f36381a, this.f36387a));
                                } catch (Exception e21) {
                                    if (MBridgeConstans.DEBUG) {
                                        q0.b("RewardCampaignsResourceManager", e21.getLocalizedMessage());
                                    }
                                }
                            }
                        }
                        listD = rewardTemplateMode.d();
                        if (listD != null && listD.size() > 0) {
                            for (CampaignEx.c.a aVar : listD) {
                                if (aVar == null && (list = aVar.f34713a) != null && list.size() > 0) {
                                    for (String str10 : aVar.f34713a) {
                                        if (!TextUtils.isEmpty(str10)) {
                                            try {
                                                com.mbridge.msdk.foundation.same.image.b.a(this.f36388b).a(str10, new j(b.this.f36381a, 1, this.f36391e, this.f36389c, this.f36392f, campaignEx));
                                            } catch (Exception e22) {
                                                if (MBridgeConstans.DEBUG) {
                                                    q0.b("RewardCampaignsResourceManager", e22.getLocalizedMessage());
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    str6 = str;
                    it2 = it;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public class C0360b implements z.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f36396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f36397b;

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, String str2, String str3, String str4, boolean z10) {
            if (z10) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                int i10 = this.f36396a;
                if (i10 == 0) {
                    nVar.e(1);
                    nVar.d(1);
                    nVar.j("m_download_end");
                } else if (i10 == 1) {
                    nVar.e(2);
                    nVar.d(1);
                    nVar.j("m_download_end");
                } else if (i10 == 2) {
                    nVar.e(3);
                    nVar.d(1);
                    nVar.j("m_download_end");
                    nVar.b(this.f36397b.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
                    nVar.f("1");
                }
                nVar.o(this.f36397b.getRequestIdNotice());
                nVar.b("url", str);
                nVar.b("scenes", "1");
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.f36397b);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e10.getMessage());
                }
            }
        }

        public C0360b(int i10, CampaignEx campaignEx) {
            this.f36396a = i10;
            this.f36397b = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, DownloadError downloadError) {
            String message = "";
            if (downloadError != null) {
                try {
                    if (downloadError.getException() != null) {
                        message = downloadError.getException().getMessage();
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            int i10 = this.f36396a;
            if (i10 == 0) {
                nVar.e(1);
                nVar.d(3);
                nVar.j("m_download_end");
            } else if (i10 == 1) {
                nVar.e(2);
                nVar.d(3);
                nVar.j("m_download_end");
            } else if (i10 == 2) {
                nVar.e(3);
                nVar.d(3);
                nVar.j("m_download_end");
                nVar.b(this.f36397b.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
                nVar.f("1");
            }
            b.b(nVar, this.f36397b);
            nVar.o(this.f36397b.getRequestIdNotice());
            nVar.m(message);
            nVar.b("scenes", "1");
            nVar.b("url", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.f36397b);
        }
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public class c implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f36399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f36400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f36401c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f36402d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ n f36403e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Context f36404f;

        public c(String str, String str2, String str3, CampaignEx campaignEx, n nVar, Context context) {
            this.f36399a = str;
            this.f36400b = str2;
            this.f36401c = str3;
            this.f36402d = campaignEx;
            this.f36403e = nVar;
            this.f36404f = context;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            Exception exc;
            String str3;
            String str4 = "";
            String str5 = MBridgeConstans.PROPERTIES_UNIT_ID;
            String str6 = "RewardCampaignsResourceManager";
            String str7 = "_";
            try {
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
                Message messageObtain = Message.obtain();
                messageObtain.what = 205;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36399a);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f36400b);
                bundle.putString(CommonUrlParts.REQUEST_ID, this.f36401c);
                bundle.putString("url", str2);
                bundle.putString(C3426d4.i.W, this.f36399a + "_" + this.f36401c + "_" + this.f36402d.getSecondRequestIndex());
                bundle.putString("message", str);
                messageObtain.setData(bundle);
                b.this.f36381a.sendMessage(messageObtain);
                if (this.f36403e != null) {
                    try {
                        try {
                            this.f36403e.a(str2, this.f36401c, b.b(880005, new MBridgeIds(this.f36400b, this.f36399a, this.f36401c), "", null, null));
                        } catch (Exception e10) {
                            e = e10;
                            try {
                                q0.b("RewardCampaignsResourceManager", e.getMessage());
                            } catch (Exception e11) {
                                exc = e11;
                                str7 = "_";
                                str6 = "RewardCampaignsResourceManager";
                                str4 = "";
                                str5 = MBridgeConstans.PROPERTIES_UNIT_ID;
                                ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
                                Message messageObtain2 = Message.obtain();
                                messageObtain2.what = 105;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(str5, this.f36399a);
                                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f36400b);
                                bundle2.putString(CommonUrlParts.REQUEST_ID, this.f36401c);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(this.f36399a);
                                String str8 = str7;
                                sb2.append(str8);
                                sb2.append(this.f36401c);
                                sb2.append(str8);
                                sb2.append(this.f36402d.getSecondRequestIndex());
                                bundle2.putString(C3426d4.i.W, sb2.toString());
                                bundle2.putString("url", str2);
                                bundle2.putString("message", exc.getMessage());
                                messageObtain2.setData(bundle2);
                                b.this.f36381a.sendMessage(messageObtain2);
                                if (this.f36403e != null) {
                                    try {
                                        this.f36403e.a(str2, this.f36401c, b.b(880005, new MBridgeIds(this.f36400b, this.f36399a, this.f36401c), str4, exc, null));
                                    } catch (Exception e12) {
                                        str3 = str6;
                                        q0.b(str3, e12.getMessage());
                                        q0.b(str3, exc.getLocalizedMessage());
                                    }
                                }
                                str3 = str6;
                                q0.b(str3, exc.getLocalizedMessage());
                            }
                        }
                    } catch (Exception e13) {
                        e = e13;
                    }
                }
                try {
                    b.this.a(this.f36404f, 3, this.f36402d, str2, str, this.f36399a, "");
                } catch (Exception e14) {
                    e = e14;
                    exc = e;
                    ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
                    Message messageObtain3 = Message.obtain();
                    messageObtain3.what = 105;
                    Bundle bundle3 = new Bundle();
                    bundle3.putString(str5, this.f36399a);
                    bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f36400b);
                    bundle3.putString(CommonUrlParts.REQUEST_ID, this.f36401c);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.f36399a);
                    String str9 = str7;
                    sb3.append(str9);
                    sb3.append(this.f36401c);
                    sb3.append(str9);
                    sb3.append(this.f36402d.getSecondRequestIndex());
                    bundle3.putString(C3426d4.i.W, sb3.toString());
                    bundle3.putString("url", str2);
                    bundle3.putString("message", exc.getMessage());
                    messageObtain3.setData(bundle3);
                    b.this.f36381a.sendMessage(messageObtain3);
                    if (this.f36403e != null) {
                        this.f36403e.a(str2, this.f36401c, b.b(880005, new MBridgeIds(this.f36400b, this.f36399a, this.f36401c), str4, exc, null));
                    }
                    str3 = str6;
                    q0.b(str3, exc.getLocalizedMessage());
                }
            } catch (Exception e15) {
                e = e15;
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            String str3;
            try {
                q0.a("RewardCampaignsResourceManager", "zip btl template download success");
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
                Message messageObtain = Message.obtain();
                messageObtain.what = 105;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36399a);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f36400b);
                bundle.putString(CommonUrlParts.REQUEST_ID, this.f36401c);
                bundle.putString(C3426d4.i.W, this.f36399a + "_" + this.f36401c + "_" + this.f36402d.getSecondRequestIndex());
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                b.this.f36381a.sendMessage(messageObtain);
                n nVar = this.f36403e;
                if (nVar != null) {
                    nVar.a(this.f36400b, this.f36399a, this.f36401c, str);
                }
                if (z10) {
                    return;
                }
                try {
                    b.this.a(this.f36404f, 1, this.f36402d, str, "", this.f36399a, str2);
                    return;
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Exception e11) {
                e = e11;
            }
            Exception exc = e;
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 205;
            Bundle bundle2 = new Bundle();
            bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36399a);
            bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f36400b);
            bundle2.putString(CommonUrlParts.REQUEST_ID, this.f36401c);
            bundle2.putString(C3426d4.i.W, this.f36399a + r9 + this.f36401c + "_" + this.f36402d.getSecondRequestIndex());
            bundle2.putString("url", str);
            messageObtain2.setData(bundle2);
            b.this.f36381a.sendMessage(messageObtain2);
            if (this.f36403e != null) {
                try {
                    this.f36403e.a(str, this.f36401c, b.b(880005, new MBridgeIds(this.f36400b, this.f36399a, this.f36401c), "", exc, null));
                } catch (Exception e12) {
                    str3 = r15;
                    q0.b(str3, e12.getMessage());
                }
            }
            str3 = "RewardCampaignsResourceManager";
            b.this.a(this.f36404f, 3, this.f36402d, str, exc.getLocalizedMessage(), this.f36399a, str2);
            if (MBridgeConstans.DEBUG) {
                q0.b(str3, exc.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f36406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f36407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f36408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f36409d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f36410e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f36411f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f36412g;

        public d(CampaignEx campaignEx, Context context, int i10, String str, String str2, String str3, String str4) {
            this.f36406a = campaignEx;
            this.f36407b = context;
            this.f36408c = i10;
            this.f36409d = str;
            this.f36410e = str2;
            this.f36411f = str3;
            this.f36412g = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f36406a == null || this.f36407b == null) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                nVar.j("m_download_end");
                Context context = this.f36407b;
                if (context != null) {
                    nVar.c(m0.s(context.getApplicationContext()));
                }
                nVar.d(this.f36408c);
                CampaignEx campaignEx = this.f36406a;
                if (campaignEx != null) {
                    nVar.b(campaignEx.getId());
                    nVar.n(this.f36406a.getRequestId());
                    nVar.k(this.f36406a.getCurrentLocalRid());
                    nVar.o(this.f36406a.getRequestIdNotice());
                }
                nVar.b("url", this.f36409d);
                nVar.t(this.f36409d);
                nVar.m(this.f36410e);
                nVar.u(this.f36411f);
                if (!TextUtils.isEmpty(this.f36412g)) {
                    nVar.q(this.f36412g);
                }
                nVar.e(1);
                nVar.b("scenes", "1");
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.f36406a);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f36414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WindVaneWebView f36415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f36416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ CopyOnWriteArrayList f36417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f36418e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.videocommon.setting.c f36419f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f36420g;

        public e(boolean z10, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, String str, com.mbridge.msdk.videocommon.setting.c cVar, String str2) {
            this.f36414a = z10;
            this.f36415b = windVaneWebView;
            this.f36416c = campaignEx;
            this.f36417d = copyOnWriteArrayList;
            this.f36418e = str;
            this.f36419f = cVar;
            this.f36420g = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f36414a, this.f36415b, this.f36416c.getRewardTemplateMode().j(), 0, this.f36416c, (CopyOnWriteArrayList<CampaignEx>) this.f36417d, H5DownLoadManager.getInstance().getH5ResAddress(this.f36416c.getRewardTemplateMode().j()), this.f36418e, this.f36419f, this.f36420g, b.this.f36382b);
        }
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public static class g extends com.mbridge.msdk.mbsignalcommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f36431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f36432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f36433c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f36434d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f36435e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f36436f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f36437g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f36438h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f36439i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private com.mbridge.msdk.videocommon.a.C0412a f36440j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private CampaignEx f36441k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f36442l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private com.mbridge.msdk.videocommon.setting.c f36443m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final o f36444n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f36445o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f36446p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f36447q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f36448r = 0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f36449s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f36450t;

        public g(boolean z10, Handler handler, Runnable runnable, boolean z11, boolean z12, int i10, String str, String str2, String str3, String str4, com.mbridge.msdk.videocommon.a.C0412a c0412a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.videocommon.setting.c cVar, o oVar, boolean z13, long j10) {
            this.f36431a = handler;
            this.f36432b = runnable;
            this.f36433c = z11;
            this.f36434d = z12;
            this.f36435e = i10;
            this.f36436f = str;
            this.f36438h = str2;
            this.f36437g = str3;
            this.f36439i = str4;
            this.f36440j = c0412a;
            this.f36441k = campaignEx;
            this.f36442l = copyOnWriteArrayList;
            this.f36443m = cVar;
            this.f36444n = oVar;
            this.f36445o = z13;
            this.f36449s = z10;
            this.f36450t = j10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            Runnable runnable;
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 1);
                eVar.a("result", Integer.valueOf(i10));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.f36441k, eVar);
            } catch (Throwable th2) {
                q0.b("RVWindVaneWebView", th2.getMessage());
            }
            if (this.f36447q) {
                return;
            }
            String str = this.f36437g + "_" + this.f36436f;
            if (i10 == 1) {
                if (this.f36445o) {
                    com.mbridge.msdk.videocommon.a.d(this.f36437g + "_" + this.f36439i);
                } else {
                    com.mbridge.msdk.videocommon.a.c(this.f36437g + "_" + this.f36439i);
                }
                com.mbridge.msdk.videocommon.a.a(this.f36437g + "_" + this.f36439i + "_" + this.f36436f, this.f36440j, true, this.f36445o);
                Handler handler = this.f36431a;
                if (handler != null && (runnable = this.f36432b) != null) {
                    handler.removeCallbacks(runnable);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f36437g + "_" + this.f36439i + "_" + this.f36436f, true);
                com.mbridge.msdk.videocommon.a.C0412a c0412a = this.f36440j;
                if (c0412a != null) {
                    c0412a.a(true);
                }
                o oVar = this.f36444n;
                if (oVar != null) {
                    oVar.a(str, this.f36438h, this.f36437g, this.f36439i, this.f36436f, this.f36440j);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f36437g + "_" + this.f36439i + "_" + this.f36436f, false);
                com.mbridge.msdk.videocommon.a.C0412a c0412a2 = this.f36440j;
                if (c0412a2 != null) {
                    c0412a2.a(false);
                }
                if (this.f36444n != null) {
                    this.f36444n.a(str, this.f36439i, this.f36436f, this.f36440j, b.b(880008, new MBridgeIds(this.f36438h, this.f36437g, this.f36439i), "readyState:" + i10, null, this.f36441k));
                }
            }
            this.f36447q = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onRenderProcessGone(WebView webView) {
            if (webView != null) {
                try {
                    com.mbridge.msdk.video.bt.component.d.c().c(this.f36437g, this.f36439i);
                } catch (Throwable th2) {
                    q0.b("RVWindVaneWebView", th2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            super.onPageFinished(webView, str);
            if (!this.f36446p) {
                String str2 = this.f36437g + "_" + this.f36436f;
                if (!str.contains("wfr=1")) {
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f36437g + "_" + this.f36439i + "_" + this.f36436f, true);
                    Handler handler = this.f36431a;
                    if (handler != null && (runnable = this.f36432b) != null) {
                        handler.removeCallbacks(runnable);
                    }
                    com.mbridge.msdk.videocommon.a.C0412a c0412a = this.f36440j;
                    if (c0412a != null) {
                        c0412a.a(true);
                    }
                    o oVar = this.f36444n;
                    if (oVar != null) {
                        oVar.a(str2, this.f36438h, this.f36437g, this.f36439i, this.f36436f, this.f36440j);
                    }
                }
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
                this.f36446p = true;
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f36437g + "_" + this.f36439i + "_" + this.f36436f, false);
            if (this.f36444n != null) {
                String str3 = this.f36437g + "_" + this.f36436f;
                com.mbridge.msdk.videocommon.a.C0412a c0412a = this.f36440j;
                if (c0412a != null) {
                    c0412a.a(false);
                }
                this.f36444n.a(str3, this.f36439i, this.f36436f, this.f36440j, b.b(880008, new MBridgeIds(this.f36438h, this.f36437g, this.f36439i), "onReceivedError： " + i10 + "  " + str, null, this.f36441k));
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a
        public void a(WebView webView, String str, String str2, int i10, int i11) {
            boolean z10 = true;
            if (i10 == 1) {
                try {
                    com.mbridge.msdk.reward.controller.a aVar = new com.mbridge.msdk.reward.controller.a();
                    aVar.e(false);
                    if (i11 != 2) {
                        z10 = false;
                    }
                    aVar.d(z10);
                    aVar.c(str, str2);
                    aVar.a(new com.mbridge.msdk.video.bt.module.orglistener.a(null));
                    aVar.a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, i11, str2, true, 1));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RVWindVaneWebView", e10.getMessage());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a
        public void a(Object obj, String str) {
            if (obj != null) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    String strOptString = new JSONObject(str).optString("id");
                    com.mbridge.msdk.video.bt.component.d.c().b(obj, strOptString);
                    String strF = com.mbridge.msdk.video.bt.component.d.c().f(strOptString);
                    CampaignEx campaignExC = com.mbridge.msdk.video.bt.component.d.c().c(strOptString);
                    com.mbridge.msdk.videocommon.setting.c cVarD = com.mbridge.msdk.video.bt.component.d.c().d(strOptString);
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    copyOnWriteArrayList.add(campaignExC);
                    WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f36112b;
                    if (windVaneWebView != null) {
                        b.b().a(this.f36449s, windVaneWebView, campaignExC, (CopyOnWriteArrayList<CampaignEx>) copyOnWriteArrayList, cVarD, strF, strOptString, this.f36448r == 0 ? 3 : 6);
                        this.f36448r++;
                    }
                } catch (Throwable th2) {
                    q0.b("RVWindVaneWebView", th2.getMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public interface h {
        void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList);

        void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar);
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public static final class i implements H5DownLoadManager.IH5SourceDownloadListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f36452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f36453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f36454d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f36455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CampaignEx f36456f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private n f36457g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Handler f36458h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f36459i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f36451a = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f36460j = System.currentTimeMillis();

        /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f36461a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f36462b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f36463c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f36464d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f36465e;

            public a(int i10, long j10, String str, String str2, String str3) {
                this.f36461a = i10;
                this.f36462b = j10;
                this.f36463c = str;
                this.f36464d = str2;
                this.f36465e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (i.this.f36456f == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("m_download_end", this.f36461a, this.f36462b + "", this.f36463c, i.this.f36456f.getId(), i.this.f36454d, this.f36464d, "2");
                    nVar.n(i.this.f36456f.getRequestId());
                    nVar.k(i.this.f36456f.getCurrentLocalRid());
                    nVar.o(i.this.f36456f.getRequestIdNotice());
                    nVar.b(i.this.f36456f.getId());
                    nVar.a(i.this.f36456f.getAdSpaceT());
                    nVar.b("scenes", "1");
                    nVar.b("url", this.f36463c);
                    if (i.this.f36456f.getAdType() == 287) {
                        nVar.a(ExifInterface.GPS_MEASUREMENT_3D);
                    } else if (i.this.f36456f.getAdType() == 94) {
                        nVar.a("1");
                    }
                    if (!TextUtils.isEmpty(this.f36465e)) {
                        nVar.q(this.f36465e);
                    }
                    b.b(nVar, i.this.f36456f);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, i.this.f36454d, i.this.f36456f);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    }
                }
            }
        }

        public void a(boolean z10) {
            this.f36451a = z10;
        }

        public i(int i10, String str, String str2, String str3, CampaignEx campaignEx, n nVar, Handler handler, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f36452b = i10;
            this.f36453c = str;
            this.f36454d = str2;
            this.f36455e = str3;
            this.f36456f = campaignEx;
            this.f36457g = nVar;
            this.f36458h = handler;
            this.f36459i = copyOnWriteArrayList;
        }

        private void a(int i10, long j10, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a(i10, j10, str, str2, str3));
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
            int i10 = this.f36452b;
            if (i10 != 313) {
                if (i10 != 497) {
                    if (i10 == 859) {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 205;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36454d);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f36453c);
                        bundle.putString(CommonUrlParts.REQUEST_ID, this.f36455e);
                        bundle.putString(C3426d4.i.W, this.f36454d + "_" + this.f36455e + "_" + this.f36456f.getSecondRequestIndex());
                        bundle.putString("message", str2);
                        messageObtain.setData(bundle);
                        this.f36458h.sendMessage(messageObtain);
                        if (this.f36457g != null) {
                            try {
                                this.f36457g.a(str, this.f36455e, b.b(880006, new MBridgeIds(this.f36453c, this.f36454d, this.f36455e), str2, null, null));
                                return;
                            } catch (Exception e10) {
                                q0.b("RewardCampaignsResourceManager", e10.getMessage());
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36454d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f36453c);
                bundle2.putString(CommonUrlParts.REQUEST_ID, this.f36455e);
                bundle2.putString(C3426d4.i.W, this.f36454d + "_" + this.f36455e + "_" + this.f36456f.getSecondRequestIndex());
                bundle2.putString("url", str);
                bundle2.putString("message", str2);
                messageObtain2.setData(bundle2);
                this.f36458h.sendMessage(messageObtain2);
                if (this.f36451a) {
                    a(3, System.currentTimeMillis() - this.f36460j, str, "url download failed", "");
                    return;
                }
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 201;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36454d);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f36453c);
            bundle3.putString(CommonUrlParts.REQUEST_ID, this.f36455e);
            bundle3.putString(C3426d4.i.W, this.f36454d + "_" + this.f36455e + "_" + this.f36456f.getSecondRequestIndex());
            bundle3.putString("url", str);
            bundle3.putString("message", str2);
            messageObtain3.setData(bundle3);
            this.f36458h.sendMessage(messageObtain3);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            int i10 = this.f36452b;
            if (i10 != 313) {
                if (i10 != 497) {
                    if (i10 == 859) {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 105;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36454d);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f36453c);
                        bundle.putString(CommonUrlParts.REQUEST_ID, this.f36455e);
                        bundle.putString(C3426d4.i.W, this.f36454d + "_" + this.f36455e + "_" + this.f36456f.getSecondRequestIndex());
                        messageObtain.setData(bundle);
                        this.f36458h.sendMessage(messageObtain);
                        n nVar = this.f36457g;
                        if (nVar != null) {
                            nVar.a(this.f36453c, this.f36454d, this.f36455e, str);
                            return;
                        }
                        return;
                    }
                    return;
                }
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36454d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f36453c);
                bundle2.putString(CommonUrlParts.REQUEST_ID, this.f36455e);
                bundle2.putString(C3426d4.i.W, this.f36454d + "_" + this.f36455e + "_" + this.f36456f.getSecondRequestIndex());
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                this.f36458h.sendMessage(messageObtain2);
                if (this.f36451a) {
                    a(1, System.currentTimeMillis() - this.f36460j, str, "", str2);
                    return;
                }
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 101;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36454d);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f36453c);
            bundle3.putString(CommonUrlParts.REQUEST_ID, this.f36455e);
            bundle3.putString(C3426d4.i.W, this.f36454d + "_" + this.f36455e + "_" + this.f36456f.getSecondRequestIndex());
            bundle3.putString("url", str);
            messageObtain3.setData(bundle3);
            this.f36458h.sendMessage(messageObtain3);
        }
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public static final class j implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f36467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f36468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f36469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f36470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f36471e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CampaignEx f36472f;

        /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f36473a;

            public a(String str) {
                this.f36473a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (j.this.f36472f != null) {
                    try {
                        com.mbridge.msdk.foundation.db.n nVarA = com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                        q0.a("RewardCampaignsResourceManager", "campaign is null");
                        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                        nVar.j("2000044");
                        nVar.c(m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
                        nVar.b(j.this.f36472f.getId());
                        nVar.i(j.this.f36472f.getImageUrl());
                        nVar.n(j.this.f36472f.getRequestId());
                        nVar.k(j.this.f36472f.getCurrentLocalRid());
                        nVar.o(j.this.f36472f.getRequestIdNotice());
                        nVar.u(j.this.f36469c);
                        nVar.m(this.f36473a);
                        nVar.b("scenes", "1");
                        nVarA.a(nVar);
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                        }
                    }
                }
            }
        }

        public j(Handler handler, int i10, String str, String str2, String str3, CampaignEx campaignEx) {
            this.f36467a = handler;
            this.f36468b = i10;
            this.f36470d = str;
            this.f36469c = str2;
            this.f36471e = str3;
            this.f36472f = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            int i10;
            Message messageObtain = Message.obtain();
            if (this.f36468b == 0) {
                i10 = 202;
            } else {
                i10 = 204;
            }
            messageObtain.what = i10;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36469c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f36470d);
            bundle.putString(CommonUrlParts.REQUEST_ID, this.f36471e);
            bundle.putString(C3426d4.i.W, this.f36469c + "_" + this.f36471e + "_" + this.f36472f.getSecondRequestIndex());
            messageObtain.setData(bundle);
            this.f36467a.sendMessage(messageObtain);
            a aVar = new a(str);
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
            } else {
                aVar.run();
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            int i10;
            ResDownloadCheckManager.getInstance().setImageDownloadDone(str, true);
            Message messageObtain = Message.obtain();
            if (this.f36468b == 0) {
                i10 = 102;
            } else {
                i10 = 104;
            }
            messageObtain.what = i10;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36469c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f36470d);
            bundle.putString(CommonUrlParts.REQUEST_ID, this.f36471e);
            bundle.putString(C3426d4.i.W, this.f36469c + "_" + this.f36471e + "_" + this.f36472f.getSecondRequestIndex());
            messageObtain.setData(bundle);
            this.f36467a.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public static final class l implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f36481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f36482c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f36483d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f36484e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CampaignEx f36485f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f36486g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Handler f36487h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private n f36488i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f36489j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f36480a = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f36490k = System.currentTimeMillis();

        /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f36491a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f36492b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f36493c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f36494d;

            public a(int i10, String str, String str2, String str3) {
                this.f36491a = i10;
                this.f36492b = str;
                this.f36493c = str2;
                this.f36494d = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (l.this.f36485f == null || l.this.f36481b == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                    nVar.j("m_download_end");
                    if (l.this.f36481b != null) {
                        nVar.c(m0.s(l.this.f36481b.getApplicationContext()));
                    }
                    nVar.d(this.f36491a);
                    if (l.this.f36485f != null) {
                        nVar.b(l.this.f36485f.getId());
                        nVar.n(l.this.f36485f.getRequestId());
                        nVar.k(l.this.f36485f.getCurrentLocalRid());
                        nVar.o(l.this.f36485f.getRequestIdNotice());
                    }
                    nVar.t(this.f36492b);
                    nVar.m(this.f36493c);
                    nVar.u(l.this.f36482c);
                    if (!TextUtils.isEmpty(this.f36494d)) {
                        nVar.q(this.f36494d);
                    }
                    nVar.e(2);
                    nVar.b("scenes", "1");
                    nVar.b("url", this.f36492b);
                    b.b(nVar, l.this.f36485f);
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, l.this.f36485f);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$l$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
        public class RunnableC0361b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f36496a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f36497b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f36498c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f36499d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f36500e;

            public RunnableC0361b(int i10, long j10, String str, String str2, String str3) {
                this.f36496a = i10;
                this.f36497b = j10;
                this.f36498c = str;
                this.f36499d = str2;
                this.f36500e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (l.this.f36485f == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("m_download_end", this.f36496a, this.f36497b + "", this.f36498c, l.this.f36485f.getId(), l.this.f36482c, this.f36499d, "1");
                    nVar.n(l.this.f36485f.getRequestId());
                    nVar.k(l.this.f36485f.getCurrentLocalRid());
                    nVar.o(l.this.f36485f.getRequestIdNotice());
                    nVar.b(l.this.f36485f.getId());
                    nVar.a(l.this.f36485f.getAdSpaceT());
                    nVar.q(this.f36500e);
                    nVar.b("scenes", "1");
                    if (l.this.f36485f.getAdType() == 287) {
                        nVar.a(ExifInterface.GPS_MEASUREMENT_3D);
                    } else if (l.this.f36485f.getAdType() == 94) {
                        nVar.a("1");
                    }
                    nVar.b("url", this.f36498c);
                    nVar.e(3);
                    b.b(nVar, l.this.f36485f);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, l.this.f36482c, l.this.f36485f);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f36490k;
            int i10 = this.f36486g;
            if (i10 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36482c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f36483d);
                bundle.putString(CommonUrlParts.REQUEST_ID, this.f36484e);
                bundle.putString(C3426d4.i.W, this.f36482c + "_" + this.f36484e + "_" + this.f36485f.getSecondRequestIndex());
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                this.f36487h.sendMessage(messageObtain);
                return;
            }
            if (i10 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36482c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f36483d);
                bundle2.putString(CommonUrlParts.REQUEST_ID, this.f36484e);
                bundle2.putString(C3426d4.i.W, this.f36482c + "_" + this.f36484e + "_" + this.f36485f.getSecondRequestIndex());
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                this.f36487h.sendMessage(messageObtain2);
                if (this.f36480a) {
                    a(1, jCurrentTimeMillis, str, "", str2);
                    return;
                }
                return;
            }
            if (i10 != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 103;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36482c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f36483d);
            bundle3.putString(CommonUrlParts.REQUEST_ID, this.f36484e);
            bundle3.putString(C3426d4.i.W, this.f36482c + "_" + this.f36484e + "_" + this.f36485f.getSecondRequestIndex());
            messageObtain3.setData(bundle3);
            this.f36487h.sendMessage(messageObtain3);
            n nVar = this.f36488i;
            if (nVar != null) {
                nVar.a(this.f36483d, this.f36482c, this.f36484e, str);
            }
            if (z10) {
                return;
            }
            a(1, str, "", str2);
        }

        public void a(boolean z10) {
            this.f36480a = z10;
        }

        public l(Context context, String str, String str2, String str3, CampaignEx campaignEx, int i10, Handler handler, n nVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f36481b = context;
            this.f36483d = str;
            this.f36482c = str2;
            this.f36484e = str3;
            this.f36485f = campaignEx;
            this.f36486g = i10;
            this.f36487h = handler;
            this.f36488i = nVar;
            this.f36489j = copyOnWriteArrayList;
        }

        private void a(int i10, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a(i10, str, str2, str3));
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f36490k;
            int i10 = this.f36486g;
            if (i10 != 313) {
                if (i10 != 497) {
                    if (i10 == 859) {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 203;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36482c);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f36483d);
                        bundle.putString(CommonUrlParts.REQUEST_ID, this.f36484e);
                        bundle.putString("url", str2);
                        bundle.putString(C3426d4.i.W, this.f36482c + "_" + this.f36484e + "_" + this.f36485f.getSecondRequestIndex());
                        bundle.putString("message", str);
                        messageObtain.setData(bundle);
                        this.f36487h.sendMessage(messageObtain);
                        if (this.f36488i != null) {
                            try {
                                this.f36488i.a(str2, this.f36484e, b.b(880006, new MBridgeIds(this.f36483d, this.f36482c, this.f36484e), "", null, null));
                            } catch (Exception e10) {
                                q0.b("RewardCampaignsResourceManager", e10.getMessage());
                            }
                        }
                        a(3, str2, str, "");
                        return;
                    }
                    return;
                }
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36482c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f36483d);
                bundle2.putString(CommonUrlParts.REQUEST_ID, this.f36484e);
                bundle2.putString("url", str2);
                bundle2.putString(C3426d4.i.W, this.f36482c + "_" + this.f36484e + "_" + this.f36485f.getSecondRequestIndex());
                bundle2.putString("message", str);
                messageObtain2.setData(bundle2);
                this.f36487h.sendMessage(messageObtain2);
                if (this.f36480a) {
                    a(3, jCurrentTimeMillis, str2, "zip download failed", "");
                    return;
                }
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 101;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36482c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f36483d);
            bundle3.putString(CommonUrlParts.REQUEST_ID, this.f36484e);
            bundle3.putString(C3426d4.i.W, this.f36482c + "_" + this.f36484e + "_" + this.f36485f.getSecondRequestIndex());
            bundle3.putString("url", str2);
            bundle3.putString("message", str);
            messageObtain3.setData(bundle3);
            this.f36487h.sendMessage(messageObtain3);
        }

        private void a(int i10, long j10, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new RunnableC0361b(i10, j10, str, str2, str3));
        }
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public static final class m extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f36502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ConcurrentHashMap<String, h> f36503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> f36504c;

        public void a(String str, h hVar) {
            this.f36503b.put(str, hVar);
        }

        public void a(Context context) {
            this.f36502a = context;
        }

        /* JADX WARN: Code duplicated, block: B:185:0x03b9 A[Catch: Exception -> 0x048b, TRY_LEAVE, TryCatch #4 {Exception -> 0x048b, blocks: (B:176:0x038a, B:185:0x03b9), top: B:244:0x00f0 }] */
        /* JADX WARN: Code duplicated, block: B:190:0x03f9 A[Catch: Exception -> 0x0484, TryCatch #8 {Exception -> 0x0484, blocks: (B:188:0x03f3, B:190:0x03f9, B:192:0x0404, B:194:0x040a, B:196:0x0414, B:205:0x0425, B:208:0x0434, B:211:0x0443, B:214:0x0452, B:217:0x045d), top: B:252:0x03f3 }] */
        /* JADX WARN: Code duplicated, block: B:191:0x0402  */
        /* JADX WARN: Code duplicated, block: B:198:0x0418  */
        /* JADX WARN: Code duplicated, block: B:200:0x041c  */
        /* JADX WARN: Code duplicated, block: B:202:0x0420  */
        /* JADX WARN: Code duplicated, block: B:208:0x0434 A[Catch: Exception -> 0x0484, TryCatch #8 {Exception -> 0x0484, blocks: (B:188:0x03f3, B:190:0x03f9, B:192:0x0404, B:194:0x040a, B:196:0x0414, B:205:0x0425, B:208:0x0434, B:211:0x0443, B:214:0x0452, B:217:0x045d), top: B:252:0x03f3 }] */
        /* JADX WARN: Code duplicated, block: B:211:0x0443 A[Catch: Exception -> 0x0484, TryCatch #8 {Exception -> 0x0484, blocks: (B:188:0x03f3, B:190:0x03f9, B:192:0x0404, B:194:0x040a, B:196:0x0414, B:205:0x0425, B:208:0x0434, B:211:0x0443, B:214:0x0452, B:217:0x045d), top: B:252:0x03f3 }] */
        /* JADX WARN: Code duplicated, block: B:214:0x0452 A[Catch: Exception -> 0x0484, TryCatch #8 {Exception -> 0x0484, blocks: (B:188:0x03f3, B:190:0x03f9, B:192:0x0404, B:194:0x040a, B:196:0x0414, B:205:0x0425, B:208:0x0434, B:211:0x0443, B:214:0x0452, B:217:0x045d), top: B:252:0x03f3 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v11 */
        /* JADX WARN: Type inference failed for: r10v27 */
        /* JADX WARN: Type inference failed for: r10v32 */
        /* JADX WARN: Type inference failed for: r10v36 */
        /* JADX WARN: Type inference failed for: r10v37 */
        /* JADX WARN: Type inference failed for: r10v38 */
        /* JADX WARN: Type inference failed for: r10v44 */
        /* JADX WARN: Type inference failed for: r10v5 */
        /* JADX WARN: Type inference failed for: r10v6, types: [com.mbridge.msdk.foundation.entity.CampaignEx] */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r14v13 */
        /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r14v6 */
        /* JADX WARN: Type inference failed for: r14v8 */
        /* JADX WARN: Type inference failed for: r14v9 */
        /* JADX WARN: Type inference failed for: r15v10 */
        /* JADX WARN: Type inference failed for: r15v12 */
        /* JADX WARN: Type inference failed for: r15v13 */
        /* JADX WARN: Type inference failed for: r15v2, types: [int] */
        /* JADX WARN: Type inference failed for: r15v3 */
        /* JADX WARN: Type inference failed for: r15v4 */
        /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r15v8 */
        /* JADX WARN: Type inference failed for: r15v9 */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v12 */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v17 */
        /* JADX WARN: Type inference failed for: r6v18 */
        /* JADX WARN: Type inference failed for: r6v19 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v20 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v5 */
        /* JADX WARN: Type inference failed for: r6v6 */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX WARN: Type inference failed for: r6v8 */
        /* JADX WARN: Type inference failed for: r6v9 */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v23 */
        /* JADX WARN: Type inference failed for: r9v24 */
        /* JADX WARN: Type inference failed for: r9v25 */
        /* JADX WARN: Type inference failed for: r9v44 */
        /* JADX WARN: Type inference failed for: r9v45 */
        /* JADX WARN: Type inference failed for: r9v46 */
        /* JADX WARN: Type inference failed for: r9v47, types: [int] */
        /* JADX WARN: Type inference failed for: r9v49 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v50 */
        /* JADX WARN: Type inference failed for: r9v51 */
        /* JADX WARN: Type inference failed for: r9v52 */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference failed for: r9v8, types: [int] */
        /* JADX WARN: Type inference failed for: r9v9 */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean zA;
            ?? r10;
            ?? r11;
            ?? r15;
            com.mbridge.msdk.videocommon.download.b bVar;
            String str;
            boolean z10;
            int i10;
            boolean z11;
            int i11;
            Bundle data = message.getData();
            String string = data.getString(MBridgeConstans.PLACEMENT_ID);
            String string2 = data.getString(MBridgeConstans.PROPERTIES_UNIT_ID);
            String string3 = data.getString(CommonUrlParts.REQUEST_ID);
            String string4 = data.getString(C3426d4.i.W);
            f fVar = (f) b.f36380g.get(string4);
            h hVar = this.f36503b.get(string4);
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f36504c.get(string4);
            int i12 = message.what;
            switch (i12) {
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                    break;
                default:
                    switch (i12) {
                        case 200:
                        case 201:
                        case 203:
                        case 205:
                            ?? C = "RewardCampaignsResourceManager";
                            if (fVar != null && hVar != null) {
                                String string5 = data.getString("message");
                                if (string5 == null) {
                                    string5 = "";
                                }
                                C = b.c(message.what);
                                ?? r14 = "resource download failed " + b.d(message.what) + Z7.f27998r + string5;
                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = fVar.f36429h;
                                CampaignEx campaignEx = (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.size() <= 0) ? null : fVar.f36429h.get(0);
                                try {
                                    try {
                                        if (!fVar.f36422a) {
                                            C = C;
                                            r15 = r14;
                                            bVar = com.mbridge.msdk.videocommon.download.b.getInstance();
                                            str = fVar.f36426e;
                                            z10 = fVar.f36423b;
                                            i10 = fVar.f36425d;
                                            z11 = fVar.f36422a;
                                            if (bVar.a(94, str, z10, i10, z11, fVar.f36424c, copyOnWriteArrayList)) {
                                                hVar.a(string, string2, string3, fVar.f36429h);
                                                r10 = r15;
                                                r11 = 0;
                                            } else {
                                                if (campaignEx != null) {
                                                    i11 = message.what;
                                                    if (i11 != 200) {
                                                        if (i11 != 201) {
                                                            if (i11 != 203) {
                                                                if (i11 != 205) {
                                                                }
                                                            } else if (campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                            }
                                                        } else if (campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                        }
                                                    } else if (campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                                    }
                                                }
                                                r10 = r15;
                                                r11 = 0;
                                                r11 = 0;
                                                hVar.a(fVar.f36429h, b.b(C, new MBridgeIds(string, string2, string3), r10, null, null));
                                                r10 = r10;
                                            }
                                            this.f36503b.remove(string4);
                                            b.f36380g.remove(string4);
                                            this.f36504c.remove(string4);
                                            C = C;
                                            r14 = i10;
                                            C = z11;
                                        } else {
                                            try {
                                                if (fVar.f36430i != null) {
                                                    if (fVar.f36424c != 1) {
                                                        try {
                                                            String string6 = data.getString("url");
                                                            int i13 = message.what;
                                                            try {
                                                                if (i13 == 200) {
                                                                    if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                                                        q0.c(C, "Is TPL but  video download fail but hit ignoreCheckRule");
                                                                    } else {
                                                                        for (int i14 = 0; i14 < fVar.f36430i.size(); i14++) {
                                                                            if (fVar.f36430i.get(i14).getVideoUrlEncode().equals(string6)) {
                                                                                fVar.f36430i.remove(i14);
                                                                            }
                                                                        }
                                                                        b.f36380g.remove(string4);
                                                                        b.f36380g.put(string4, fVar);
                                                                    }
                                                                } else if (i13 == 201) {
                                                                    if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                                        q0.c(C, "Is TPL but download endcard fail but hit ignoreCheckRule");
                                                                    } else {
                                                                        for (int i15 = 0; i15 < fVar.f36430i.size(); i15++) {
                                                                            CampaignEx campaignEx2 = fVar.f36430i.get(i15);
                                                                            if (campaignEx2.getRewardTemplateMode() != null && campaignEx2.getRewardTemplateMode().h().equals(string6)) {
                                                                                fVar.f36430i.remove(i15);
                                                                            }
                                                                            if (!TextUtils.isEmpty(campaignEx2.getendcard_url()) && campaignEx2.getendcard_url().equals(string6)) {
                                                                                fVar.f36430i.remove(i15);
                                                                            }
                                                                        }
                                                                        b.f36380g.remove(string4);
                                                                        b.f36380g.put(string4, fVar);
                                                                    }
                                                                } else if (i13 == 203) {
                                                                    if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                                        q0.c(C, "Is TPL but download template fail but hit ignoreCheckRule");
                                                                    } else {
                                                                        for (int i16 = 0; i16 < fVar.f36430i.size(); i16++) {
                                                                            CampaignEx campaignEx3 = fVar.f36430i.get(i16);
                                                                            if (campaignEx3.getRewardTemplateMode() != null && campaignEx3.getRewardTemplateMode().j().equals(string6)) {
                                                                                fVar.f36430i.remove(i16);
                                                                            }
                                                                        }
                                                                        b.f36380g.remove(string4);
                                                                        b.f36380g.put(string4, fVar);
                                                                    }
                                                                } else if (i13 == 205) {
                                                                    if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(3)) {
                                                                        q0.c(C, "Is TPL but download BTL Template fail but hit ignoreCheckRule");
                                                                    } else {
                                                                        fVar.f36430i.clear();
                                                                        b.f36380g.remove(string4);
                                                                        b.f36380g.put(string4, fVar);
                                                                    }
                                                                }
                                                                try {
                                                                    if (com.mbridge.msdk.videocommon.download.b.getInstance().a(94, fVar.f36426e, fVar.f36423b, fVar.f36425d, fVar.f36422a, fVar.f36424c, copyOnWriteArrayList)) {
                                                                        try {
                                                                            hVar.a(string, string2, string3, fVar.f36429h);
                                                                            this.f36503b.remove(string4);
                                                                            b.f36380g.remove(string4);
                                                                            this.f36504c.remove(string4);
                                                                        } catch (Exception e10) {
                                                                            e = e10;
                                                                            r10 = r14;
                                                                            C = C;
                                                                        }
                                                                    } else if (fVar.f36430i.size() == 0) {
                                                                        ?? r16 = r14;
                                                                        ?? r12 = C;
                                                                        r14 = 0;
                                                                        hVar.a(fVar.f36429h, b.b(r12 == true ? 1 : 0, new MBridgeIds(string, string2, string3), r16, null, null));
                                                                        this.f36503b.remove(string4);
                                                                        b.f36380g.remove(string4);
                                                                        this.f36504c.remove(string4);
                                                                        C = r12;
                                                                        C = r16;
                                                                    }
                                                                } catch (Exception e11) {
                                                                    e = e11;
                                                                    C = C;
                                                                    r10 = r14;
                                                                }
                                                            } catch (Exception e12) {
                                                                e = e12;
                                                                r10 = r14;
                                                                r11 = 0;
                                                                hVar.a(fVar.f36429h, b.b(C, new MBridgeIds(string, string2, string3), r10, e, r11));
                                                                return;
                                                            }
                                                        } catch (Exception e13) {
                                                            e = e13;
                                                            r10 = r14;
                                                        }
                                                        r11 = 0;
                                                        break;
                                                    } else {
                                                        if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                                                            int i17 = message.what;
                                                            if (i17 != 200) {
                                                                if (i17 != 201) {
                                                                    if (i17 != 203) {
                                                                        if (i17 == 205) {
                                                                            if (!campaignEx.getRsIgnoreCheckRule().contains(3)) {
                                                                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList3 = fVar.f36429h;
                                                                                if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.size() > 0) {
                                                                                    CampaignEx campaignEx4 = fVar.f36429h.get(0);
                                                                                    if (campaignEx4.getCMPTEntryUrl().equals(campaignEx4.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                                    }
                                                                } else if (campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                                }
                                                            } else if (campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                                            }
                                                        }
                                                        try {
                                                            hVar.a(fVar.f36429h, b.b(C, new MBridgeIds(string, string2, string3), r14, null, null));
                                                            this.f36503b.remove(string4);
                                                            b.f36380g.remove(string4);
                                                            this.f36504c.remove(string4);
                                                        } catch (Exception e14) {
                                                            e = e14;
                                                            r11 = 0;
                                                            r10 = r14;
                                                            C = C;
                                                        }
                                                    }
                                                } else {
                                                    C = C;
                                                    r15 = r14;
                                                    bVar = com.mbridge.msdk.videocommon.download.b.getInstance();
                                                    str = fVar.f36426e;
                                                    try {
                                                        z10 = fVar.f36423b;
                                                        i10 = fVar.f36425d;
                                                        z11 = fVar.f36422a;
                                                        try {
                                                            if (bVar.a(94, str, z10, i10, z11, fVar.f36424c, copyOnWriteArrayList)) {
                                                                hVar.a(string, string2, string3, fVar.f36429h);
                                                                r10 = r15;
                                                                r11 = 0;
                                                            } else {
                                                                if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                                                                    i11 = message.what;
                                                                    if (i11 != 200) {
                                                                        if (i11 != 201) {
                                                                            if (i11 != 203) {
                                                                                if (i11 != 205 && campaignEx.getRsIgnoreCheckRule().contains(3)) {
                                                                                }
                                                                            } else if (campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                                            }
                                                                        } else if (campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                                        }
                                                                    } else if (campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                                                    }
                                                                }
                                                                r10 = r15;
                                                                r11 = 0;
                                                                r11 = 0;
                                                                try {
                                                                    hVar.a(fVar.f36429h, b.b(C, new MBridgeIds(string, string2, string3), r10, null, null));
                                                                    r10 = r10;
                                                                } catch (Exception e15) {
                                                                    e = e15;
                                                                }
                                                            }
                                                            this.f36503b.remove(string4);
                                                            b.f36380g.remove(string4);
                                                            this.f36504c.remove(string4);
                                                            C = C;
                                                            r14 = i10;
                                                            C = z11;
                                                        } catch (Exception e16) {
                                                            e = e16;
                                                            r10 = r15;
                                                            C = C;
                                                            r11 = 0;
                                                        }
                                                    } catch (Exception e17) {
                                                        e = e17;
                                                        r10 = r15;
                                                        C = C;
                                                    }
                                                }
                                            } catch (Exception e18) {
                                                e = e18;
                                                C = C;
                                                r15 = r14;
                                                r10 = r15;
                                                C = C;
                                                r11 = 0;
                                                hVar.a(fVar.f36429h, b.b(C, new MBridgeIds(string, string2, string3), r10, e, r11));
                                                return;
                                            }
                                        }
                                    } catch (Exception e19) {
                                        e = e19;
                                        r11 = r14;
                                        r10 = C;
                                    }
                                } catch (Exception e20) {
                                    e = e20;
                                    r10 = r14;
                                    C = C;
                                }
                                hVar.a(fVar.f36429h, b.b(C, new MBridgeIds(string, string2, string3), r10, e, r11));
                                break;
                            }
                            break;
                    }
                    return;
            }
            if (fVar == null || hVar == null) {
                return;
            }
            try {
                try {
                    zA = com.mbridge.msdk.videocommon.download.b.getInstance().a(94, fVar.f36426e, fVar.f36423b, fVar.f36425d, fVar.f36422a, fVar.f36424c, copyOnWriteArrayList);
                } catch (Exception e21) {
                    e = e21;
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                    }
                    zA = false;
                }
            } catch (Exception e22) {
                e = e22;
            }
            if (zA) {
                hVar.a(string, string2, string3, fVar.f36429h);
                this.f36503b.remove(string4);
                b.f36380g.remove(string4);
                this.f36504c.remove(string4);
            }
        }

        public m(Looper looper) {
            super(looper);
            this.f36503b = new ConcurrentHashMap<>();
            this.f36504c = new ConcurrentHashMap<>();
        }

        public void a(String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f36504c.put(str, copyOnWriteArrayList);
        }
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public interface n {
        void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar);

        void a(String str, String str2, String str3, String str4);
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public interface o {
        void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.a.C0412a c0412a, com.mbridge.msdk.foundation.error.b bVar);

        void a(String str, String str2, String str3, String str4, String str5, com.mbridge.msdk.videocommon.a.C0412a c0412a);
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public static class p extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f36505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Runnable f36506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f36507c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f36508d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f36509e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final o f36510f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final WindVaneWebView f36511g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f36512h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f36513i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String f36514j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final com.mbridge.msdk.videocommon.a.C0412a f36515k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final CampaignEx f36516l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f36517m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f36518n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f36519o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f36520p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Runnable f36521q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Runnable f36522r;

        /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o f36523a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.mbridge.msdk.videocommon.a.C0412a f36524b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f36525c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f36526d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f36527e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f36528f;

            public a(o oVar, com.mbridge.msdk.videocommon.a.C0412a c0412a, String str, String str2, String str3, String str4) {
                this.f36523a = oVar;
                this.f36524b = c0412a;
                this.f36525c = str;
                this.f36526d = str2;
                this.f36527e = str3;
                this.f36528f = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindVaneWebView windVaneWebViewB;
                com.mbridge.msdk.videocommon.a.C0412a c0412a;
                if (this.f36523a != null && (c0412a = this.f36524b) != null) {
                    c0412a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f36525c + "_" + this.f36526d + "_" + this.f36527e, true);
                    o oVar = this.f36523a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f36525c);
                    sb2.append("_");
                    sb2.append(this.f36527e);
                    oVar.a(sb2.toString(), this.f36528f, this.f36525c, this.f36526d, this.f36527e, this.f36524b);
                }
                com.mbridge.msdk.videocommon.a.C0412a c0412a2 = this.f36524b;
                if (c0412a2 == null || (windVaneWebViewB = c0412a2.b()) == null) {
                    return;
                }
                try {
                    windVaneWebViewB.release();
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e10.getMessage());
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$p$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
        public class RunnableC0362b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o f36530a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.mbridge.msdk.videocommon.a.C0412a f36531b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f36532c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f36533d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f36534e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f36535f;

            public RunnableC0362b(o oVar, com.mbridge.msdk.videocommon.a.C0412a c0412a, String str, String str2, String str3, String str4) {
                this.f36530a = oVar;
                this.f36531b = c0412a;
                this.f36532c = str;
                this.f36533d = str2;
                this.f36534e = str3;
                this.f36535f = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindVaneWebView windVaneWebViewB;
                com.mbridge.msdk.videocommon.a.C0412a c0412a;
                if (this.f36530a != null && (c0412a = this.f36531b) != null) {
                    c0412a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f36532c + "_" + this.f36533d + "_" + this.f36534e, true);
                    o oVar = this.f36530a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f36532c);
                    sb2.append("_");
                    sb2.append(this.f36534e);
                    oVar.a(sb2.toString(), this.f36535f, this.f36532c, this.f36533d, this.f36534e, this.f36531b);
                }
                com.mbridge.msdk.videocommon.a.C0412a c0412a2 = this.f36531b;
                if (c0412a2 == null || (windVaneWebViewB = c0412a2.b()) == null) {
                    return;
                }
                try {
                    windVaneWebViewB.release();
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e10.getMessage());
                    }
                }
            }
        }

        public p(Handler handler, Runnable runnable, boolean z10, boolean z11, String str, o oVar, WindVaneWebView windVaneWebView, String str2, String str3, String str4, com.mbridge.msdk.videocommon.a.C0412a c0412a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, long j10) {
            this.f36505a = handler;
            this.f36506b = runnable;
            this.f36507c = z10;
            this.f36508d = z11;
            this.f36509e = str;
            this.f36510f = oVar;
            this.f36511g = windVaneWebView;
            this.f36512h = str2;
            this.f36513i = str4;
            this.f36514j = str3;
            this.f36515k = c0412a;
            this.f36516l = campaignEx;
            this.f36517m = copyOnWriteArrayList;
            this.f36518n = j10;
            a aVar = new a(oVar, c0412a, str4, str, str2, str3);
            this.f36522r = aVar;
            this.f36521q = new RunnableC0362b(oVar, c0412a, str4, str, str2, str3);
            if (handler != null) {
                handler.postDelayed(aVar, 5000L);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            Handler handler;
            Runnable runnable;
            Runnable runnable2;
            super.a(webView, i10);
            Handler handler2 = this.f36505a;
            if (handler2 != null && (runnable2 = this.f36521q) != null) {
                handler2.removeCallbacks(runnable2);
            }
            Handler handler3 = this.f36505a;
            if (handler3 != null && (runnable = this.f36522r) != null) {
                handler3.removeCallbacks(runnable);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 2);
                eVar.a("result", Integer.valueOf(i10));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.f36516l, eVar);
            } catch (Throwable th2) {
                q0.b("WindVaneWebView", th2.getMessage());
            }
            if (!this.f36520p) {
                String str = this.f36513i + "_" + this.f36512h;
                if (i10 == 1) {
                    Runnable runnable3 = this.f36506b;
                    if (runnable3 != null && (handler = this.f36505a) != null) {
                        handler.removeCallbacks(runnable3);
                    }
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f36513i + "_" + this.f36509e + "_" + this.f36512h, true);
                    com.mbridge.msdk.videocommon.a.C0412a c0412a = this.f36515k;
                    if (c0412a != null) {
                        c0412a.a(true);
                    }
                    if (this.f36507c) {
                        if (this.f36508d) {
                            com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f36516l.getRequestIdNotice(), this.f36515k);
                        } else {
                            com.mbridge.msdk.videocommon.a.b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f36516l.getRequestIdNotice(), this.f36515k);
                        }
                    } else if (this.f36508d) {
                        com.mbridge.msdk.videocommon.a.a(94, this.f36516l.getRequestIdNotice(), this.f36515k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(94, this.f36516l.getRequestIdNotice(), this.f36515k);
                    }
                    o oVar = this.f36510f;
                    if (oVar != null) {
                        oVar.a(str, this.f36514j, this.f36513i, this.f36509e, this.f36512h, this.f36515k);
                    }
                } else if (this.f36510f != null) {
                    this.f36510f.a(str, this.f36509e, this.f36512h, this.f36515k, b.b(880009, new MBridgeIds(this.f36514j, this.f36513i, this.f36509e), "readyState:" + i10, null, this.f36516l));
                }
                this.f36520p = true;
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            Handler handler;
            Runnable runnable2;
            super.onPageFinished(webView, str);
            Handler handler2 = this.f36505a;
            if (handler2 != null && (runnable2 = this.f36522r) != null) {
                handler2.removeCallbacks(runnable2);
            }
            if (!this.f36519o) {
                if (!str.contains("wfr=1")) {
                    String str2 = this.f36513i + "_" + this.f36512h;
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f36513i + "_" + this.f36509e + "_" + this.f36512h, true);
                    Runnable runnable3 = this.f36506b;
                    if (runnable3 != null && (handler = this.f36505a) != null) {
                        handler.removeCallbacks(runnable3);
                    }
                    com.mbridge.msdk.videocommon.a.C0412a c0412a = this.f36515k;
                    if (c0412a != null) {
                        c0412a.a(true);
                    }
                    if (this.f36507c) {
                        if (this.f36516l.isBidCampaign()) {
                            com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f36516l.getRequestIdNotice(), this.f36515k);
                        } else {
                            com.mbridge.msdk.videocommon.a.b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f36516l.getRequestIdNotice(), this.f36515k);
                        }
                    } else if (this.f36516l.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(94, this.f36516l.getRequestIdNotice(), this.f36515k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(94, this.f36516l.getRequestIdNotice(), this.f36515k);
                    }
                    o oVar = this.f36510f;
                    if (oVar != null) {
                        oVar.a(str2, this.f36514j, this.f36513i, this.f36509e, this.f36512h, this.f36515k);
                    }
                } else {
                    Handler handler3 = this.f36505a;
                    if (handler3 != null && (runnable = this.f36521q) != null) {
                        handler3.postDelayed(runnable, 5000L);
                    }
                }
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
                this.f36519o = true;
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f36513i + "_" + this.f36509e + "_" + this.f36512h, false);
            Handler handler = this.f36505a;
            if (handler != null) {
                if (this.f36521q != null) {
                    handler.removeCallbacks(this.f36522r);
                }
                Runnable runnable = this.f36521q;
                if (runnable != null) {
                    this.f36505a.removeCallbacks(runnable);
                }
            }
            try {
                String str3 = this.f36513i + "_" + this.f36512h;
                com.mbridge.msdk.videocommon.a.C0412a c0412a = this.f36515k;
                if (c0412a != null) {
                    c0412a.a(false);
                }
                if (this.f36510f != null) {
                    this.f36510f.a(str3, this.f36509e, str2, this.f36515k, b.b(880009, new MBridgeIds(this.f36514j, this.f36513i, this.f36509e), i10 + "#" + str, null, this.f36516l));
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("WindVaneWebView", e10.getLocalizedMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            Object objValueOf;
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f36513i + "_" + this.f36509e + "_" + this.f36512h, false);
            Handler handler = this.f36505a;
            if (handler != null) {
                if (this.f36521q != null) {
                    handler.removeCallbacks(this.f36522r);
                }
                Runnable runnable = this.f36521q;
                if (runnable != null) {
                    this.f36505a.removeCallbacks(runnable);
                }
            }
            try {
                String str = this.f36513i + "_" + this.f36512h;
                com.mbridge.msdk.videocommon.a.C0412a c0412a = this.f36515k;
                if (c0412a != null) {
                    c0412a.a(false);
                }
                if (this.f36510f != null) {
                    MBridgeIds mBridgeIds = new MBridgeIds(this.f36514j, this.f36513i, this.f36509e);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onReceivedSslError:");
                    if (sslError == null) {
                        objValueOf = "";
                    } else {
                        objValueOf = Integer.valueOf(sslError.getPrimaryError());
                    }
                    sb2.append(objValueOf);
                    this.f36510f.a(str, this.f36509e, this.f36512h, this.f36515k, b.b(880009, mBridgeIds, sb2.toString(), null, this.f36516l));
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("WindVaneWebView", e10.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public static class q extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f36537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f36538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WindVaneWebView f36539c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f36540d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f36541e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.mbridge.msdk.videocommon.a.C0412a f36542f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final CampaignEx f36543g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f36544h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f36545i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f36546j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f36547k;

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 2);
                eVar.a("result", Integer.valueOf(i10));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.f36543g, eVar);
            } catch (Throwable th2) {
                q0.b("WindVaneWebView", th2.getMessage());
            }
            if (this.f36547k) {
                return;
            }
            if (this.f36539c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f36537a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i10);
                    jSONObject2.put("error", "");
                    jSONObject.put("data", jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f36539c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e10.getLocalizedMessage());
                    }
                }
            }
            String str = this.f36541e + "_" + this.f36543g.getId() + "_" + this.f36543g.getRequestId() + "_" + this.f36540d;
            if (i10 == 1) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f36541e + "_" + this.f36545i + "_" + this.f36540d, true);
                com.mbridge.msdk.videocommon.a.C0412a c0412a = this.f36542f;
                if (c0412a != null) {
                    c0412a.a(true);
                }
                if (this.f36538b) {
                    if (this.f36543g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(str, this.f36542f, false, this.f36544h);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str, this.f36542f, false, this.f36544h);
                    }
                } else if (this.f36543g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(str, this.f36542f, false, this.f36544h);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str, this.f36542f, false, this.f36544h);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f36541e + "_" + this.f36545i + "_" + this.f36540d, false);
                com.mbridge.msdk.videocommon.a.C0412a c0412a2 = this.f36542f;
                if (c0412a2 != null) {
                    c0412a2.a(false);
                }
            }
            this.f36547k = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            if (this.f36546j) {
                return;
            }
            if (!str.contains("wfr=1")) {
                if (this.f36539c != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", this.f36537a);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "");
                        jSONObject.put("data", jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f36539c, "componentReact", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("WindVaneWebView", e10.getLocalizedMessage());
                        }
                    }
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f36541e + "_" + this.f36545i + "_" + this.f36540d, true);
                com.mbridge.msdk.videocommon.a.C0412a c0412a = this.f36542f;
                if (c0412a != null) {
                    c0412a.a(true);
                }
                String str2 = this.f36541e + "_" + this.f36543g.getId() + "_" + this.f36543g.getRequestId() + "_" + this.f36540d;
                if (this.f36538b) {
                    if (this.f36543g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f36543g.getRequestIdNotice(), this.f36542f);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str2, this.f36542f, false, this.f36544h);
                    }
                } else if (this.f36543g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f36543g.getRequestIdNotice(), this.f36542f);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str2, this.f36542f, false, this.f36544h);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.f36546j = true;
        }

        public q(String str, boolean z10, WindVaneWebView windVaneWebView, String str2, String str3, com.mbridge.msdk.videocommon.a.C0412a c0412a, CampaignEx campaignEx, boolean z11, String str4) {
            this.f36538b = z10;
            this.f36539c = windVaneWebView;
            this.f36540d = str2;
            this.f36541e = str3;
            this.f36542f = c0412a;
            this.f36543g = campaignEx;
            this.f36537a = str;
            this.f36544h = z11;
            this.f36545i = str4;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f36541e + "_" + this.f36545i + "_" + this.f36540d, false);
            com.mbridge.msdk.videocommon.a.C0412a c0412a = this.f36542f;
            if (c0412a != null) {
                c0412a.a(false);
            }
            if (this.f36539c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f36537a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", str);
                    jSONObject.put("data", jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f36539c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e10.getLocalizedMessage());
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public static final class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f36548a = new b(null);
    }

    public /* synthetic */ b(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(int i10) {
        if (i10 == 200) {
            return 880004;
        }
        if (i10 == 201) {
            return 880007;
        }
        if (i10 != 203) {
            return i10 != 205 ? 880024 : 880005;
        }
        return 880006;
    }

    public void c() {
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f36422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f36423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f36424c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f36425d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f36426e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f36427f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f36428g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CopyOnWriteArrayList<CampaignEx> f36429h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CopyOnWriteArrayList<CampaignEx> f36430i;

        public f(boolean z10, boolean z11, int i10, int i11, String str, String str2, int i12, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f36422a = z10;
            this.f36423b = z11;
            this.f36424c = i10;
            this.f36425d = i11;
            this.f36426e = str;
            this.f36427f = str2;
            this.f36428g = i12;
            this.f36429h = copyOnWriteArrayList;
            this.f36430i = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        }
    }

    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public static final class k implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f36475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f36476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f36477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f36478d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f36479e;

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str, true);
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36476b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f36477c);
            bundle.putString(CommonUrlParts.REQUEST_ID, this.f36478d);
            bundle.putString(C3426d4.i.W, this.f36479e);
            bundle.putString("url", str);
            messageObtain.setData(bundle);
            this.f36475a.sendMessage(messageObtain);
        }

        public k(Handler handler, String str, String str2, String str3, String str4) {
            this.f36475a = handler;
            this.f36477c = str;
            this.f36476b = str2;
            this.f36478d = str3;
            this.f36479e = str4;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str2, false);
            Message messageObtain = Message.obtain();
            messageObtain.what = 200;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36476b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f36477c);
            bundle.putString(CommonUrlParts.REQUEST_ID, this.f36478d);
            bundle.putString("url", str2);
            bundle.putString(C3426d4.i.W, this.f36479e);
            bundle.putString("message", str);
            messageObtain.setData(bundle);
            this.f36475a.sendMessage(messageObtain);
        }
    }

    private b() {
        this.f36383c = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;
        this.f36384d = "down_type";
        this.f36385e = "h3c";
        this.f36386f = new ArrayList(6);
        HandlerThread handlerThread = new HandlerThread("mb-reward-load-thread");
        f36380g = new ConcurrentHashMap<>();
        handlerThread.start();
        this.f36381a = new m(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized String d(int i10) {
        if (i10 == 200) {
            return "video";
        }
        if (i10 == 201) {
            return "zip/html";
        }
        if (i10 != 203) {
            return i10 != 205 ? "unknown" : "tpl";
        }
        return "temp";
    }

    public static b b() {
        return r.f36548a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.mbridge.msdk.foundation.entity.n nVar, CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), campaignEx.getCampaignUnitId());
            if (cVarC != null) {
                nVar.s(cVarC.x());
            }
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC != null) {
                nVar.r(aVarC.f());
            }
        } catch (Exception e10) {
            q0.b("RewardCampaignsResourceManager", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.mbridge.msdk.foundation.error.b b(int i10, MBridgeIds mBridgeIds, String str, Throwable th2, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i10);
        bVar.a(mBridgeIds);
        bVar.a(th2);
        bVar.c(str);
        bVar.a(campaignEx);
        return bVar;
    }

    public synchronized void a(Context context, boolean z10, int i10, boolean z11, int i11, String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, h hVar, n nVar) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        String str4 = str2 + "_" + str3 + "_" + copyOnWriteArrayList2.get(0).getSecondRequestIndex();
        f36380g.put(str4, new f(z10, z11, i10, copyOnWriteArrayList2.size(), str2, str3, i11, copyOnWriteArrayList2));
        this.f36381a.a(str4, hVar);
        this.f36381a.a(context);
        this.f36381a.a(str4, copyOnWriteArrayList2);
        this.f36381a.post(new a(copyOnWriteArrayList2, context, str2, i11, str, str3, str4, nVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, CampaignEx campaignEx, String str, String str2) {
        z.a(i10, str, str2, new C0360b(i10, campaignEx), campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2, String str3, CampaignEx campaignEx, String str4, n nVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        if (TextUtils.isEmpty(str4) || campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = a(campaignEx, 3);
        if (str4.contains(MultiDexExtractor.EXTRACTED_SUFFIX) && str4.contains(ResourceManager.KEY_MD5FILENAME)) {
            boolean zIsEmpty = TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str4));
            try {
                l lVar = new l(context, str, str2, str3, campaignEx, 497, this.f36381a, nVar, copyOnWriteArrayList);
                lVar.a(zIsEmpty);
                H5DownLoadManager.getInstance().downloadH5Res(cVarA, str4, lVar);
                return;
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    return;
                }
                return;
            }
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str4));
        try {
            i iVar = new i(497, str, str2, str3, campaignEx, nVar, this.f36381a, copyOnWriteArrayList);
            iVar.a(zIsEmpty2);
            H5DownLoadManager.getInstance().downloadH5Res(cVarA, str4, iVar);
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardCampaignsResourceManager", e11.getLocalizedMessage());
            }
        }
    }

    public synchronized void a(Context context, CampaignEx campaignEx, String str, String str2, String str3, n nVar) {
        this.f36381a.a(context);
        if (campaignEx != null) {
            String cMPTEntryUrl = campaignEx.getCMPTEntryUrl();
            if (campaignEx.isDynamicView()) {
                if (v0.b(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, cMPTEntryUrl)) {
                    a(0, campaignEx, campaignEx.getMof_tplid() + "", cMPTEntryUrl);
                }
                ResDownloadCheckManager.getInstance().setZipDownloadDone(cMPTEntryUrl, true);
                Message messageObtain = Message.obtain();
                messageObtain.what = 105;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(CommonUrlParts.REQUEST_ID, str3);
                bundle.putString(C3426d4.i.W, str2 + "_" + str3 + "_" + campaignEx.getSecondRequestIndex());
                bundle.putString("url", cMPTEntryUrl);
                messageObtain.setData(bundle);
                this.f36381a.sendMessage(messageObtain);
                if (nVar != null) {
                    nVar.a(str, str2, str3, cMPTEntryUrl);
                }
                return;
            }
        }
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c cVarB = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(campaignEx.getCurrentLocalRid());
                if (cVarB == null) {
                    cVarB = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                com.mbridge.msdk.foundation.same.report.metrics.c cVar = cVarB;
                cVar.a(campaignEx);
                cVar.e(1);
                cVar.f(a(campaignEx));
                H5DownLoadManager.getInstance().downloadH5Res(cVar, campaignEx.getCMPTEntryUrl(), new c(str2, str, str3, campaignEx, nVar, context));
            } catch (Exception e10) {
                q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, int i10, CampaignEx campaignEx, String str, String str2, String str3, String str4) {
        com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new d(campaignEx, context, i10, str, str2, str3, str4));
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01ac A[Catch: all -> 0x01db, TryCatch #6 {, blocks: (B:4:0x000b, B:5:0x0023, B:8:0x002b, B:11:0x003d, B:18:0x0075, B:21:0x007b, B:23:0x0081, B:26:0x008c, B:28:0x00c5, B:30:0x00db, B:60:0x01a8, B:62:0x01ac, B:64:0x01b7, B:25:0x0087, B:52:0x0157, B:38:0x00f5, B:40:0x0105, B:42:0x0117), top: B:78:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01b7 A[Catch: all -> 0x01db, TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x000b, B:5:0x0023, B:8:0x002b, B:11:0x003d, B:18:0x0075, B:21:0x007b, B:23:0x0081, B:26:0x008c, B:28:0x00c5, B:30:0x00db, B:60:0x01a8, B:62:0x01ac, B:64:0x01b7, B:25:0x0087, B:52:0x0157, B:38:0x00f5, B:40:0x0105, B:42:0x0117), top: B:78:0x000b }] */
    public synchronized void a(boolean z10, Handler handler, boolean z11, boolean z12, WindVaneWebView windVaneWebView, String str, int i10, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str2, String str3, String str4, String str5, String str6, com.mbridge.msdk.videocommon.setting.c cVar, o oVar) {
        String str7;
        String str8;
        String str9;
        String str10;
        com.mbridge.msdk.video.signal.impl.k kVar;
        String str11 = str4 + "_" + str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (v0.i(str)) {
                if (oVar != null) {
                    oVar.a(str11, str3, str4, str5, str, null);
                }
                return;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
            com.mbridge.msdk.videocommon.a.C0412a c0412a = new com.mbridge.msdk.videocommon.a.C0412a();
            try {
                try {
                    try {
                        try {
                            try {
                                WindVaneWebView windVaneWebView2 = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.n().d());
                                if (campaignEx != null) {
                                    windVaneWebView2.setLocalRequestId(campaignEx.getCurrentLocalRid());
                                }
                                windVaneWebView2.setTempTypeForMetrics(2);
                                try {
                                    c0412a.a(windVaneWebView2);
                                    if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                                        kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
                                    } else {
                                        kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
                                    }
                                    com.mbridge.msdk.video.signal.impl.k kVar2 = kVar;
                                    kVar2.g(i10);
                                    kVar2.setUnitId(str4);
                                    kVar2.setRewardUnitSetting(cVar);
                                    kVar2.d(z10);
                                    try {
                                        windVaneWebView2.setWebViewListener(new p(handler, null, z11, z12, str5, oVar, windVaneWebView, str, str3, str4, c0412a, campaignEx, copyOnWriteArrayList, jCurrentTimeMillis));
                                        windVaneWebView2.setObject(kVar2);
                                        MintegralNetworkBridge.webviewLoadUrl(windVaneWebView2, str2);
                                        windVaneWebView2.setRid(str5);
                                    } catch (Exception e10) {
                                        e = e10;
                                        str7 = str5;
                                        str8 = str4;
                                        if (MBridgeConstans.DEBUG) {
                                            q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                        }
                                        if (oVar != null) {
                                            oVar.a(str11, str5, str, null, b(880009, new MBridgeIds(str3, str8, str7), "", e, campaignEx));
                                        }
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    str7 = str5;
                                }
                            } catch (Exception unused) {
                                str10 = str;
                                str9 = str4;
                                if (oVar != null) {
                                    c0412a.a(true);
                                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str9 + "_" + str5 + "_" + str10, true);
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(str9);
                                    sb2.append("_");
                                    sb2.append(str10);
                                    oVar.a(sb2.toString(), str3, str4, str5, str, c0412a);
                                }
                            }
                        } catch (Exception e12) {
                            e = e12;
                            if (MBridgeConstans.DEBUG) {
                                q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                            }
                            if (oVar != null) {
                                oVar.a(str11, str5, str, null, b(880009, new MBridgeIds(str3, str8, str7), "", e, campaignEx));
                            }
                        }
                    } catch (Throwable unused2) {
                        str7 = str5;
                        if (oVar != null) {
                            c0412a.a(true);
                            ResDownloadCheckManager resDownloadCheckManager = ResDownloadCheckManager.getInstance();
                            StringBuilder sb3 = new StringBuilder();
                            str8 = str4;
                            try {
                                sb3.append(str8);
                                sb3.append("_");
                                sb3.append(str7);
                                sb3.append("_");
                                sb3.append(str);
                                resDownloadCheckManager.setTemplatePreLoadDone(sb3.toString(), true);
                                oVar.a(str8 + "_" + str, str3, str4, str5, str, c0412a);
                            } catch (Exception e13) {
                                e = e13;
                                if (MBridgeConstans.DEBUG) {
                                    q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                }
                                if (oVar != null) {
                                    oVar.a(str11, str5, str, null, b(880009, new MBridgeIds(str3, str8, str7), "", e, campaignEx));
                                }
                            }
                        }
                    }
                } catch (Exception unused3) {
                    str9 = str4;
                    str10 = str;
                }
            } catch (Exception e14) {
                e = e14;
            }
        } catch (Exception e15) {
            e = e15;
            str7 = str5;
            str8 = str4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01d5 A[Catch: all -> 0x0206, TRY_ENTER, TryCatch #2 {, blocks: (B:4:0x000d, B:7:0x0033, B:10:0x0047, B:12:0x007c, B:13:0x0083, B:15:0x009e, B:17:0x00a4, B:19:0x00ae, B:22:0x00b5, B:24:0x00bb, B:25:0x00c5, B:27:0x00cb, B:29:0x00df, B:31:0x00ed, B:33:0x00f6, B:34:0x00fa, B:36:0x0107, B:38:0x0158, B:40:0x016c, B:42:0x018c, B:54:0x01d5, B:55:0x01f7, B:57:0x01fb, B:35:0x0101), top: B:67:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:57:0x01fb A[Catch: all -> 0x0206, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x000d, B:7:0x0033, B:10:0x0047, B:12:0x007c, B:13:0x0083, B:15:0x009e, B:17:0x00a4, B:19:0x00ae, B:22:0x00b5, B:24:0x00bb, B:25:0x00c5, B:27:0x00cb, B:29:0x00df, B:31:0x00ed, B:33:0x00f6, B:34:0x00fa, B:36:0x0107, B:38:0x0158, B:40:0x016c, B:42:0x018c, B:54:0x01d5, B:55:0x01f7, B:57:0x01fb, B:35:0x0101), top: B:67:0x000d }] */
    public synchronized void a(boolean z10, Handler handler, boolean z11, boolean z12, String str, String str2, String str3, String str4, String str5, int i10, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str6, String str7, com.mbridge.msdk.videocommon.setting.c cVar, o oVar, boolean z13) {
        String str8;
        String str9;
        com.mbridge.msdk.video.signal.impl.k kVar;
        this.f36382b = z13;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str10 = str4 + "_" + str5;
        this.f36382b = z13;
        if (v0.i(str5)) {
            if (oVar != null) {
                oVar.a(str10, str3, str4, str, str5, null);
            }
            return;
        }
        try {
            q0.a("RewardCampaignsResourceManager", "开始预加载大模板资源");
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", 1);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
            com.mbridge.msdk.videocommon.a.C0412a c0412a = new com.mbridge.msdk.videocommon.a.C0412a();
            WindVaneWebView windVaneWebView = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.n().d());
            if (campaignEx != null) {
                windVaneWebView.setLocalRequestId(campaignEx.getCurrentLocalRid());
            }
            windVaneWebView.setTempTypeForMetrics(1);
            c0412a.a(windVaneWebView);
            String strB = com.mbridge.msdk.video.bt.component.d.c().b();
            String strB2 = com.mbridge.msdk.video.bt.component.d.c().b();
            c0412a.a(strB2);
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(str4);
                if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                    for (int i11 = 0; i11 < copyOnWriteArrayList.size(); i11++) {
                        CampaignEx campaignEx2 = copyOnWriteArrayList.get(i11);
                        for (CampaignEx campaignEx3 : copyOnWriteArrayListB) {
                            if (campaignEx3.getId().equals(campaignEx2.getId()) && campaignEx3.getRequestId().equals(campaignEx2.getRequestId())) {
                                campaignEx2.setReady(true);
                                copyOnWriteArrayList.set(i11, campaignEx2);
                            }
                        }
                    }
                }
                kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
            } else {
                kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
            }
            com.mbridge.msdk.video.signal.impl.k kVar2 = kVar;
            kVar2.g(i10);
            kVar2.setUnitId(str7);
            kVar2.c(strB2);
            kVar2.d(strB);
            kVar2.c(true);
            kVar2.setRewardUnitSetting(cVar);
            kVar2.d(z10);
            try {
                windVaneWebView.setWebViewListener(new g(z10, handler, null, z11, z12, i10, str5, str3, str4, str, c0412a, campaignEx, copyOnWriteArrayList, cVar, oVar, z13, jCurrentTimeMillis));
                windVaneWebView.setObject(kVar2);
                MintegralNetworkBridge.webviewLoadUrl(windVaneWebView, str6);
                str9 = str;
                try {
                    windVaneWebView.setRid(str9);
                    MBridgeBTRootLayout mBridgeBTRootLayout = new MBridgeBTRootLayout(com.mbridge.msdk.foundation.controller.c.n().d());
                    mBridgeBTRootLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    mBridgeBTRootLayout.setInstanceId(strB);
                    str8 = str4;
                    try {
                        mBridgeBTRootLayout.setUnitId(str8);
                        MBridgeBTLayout mBridgeBTLayout = new MBridgeBTLayout(com.mbridge.msdk.foundation.controller.c.n().d());
                        mBridgeBTLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        mBridgeBTLayout.setInstanceId(strB2);
                        mBridgeBTLayout.setUnitId(str8);
                        mBridgeBTLayout.setWebView(windVaneWebView);
                        AbstractMap abstractMapB = com.mbridge.msdk.video.bt.component.d.c().b(str8, str9);
                        abstractMapB.put(strB2, mBridgeBTLayout);
                        abstractMapB.put(strB, mBridgeBTRootLayout);
                        mBridgeBTRootLayout.addView(mBridgeBTLayout, new FrameLayout.LayoutParams(-1, -1));
                    } catch (Exception e10) {
                        e = e10;
                        if (oVar != null) {
                            oVar.a(str10, str, str5, null, b(880008, new MBridgeIds(str3, str8, str9), "", e, campaignEx));
                        }
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    str8 = str4;
                    if (oVar != null) {
                        oVar.a(str10, str, str5, null, b(880008, new MBridgeIds(str3, str8, str9), "", e, campaignEx));
                    }
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                    }
                }
            } catch (Exception e12) {
                e = e12;
                str9 = str;
            }
        } catch (Exception e13) {
            e = e13;
            str8 = str4;
            str9 = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.videocommon.setting.c cVar, String str, String str2, int i10) {
        if (windVaneWebView != null) {
            if (campaignEx != null && cVar != null && campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", str2);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "data is null");
                        jSONObject.put("data", jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        return;
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                            return;
                        }
                        return;
                    }
                }
                if (!TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j()) && campaignEx.getRewardTemplateMode().j().contains(CampaignEx.KEY_IS_CMPT_ENTRY)) {
                    q0.a("RewardCampaignsResourceManager", "getTeamplateUrl contains cmpt=1");
                    return;
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new e(z10, windVaneWebView, campaignEx, copyOnWriteArrayList, str, cVar, str2), i10 * 1000);
                    return;
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", str2);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("result", 2);
                jSONObject4.put("error", "data is null");
                jSONObject3.put("data", jSONObject4);
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e11.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, WindVaneWebView windVaneWebView, String str, int i10, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str2, String str3, com.mbridge.msdk.videocommon.setting.c cVar, String str4, boolean z11) {
        com.mbridge.msdk.video.signal.impl.k kVar;
        String requestId;
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
            com.mbridge.msdk.videocommon.a.C0412a c0412a = new com.mbridge.msdk.videocommon.a.C0412a();
            WindVaneWebView windVaneWebView2 = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.n().d());
            if (campaignEx != null) {
                windVaneWebView2.setLocalRequestId(campaignEx.getCurrentLocalRid());
            }
            windVaneWebView2.setTempTypeForMetrics(2);
            c0412a.a(windVaneWebView2);
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(str3);
                if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                    for (int i11 = 0; i11 < copyOnWriteArrayList.size(); i11++) {
                        CampaignEx campaignEx2 = copyOnWriteArrayList.get(i11);
                        for (CampaignEx campaignEx3 : copyOnWriteArrayListB) {
                            if (campaignEx3.getId().equals(campaignEx2.getId()) && campaignEx3.getRequestId().equals(campaignEx2.getRequestId())) {
                                campaignEx2.setReady(true);
                                copyOnWriteArrayList.set(i11, campaignEx2);
                            }
                        }
                    }
                }
                com.mbridge.msdk.video.signal.impl.k kVar2 = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
                requestId = copyOnWriteArrayList.get(0).getRequestId();
                kVar = kVar2;
            } else {
                kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
                requestId = campaignEx != null ? campaignEx.getRequestId() : "";
            }
            kVar.g(i10);
            kVar.setUnitId(str3);
            kVar.c(str4);
            kVar.setRewardUnitSetting(cVar);
            kVar.d(z10);
            windVaneWebView2.setWebViewListener(new q(str4, false, windVaneWebView, str, str3, c0412a, campaignEx, z11, requestId));
            windVaneWebView2.setObject(kVar);
            MintegralNetworkBridge.webviewLoadUrl(windVaneWebView2, str2);
            windVaneWebView2.setRid(requestId);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
            }
        }
    }

    private int a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (campaignEx.getAabEntity() != null) {
                    return campaignEx.getAabEntity().h3c;
                }
            } catch (Throwable th2) {
                q0.b("RewardCampaignsResourceManager", th2.getMessage());
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVarB = campaignEx != null ? com.mbridge.msdk.foundation.same.report.metrics.d.b().b(campaignEx.getCurrentLocalRid()) : null;
        if (cVarB == null) {
            cVarB = new com.mbridge.msdk.foundation.same.report.metrics.c();
        }
        cVarB.a(campaignEx);
        cVarB.f(a(campaignEx));
        cVarB.e(i10);
        return cVarB;
    }
}
