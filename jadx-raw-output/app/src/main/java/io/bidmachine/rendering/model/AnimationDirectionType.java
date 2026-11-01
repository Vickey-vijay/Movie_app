package io.bidmachine.rendering.model;

import ck.i;
import com.ironsource.C3426d4;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.util.KeyHolder;
import io.bidmachine.util.UtilsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0006\u0010\u0005\u001a\u00020\u0000R\u0014\u0010\b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lio/bidmachine/rendering/model/AnimationDirectionType;", "", "Lio/bidmachine/util/KeyHolder;", "", "getKey", "inverted", "a", "Ljava/lang/String;", C3426d4.i.W, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", VastTagName.COMPANION, "Left", "Top", "Right", "Bottom", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1})
public enum AnimationDirectionType implements KeyHolder {
    Left("left"),
    Top("top"),
    Right("right"),
    Bottom("bottom");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String key;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnimationDirectionType.values().length];
            try {
                iArr[AnimationDirectionType.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnimationDirectionType.Top.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnimationDirectionType.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnimationDirectionType.Bottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    AnimationDirectionType(String str) {
        this.key = str;
    }

    public static final AnimationDirectionType get(String str) {
        return INSTANCE.get(str);
    }

    @Override // io.bidmachine.util.KeyHolder
    public String getKey() {
        return this.key;
    }

    public final AnimationDirectionType inverted() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return Right;
        }
        if (i10 == 2) {
            return Bottom;
        }
        if (i10 == 3) {
            return Left;
        }
        if (i10 == 4) {
            return Top;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lio/bidmachine/rendering/model/AnimationDirectionType$Companion;", "", "()V", "get", "Lio/bidmachine/rendering/model/AnimationDirectionType;", C3426d4.i.W, "", "bidmachine-android-rendering_d_2_5_2"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final AnimationDirectionType get(String key) {
            return (AnimationDirectionType) UtilsKt.find(AnimationDirectionType.values(), key);
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }
}
