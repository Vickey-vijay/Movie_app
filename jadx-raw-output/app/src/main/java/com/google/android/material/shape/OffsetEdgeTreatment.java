package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public final class OffsetEdgeTreatment extends EdgeTreatment {
    private final float offset;
    private final EdgeTreatment other;

    @Override // com.google.android.material.shape.EdgeTreatment
    public boolean forceIntersection() {
        return this.other.forceIntersection();
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f10, float f11, float f12, @NonNull ShapePath shapePath) {
        this.other.getEdgePath(f10, f11 - this.offset, f12, shapePath);
    }

    public OffsetEdgeTreatment(@NonNull EdgeTreatment edgeTreatment, float f10) {
        this.other = edgeTreatment;
        this.offset = f10;
    }
}
