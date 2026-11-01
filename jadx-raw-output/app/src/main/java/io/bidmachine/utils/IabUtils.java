package io.bidmachine.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.Utils;
import io.bidmachine.iab.CacheControl;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.CreativeLoadingMethod;

/* JADX INFO: loaded from: classes11.dex */
public class IabUtils {

    @NonNull
    private static final CacheControl DEFAULT_CACHE_CONTROL = CacheControl.FullLoad;

    @Nullable
    public static IabElementStyle transform(@Nullable AdExtension.ControlAsset controlAsset) {
        if (controlAsset == null) {
            return null;
        }
        try {
            IabElementStyle iabElementStyle = new IabElementStyle();
            iabElementStyle.setMargin(controlAsset.getMargin());
            iabElementStyle.setPadding(controlAsset.getPadding());
            iabElementStyle.setContent(controlAsset.getContent());
            iabElementStyle.setFillColor(Utils.safeParseColor(controlAsset.getFill()));
            iabElementStyle.setFontStyle(Integer.valueOf(controlAsset.getFontStyle()));
            iabElementStyle.setWidth(Integer.valueOf(controlAsset.getWidth()));
            iabElementStyle.setHeight(Integer.valueOf(controlAsset.getHeight()));
            iabElementStyle.setHideAfter(Float.valueOf(controlAsset.getHideafter()));
            iabElementStyle.setHorizontalPosition(Utils.parseHorizontalPosition(controlAsset.getX()));
            iabElementStyle.setVerticalPosition(Utils.parseVerticalPosition(controlAsset.getY()));
            iabElementStyle.setOpacity(Float.valueOf(controlAsset.getOpacity()));
            iabElementStyle.setOutlined(Boolean.valueOf(controlAsset.getOutlined()));
            iabElementStyle.setStrokeColor(Utils.safeParseColor(controlAsset.getStroke()));
            iabElementStyle.setStrokeWidth(Float.valueOf(controlAsset.getStrokeWidth()));
            iabElementStyle.setStyle(controlAsset.getStyle());
            iabElementStyle.setVisible(Boolean.valueOf(controlAsset.getVisible()));
            return iabElementStyle;
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$CreativeLoadingMethod;

        static {
            int[] iArr = new int[CreativeLoadingMethod.values().length];
            $SwitchMap$io$bidmachine$protobuf$CreativeLoadingMethod = iArr;
            try {
                iArr[CreativeLoadingMethod.Stream.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$protobuf$CreativeLoadingMethod[CreativeLoadingMethod.PartialLoad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @NonNull
    public static CacheControl toCacheControl(@Nullable Object obj) {
        if (obj == null) {
            return DEFAULT_CACHE_CONTROL;
        }
        if (obj instanceof CacheControl) {
            return (CacheControl) obj;
        }
        CreativeLoadingMethod creativeLoadingMethodValueOf = null;
        if (obj instanceof CreativeLoadingMethod) {
            creativeLoadingMethodValueOf = (CreativeLoadingMethod) obj;
        } else if (obj instanceof String) {
            try {
                creativeLoadingMethodValueOf = CreativeLoadingMethod.valueOf((String) obj);
            } catch (IllegalArgumentException unused) {
            }
        }
        if (creativeLoadingMethodValueOf == null) {
            return DEFAULT_CACHE_CONTROL;
        }
        int i10 = a.$SwitchMap$io$bidmachine$protobuf$CreativeLoadingMethod[creativeLoadingMethodValueOf.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? DEFAULT_CACHE_CONTROL : CacheControl.PartialLoad;
        }
        return CacheControl.Stream;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001c  */
    @NonNull
    public static BMError mapError(@NonNull IabError iabError) {
        BMError bMError;
        int code = iabError.getCode();
        if (code != 1) {
            if (code != 3) {
                if (code != 5) {
                    if (code != 6) {
                        if (code != 7) {
                            bMError = BMError.InternalUnknownError;
                        } else {
                            bMError = BMError.NoFill;
                        }
                    } else {
                        bMError = BMError.Expired;
                    }
                } else {
                    bMError = BMError.PlaceholderTimeout;
                }
            } else {
                bMError = BMError.NoFill;
            }
        } else {
            bMError = BMError.NoConnection;
        }
        return new BMError(bMError, code, iabError.getMessage());
    }
}
