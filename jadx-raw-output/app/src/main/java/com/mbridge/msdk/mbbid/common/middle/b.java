package com.mbridge.msdk.mbbid.common.middle;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.mbbid.out.BidListennning;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: RequesManager.java */
/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35775c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BidListennning f35777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BidResponsedEx f35778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f35779g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f35781i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f35782j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f35783k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f35784l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f35780h = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f35776d = com.mbridge.msdk.foundation.controller.c.n().d();

    /* JADX INFO: compiled from: RequesManager.java */
    public class a extends com.mbridge.msdk.mbbid.common.middle.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f35785b;

        @Override // com.mbridge.msdk.mbbid.common.net.c
        public void a(BidResponsedEx bidResponsedEx) {
            b.this.f35780h = false;
            b.this.f35778f = bidResponsedEx;
            com.mbridge.msdk.mbbid.common.report.a.a(b.this.f35776d, b.this.f35774b, bidResponsedEx.getBidId(), this.f35785b, bidResponsedEx.getBidToken());
            b.this.a(bidResponsedEx);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3) {
            super(str, str2);
            this.f35785b = str3;
        }

        @Override // com.mbridge.msdk.mbbid.common.net.c
        public void a(int i10, String str) {
            b.this.f35780h = false;
            com.mbridge.msdk.mbbid.common.report.a.a(b.this.f35776d, b.this.f35774b, str, this.f35785b);
            b.this.a(str);
        }
    }

    public void b(boolean z10) {
        this.f35783k = z10;
    }

    public b(String str, String str2, String str3) {
        this.f35773a = str;
        this.f35774b = str2;
        this.f35775c = str3;
    }

    public void b(int i10) {
        this.f35784l = i10;
    }

    public void b(long j10) {
        this.f35782j = j10;
    }

    public void a(int i10) {
        this.f35779g = i10;
    }

    public void a(long j10) {
        this.f35781i = j10;
    }

    public void a(boolean z10) {
        try {
            if (!this.f35780h) {
                this.f35780h = true;
                if (this.f35776d == null) {
                    a("context is null");
                }
                com.mbridge.msdk.mbbid.common.net.a aVar = new com.mbridge.msdk.mbbid.common.net.a(this.f35776d);
                e eVar = new e();
                String strB = com.mbridge.msdk.foundation.controller.c.n().b();
                eVar.a("app_id", strB);
                eVar.a("sign", SameMD5.getMD5(strB + com.mbridge.msdk.foundation.controller.c.n().c()));
                eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f35774b);
                if (TextUtils.isEmpty(this.f35773a)) {
                    this.f35773a = "";
                }
                eVar.a(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, this.f35773a);
                if (com.mbridge.msdk.util.b.a()) {
                    eVar.a("install_ids", c.a());
                }
                eVar.a("bid_floor", this.f35775c);
                eVar.a(e.f35063h, v0.a(this.f35776d, this.f35774b));
                eVar.a(e.f35062g, com.mbridge.msdk.foundation.same.buffer.b.a(this.f35774b, ""));
                String str = "1";
                eVar.a("req_type", this.f35783k ? "1" : "2");
                eVar.a("orientation", m0.F(this.f35776d) + "");
                int i10 = this.f35779g;
                if (i10 == 296) {
                    if (this.f35781i > 0 && this.f35782j > 0) {
                        eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f35782j + VastAttributes.HORIZONTAL_POSITION + this.f35781i);
                        try {
                            int i11 = BannerUtils.f35719a;
                            Method method = BannerUtils.class.getMethod("getCloseIds", String.class);
                            if (method.invoke(null, this.f35774b) instanceof String) {
                                eVar.a("close_id", method.invoke(null, this.f35774b).toString());
                            }
                        } catch (Exception unused) {
                            a("banner module is miss");
                            return;
                        }
                    } else {
                        a("bid required param is missing or error");
                        return;
                    }
                } else if (i10 == 297) {
                    if (this.f35781i > 0 && this.f35782j > 0) {
                        eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f35782j + VastAttributes.HORIZONTAL_POSITION + this.f35781i);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.f35784l);
                        sb2.append("");
                        eVar.a("orientation", sb2.toString());
                    } else {
                        a("ad display area is too small");
                        return;
                    }
                } else if (i10 != 298) {
                    if (!z10) {
                        str = "0";
                    }
                    eVar.a("rw_plus", str);
                } else if (this.f35781i > 0 && this.f35782j > 0) {
                    eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f35782j + VastAttributes.HORIZONTAL_POSITION + this.f35781i);
                } else {
                    a("bid required param is missing or error");
                    return;
                }
                String md5 = SameMD5.getMD5(v0.d());
                eVar.a(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, md5);
                a aVar2 = new a(this.f35773a, this.f35774b, md5);
                aVar2.setUnitId(this.f35774b);
                aVar2.setPlacementId(this.f35773a);
                aVar.get(1, d.h().a(false, ""), eVar, aVar2, "bid_request", 30000L);
                return;
            }
            a("current unit is biding");
        } catch (Throwable th2) {
            a(th2.getMessage());
        }
    }

    public void a(BidListennning bidListennning) {
        this.f35777e = bidListennning;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        BidListennning bidListennning = this.f35777e;
        if (bidListennning != null) {
            bidListennning.onFailed(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BidResponsed bidResponsed) {
        BidListennning bidListennning = this.f35777e;
        if (bidListennning != null) {
            bidListennning.onSuccessed(bidResponsed);
        }
    }
}
