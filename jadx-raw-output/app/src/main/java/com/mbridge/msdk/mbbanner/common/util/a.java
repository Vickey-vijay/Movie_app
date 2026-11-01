package com.mbridge.msdk.mbbanner.common.util;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: BannerDelivery.java */
/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f35720c = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f35721a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f35722b;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.util.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BannerDelivery.java */
    public class RunnableC0344a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f35723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f35724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CampaignUnit f35725c;

        public RunnableC0344a(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, CampaignUnit campaignUnit) {
            this.f35723a = bVar;
            this.f35724b = str;
            this.f35725c = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbbanner.common.listener.b bVar = this.f35723a;
            if (bVar != null) {
                bVar.a(this.f35724b, this.f35725c, a.this.f35722b);
            }
        }
    }

    /* JADX INFO: compiled from: BannerDelivery.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f35727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.foundation.error.b f35728b;

        public b(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
            this.f35727a = bVar;
            this.f35728b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f35727a != null) {
                this.f35728b.a(a.this.f35722b);
                this.f35727a.a(this.f35728b);
            }
        }
    }

    /* JADX INFO: compiled from: BannerDelivery.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f35730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f35731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f35732c;

        public c(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, int i10) {
            this.f35730a = bVar;
            this.f35731b = str;
            this.f35732c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbbanner.common.listener.b bVar = this.f35730a;
            if (bVar != null) {
                bVar.a(this.f35731b, this.f35732c, a.this.f35722b);
            }
        }
    }

    /* JADX INFO: compiled from: BannerDelivery.java */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f35734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.foundation.error.b f35735b;

        public d(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
            this.f35734a = bVar;
            this.f35735b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f35734a != null) {
                this.f35735b.a(a.this.f35722b);
                this.f35734a.b(this.f35735b);
            }
        }
    }

    public void a(boolean z10) {
        this.f35722b = z10;
    }

    public void b(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
        q0.b(f35720c, "postResourceFail unitId=" + bVar2);
        this.f35721a.post(new d(bVar, bVar2));
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, CampaignUnit campaignUnit, String str) {
        q0.b(f35720c, "postCampaignSuccess unitId=" + str);
        this.f35721a.post(new RunnableC0344a(bVar, str, campaignUnit));
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
        this.f35721a.post(new b(bVar, bVar2));
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, int i10) {
        q0.b(f35720c, "postResourceSuccess unitId=" + str);
        this.f35721a.post(new c(bVar, str, i10));
    }
}
