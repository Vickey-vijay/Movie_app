package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import java.util.Map;

/* JADX INFO: compiled from: VideoViewStatisticsListener.java */
/* JADX INFO: loaded from: classes11.dex */
public class o extends k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f39091n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f39092o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f39093p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f39094q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f39095r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f39096s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f39097t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Map<Integer, String> f39098u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private MBridgeVideoView.u f39099v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f39100w;

    /* JADX INFO: compiled from: VideoViewStatisticsListener.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f39101a;

        public a(Object obj) {
            this.f39101a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f39101a;
            if (obj instanceof String) {
                o.this.b((String) obj);
            }
        }
    }

    public o(CampaignEx campaignEx, com.mbridge.msdk.videocommon.entity.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i10, z10);
        this.f39096s = false;
        this.f39097t = 0;
        this.f39100w = -1;
        if (this.f39066a) {
            this.f39098u = campaignEx.getAdvImpList();
        }
        this.f39097t = campaignEx.getVideoCompleteTime();
    }

    /* JADX WARN: Code duplicated, block: B:75:0x014a A[Catch: all -> 0x016a, TryCatch #0 {all -> 0x016a, blocks: (B:18:0x0024, B:19:0x002c, B:21:0x003b, B:23:0x0046, B:22:0x0043, B:24:0x0057, B:80:0x0164, B:25:0x005f, B:27:0x0072, B:29:0x0076, B:31:0x007c, B:33:0x0081, B:35:0x0085, B:38:0x0096, B:40:0x009a, B:41:0x009e, B:43:0x00ba, B:44:0x00c3, B:46:0x00c7, B:51:0x00cf, B:52:0x00d3, B:53:0x00eb, B:56:0x00f1, B:58:0x00f5, B:60:0x00fe, B:62:0x0102, B:64:0x0114, B:66:0x0118, B:67:0x0128, B:69:0x012c, B:70:0x0136, B:72:0x0140, B:74:0x0144, B:75:0x014a, B:77:0x014e, B:79:0x0152), top: B:85:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x014e A[Catch: all -> 0x016a, TryCatch #0 {all -> 0x016a, blocks: (B:18:0x0024, B:19:0x002c, B:21:0x003b, B:23:0x0046, B:22:0x0043, B:24:0x0057, B:80:0x0164, B:25:0x005f, B:27:0x0072, B:29:0x0076, B:31:0x007c, B:33:0x0081, B:35:0x0085, B:38:0x0096, B:40:0x009a, B:41:0x009e, B:43:0x00ba, B:44:0x00c3, B:46:0x00c7, B:51:0x00cf, B:52:0x00d3, B:53:0x00eb, B:56:0x00f1, B:58:0x00f5, B:60:0x00fe, B:62:0x0102, B:64:0x0114, B:66:0x0118, B:67:0x0128, B:69:0x012c, B:70:0x0136, B:72:0x0140, B:74:0x0144, B:75:0x014a, B:77:0x014e, B:79:0x0152), top: B:85:0x0004 }] */
    @Override // com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        int i11;
        CampaignEx campaignEx;
        try {
            if (i10 != 2) {
                int videoLength = 0;
                if (i10 != 20) {
                    if (i10 != 130) {
                        if (i10 == 6) {
                            if (this.f39066a && !this.f39093p) {
                                this.f39093p = true;
                                l();
                                com.mbridge.msdk.video.module.report.b.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f39067b);
                            }
                        } else if (i10 != 7) {
                            if (i10 == 15) {
                                j();
                                h();
                                i();
                                if (s0.a().a("i_l_s_t_r_i", false) && !this.f39094q) {
                                    this.f39094q = true;
                                    MBridgeVideoView.u uVar = this.f39099v;
                                    if (uVar != null) {
                                        uVar.a();
                                    }
                                }
                                if (obj == null || !(obj instanceof MBridgeVideoView.v)) {
                                    i11 = 0;
                                } else {
                                    int i12 = ((MBridgeVideoView.v) obj).f39034a;
                                    videoLength = ((MBridgeVideoView.v) obj).f39035b;
                                    i11 = i12;
                                }
                                if (videoLength == 0 && (campaignEx = this.f39067b) != null) {
                                    videoLength = campaignEx.getVideoLength();
                                }
                                com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f39067b, i11, videoLength, this.f39075j);
                                com.mbridge.msdk.video.module.report.b.a(this.f39067b, this.f39098u, this.f39072g, i11);
                                if (!this.f39095r) {
                                    this.f39095r = true;
                                    com.mbridge.msdk.video.module.report.b.a(this.f39067b, this.f39072g);
                                }
                                if (!this.f39096s) {
                                    int i13 = this.f39097t;
                                    if (i13 != 0) {
                                        videoLength = i13;
                                    }
                                    if (i11 >= videoLength) {
                                        this.f39096s = true;
                                        i10 = 17;
                                    }
                                }
                                q0.b("NotifyListener", "onPlayProgress:" + i11);
                                this.f39100w = i11;
                            } else if (i10 != 16) {
                                switch (i10) {
                                    case 11:
                                        a();
                                        l();
                                        break;
                                    case 12:
                                        a aVar = new a(obj);
                                        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                                            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
                                        } else {
                                            aVar.run();
                                        }
                                        l();
                                        c();
                                        b();
                                        e();
                                        a();
                                        break;
                                    case 13:
                                        c();
                                        b();
                                        break;
                                }
                            } else if (this.f39066a) {
                                this.f39093p = true;
                                l();
                                com.mbridge.msdk.video.module.report.b.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f39067b);
                            }
                        } else if (this.f39066a && obj != null && (obj instanceof Integer)) {
                            int iIntValue = ((Integer) obj).intValue();
                            if (iIntValue == 2) {
                                if (!this.f39092o) {
                                    this.f39092o = true;
                                    com.mbridge.msdk.video.module.report.b.e(com.mbridge.msdk.foundation.controller.c.n().d(), this.f39067b);
                                }
                            } else if (iIntValue == 1 && !this.f39091n) {
                                this.f39091n = true;
                                com.mbridge.msdk.video.module.report.b.f(com.mbridge.msdk.foundation.controller.c.n().d(), this.f39067b);
                            }
                        }
                    } else if (obj instanceof Integer) {
                        this.f39097t = ((Integer) obj).intValue();
                    }
                } else if (s0.a().a("i_l_s_t_r_i", false) && (obj instanceof MBridgeVideoView.u)) {
                    this.f39099v = (MBridgeVideoView.u) obj;
                }
            } else if (this.f39066a) {
                this.f39093p = true;
                l();
                com.mbridge.msdk.video.module.report.b.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f39067b);
            }
            this.f39074i.a(i10, obj);
        } catch (Throwable th2) {
            q0.b("NotifyListener", th2.getMessage(), th2);
        }
    }
}
