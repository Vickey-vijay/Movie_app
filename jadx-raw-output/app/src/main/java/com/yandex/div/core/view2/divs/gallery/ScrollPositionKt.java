package com.yandex.div.core.view2.divs.gallery;

import com.yandex.div2.DivGallery;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: ScrollPosition.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ScrollPositionKt {

    /* JADX INFO: compiled from: ScrollPosition.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivGallery.ScrollMode.values().length];
            try {
                iArr[DivGallery.ScrollMode.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivGallery.ScrollMode.PAGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ScrollPosition toScrollPosition(DivGallery.ScrollMode scrollMode) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[scrollMode.ordinal()];
        if (i10 == 1) {
            return ScrollPosition.DEFAULT;
        }
        if (i10 == 2) {
            return ScrollPosition.CENTER;
        }
        throw new NoWhenBranchMatchedException();
    }
}
