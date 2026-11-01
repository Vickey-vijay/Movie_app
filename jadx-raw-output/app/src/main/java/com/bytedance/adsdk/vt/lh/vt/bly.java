package com.bytedance.adsdk.vt.lh.vt;

/* JADX INFO: loaded from: classes.dex */
public final class bly implements lh {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final boolean f11197lh;
    public final String ouw;
    public final ouw vt;

    public enum ouw {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static ouw ouw(int i10) {
            if (i10 == 1) {
                return MERGE;
            }
            if (i10 == 2) {
                return ADD;
            }
            if (i10 == 3) {
                return SUBTRACT;
            }
            if (i10 != 4) {
                return i10 != 5 ? MERGE : EXCLUDE_INTERSECTIONS;
            }
            return INTERSECT;
        }
    }

    @Override // com.bytedance.adsdk.vt.lh.vt.lh
    public final com.bytedance.adsdk.vt.ouw.ouw.lh ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar) {
        return new com.bytedance.adsdk.vt.ouw.ouw.ryl(this);
    }

    public final String toString() {
        return "MergePaths{mode=" + this.vt + '}';
    }

    public bly(String str, ouw ouwVar, boolean z10) {
        this.ouw = str;
        this.vt = ouwVar;
        this.f11197lh = z10;
    }
}
