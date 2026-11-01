package io.bidmachine.rendering.model;

import android.view.View;
import ck.i;
import ck.p;
import com.mbridge.msdk.MBridgeConstans;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import kotlin.Metadata;
import lk.a0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b¨\u0006\u0016"}, d2 = {"Lio/bidmachine/rendering/model/Padding;", "", "", "isZero", "", "a", "F", "getLeftDp", "()F", "leftDp", "b", "getTopDp", "topDp", "c", "getRightDp", "rightDp", "d", "getBottomDp", "bottomDp", "<init>", "(FFFF)V", VastTagName.COMPANION, "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public final class Padding {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float leftDp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float topDp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float rightDp;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float bottomDp;

    public Padding(float f10, float f11, float f12, float f13) {
        this.leftDp = f10;
        this.topDp = f11;
        this.rightDp = f12;
        this.bottomDp = f13;
    }

    public static final Padding parse(String str) {
        return INSTANCE.parse(str);
    }

    public static final void setPadding(View view, Padding padding) {
        INSTANCE.setPadding(view, padding);
    }

    public final float getBottomDp() {
        return this.bottomDp;
    }

    public final float getLeftDp() {
        return this.leftDp;
    }

    public final float getRightDp() {
        return this.rightDp;
    }

    public final float getTopDp() {
        return this.topDp;
    }

    public final boolean isZero() {
        return this.leftDp == 0.0f && this.topDp == 0.0f && this.rightDp == 0.0f && this.bottomDp == 0.0f;
    }

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\r"}, d2 = {"Lio/bidmachine/rendering/model/Padding$Companion;", "", "", "value", "Lio/bidmachine/rendering/model/Padding;", "parse", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, VastAttributes.PADDING, "Lmj/r;", "setPadding", "<init>", "()V", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public final Padding parse(String value) {
            List listN0 = value != null ? a0.N0(value, new String[]{StringUtils.COMMA}, false, 0, 6, null) : null;
            if (listN0 == null || listN0.size() < 4) {
                return null;
            }
            try {
                return new Padding(Float.parseFloat(a0.k1((String) listN0.get(0)).toString()), Float.parseFloat(a0.k1((String) listN0.get(1)).toString()), Float.parseFloat(a0.k1((String) listN0.get(2)).toString()), Float.parseFloat(a0.k1((String) listN0.get(3)).toString()));
            } catch (Exception unused) {
                return null;
            }
        }

        public final void setPadding(View view, Padding padding) {
            p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            PaddingKt.setPadding(view, padding);
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }
}
