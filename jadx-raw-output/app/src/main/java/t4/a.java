package t4;

import android.annotation.TargetApi;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import g5.k0;

/* JADX INFO: compiled from: CaptionStyleCompat.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f72212g = new a(-1, ViewCompat.MEASURED_STATE_MASK, 0, 0, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f72213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f72214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f72215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f72216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f72217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Typeface f72218f;

    @TargetApi(19)
    public static a a(CaptioningManager.CaptionStyle captionStyle) {
        return k0.f53108a >= 21 ? c(captionStyle) : b(captionStyle);
    }

    @TargetApi(19)
    public static a b(CaptioningManager.CaptionStyle captionStyle) {
        return new a(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    @TargetApi(21)
    public static a c(CaptioningManager.CaptionStyle captionStyle) {
        return new a(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f72212g.f72213a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f72212g.f72214b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f72212g.f72215c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f72212g.f72216d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f72212g.f72217e, captionStyle.getTypeface());
    }

    public a(int i10, int i11, int i12, int i13, int i14, @Nullable Typeface typeface) {
        this.f72213a = i10;
        this.f72214b = i11;
        this.f72215c = i12;
        this.f72216d = i13;
        this.f72217e = i14;
        this.f72218f = typeface;
    }
}
