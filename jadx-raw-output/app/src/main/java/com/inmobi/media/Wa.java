package com.inmobi.media;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes7.dex */
public final class Wa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ya f23735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U5 f23736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f23737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f23738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23739e;

    public Wa(Ya ya2, U5 u10) {
        ck.p.j(u10, "embeddedBrowserViewClient");
        this.f23735a = ya2;
        this.f23736b = u10;
        this.f23737c = new LinkedHashSet();
    }

    public final void a(int i10, boolean z10, String str, Integer num) {
        try {
            if (this.f23739e) {
                return;
            }
            Ya ya2 = this.f23735a;
            if (ya2 != null) {
                ya2.f23836f = "IN_CUSTOM";
            }
            int i11 = 8100;
            switch (i10) {
                case 1:
                    if (z10) {
                        this.f23738d = str;
                        U5 u10 = this.f23736b;
                        Na na2 = Na.LPPageStart;
                        u10.getClass();
                        ck.p.j(na2, "funnelState");
                        Pa.a(na2, ya2, null, u10.f23618i);
                    }
                    break;
                case 2:
                    if (z10) {
                        this.f23738d = str;
                        this.f23739e = true;
                        if (!this.f23737c.contains(1)) {
                            U5 u11 = this.f23736b;
                            Na na3 = Na.LPPageStart;
                            Ya ya3 = this.f23735a;
                            u11.getClass();
                            ck.p.j(na3, "funnelState");
                            Pa.a(na3, ya3, 8006, u11.f23618i);
                        }
                        this.f23736b.f23616g.invoke();
                        U5 u12 = this.f23736b;
                        Na na4 = Na.LPCompleteSuccess;
                        Ya ya4 = this.f23735a;
                        u12.getClass();
                        ck.p.j(na4, "funnelState");
                        Pa.a(na4, ya4, null, u12.f23618i);
                    }
                    break;
                case 3:
                    if (z10 || (str != null && ck.p.e(str, this.f23738d))) {
                        this.f23739e = true;
                        if (!this.f23737c.contains(1)) {
                            U5 u13 = this.f23736b;
                            Na na5 = Na.LPPageStart;
                            Ya ya5 = this.f23735a;
                            u13.getClass();
                            ck.p.j(na5, "funnelState");
                            Pa.a(na5, ya5, 8006, u13.f23618i);
                        }
                        U5 u14 = this.f23736b;
                        Na na6 = Na.LPCompleteFailed;
                        Ya ya6 = this.f23735a;
                        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 8100);
                        u14.getClass();
                        ck.p.j(na6, "funnelState");
                        Pa.a(na6, ya6, numValueOf, u14.f23618i);
                    }
                    break;
                case 4:
                    if (z10) {
                        this.f23738d = str;
                    }
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    this.f23739e = true;
                    switch (i10) {
                        case 5:
                            i11 = 8200;
                            break;
                        case 6:
                            i11 = 8300;
                            break;
                        case 7:
                            i11 = 8400;
                            break;
                        case 8:
                            i11 = 8600;
                            break;
                        case 9:
                            i11 = 8500;
                            break;
                    }
                    int i12 = 4;
                    if (!this.f23737c.contains(4)) {
                        i12 = 0;
                    }
                    int i13 = i11 + i12;
                    U5 u15 = this.f23736b;
                    Na na7 = Na.LPCompleteFailed;
                    Ya ya7 = this.f23735a;
                    Integer numValueOf2 = Integer.valueOf(i13);
                    u15.getClass();
                    ck.p.j(na7, "funnelState");
                    Pa.a(na7, ya7, numValueOf2, u15.f23618i);
                    break;
            }
            this.f23737c.add(Integer.valueOf(i10));
        } catch (Exception e10) {
            e10.toString();
        }
    }
}
