package com.vungle.ads.fpd;

import al.d;
import bl.o1;
import bl.y1;
import ck.i;
import ck.p;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.a;
import xk.b;
import xk.f;

/* JADX INFO: compiled from: Location.kt */
/* JADX INFO: loaded from: classes6.dex */
@f
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u0007¢\u0006\u0004\b\u0011\u0010\u0012B\u001b\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\tH\u0007J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¨\u0006\u0019"}, d2 = {"Lcom/vungle/ads/fpd/Location;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "", "country", "setCountry", "regionState", "setRegionState", "", "dma", "setDma", "<init>", "()V", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class Location {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: Location.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/fpd/Location$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/fpd/Location;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final b<Location> serializer() {
            return Location$$serializer.INSTANCE;
        }
    }

    public Location() {
    }

    public static final void write$Self(Location location, d dVar, a aVar) {
        p.j(location, "self");
        p.j(dVar, "output");
        p.j(aVar, "serialDesc");
    }

    public final Location setCountry(String country) {
        p.j(country, "country");
        return this;
    }

    public final Location setDma(int dma) {
        return this;
    }

    public final Location setRegionState(String regionState) {
        p.j(regionState, "regionState");
        return this;
    }

    public /* synthetic */ Location(int i10, y1 y1Var) {
        if ((i10 & 0) != 0) {
            o1.a(i10, 0, Location$$serializer.INSTANCE.getDescriptor());
        }
    }
}
