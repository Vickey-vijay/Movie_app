package io.bidmachine.iab.mraid;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"RtlHardcoded"})
public enum ViewPosition {
    TopLeft(51),
    TopCenter(49),
    TopRight(53),
    Center(17),
    BottomLeft(83),
    BottomCenter(81),
    BottomRight(85);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f59314a;

    ViewPosition(int i10) {
        this.f59314a = i10;
    }

    @NonNull
    public static ViewPosition fromJsString(@Nullable String str) {
        return fromJsString(str, TopRight);
    }

    public int getGravity() {
        return this.f59314a;
    }

    @NonNull
    public static ViewPosition fromJsString(@Nullable String str, @NonNull ViewPosition viewPosition) {
        if (TextUtils.isEmpty(str)) {
            return viewPosition;
        }
        str.hashCode();
        switch (str) {
            case "center":
                return Center;
            case "top-right":
                return TopRight;
            case "top-left":
                return TopLeft;
            case "bottom-left":
                return BottomLeft;
            case "bottom-right":
                return BottomRight;
            case "bottom-center":
                return BottomCenter;
            case "top-center":
                return TopCenter;
            default:
                return viewPosition;
        }
    }
}
