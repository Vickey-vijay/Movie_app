package com.vungle.ads.fpd;

import al.d;
import bl.o1;
import bl.p0;
import bl.y1;
import ck.i;
import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.a;
import xk.b;
import xk.f;

/* JADX INFO: compiled from: Demographic.kt */
/* JADX INFO: loaded from: classes4.dex */
@f
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB\u0007¢\u0006\u0004\b\u001a\u0010\u0018B3\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\f\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001a\u0010\u001eJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\fH\u0007J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\fH\u0007J\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\fH\u0007R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0017\u0010\u0018R\u001e\u0010\n\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\n\u0010\u0016\u0012\u0004\b\u0019\u0010\u0018¨\u0006!"}, d2 = {"Lcom/vungle/ads/fpd/Demographic;", "", "self", "Lal/d;", "output", "Lkotlinx/serialization/descriptors/a;", "serialDesc", "Lmj/r;", "write$Self", "Lcom/vungle/ads/fpd/LiftoffGender;", InneractiveMediationDefs.KEY_GENDER, "setGender", "", "age", "setAgeRange", "lengthOfResidence", "setLengthOfResidence", "homeValue", "setMedianHomeValueUSD", "housingCost", "setMonthlyHousingCosts", "ageRange", "Ljava/lang/Integer;", "getAgeRange$annotations", "()V", "getGender$annotations", "<init>", "seen1", "Lbl/y1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Lbl/y1;)V", VastTagName.COMPANION, "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class Demographic {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Integer ageRange;
    private Integer gender;

    /* JADX INFO: compiled from: Demographic.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/fpd/Demographic$Companion;", "", "Lxk/b;", "Lcom/vungle/ads/fpd/Demographic;", "serializer", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final b<Demographic> serializer() {
            return Demographic$$serializer.INSTANCE;
        }
    }

    public Demographic() {
    }

    private static /* synthetic */ void getAgeRange$annotations() {
    }

    private static /* synthetic */ void getGender$annotations() {
    }

    public final Demographic setLengthOfResidence(int lengthOfResidence) {
        return this;
    }

    public final Demographic setMedianHomeValueUSD(int homeValue) {
        return this;
    }

    public final Demographic setMonthlyHousingCosts(int housingCost) {
        return this;
    }

    public /* synthetic */ Demographic(int i10, Integer num, Integer num2, y1 y1Var) {
        if ((i10 & 0) != 0) {
            o1.a(i10, 0, Demographic$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.ageRange = null;
        } else {
            this.ageRange = num;
        }
        if ((i10 & 2) == 0) {
            this.gender = null;
        } else {
            this.gender = num2;
        }
    }

    public static final void write$Self(Demographic demographic, d dVar, a aVar) {
        p.j(demographic, "self");
        p.j(dVar, "output");
        p.j(aVar, "serialDesc");
        if (dVar.q(aVar, 0) || demographic.ageRange != null) {
            dVar.C(aVar, 0, p0.f5452a, demographic.ageRange);
        }
        if (dVar.q(aVar, 1) || demographic.gender != null) {
            dVar.C(aVar, 1, p0.f5452a, demographic.gender);
        }
    }

    public final Demographic setAgeRange(int age) {
        this.ageRange = Integer.valueOf(AgeRange.INSTANCE.fromAge$vungle_ads_release(age).getId());
        return this;
    }

    public final Demographic setGender(LiftoffGender gender) {
        p.j(gender, InneractiveMediationDefs.KEY_GENDER);
        this.gender = Integer.valueOf(gender.getValue());
        return this;
    }
}
