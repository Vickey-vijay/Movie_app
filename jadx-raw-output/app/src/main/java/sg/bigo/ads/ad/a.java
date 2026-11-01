package sg.bigo.ads.ad;

import android.content.Context;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.core.f;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: sg.bigo.ads.ad.a$a, reason: collision with other inner class name */
    public static class C0648a implements AdBid {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f67321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final sg.bigo.ads.api.core.b f67322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final sg.bigo.ads.core.e.a.b f67323c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f67324d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f67325e = false;

        public C0648a(f fVar, sg.bigo.ads.api.core.b bVar, sg.bigo.ads.core.e.a.b bVar2) {
            this.f67321a = fVar;
            this.f67322b = bVar;
            this.f67323c = bVar2;
        }

        @Override // sg.bigo.ads.api.AdBid
        public final double getPrice() {
            return this.f67322b.ai();
        }

        @Override // sg.bigo.ads.api.AdBid
        public final void notifyLoss(Double d10, String str, int i10) {
            if (this.f67325e) {
                return;
            }
            this.f67325e = true;
            if (d10 != null) {
                this.f67323c.b("first_price", String.valueOf(d10));
            }
            if (str != null) {
                this.f67323c.b("first_bidder", str);
            }
            this.f67323c.b("loss_reason", String.valueOf(i10));
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.b.4

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Context f71280a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f71281b = false;

                public AnonymousClass4() {
                    context = context;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.this.b(context, this.f71281b);
                }
            });
            sg.bigo.ads.api.core.b bVar = this.f67322b;
            sg.bigo.ads.core.d.b.a(bVar, bVar.aj(), d10, str, i10);
        }

        @Override // sg.bigo.ads.api.AdBid
        public final void notifyWin(Double d10, String str) {
            if (this.f67324d) {
                return;
            }
            this.f67324d = true;
            if (d10 != null) {
                this.f67323c.b("sec_price", String.valueOf(d10));
            }
            if (str != null) {
                this.f67323c.b("sec_bidder", str);
            }
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.b.3

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Context f71277a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f71278b = false;

                public AnonymousClass3() {
                    context = context;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.this.a(context, this.f71278b);
                }
            });
            sg.bigo.ads.api.core.b bVar = this.f67322b;
            sg.bigo.ads.core.d.b.a(bVar, bVar.aj(), d10, str);
            f fVar = this.f67321a;
            sg.bigo.ads.core.b.b.a().a("win", sg.bigo.ads.core.b.a.a("win", fVar.f69377b, fVar.f69378c, fVar.f69376a, Integer.valueOf(this.f67322b.aj()), d10 == null ? null : String.valueOf(d10), str, null));
        }
    }
}
