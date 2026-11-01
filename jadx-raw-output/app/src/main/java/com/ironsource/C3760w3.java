package com.ironsource;

import com.ironsource.AbstractC3659q3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3760w3<Smash extends AbstractC3659q3<?>> extends Lg<Smash> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f31521h;

    public /* synthetic */ C3760w3(int i10, boolean z10, List list, boolean z11, int i11, ck.i iVar) {
        this(i10, z10, list, (i11 & 8) != 0 ? false : z11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3760w3(int i10, boolean z10, List<? extends Smash> list, boolean z11) {
        super(i10, z10, list);
        ck.p.j(list, com.ironsource.mediationsdk.d.f29596h);
        this.f31521h = z11;
    }

    @Override // com.ironsource.Lg
    public void c(Smash smash) {
        String str;
        ck.p.j(smash, "smash");
        if (!smash.w()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.c() + " (non-bidder) is ready to load");
            smash.a(true);
            c().add(smash);
            return;
        }
        this.f31521h = true;
        if (d() == 0) {
            str = "Advanced Loading: Starting to load bidder " + smash.c() + ". No other instances will be loaded at the same time.";
            smash.a(true);
            c().add(smash);
        } else {
            str = "Advanced Loading: Won't start loading bidder " + smash.c() + " as a non bidder is being loaded";
        }
        IronLog.INTERNAL.verbose(smash.g().name() + " - " + str);
        IronSourceUtils.i(str);
    }

    @Override // com.ironsource.Lg
    public boolean e() {
        if (!super.e() && !this.f31521h) {
            return false;
        }
        return true;
    }
}
