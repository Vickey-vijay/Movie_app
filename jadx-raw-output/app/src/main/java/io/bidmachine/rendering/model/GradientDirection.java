package io.bidmachine.rendering.model;

import ck.i;
import com.ironsource.C3426d4;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.rendering.internal.j;
import io.bidmachine.util.KeyHolder;
import io.bidmachine.util.UtilsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005R\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lio/bidmachine/rendering/model/GradientDirection;", "", "Lio/bidmachine/util/KeyHolder;", "", "getKey", "Lio/bidmachine/rendering/internal/j$c;", "toDrawableGradientOrientation", "a", "Ljava/lang/String;", C3426d4.i.W, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", VastTagName.COMPANION, "LeftRight", "TopBottom", "RightLeft", "BottomTop", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public enum GradientDirection implements KeyHolder {
    LeftRight("right"),
    TopBottom("bottom"),
    RightLeft("left"),
    BottomTop("top");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String key;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GradientDirection.values().length];
            try {
                iArr[GradientDirection.LeftRight.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GradientDirection.TopBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GradientDirection.RightLeft.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GradientDirection.BottomTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    GradientDirection(String str) {
        this.key = str;
    }

    public static final GradientDirection get(String str) {
        return INSTANCE.get(str);
    }

    @Override // io.bidmachine.util.KeyHolder
    /* JADX INFO: renamed from: getKey, reason: from getter */
    public String getCom.ironsource.d4.i.W java.lang.String() {
        return this.key;
    }

    public final j.c toDrawableGradientOrientation() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return j.c.LEFT_RIGHT;
        }
        if (i10 == 2) {
            return j.c.TOP_BOTTOM;
        }
        if (i10 == 3) {
            return j.c.RIGHT_LEFT;
        }
        if (i10 == 4) {
            return j.c.BOTTOM_TOP;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lio/bidmachine/rendering/model/GradientDirection$Companion;", "", "()V", "get", "Lio/bidmachine/rendering/model/GradientDirection;", C3426d4.i.W, "", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final GradientDirection get(String key) {
            return (GradientDirection) UtilsKt.find(GradientDirection.values(), key);
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }
}
