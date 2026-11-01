package com.yandex.div.core.view2.items;

import android.util.DisplayMetrics;
import ck.i;
import ck.p;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;

/* JADX INFO: compiled from: OverflowItemStrategy.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class OverflowItemStrategy {
    public static final Companion Companion = new Companion(null);
    private final int itemCount;

    /* JADX INFO: compiled from: OverflowItemStrategy.kt */
    public static final class Clamp extends OverflowItemStrategy {
        private final int currentItem;
        private final int itemCount;
        private final DisplayMetrics metrics;
        private final int scrollOffset;
        private final int scrollRange;

        public Clamp(int i10, int i11, int i12, int i13, DisplayMetrics displayMetrics) {
            super(i11, null);
            this.currentItem = i10;
            this.itemCount = i11;
            this.scrollRange = i12;
            this.scrollOffset = i13;
            this.metrics = displayMetrics;
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int positionAfterScrollBy(int i10) {
            return Math.min(Math.max(0, this.scrollOffset + BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(i10), this.metrics)), this.scrollRange);
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int nextItem(int i10) {
            if (super.itemCount <= 0) {
                return -1;
            }
            return Math.min(this.currentItem + i10, this.itemCount - 1);
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int previousItem(int i10) {
            if (super.itemCount <= 0) {
                return -1;
            }
            return Math.max(0, this.currentItem - i10);
        }
    }

    /* JADX INFO: compiled from: OverflowItemStrategy.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final OverflowItemStrategy create$div_release(String str, int i10, int i11, int i12, int i13, DisplayMetrics displayMetrics) {
            if (str == null ? true : p.e(str, "clamp")) {
                return new Clamp(i10, i11, i12, i13, displayMetrics);
            }
            if (p.e(str, "ring")) {
                return new Ring(i10, i11, i12, i13, displayMetrics);
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unsupported overflow " + str);
            }
            return new Clamp(i10, i11, i12, i13, displayMetrics);
        }
    }

    /* JADX INFO: compiled from: OverflowItemStrategy.kt */
    public static final class Ring extends OverflowItemStrategy {
        private final int currentItem;
        private final int itemCount;
        private final DisplayMetrics metrics;
        private final int scrollOffset;
        private final int scrollRange;

        public Ring(int i10, int i11, int i12, int i13, DisplayMetrics displayMetrics) {
            super(i11, null);
            this.currentItem = i10;
            this.itemCount = i11;
            this.scrollRange = i12;
            this.scrollOffset = i13;
            this.metrics = displayMetrics;
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int positionAfterScrollBy(int i10) {
            int iDpToPx = this.scrollOffset + BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(i10), this.metrics);
            int i11 = this.scrollRange;
            int i12 = iDpToPx % i11;
            return i12 < 0 ? i12 + i11 : i12;
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int nextItem(int i10) {
            if (super.itemCount <= 0) {
                return -1;
            }
            return (this.currentItem + i10) % this.itemCount;
        }

        @Override // com.yandex.div.core.view2.items.OverflowItemStrategy
        public int previousItem(int i10) {
            if (super.itemCount <= 0) {
                return -1;
            }
            int i11 = this.currentItem - i10;
            int i12 = this.itemCount;
            int i13 = i11 % i12;
            return (i12 & (((i13 ^ i12) & ((-i13) | i13)) >> 31)) + i13;
        }
    }

    private OverflowItemStrategy(int i10) {
        this.itemCount = i10;
    }

    public /* synthetic */ OverflowItemStrategy(int i10, i iVar) {
        this(i10);
    }

    public abstract int nextItem(int i10);

    public abstract int positionAfterScrollBy(int i10);

    public abstract int previousItem(int i10);
}
