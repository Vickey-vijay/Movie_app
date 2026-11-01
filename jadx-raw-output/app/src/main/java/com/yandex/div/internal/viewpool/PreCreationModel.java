package com.yandex.div.internal.viewpool;

import al.d;
import bl.o1;
import bl.y1;
import ck.i;
import kotlinx.serialization.descriptors.a;
import xk.b;
import xk.f;

/* JADX INFO: compiled from: ViewPreCreationProfile.kt */
/* JADX INFO: loaded from: classes8.dex */
@f
public final class PreCreationModel {
    public static final Companion Companion = new Companion(null);
    private final int capacity;
    private final int max;
    private final int min;

    /* JADX INFO: compiled from: ViewPreCreationProfile.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final b<PreCreationModel> serializer() {
            return PreCreationModel$$serializer.INSTANCE;
        }
    }

    public PreCreationModel(int i10, int i11, int i12) {
        this.capacity = i10;
        this.min = i11;
        this.max = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreCreationModel)) {
            return false;
        }
        PreCreationModel preCreationModel = (PreCreationModel) obj;
        return this.capacity == preCreationModel.capacity && this.min == preCreationModel.min && this.max == preCreationModel.max;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.capacity) * 31) + Integer.hashCode(this.min)) * 31) + Integer.hashCode(this.max);
    }

    public String toString() {
        return "PreCreationModel(capacity=" + this.capacity + ", min=" + this.min + ", max=" + this.max + ')';
    }

    public static final /* synthetic */ void write$Self(PreCreationModel preCreationModel, d dVar, a aVar) {
        dVar.n(aVar, 0, preCreationModel.capacity);
        if (dVar.q(aVar, 1) || preCreationModel.min != 0) {
            dVar.n(aVar, 1, preCreationModel.min);
        }
        if (dVar.q(aVar, 2) || preCreationModel.max != Integer.MAX_VALUE) {
            dVar.n(aVar, 2, preCreationModel.max);
        }
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public /* synthetic */ PreCreationModel(int i10, int i11, int i12, int i13, y1 y1Var) {
        if (1 != (i10 & 1)) {
            o1.a(i10, 1, PreCreationModel$$serializer.INSTANCE.getDescriptor());
        }
        this.capacity = i11;
        if ((i10 & 2) == 0) {
            this.min = 0;
        } else {
            this.min = i12;
        }
        if ((i10 & 4) == 0) {
            this.max = Integer.MAX_VALUE;
        } else {
            this.max = i13;
        }
    }

    public /* synthetic */ PreCreationModel(int i10, int i11, int i12, int i13, i iVar) {
        this(i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? Integer.MAX_VALUE : i12);
    }
}
