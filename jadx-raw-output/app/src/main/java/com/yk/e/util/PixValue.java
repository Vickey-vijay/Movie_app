package com.yk.e.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes7.dex */
public enum PixValue {
    dip { // from class: com.yk.e.util.PixValue.1
        @Override // com.yk.e.util.PixValue
        public int valueOf(float f10) {
            return Math.round(f10 * PixValue.f51174m.density);
        }
    },
    pix { // from class: com.yk.e.util.PixValue.2
        @Override // com.yk.e.util.PixValue
        public int valueOf(float f10) {
            return Math.round(f10 / PixValue.f51174m.density);
        }
    };


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static DisplayMetrics f51174m = Resources.getSystem().getDisplayMetrics();

    public abstract int valueOf(float f10);
}
